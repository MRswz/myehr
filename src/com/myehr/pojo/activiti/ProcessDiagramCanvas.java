package com.myehr.pojo.activiti;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.util.IoUtil;
import org.activiti.engine.impl.util.ReflectUtil;

import com.myehr.common.mybatis.MybatisUtil;

/**
 */
public class ProcessDiagramCanvas {

    protected static final Logger LOGGER = Logger.getLogger(ProcessDiagramCanvas.class.getName());

    // Predefined sized
    protected static final int ARROW_WIDTH = 5;

    protected static final int CONDITIONAL_INDICATOR_WIDTH = 16;

    protected static final int MARKER_WIDTH = 12;

    // Colors
    protected static Color TASK_COLOR = new Color(255, 255, 255);//节点背景颜色19, 185, 156
/*
    protected static Color BOUNDARY_EVENT_COLOR = new Color(13, 179, 166);

   protected static Color CONDITIONAL_INDICATOR_COLOR = new Color(13, 179, 166);

   protected static Color HIGHLIGHT_COLOR = new Color(13, 179, 166); //Color.CYAN;*/


    protected static Color BOUNDARY_EVENT_COLOR = new Color(135, 206, 235);//边界事件背景颜色颜色(187,255,255)青(0,120,215)蓝色(19, 185, 156)墨绿(135, 206, 235)淡蓝

    protected static Color CONDITIONAL_INDICATOR_COLOR = new Color(135, 206, 235);//已执行线条颜色(187,255,255)青(0,120,215)蓝色(19, 185, 156)墨绿

    protected static Color HIGHLIGHT_COLOR = new Color(135, 206, 235); //Color.CYAN;已执行节点颜色(187,255,255)青(0,120,215)蓝色(19, 185, 156)墨绿
    protected static Color HIGHLIGHT_RED = new Color(255, 0, 0); //Color.CYAN;已执行b被打回颜色
    /*protected static Color HIGHLIGHT_COLOR_RED = new Color(166, 131, 65);  // Color.YELLOW;*/
    protected static Color HIGHLIGHT_COLOR_RED = new Color(255, 88, 9);  // 流程走到该节点的边框颜色;//(255, 88, 9)橘黄(230, 130, 70)墨橘
    protected static Color HIGHLIGHT_COLOR_RED2 = new Color(0, 0, 0);  // 流程未走过的颜色
    // Strokes
    protected static Stroke THICK_TASK_BORDER_STROKE = new BasicStroke(3.0f);

    protected static Stroke GATEWAY_TYPE_STROKE = new BasicStroke(3.0f);

    protected static Stroke END_EVENT_STROKE = new BasicStroke(3.0f);

    protected static Stroke MULTI_INSTANCE_STROKE = new BasicStroke(1.3f);

    protected static Stroke EVENT_SUBPROCESS_STROKE = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, new float[]{1.0f},
            0.0f);

    // icons
    protected static int ICON_SIZE = 16;

    protected static Image USERTASK_IMAGE;

    protected static Image SCRIPTTASK_IMAGE;

    protected static Image SERVICETASK_IMAGE;

    protected static Image RECEIVETASK_IMAGE;

    protected static Image SENDTASK_IMAGE;

    protected static Image MANUALTASK_IMAGE;

    protected static Image BUSINESS_RULE_TASK_IMAGE;

    protected static Image TIMER_IMAGE;

    protected static Image ERROR_THROW_IMAGE;

    protected static Image ERROR_CATCH_IMAGE;

    protected static Image SIGNAL_CATCH_IMAGE;

    protected static Image SIGNAL_THROW_IMAGE;
    
    private Map<String, Object> map = new HashMap<String,Object>();

    // icons are statically loaded for performace
    static {
        try {
           /* ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("stencilset.json"));*/
            USERTASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/user.png"));
            SCRIPTTASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/script.png"));
            SERVICETASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/service.png"));
            RECEIVETASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/receive.png"));
            SENDTASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/send.png"));
            MANUALTASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/manual.png"));
            BUSINESS_RULE_TASK_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/business_rule.png"));
            TIMER_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/timer.png"));
            ERROR_THROW_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/error_throw.png"));
            ERROR_CATCH_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/error_catch.png"));
            SIGNAL_CATCH_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/signal_catch.png"));
            SIGNAL_THROW_IMAGE = ImageIO.read(ReflectUtil.getResourceAsStream("org/activiti/engine/impl/bpmn/deployer/signal_throw.png"));
        } catch (IOException e) {
            LOGGER.warning("Could not load image for process diagram creation: " + e.getMessage());
        }
    }

    protected int canvasWidth = -1;

    protected int canvasHeight = -1;

    protected int minX = -1;

    protected int minY = -1;

    protected BufferedImage processDiagram;

    protected Graphics2D g;

    protected FontMetrics fontMetrics;

    protected boolean closed;

    /**
     * Creates an empty canvas with given width and height.
     */
    public ProcessDiagramCanvas(int width, int height) {
        this.canvasWidth = width;
        this.canvasHeight = height;
        this.processDiagram = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        this.g = processDiagram.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setPaint(Color.BLACK);
//Font.BOLD
        Font font = new Font("宋体",3, 13);
        
        g.setFont(font);
        this.fontMetrics = g.getFontMetrics();
    }

    /**
     * Creates an empty canvas with given width and height.
     * <p>
     * Allows to specify minimal boundaries on the left and upper side of the
     * canvas. This is useful for diagrams that have white space there (eg
     * Signavio). Everything beneath these minimum values will be cropped.
     *
     * @param minX Hint that will be used when generating the image. Parts that fall
     *             below minX on the horizontal scale will be cropped.
     * @param minY Hint that will be used when generating the image. Parts that fall
     *             below minX on the horizontal scale will be cropped.
     */
    public ProcessDiagramCanvas(int width, int height, int minX, int minY) {
        this(width, height);
        this.minX = minX;
        this.minY = minY;
    }

    /**
     * Generates an image of what currently is drawn on the canvas.
     * <p>
     * Throws an {@link ActivitiException} when {@link #close()} is already
     * called.
     */
    public InputStream generateImage(String imageType) {
        if (closed) {
            throw new ActivitiException("ProcessDiagramGenerator already closed");
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            // Try to remove white space
            minX = (minX <= 5) ? 5 : minX;
            minY = (minY <= 5) ? 5 : minY;
            BufferedImage imageToSerialize = processDiagram;
            if (minX >= 0 && minY >= 0) {
                imageToSerialize = processDiagram.getSubimage(minX - 5, minY - 5, canvasWidth - minX + 5, canvasHeight - minY + 5);
            }
            ImageIO.write(imageToSerialize, imageType, out);
        } catch (IOException e) {
            throw new ActivitiException("Error while generating process image", e);
        } finally {
            IoUtil.closeSilently(out);
        }
        return new ByteArrayInputStream(out.toByteArray());
    }

    /**
     * Closes the canvas which dissallows further drawing and releases graphical
     * resources.
     */
    public void close() {
        g.dispose();
        closed = true;
    }

    public void drawNoneStartEvent(int x, int y, int width, int height) {
        drawStartEvent(x, y, width, height, null);
    }

    public void drawTimerStartEvent(int x, int y, int width, int height) {
        drawStartEvent(x, y, width, height, TIMER_IMAGE);
    }

    public void drawStartEvent(int x, int y, int width, int height, Image image) {
        g.draw(new Ellipse2D.Double(x, y, width, height));
        if (image != null) {
            g.drawImage(image, x, y, width, height, null);
        }

    }

    public void drawNoneEndEvent(int x, int y, int width, int height) {
        Stroke originalStroke = g.getStroke();
        g.setStroke(END_EVENT_STROKE);
        g.draw(new Ellipse2D.Double(x, y, width, height));
        g.setStroke(originalStroke);
    }

    public void drawErrorEndEvent(int x, int y, int width, int height) {
        drawNoneEndEvent(x, y, width, height);
        g.drawImage(ERROR_THROW_IMAGE, x + 3, y + 3, width - 6, height - 6, null);
    }

    public void drawErrorStartEvent(int x, int y, int width, int height) {
        drawNoneStartEvent(x, y, width, height);
        g.drawImage(ERROR_CATCH_IMAGE, x + 3, y + 3, width - 6, height - 6, null);
    }

    public void drawCatchingEvent(int x, int y, int width, int height, Image image) {
        // event circles
        Ellipse2D outerCircle = new Ellipse2D.Double(x, y, width, height);
        int innerCircleX = x + 3;
        int innerCircleY = y + 3;
        int innerCircleWidth = width - 6;
        int innerCircleHeight = height - 6;
        Ellipse2D innerCircle = new Ellipse2D.Double(innerCircleX, innerCircleY, innerCircleWidth, innerCircleHeight);

        Paint originalPaint = g.getPaint();
        g.setPaint(BOUNDARY_EVENT_COLOR);
        g.fill(outerCircle);

        g.setPaint(originalPaint);
        g.draw(outerCircle);
        g.draw(innerCircle);

        g.drawImage(image, innerCircleX, innerCircleY, innerCircleWidth, innerCircleHeight, null);
    }

    public void drawCatchingTimerEvent(int x, int y, int width, int height) {
        drawCatchingEvent(x, y, width, height, TIMER_IMAGE);
    }

    public void drawCatchingErroEvent(int x, int y, int width, int height) {
        drawCatchingEvent(x, y, width, height, ERROR_CATCH_IMAGE);
    }

    public void drawCatchingSignalEvent(int x, int y, int width, int height) {
        drawCatchingEvent(x, y, width, height, SIGNAL_CATCH_IMAGE);
    }

    public void drawThrowingSignalEvent(int x, int y, int width, int height) {
        drawCatchingEvent(x, y, width, height, SIGNAL_THROW_IMAGE);
    }

    public void drawSequenceflowWithoutArrow(String name, int srcX, int srcY, int targetX, int targetY, boolean conditional) {
        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }
        if (name != null) {
            g.setColor(Color.BLACK);
            if (srcY == targetY) {
                if (srcX >= targetX) {
                    srcX = srcX - 40;
                    srcY=srcY-5;
                } else {
                    srcX = srcX + 7;
                    srcY=srcY-5;
                }
            } else if (srcX == targetX) {
                if (srcY <= targetY) {
                    srcY = srcY + 15;
                    srcX = srcX - 10;
                } else {
                    srcY = srcY - 20;
                    srcX = srcX - 10;
                }
                //斜左上
            }else if(targetX<srcX&&targetY<srcY){
                srcY = srcY - 15;
                srcX = srcX - 15;
                //斜左下
            }else if(targetX<srcX&&targetY>srcY){
                srcY = srcY + 15;
                srcX = srcX - 15;
                //斜右上
            }else if(targetX>srcX&&targetY<srcY){
                srcY = srcY - 15;
                srcX = srcX + 15;
                //斜右下
            }else if(targetX>srcX&&targetY>srcY){
                srcY = srcY + 15;
                srcX = srcX + 15;
            }

            g.drawString(name, srcX, srcY);

        }
    }

    // 绘制高亮显示的不带箭头的流程线
    public void drawHighLightSequenceflowWithoutArrow(int srcX, int srcY, int targetX, int targetY, boolean conditional) {

        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_COLOR);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }

        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    // 绘制高亮显示的不带箭头的流程线
    public void drawHighLightSequenceflowWithoutArrow2(int srcX, int srcY, int targetX, int targetY, boolean conditional) {

        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_RED);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }

        g.setPaint(originalPaint);
        g.setStroke(originalStroke);


    }

    public void drawArrowHead(Line2D.Double line) {
        int doubleArrowWidth = 2 * ARROW_WIDTH;
        Polygon arrowHead = new Polygon();
        arrowHead.addPoint(0, 0);
        arrowHead.addPoint(-ARROW_WIDTH, -doubleArrowWidth);
        arrowHead.addPoint(ARROW_WIDTH, -doubleArrowWidth);

        AffineTransform transformation = new AffineTransform();
        transformation.setToIdentity();
        double angle = Math.atan2(line.y2 - line.y1, line.x2 - line.x1);
        transformation.translate(line.x2, line.y2);
        transformation.rotate((angle - Math.PI / 2d));

        AffineTransform originalTransformation = g.getTransform();
        g.setTransform(transformation);
        g.fill(arrowHead);
        g.setTransform(originalTransformation);
    }

    public void drawConditionalSequenceFlowIndicator(Line2D.Double line) {
        int horizontal = (int) (CONDITIONAL_INDICATOR_WIDTH * 0.7);
        int halfOfHorizontal = horizontal / 2;
        int halfOfVertical = CONDITIONAL_INDICATOR_WIDTH / 2;

        Polygon conditionalIndicator = new Polygon();
        conditionalIndicator.addPoint(0, 0);
        conditionalIndicator.addPoint(-halfOfHorizontal, halfOfVertical);
        conditionalIndicator.addPoint(0, CONDITIONAL_INDICATOR_WIDTH);
        conditionalIndicator.addPoint(halfOfHorizontal, halfOfVertical);

        AffineTransform transformation = new AffineTransform();
        transformation.setToIdentity();
        double angle = Math.atan2(line.y2 - line.y1, line.x2 - line.x1);
        transformation.translate(line.x1, line.y1);
        transformation.rotate((angle - Math.PI / 2d));

        AffineTransform originalTransformation = g.getTransform();
        g.setTransform(transformation);
        g.draw(conditionalIndicator);

        Paint originalPaint = g.getPaint();
        g.setPaint(CONDITIONAL_INDICATOR_COLOR);
        g.fill(conditionalIndicator);

        g.setPaint(originalPaint);
        g.setTransform(originalTransformation);
    }

    public void drawTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height, false);
    }

    public void drawTask2(String name, int x, int y, int width, int height, int flag) throws Exception{
        drawTask2(name, x, y, width, height, false, flag);
    }


    public void drawPoolOrLane(String name, int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);

        // Add the name as text, vertical
        if (name != null && name.length() > 0) {
            // Include some padding
            int availableTextSpace = height - 6;

            // Create rotation for derived font
            AffineTransform transformation = new AffineTransform();
            transformation.setToIdentity();
            transformation.rotate(270 * Math.PI / 180);

            Font currentFont = g.getFont();
            Font theDerivedFont = currentFont.deriveFont(transformation);
            g.setFont(theDerivedFont);

            String truncated = fitTextToWidth(name, availableTextSpace);
            int realWidth = fontMetrics.stringWidth(truncated);

            g.drawString(truncated, x + 2 + fontMetrics.getHeight(), 3 + y + availableTextSpace - (availableTextSpace - realWidth) / 2);
            g.setFont(currentFont);
        }
    }

    protected void drawTask(String name, int x, int y, int width, int height, boolean thickBorder) {
        Paint originalPaint = g.getPaint();
        g.setPaint(TASK_COLOR);

        // shape
        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.fill(rect);
        g.setPaint(originalPaint);

        if (thickBorder) {
            Stroke originalStroke = g.getStroke();
            g.setStroke(THICK_TASK_BORDER_STROKE);
            g.draw(rect);
            g.setStroke(originalStroke);
        } else {
            g.draw(rect);
        }

        // text
        if (name != null) {
            String text = fitTextToWidth(name, width);

            int textX = x + ((width - fontMetrics.stringWidth(text)) / 2);
            int textY = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight();

            if (text.length() > 7 && text.length() <= 14) {
                String text2 = fitTextToWidth(name.substring(0, 7), width);
                int textX2 = x + ((width - fontMetrics.stringWidth(text2)) / 2);
                int textY2 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() - 9;

                String text3 = fitTextToWidth(name.substring(7, name.length()), width);
                int textX3 = x + ((width - fontMetrics.stringWidth(text3)) / 2);
                int textY3 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() + 15;
                g.setColor(Color.BLACK);
                g.drawString(text2, textX2, textY2);
                g.drawString(text3, textX3, textY3);

            } else if (text.length() > 14) {
                String text2 = fitTextToWidth(name.substring(0, 7), width);
                int textX2 = x + ((width - fontMetrics.stringWidth(text2)) / 2);
                int textY2 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() - 12;

                String text3 = fitTextToWidth(name.substring(7, 14), width);
                int textX3 = x + ((width - fontMetrics.stringWidth(text3)) / 2);
                int textY3 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() + 4;
                String text4;
                if (name.length() > 16) {
                    text4 = fitTextToWidth(name.substring(14, 16) + "...", width);
                } else {
                    text4 = fitTextToWidth(name.substring(14, name.length()), width);
                }
                int textX4 = x + ((width - fontMetrics.stringWidth(text4)) / 2);
                int textY4 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() + 17;
                g.setColor(Color.BLACK);
                g.drawString(text2, textX2, textY2);
                g.drawString(text3, textX3, textY3);
                g.drawString(text4, textX4, textY4);
            } else {
                g.setColor(Color.BLACK);
                g.drawString(text, textX, textY);
            }
        }
        // g.setColor(TASK_COLOR);

    }

    
    public String getRecvName(){
    	String pIId = this.map.get("processInstanceId")+"";
    	String taskDefKey = this.map.get("taskDefKey")+"";
    	String sql = "SELECT u.USER_NAME as userName from ACT_HI_TASKINST act JOIN SYS_USER u ON act.ASSIGNEE_ = u.USER_ID WHERE  act.PROC_INST_ID_ = '"+pIId+"' and TASK_DEF_KEY_ = '"+taskDefKey+"'";
    	try {
			List<Map> mapx = MybatisUtil.queryList("runtime.selectSql", sql);
			if(mapx.size()>0){
				return "["+mapx.get(0).get("userName")+"]";
			}else{
		    	return "[未找到下个节点人/流程已结束] ";
			}
		} catch (Exception e) {
			e.printStackTrace();
	    	return "[异常] ";
		}
    }


    protected void drawTask2(String name, int x, int y, int width, int height, boolean thickBorder, int flag) throws Exception{
        Paint originalPaint = g.getPaint();
//    	Paint originalPaint = new Color(255, 255, 255);
        if (flag == 2) {
            g.setPaint(HIGHLIGHT_COLOR);
        } else if (flag == 3) {
            g.setPaint(HIGHLIGHT_COLOR_RED);
        } else if (flag == 4) {
            g.setPaint(HIGHLIGHT_RED);
        }
        // shape
        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.fill(rect);//绿色填充 背景框
        g.setPaint(originalPaint);

        if (thickBorder) {
            Stroke originalStroke = g.getStroke();
            g.setStroke(THICK_TASK_BORDER_STROKE);
            g.draw(rect);
            g.setStroke(originalStroke);
        } else {
            g.draw(rect);
        }
        /**
         * 获取流程的审批人
         *  如果传入参数为  已完成流程 则取的是已完成流程的 审批人
         *  如果传入参数为  当前流程，则取的是当前流程的审批人
         *  因为 此方法有 已完成流程 和 当前流程 两种情况调用
         */
        String reviewName = getRecvName();

        // 绘制流程图 流程名称
        if (name != null) {
            String text = fitTextToWidth(name, width);
            int textX = x + ((width - fontMetrics.stringWidth(text)) / 2);
            int textY = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight();
            if (text.length() > 7 && text.length() <= 14) {
                String text2 = fitTextToWidth(name.substring(0, 7), width);
                int textX2 = x + ((width - fontMetrics.stringWidth(text2)) / 2);
                int textY2 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() - 13;

                String text3 = fitTextToWidth(name.substring(7, name.length()), width);
                int textX3 = x + ((width - fontMetrics.stringWidth(text3)) / 2);
                int textY3 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight()-1 ;
                g.setColor(Color.BLACK);
                g.drawString(text2, textX2, textY2);
                g.drawString(text3, textX3, textY3);

                //绘制 增加审批人 lizhan 2018-07-11
                int textYName = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() +12;
                if(reviewName.length()>9){//当审核人姓名长度大于9 (一行显示不下)
                    g.drawString(reviewName.substring(0,9), x, textYName);//第一行 不空格，靠左顶格显示
                    g.drawString(reviewName.substring(9,reviewName.length()), x, textYName+12);//第二行
                }else{
                    int textXName = x ;
                    if(fontMetrics.stringWidth(reviewName)<width){
                        textXName = x + ((width - fontMetrics.stringWidth(reviewName)) / 2);
                    }
                    g.drawString(reviewName, textXName, textYName);
                }

            } else if (text.length() > 14) {
                String text2 = fitTextToWidth(name.substring(0, 7), width);
                int textX2 = x + ((width - fontMetrics.stringWidth(text2)) / 2);
                int textY2 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() - 14;

                String text3 = fitTextToWidth(name.substring(7, 14), width);
                int textX3 = x + ((width - fontMetrics.stringWidth(text3)) / 2);
                int textY3 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() ;
                String text4;
                if (name.length() > 16) {
                    text4 = fitTextToWidth(name.substring(14, 16) + "...", width);
                } else {
                    text4 = fitTextToWidth(name.substring(14, name.length()), width);
                }
                int textX4 = x + ((width - fontMetrics.stringWidth(text4)) / 2);
                int textY4 = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() + 14;
                g.setColor(Color.BLACK);
                g.drawString(text2, textX2, textY2);

                g.drawString(text3, textX3, textY3);
                g.drawString(text4, textX4, textY4);

                int textYName = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() +26;
                if(reviewName.length()>9){//当审核人姓名长度大于9 (一行显示不下)
                    g.drawString(reviewName.substring(0,9), x, textYName);//第一行 不空格，靠左顶格显示
                    g.drawString(reviewName.substring(9,reviewName.length()), x, textYName+12);//第二行
                }else{
                    int textXName = x ;
                    if(fontMetrics.stringWidth(reviewName)<width){
                        textXName = x + ((width - fontMetrics.stringWidth(reviewName)) / 2);
                    }
                    g.drawString(reviewName, textXName, textYName);
                }
            } else {
                g.setColor(Color.BLACK);
                g.drawString(text, textX, textY);

                //绘制 增加审批人 lizhan 2018-07-11
                int textYName = y + ((height - fontMetrics.getHeight()) / 2) + fontMetrics.getHeight() +15;
                if(reviewName.length()>9){//当审核人姓名长度大于9 (一行显示不下)
                    g.drawString(reviewName.substring(0,9), x, textYName);//第一行 不空格，靠左顶格显示
                    g.drawString(reviewName.substring(9,reviewName.length()), x, textYName+12);//第二行
                }else{
                    int textXName = x ;
                    if(fontMetrics.stringWidth(reviewName)<width){
                        textXName = x + ((width - fontMetrics.stringWidth(reviewName)) / 2);
                    }
                    g.drawString(reviewName, textXName, textYName);
                }
            }
        }
    }

    protected String fitTextToWidth(String original, int width) {
        // remove length for "..."
        /*int maxWidth = width - 10;

      while (fontMetrics.stringWidth(text + "...") > maxWidth && text.length() > 0) {
         text = text.substring(0, text.length() - 1);
      }

      if (!text.equals(original)) {
         text = text + "...";
      }*/
        return original;
    }

    public void drawUserTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(USERTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawUserTask2(String name, int x, int y, int width, int height) throws Exception{
        drawTask2(name, x, y, width, height, 2);
        //绘制 背景图的小头像
        g.drawImage(USERTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawUserTask3(String name, int x, int y, int width, int height) throws Exception{
        drawTask2(name, x, y, width, height, 3);
        g.drawImage(USERTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawUserTask4(String name, int x, int y, int width, int height) throws Exception{
        drawTask2(name, x, y, width, height, 4);
        g.drawImage(USERTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawScriptTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(SCRIPTTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawServiceTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(SERVICETASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawReceiveTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(RECEIVETASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawSendTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(SENDTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawManualTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(MANUALTASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawBusinessRuleTask(String name, int x, int y, int width, int height) {
        drawTask(name, x, y, width, height);
        g.drawImage(BUSINESS_RULE_TASK_IMAGE, x + 7, y + 7, ICON_SIZE, ICON_SIZE, null);
    }

    public void drawExpandedSubProcess(String name, int x, int y, int width, int height, Boolean isTriggeredByEvent) {
        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);

        // Use different stroke (dashed)
        if (isTriggeredByEvent) {
            Stroke originalStroke = g.getStroke();
            g.setStroke(EVENT_SUBPROCESS_STROKE);
            g.draw(rect);
            g.setStroke(originalStroke);
        } else {
            g.draw(rect);
        }

        String text = fitTextToWidth(name, width);
        g.drawString(text, x + 10, y + 15);
    }

    public void drawCollapsedSubProcess(String name, int x, int y, int width, int height, Boolean isTriggeredByEvent) {
        drawCollapsedTask(name, x, y, width, height, false);
    }

    public void drawCollapsedCallActivity(String name, int x, int y, int width, int height) {
        drawCollapsedTask(name, x, y, width, height, true);
    }

    protected void drawCollapsedTask(String name, int x, int y, int width, int height, boolean thickBorder) {
        // The collapsed marker is now visualized separately
        drawTask(name, x, y, width, height, thickBorder);
    }

    public void drawCollapsedMarker(int x, int y, int width, int height) {
        // rectangle
        int rectangleWidth = MARKER_WIDTH;
        int rectangleHeight = MARKER_WIDTH;
        Rectangle rect = new Rectangle(x + (width - rectangleWidth) / 2, y + height - rectangleHeight - 3, rectangleWidth, rectangleHeight);
        g.draw(rect);

        // plus inside rectangle
        Line2D.Double line = new Line2D.Double(rect.getCenterX(), rect.getY() + 2, rect.getCenterX(), rect.getMaxY() - 2);
        g.draw(line);
        line = new Line2D.Double(rect.getMinX() + 2, rect.getCenterY(), rect.getMaxX() - 2, rect.getCenterY());
        g.draw(line);
    }

    public void drawActivityMarkers(int x, int y, int width, int height, boolean multiInstanceSequential, boolean multiInstanceParallel,
                                    boolean collapsed) {
        if (collapsed) {
            if (!multiInstanceSequential && !multiInstanceParallel) {
                drawCollapsedMarker(x, y, width, height);
            } else {
                drawCollapsedMarker(x - MARKER_WIDTH / 2 - 2, y, width, height);
                if (multiInstanceSequential) {
                    drawMultiInstanceMarker(true, x + MARKER_WIDTH / 2 + 2, y, width, height);
                } else if (multiInstanceParallel) {
                    drawMultiInstanceMarker(false, x + MARKER_WIDTH / 2 + 2, y, width, height);
                }
            }
        } else {
            if (multiInstanceSequential) {
                drawMultiInstanceMarker(true, x, y, width, height);
            } else if (multiInstanceParallel) {
                drawMultiInstanceMarker(false, x, y, width, height);
            }
        }
    }

    /**
     *  绘制多边形
     */
    public void drawGateway(int x, int y, int width, int height) {
        Polygon rhombus = new Polygon();
        rhombus.addPoint(x, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y + height);
        rhombus.addPoint(x + width, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y);
        g.draw(rhombus);
    }

    //修改网关颜色为蓝色
    public void drawGateway2(int x, int y, int width, int height) {
        Polygon rhombus = new Polygon();
        g.setPaint(HIGHLIGHT_COLOR);
        rhombus.addPoint(x, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y + height);
        rhombus.addPoint(x + width, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y);
        g.draw(rhombus);
    }

    //修改网关颜色为红色
    public void drawGateway3(int x, int y, int width, int height) {
        Polygon rhombus = new Polygon();
        g.setPaint(HIGHLIGHT_RED);
        rhombus.addPoint(x, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y + height);
        rhombus.addPoint(x + width, y + (height / 2));
        rhombus.addPoint(x + (width / 2), y);
        g.draw(rhombus);
    }

    public void drawParallelGateway(int x, int y, int width, int height) {
        // rhombus
        drawGateway(x, y, width, height);

        // plus inside rhombus
        Stroke orginalStroke = g.getStroke();
        g.setStroke(GATEWAY_TYPE_STROKE);
        Line2D.Double line = new Line2D.Double(x + 10, y + height / 2, x + width - 10, y + height / 2); // horizontal
        g.draw(line);
        line = new Line2D.Double(x + width / 2, y + height - 10, x + width / 2, y + 10); // vertical
        g.draw(line);
        g.setStroke(orginalStroke);
    }

    public void drawExclusiveGateway(ActivityImpl activityImpl, int x, int y, int width, int height) {
        // rhombus
        //绘制多边形
        drawGateway(x, y, width, height);

        int quarterWidth = width / 4;
        int quarterHeight = height / 4;

        // X inside rhombus
        //线宽
        Stroke orginalStroke = g.getStroke();
        g.setStroke(GATEWAY_TYPE_STROKE);
        Line2D.Double line = new Line2D.Double(x + quarterWidth + 3, y + quarterHeight + 3, x + 3 * quarterWidth - 3, y + 3 * quarterHeight - 3);
        g.draw(line);
        line = new Line2D.Double(x + quarterWidth + 3, y + 3 * quarterHeight - 3, x + 3 * quarterWidth - 3, y + quarterHeight + 3);
        g.draw(line);

        g.setStroke(orginalStroke);
        if (activityImpl.getProperty("name") != null) {
            g.setColor(Color.BLACK);
            if (activityImpl.getProperty("name").toString().length() > 7) {
                x = x - 20;
            }
            g.drawString(activityImpl.getProperty("name").toString(), x - 10, y - 5);
        }
    }

    public void drawExclusive(int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_RED);
        g.setStroke(THICK_TASK_BORDER_STROKE);
        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);

        g.setPaint(originalPaint);
        g.setStroke(originalStroke);


    }

    public void drawInclusiveGateway(int x, int y, int width, int height) {
        // rhombus
        drawGateway(x, y, width, height);

        int diameter = width / 2;

        // circle inside rhombus
        Stroke orginalStroke = g.getStroke();
        g.setStroke(GATEWAY_TYPE_STROKE);
        Ellipse2D.Double circle = new Ellipse2D.Double(((width - diameter) / 2) + x, ((height - diameter) / 2) + y, diameter, diameter);
        g.draw(circle);
        g.setStroke(orginalStroke);
    }

    public void drawMultiInstanceMarker(boolean sequential, int x, int y, int width, int height) {
        int rectangleWidth = MARKER_WIDTH;
        int rectangleHeight = MARKER_WIDTH;
        int lineX = x + (width - rectangleWidth) / 2;
        int lineY = y + height - rectangleHeight - 3;

        Stroke orginalStroke = g.getStroke();
        g.setStroke(MULTI_INSTANCE_STROKE);

        if (sequential) {
            g.draw(new Line2D.Double(lineX, lineY, lineX + rectangleWidth, lineY));
            g.draw(new Line2D.Double(lineX, lineY + rectangleHeight / 2, lineX + rectangleWidth, lineY + rectangleHeight / 2));
            g.draw(new Line2D.Double(lineX, lineY + rectangleHeight, lineX + rectangleWidth, lineY + rectangleHeight));
        } else {
            g.draw(new Line2D.Double(lineX, lineY, lineX, lineY + rectangleHeight));
            g.draw(new Line2D.Double(lineX + rectangleWidth / 2, lineY, lineX + rectangleWidth / 2, lineY + rectangleHeight));
            g.draw(new Line2D.Double(lineX + rectangleWidth, lineY, lineX + rectangleWidth, lineY + rectangleHeight));
        }

        g.setStroke(orginalStroke);
    }

    //修改以走过流程节点为蓝色
    public void drawHighLight(int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();
        g.setPaint(HIGHLIGHT_COLOR);//椭圆矩形 背景色
        g.setStroke(THICK_TASK_BORDER_STROKE);//线宽
        //绘制背景椭圆矩形
        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);
        //设置背景色
        g.setPaint(originalPaint);
        //设置线宽
        g.setStroke(originalStroke);
    }

    //修改以走过流程网关为蓝色
    public void drawHighLight2(ActivityImpl activity, int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();
        drawGateway2(x, y, width, height);
        g.setPaint(HIGHLIGHT_COLOR);
        g.setStroke(THICK_TASK_BORDER_STROKE);

   /*     RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);*/
        int quarterWidth = width / 4;
        int quarterHeight = height / 4;
        if (activity.getProperty("type").equals("parallelGateway")) {
            Line2D.Double line = new Line2D.Double(x + 10, y + height / 2, x + width - 10, y + height / 2); // horizontal
            g.draw(line);
            line = new Line2D.Double(x + width / 2, y + height - 10, x + width / 2, y + 10); // vertical
            g.draw(line);
        } else if (activity.getProperty("type").equals("inclusiveGateway")) {
            int diameter = width / 2;
            Ellipse2D.Double circle = new Ellipse2D.Double(((width - diameter) / 2) + x, ((height - diameter) / 2) + y, diameter, diameter);
            g.draw(circle);
        } else {
            Line2D.Double line = new Line2D.Double(x + quarterWidth + 3, y + quarterHeight + 3, x + 3 * quarterWidth - 3, y + 3 * quarterHeight - 3);
            g.draw(line);
            line = new Line2D.Double(x + quarterWidth + 3, y + 3 * quarterHeight - 3, x + 3 * quarterWidth - 3, y + quarterHeight + 3);
            g.draw(line);
        }
        if (activity.getProperty("name") != null) {
            g.setColor(Color.BLACK);
            if (activity.getProperty("name").toString().length() > 7) {
                x = x - 20;
            }
            g.drawString(activity.getProperty("name").toString(), x - 10, y - 5);
        }
        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    //修改不同意打回节点为红色
    public void drawHighLight3(ActivityImpl activity, int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();
        drawGateway3(x, y, width, height);
        g.setPaint(HIGHLIGHT_RED);
        g.setStroke(THICK_TASK_BORDER_STROKE);
   /*     RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);*/
        int quarterWidth = width / 4;
        int quarterHeight = height / 4;
        if (activity.getProperty("type").equals("parallelGateway")) {
            Line2D.Double line = new Line2D.Double(x + 10, y + height / 2, x + width - 10, y + height / 2); // horizontal
            g.draw(line);
            line = new Line2D.Double(x + width / 2, y + height - 10, x + width / 2, y + 10); // vertical
            g.draw(line);
        } else if (activity.getProperty("type").equals("inclusiveGateway")) {
            int diameter = width / 2;
            Ellipse2D.Double circle = new Ellipse2D.Double(((width - diameter) / 2) + x, ((height - diameter) / 2) + y, diameter, diameter);
            g.draw(circle);
        } else {
            Line2D.Double line = new Line2D.Double(x + quarterWidth + 3, y + quarterHeight + 3, x + 3 * quarterWidth - 3, y + 3 * quarterHeight - 3);
            g.draw(line);
            line = new Line2D.Double(x + quarterWidth + 3, y + 3 * quarterHeight - 3, x + 3 * quarterWidth - 3, y + quarterHeight + 3);
            g.draw(line);
        }
        if (activity.getProperty("name") != null) {
            g.setColor(Color.BLACK);
            if (activity.getProperty("name").toString().length() > 7) {
                x = x - 20;
            }
            g.drawString(activity.getProperty("name").toString(), x - 10, y - 5);
        }
        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    public void drawHighLightRed(int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_COLOR_RED);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);

        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    public void drawHighLightRed2(int x, int y, int width, int height) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_COLOR_RED2);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        RoundRectangle2D rect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g.draw(rect);

        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    public void drawHighLightSequenceflow(int srcX, int srcY, int targetX, int targetY, boolean conditional) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_COLOR);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);
        drawArrowHead(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }
        g.setPaint(originalPaint);
        g.setStroke(originalStroke);
    }

    public void drawHighLightSequenceflow2(int srcX, int srcY, int targetX, int targetY, boolean conditional) {
        Paint originalPaint = g.getPaint();
        Stroke originalStroke = g.getStroke();

        g.setPaint(HIGHLIGHT_RED);
        g.setStroke(THICK_TASK_BORDER_STROKE);

        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);
        drawArrowHead(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }
        g.setPaint(originalPaint);
        g.setStroke(originalStroke);

    }

    public void drawSequenceflow(String name, int srcX, int srcY, int targetX, int targetY, boolean conditional) {
        Line2D.Double line = new Line2D.Double(srcX, srcY, targetX, targetY);
        g.draw(line);
        drawArrowHead(line);

        if (conditional) {
            drawConditionalSequenceFlowIndicator(line);
        }
        if (name != null) {
            if (srcY == targetY) {
                if (srcX >= targetX) {
                    srcX = srcX - 40;
                    srcY=srcY-5;
                } else {
                    srcX = srcX + 7;
                    srcY=srcY-5;
                }
            } else if (srcX == targetX) {
                if (srcY <= targetY) {
                    srcY = srcY + 15;
                    srcX = srcX - 10;
                } else {
                    srcY = srcY - 20;
                    srcX = srcX - 10;
                }
                //斜左上
            }else if(targetX<srcX&&targetY<srcY){
                srcY = srcY - 15;
                srcX = srcX - 15;
                //斜左下
            }else if(targetX<srcX&&targetY>srcY){
                srcY = srcY + 15;
                srcX = srcX - 15;
                //斜右上
            }else if(targetX>srcX&&targetY<srcY){
                srcY = srcY - 15;
                srcX = srcX + 15;
                //斜右下
            }else if(targetX>srcX&&targetY>srcY){
                srcY = srcY + 15;
                srcX = srcX + 15;
            }

            g.setColor(Color.BLACK);
            g.drawString(name, srcX, srcY);

        }
    }

	public void putParamMap(String key, String value) {
		// TODO Auto-generated method stub
		this.map.put(key, value);
		
	}
}