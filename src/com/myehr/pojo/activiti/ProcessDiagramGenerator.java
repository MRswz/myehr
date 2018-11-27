package com.myehr.pojo.activiti;

import org.activiti.bpmn.model.*;
import org.activiti.bpmn.model.Process;
import org.activiti.engine.impl.bpmn.parser.BpmnParse;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.*;
import org.activiti.engine.impl.pvm.process.Lane;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.*;
import javax.annotation.Resource;
import java.io.InputStream;
import java.util.*;

/**
 * 绘制流程工具类
 * 
 *
 */
public class ProcessDiagramGenerator  {
    static final Logger logger = Logger.getLogger(ProcessDiagramGenerator.class);
    protected static final Map<String, ActivityDrawInstruction> activityDrawInstructions = new HashMap<String, ActivityDrawInstruction>();

    static {
        // start event
        activityDrawInstructions.put("startEvent", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawNoneStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // start timer event
        activityDrawInstructions.put("startTimerEvent", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawTimerStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // signal catch
        activityDrawInstructions.put("intermediateSignalCatch", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCatchingSignalEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // signal throw
        activityDrawInstructions.put("intermediateSignalThrow", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawThrowingSignalEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // end event
        activityDrawInstructions.put("endEvent", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawNoneEndEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // error end event
        activityDrawInstructions.put("errorEndEvent", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawErrorEndEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // error start event
        activityDrawInstructions.put("errorStartEvent", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawErrorStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // task
        activityDrawInstructions.put("task", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // user task
        activityDrawInstructions.put("userTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawUserTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // script task
        activityDrawInstructions.put("scriptTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawScriptTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // service task
        activityDrawInstructions.put("serviceTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawServiceTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // receive task
        activityDrawInstructions.put("receiveTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawReceiveTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // send task
        activityDrawInstructions.put("sendTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawSendTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // manual task
        activityDrawInstructions.put("manualTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawManualTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // businessRuleTask task
        activityDrawInstructions.put("businessRuleTask", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawBusinessRuleTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // exclusive gateway
        activityDrawInstructions.put("exclusiveGateway", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawExclusiveGateway(activityImpl, activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // inclusive gateway
        activityDrawInstructions.put("inclusiveGateway", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawInclusiveGateway(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // parallel gateway
        activityDrawInstructions.put("parallelGateway", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawParallelGateway(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

        // Boundary timer
        activityDrawInstructions.put("boundaryTimer", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCatchingTimerEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // Boundary catch error
        activityDrawInstructions.put("boundaryError", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCatchingErroEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // Boundary signal event
        activityDrawInstructions.put("boundarySignal", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCatchingSignalEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // timer catch event
        activityDrawInstructions.put("intermediateTimer", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCatchingTimerEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                        activityImpl.getHeight());
            }
        });

        // subprocess
        activityDrawInstructions.put("subProcess", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                Boolean isExpanded = (Boolean) activityImpl.getProperty(BpmnParse.PROPERTYNAME_ISEXPANDED);
                Boolean isTriggeredByEvent = (Boolean) activityImpl.getProperty("triggeredByEvent");
                if (isTriggeredByEvent == null) {
                    isTriggeredByEvent = Boolean.TRUE;
                }
                if (isExpanded != null && isExpanded == false) {
                    processDiagramCreator.drawCollapsedSubProcess((String) activityImpl.getProperty("name"), activityImpl.getX(),
                            activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight(), isTriggeredByEvent);
                } else {
                    processDiagramCreator.drawExpandedSubProcess((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                            activityImpl.getWidth(), activityImpl.getHeight(), isTriggeredByEvent);
                }
            }
        });

        // call activity
        activityDrawInstructions.put("callActivity", new ActivityDrawInstruction() {
            @Override
            public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
                processDiagramCreator.drawCollapsedCallActivity((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                        activityImpl.getWidth(), activityImpl.getHeight());
            }
        });

    }

    /**
     * Generates a PNG diagram image of the given process definition, using the
     * diagram interchange information of the process.
     */
    public static InputStream generatePngDiagram(ProcessDefinitionEntity processDefinition,String processInstanceId) throws Exception {
        return generateDiagram(processDefinition, "png", Collections.<String>emptyList(),processInstanceId);
    }

    /**
     * Generates a JPG diagram image of the given process definition, using the
     * diagram interchange information of the process.
     */
    public static InputStream generateJpgDiagram(ProcessDefinitionEntity processDefinition,String processInstanceId) throws  Exception{
        return generateDiagram(processDefinition, "jpg", Collections.<String>emptyList(),processInstanceId);
    }

    protected static ProcessDiagramCanvas initProcessDiagramCanvas(ProcessDefinitionEntity processDefinition) {
        int minX = Integer.MAX_VALUE;
        int maxX = 0;
        int minY = Integer.MAX_VALUE;
        int maxY = 0;

        if (processDefinition.getParticipantProcess() != null) {
            ParticipantProcess pProc = processDefinition.getParticipantProcess();

            minX = pProc.getX();
            maxX = pProc.getX() + pProc.getWidth();
            minY = pProc.getY();
            maxY = pProc.getY() + pProc.getHeight();
        }

        for (ActivityImpl activity : processDefinition.getActivities()) {

            // width
            if (activity.getX() + activity.getWidth() > maxX) {
                maxX = activity.getX() + activity.getWidth();
            }
            if (activity.getX() < minX) {
                minX = activity.getX();
            }
            // height
            if (activity.getY() + activity.getHeight() > maxY) {
                maxY = activity.getY() + activity.getHeight();
            }
            if (activity.getY() < minY) {
                minY = activity.getY();
            }

            for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {
                List<Integer> waypoints = ((TransitionImpl) sequenceFlow).getWaypoints();
                for (int i = 0; i < waypoints.size(); i += 2) {
                    // width
                    if (waypoints.get(i) > maxX) {
                        maxX = waypoints.get(i);
                    }
                    if (waypoints.get(i) < minX) {
                        minX = waypoints.get(i);
                    }
                    // height
                    if (waypoints.get(i + 1) > maxY) {
                        maxY = waypoints.get(i + 1);
                    }
                    if (waypoints.get(i + 1) < minY) {
                        minY = waypoints.get(i + 1);
                    }
                }
            }
        }

       if (processDefinition.getLaneSets() != null && processDefinition.getLaneSets().size() > 0) {
            for (LaneSet laneSet : processDefinition.getLaneSets()) {
                if (laneSet.getLanes() != null && laneSet.getLanes().size() > 0) {
                    for (Lane lane : laneSet.getLanes()) {
                        // width
                        if (lane.getX() + lane.getWidth() > maxX) {
                            maxX = lane.getX() + lane.getWidth();
                        }
                        if (lane.getX() < minX) {
                            minX = lane.getX();
                        }
                        // height
                        if (lane.getY() + lane.getHeight() > maxY) {
                            maxY = lane.getY() + lane.getHeight();
                        }
                        if (lane.getY() < minY) {
                            minY = lane.getY();
                        }
                    }
                }
            }
        }
        return new ProcessDiagramCanvas(maxX + 10, maxY + 10, minX, minY);
    }


    protected interface ActivityDrawInstruction {
        void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl);
    }

    /**
     * [生成流程图，返回输入流]
     *
     * @param processDefinition
     * @param imageType
     * @param highLightedActivities
     * @return
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    public static InputStream generateDiagram(ProcessDefinitionEntity processDefinition, String imageType, List<String> highLightedActivities,String processInstanceId) throws Exception {
        // 通过流程图画布绘制出对应图像类型的流程图图片
        return generateDiagram(processDefinition, highLightedActivities,processInstanceId).generateImage(imageType);
    }

    /**
     * [生成流程图，返回流程图画布]
     *
     * @param processDefinition
     * @param highLightedActivities
     * @return
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    protected static ProcessDiagramCanvas generateDiagram(ProcessDefinitionEntity processDefinition, List<String> highLightedActivities,String processInstanceId) throws Exception {
        ProcessDiagramCanvas processDiagramCanvas = initProcessDiagramCanvas(processDefinition);

        // Draw pool shape, if process is participant in collaboration
        if (processDefinition.getParticipantProcess() != null) {
            ParticipantProcess pProc = processDefinition.getParticipantProcess();
            processDiagramCanvas.drawPoolOrLane(pProc.getName(), pProc.getX(), pProc.getY(), pProc.getWidth(), pProc.getHeight());
        }
        // Draw lanes
        if (processDefinition.getLaneSets() != null && processDefinition.getLaneSets().size() > 0) {
            for (LaneSet laneSet : processDefinition.getLaneSets()) {
                if (laneSet.getLanes() != null && laneSet.getLanes().size() > 0) {
                    for (Lane lane : laneSet.getLanes()) {
                        processDiagramCanvas.drawPoolOrLane(lane.getName(), lane.getX(), lane.getY(), lane.getWidth(), lane.getHeight());
                    }
                }
            }
        }

        // Draw activities and their sequence-flows
        // 循环当前流程定义中的所有节点，绘制节点和节点上的流程线，如果节点已经执行过这高亮显示
       /* for (ActivityImpl activity : processDefinition.getActivities()) {
            drawActivity(processDiagramCanvas, activity, highLightedActivities);
        }*/
        String id2=drawActivitys(processDiagramCanvas, processDefinition, highLightedActivities,processInstanceId);

        // 绘制当前所有已执行的节点的所有流出流程线，如果流程线已被执行过，则高亮显示
        for (int index = 1; index <= highLightedActivities.size(); index++) {
            for (ActivityImpl activity : processDefinition.getActivities()) {
                if (highLightedActivities.get(index - 1).equals(activity.getId())) {
                    drawActivityFlowHighLight(processDiagramCanvas, activity, highLightedActivities, index,id2);
                  /*  // 最后一个节点红色显示
                    if (index == highLightedActivities.size()) {
                        drawCurrentActivityRed(processDiagramCanvas, activity);
                    }*/
                }
            }
        }

        return processDiagramCanvas;
    }


    /**
     * [绘制流程图中高亮显示的流程线]
     *
     * @param processDiagramCanvas
     * @param activity
     * @param highLightedActivities
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    protected static void drawActivityFlowHighLight(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity, List<String> highLightedActivities, int index,String id2) throws  Exception{
        //logger.info("第【" + index + "】个节点=" + activity.getId());
        // Outgoing transitions of activity
        // 绘制当前节点的所有流出流程线，如果流程线已被执行过，则高亮显示
        int flowIndex = 1;
        boolean isHighLightedFlow;
        boolean flag;
        boolean timeFlag;
        String id = null;
        List<Integer> waypoints = null;
        ActivityImpl lastActivityImpl = null;
        String type = (String) activity.getProperty("type");
//遍历当前节点的所有走向
        for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {
            //logger.info("节点的第[" + flowIndex + "]条流出流程线=" + sequenceFlow.getId());
            //变蓝标识
            isHighLightedFlow = false;
            //变红标识
            flag = false;
            timeFlag = false;
            // 当前流程线对应的后续节点
            lastActivityImpl = (ActivityImpl) sequenceFlow.getDestination();
            //logger.info("流程线[" + sequenceFlow.getId() + "]对应的后续节点ID=[" + lastActivityImpl.getId() + "]");
            // 当前节点的后续节点在需高亮显示的节点List中，并且当前节点已经执行过就是也在高亮显示的节点List中，
            if (highLightedActivities.contains(lastActivityImpl.getId()) && highLightedActivities.contains(activity.getId())) {
                // 获取在已执行节点List中当前节点的下一个节点ID
                // 【注意：以下处理对于并发的处理可能不完善，遇到时再进行具体处理】
// 如果下一个节点是当前流程线指向的节点，则流程线高亮显示
                if (index >= highLightedActivities.size()) {
                    // 没有下一个节点，当前的流程线不高亮显示
                    // logger.info("流程线[" + sequenceFlow.getId() + "]不需要高亮显示");
                } else if (lastActivityImpl.getId().equals(highLightedActivities.get(index))) {
                    isHighLightedFlow = true;
                    //判断是否包含倒数第三个节点（当前节点为起草人）
                    if(id2!=null){
                        //如果该节点是当前节点赋值变红标识
                        if(id2.equals(activity.getId())){
                            flag=true;
                        }
                    }
                    //判断节点类型是否为现在的节点类型是否为包含网关或排他网关
                    if (type.equals("exclusiveGateway") || type.equals("inclusiveGateway")) {
                        //h获取流程走向中的条件
                        Object conditionText = sequenceFlow.getProperty("conditionText");
                        //如果条件不为空
                        if(conditionText!=null) {
                            //如果条件包含不同意
                            if (conditionText.toString().contains("不同意")) {
                                flag = true;
                            }
                        }
                    }

                    //  logger.info("流程线【" + sequenceFlow.getId() + "】需要高亮显示");
                } else {
                    if (type.equals("parallelGateway")) {
                        isHighLightedFlow = true;
                    }
                    if (highLightedActivities.contains(activity.getId()) && type.equals("userTask")) {
                        isHighLightedFlow = true;
                    }
                  /* */

                }
            } else {
                if (type.equals("userTask") && !activity.getActivities().isEmpty()) {
                    //绘制定时任务的线条
                    if (activity.getActivities().get(0).getProperty("type").equals("boundaryTimer")) {
                        if (highLightedActivities.contains(activity.getActivities().get(0).getOutgoingTransitions().get(0).getDestination().getId())) {
                            isHighLightedFlow = true;
                            timeFlag = true;
                            waypoints = ((TransitionImpl) activity.getActivities().get(0).getOutgoingTransitions().get(0)).getWaypoints();
                        }
                    }
                }
                // logger.info("---流程线[" + sequenceFlow.getId() + "]不需要高亮显示");
            }
            /*如果是定时任务获取定时任务的坐标*/
            if (!timeFlag) {
                waypoints = ((TransitionImpl) sequenceFlow).getWaypoints();
            }
            for (int i = 2; i < waypoints.size(); i += 2) { // waypoints.size() // minimally 4: x1, y1, // x2, y2
                boolean drawConditionalIndicator = (i == 2) && sequenceFlow.getProperty(BpmnParse.PROPERTYNAME_CONDITION) != null
                        && !((String) activity.getProperty("type")).toLowerCase().contains("gateway");
                if (i < waypoints.size() - 2) {
                    // 绘制一条流程线中不带箭头的直线部分
                    if (isHighLightedFlow) {

                        if (flag) {
                            processDiagramCanvas.drawHighLightSequenceflowWithoutArrow2(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i),
                                    waypoints.get(i + 1), drawConditionalIndicator);
                        } else {
                            processDiagramCanvas.drawHighLightSequenceflowWithoutArrow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i),
                                    waypoints.get(i + 1), drawConditionalIndicator);
                        }
                    }
                } else {
                    // 绘制一条流程线中带箭头的直线部分
                    if (isHighLightedFlow) {
                        String name = null;
                        if (sequenceFlow.getProperty("name") != null) {
                            name = sequenceFlow.getProperty("name").toString();
                        }
                        if (flag) {
                            /*绘制红色*/
                            processDiagramCanvas.drawHighLightSequenceflow2(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1),
                                    drawConditionalIndicator);
                        } else {
                            /*绘制蓝色*/
                            processDiagramCanvas.drawHighLightSequenceflow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1),
                                    drawConditionalIndicator);
                        }
                    }
                }
            }
            flowIndex++;
        }

        // Nested activities (boundary events)
        // 循环绘制当前节点下的子节点
        for (ActivityImpl nestedActivity : activity.getActivities()) {
            drawActivity(processDiagramCanvas, nestedActivity, highLightedActivities);
        }
    }

    /**
     * [绘制流程图中的节点和节点上的流程线]
     *
     * @param processDiagramCanvas
     * @param activity
     * @param highLightedActivities
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    protected static void drawActivity(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity, List<String> highLightedActivities) throws Exception{
        // 获取节点类型
        String type = (String) activity.getProperty("type");
        ActivityDrawInstruction drawInstruction = activityDrawInstructions.get(type);
        if (drawInstruction != null) {

            drawInstruction.draw(processDiagramCanvas, activity);

            // Gather info on the multi instance marker
            boolean multiInstanceSequential = false, multiInstanceParallel = false, collapsed = false;
            String multiInstance = (String) activity.getProperty("multiInstance");
            if (multiInstance != null) {
                if ("sequential".equals(multiInstance)) {
                    multiInstanceSequential = true;
                } else {
                    multiInstanceParallel = true;
                }
            }

            // Gather info on the collapsed marker
            Boolean expanded = (Boolean) activity.getProperty(BpmnParse.PROPERTYNAME_ISEXPANDED);
            if (expanded != null) {
                collapsed = !expanded;
            }

            // Actually draw the markers
            processDiagramCanvas.drawActivityMarkers(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight(),
                    multiInstanceSequential, multiInstanceParallel, collapsed);

            // Draw highlighted activities
            // 如果高亮节点List中包含当前节点，则当前节点绘制为高亮样式
//            logger.info("当前节点=【" + activity.getId() + "】");
//            logger.info("节点类型：[" + type + "]");

            if (highLightedActivities.contains(activity.getId())) {
                //最后一个节点高亮显示(橙色）
                String id = "";
                if (highLightedActivities.get(highLightedActivities.size() - 1).equals(activity.getId())) {
                    //修改背景颜色
                    if (type.equals("userTask")) {
                        processDiagramCanvas.drawUserTask3((String) activity.getProperty("name"), activity.getX(), activity.getY(),
                                activity.getWidth(), activity.getHeight());
                        if (activity.getIncomingTransitions() != null) {
                            List<PvmTransition> incomingTransitions = activity.getIncomingTransitions();
                            for (PvmTransition p : incomingTransitions) {
                                if (p.getProperty("conditionText") != null) {
                                    if (p.getProperty("conditionText").toString().contains("不同意")) {
                                        if (highLightedActivities.get(highLightedActivities.size() - 2).equals(p.getSource().getId())) {
                                            ActivityImpl source = (ActivityImpl) p.getSource();
                                            String types = (String) source.getProperty("type");
                                            id = source.getId();
                                            processDiagramCanvas.drawExclusive(source.getX(), source.getY(), source.getWidth(), source.getHeight());
                                          /*  processDiagramCanvas.drawUserTask3((String) source.getProperty("name"), source.getX(), source.getY(),
                                                    activity.getWidth(), activity.getHeight());*/
                                        }

                                    }
                                }
                            }
                        }
                    }
                    drawCurrentActivityRed(processDiagramCanvas, activity);
                } else {
                    if (type.equals("userTask")) {
                        if (!id.equals(activity.getId())) {
                            processDiagramCanvas.drawUserTask2((String) activity.getProperty("name"), activity.getX(), activity.getY(),
                                    activity.getWidth(), activity.getHeight());
                        }
                    }
                    //已执行过的（高亮显示蓝色）
                    drawHighLight(processDiagramCanvas, activity);
                }
            } /*else {

                //未执行过的显示深蓝色（不包括定时边界任务）
                if (!type.equals("exclusiveGateway") && !type.equals("boundaryTimer")) {
                    drawCurrentActivityRed2(processDiagramCanvas, activity);
                }

            }*/

        }

        // Outgoing transitions of activity

        for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {

            List<Integer> waypoints = ((TransitionImpl) sequenceFlow).getWaypoints();
            for (int i = 2; i < waypoints.size(); i += 2) { // waypoints.size() // minimally 4: x1, y1, // x2, y2
                boolean drawConditionalIndicator = (i == 2) && sequenceFlow.getProperty(BpmnParse.PROPERTYNAME_CONDITION) != null
                        && !((String) activity.getProperty("type")).toLowerCase().contains("gateway");
                String name = null;
                if (sequenceFlow.getProperty("name") != null) {
                    name = sequenceFlow.getProperty("name").toString();
                }
                if (i < waypoints.size() - 2) {
                    // 绘制一条流程线中不带箭头的直线部分
                    processDiagramCanvas.drawSequenceflowWithoutArrow(name, waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i),
                            waypoints.get(i + 1), drawConditionalIndicator);
                } else {
                    processDiagramCanvas.drawSequenceflow(name, waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1),
                            drawConditionalIndicator);
                }
            }
        }

        // Nested activities (boundary events)
        // 循环绘制当前节点下的子节点
        for (ActivityImpl nestedActivity : activity.getActivities()) {
            drawActivity(processDiagramCanvas, nestedActivity, highLightedActivities);
        }
    }

    protected static String drawActivitys(ProcessDiagramCanvas processDiagramCanvas, ProcessDefinitionEntity processDefinition, List<String> highLightedActivities,String processInstanceId) throws Exception {
        // 获取节点类型
        String id = "";
        //倒数第三以执行节点
        String id2 = "";
        for (ActivityImpl activity : processDefinition.getActivities()) {
            String type = (String) activity.getProperty("type");
            ActivityDrawInstruction drawInstruction = activityDrawInstructions.get(type);
            if (drawInstruction != null) {
                if (!id.equals(activity.getId()) &&!id2.equals(activity.getId())) {
                    drawInstruction.draw(processDiagramCanvas, activity);
                }
                // Gather info on the multi instance marker
                boolean multiInstanceSequential = false, multiInstanceParallel = false, collapsed = false;
                String multiInstance = (String) activity.getProperty("multiInstance");
                if (multiInstance != null) {
                    if ("sequential".equals(multiInstance)) {
                        multiInstanceSequential = true;
                    } else {
                        multiInstanceParallel = true;
                    }
                }

                // Gather info on the collapsed marker
                Boolean expanded = (Boolean) activity.getProperty(BpmnParse.PROPERTYNAME_ISEXPANDED);
                if (expanded != null) {
                    collapsed = !expanded;
                }

                // Actually draw the markers
                processDiagramCanvas.drawActivityMarkers(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight(),
                        multiInstanceSequential, multiInstanceParallel, collapsed);


                if (highLightedActivities.contains(activity.getId())) {
                    //最后一个节点高亮显示(橙色）
                    if (highLightedActivities.get(highLightedActivities.size() - 1).equals(activity.getId())) {//是否是最后一个节点
                        //修改背景颜色
                        //判断是否用户节点
                        if (type.equals("userTask")) {
                            //传入参数  processInstanceId 流程实例id和taskDefKey 已完成流程id
                            processDiagramCanvas.putParamMap("processInstanceId",processInstanceId);
                            processDiagramCanvas.putParamMap("taskDefKey",activity.getId());
                            //修改单前节点背景为橙色
                            processDiagramCanvas.drawUserTask3((String) activity.getProperty("name"), activity.getX(), activity.getY(),
                                    activity.getWidth(), activity.getHeight());
                            //判断单前节点的上一个节点是否为空
                            if (activity.getIncomingTransitions() != null) {
                                //获取当前节点的所有上一个节点
                                List<PvmTransition> incomingTransitions = activity.getIncomingTransitions();
                                for (PvmTransition p : incomingTransitions) {
                                    if (p.getProperty("conditionText") != null) {
                                        //判断是否是不同意来源
                                        if (p.getProperty("conditionText").toString().contains("不同意")) {
                                            //判断以执行节点中倒数第二个是否包含当前节点的上一个节点
                                            if (highLightedActivities.get(highLightedActivities.size() - 2).equals(p.getSource().getId())) {
                                                //类型转换
                                                ActivityImpl source = (ActivityImpl) p.getSource();
                                                String types = (String) source.getProperty("type");
                                                id = source.getId();
                                                //判断是否是排他网关
                                                if(types.equals("exclusiveGateway")||types.equals("parallelGateway")||types.equals("inclusiveGateway")){
                                                    //绘制当前节点的上一个节点为红色
                                                    drawHighLight3(processDiagramCanvas, source);
                                                }
                                                //通过当前节点的上个一节点找到上个节点上所有来源
                                                List<PvmTransition> incomingTransitions1 = source.getIncomingTransitions();
                                                for (PvmTransition pt : incomingTransitions1) {
                                                    ActivityImpl source1 = (ActivityImpl) pt.getSource();
                                                    //找到倒数第三个节点
                                                    if (highLightedActivities.get(highLightedActivities.size() - 3).equals(source1.getId())) {

                                                        id2=drawUserTaskAndUser(processDiagramCanvas,source1,processInstanceId);

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        //修改单前节点边框为橙色
                        drawCurrentActivityRed(processDiagramCanvas, activity);
                    } else {//如果不是最后一个节点
                        if (type.equals("userTask")) { //type 是否为 userTask
                            if (!id.equals(activity.getId()) && !id2.equals(activity.getId())) {
                                //传入参数  processInstanceId 流程实例id和taskDefKey 已完成流程id
                                processDiagramCanvas.putParamMap("processInstanceId",processInstanceId);
                                processDiagramCanvas.putParamMap("taskDefKey",activity.getId());
                                processDiagramCanvas.drawUserTask2((String) activity.getProperty("name"), activity.getX(), activity.getY(),
                                        activity.getWidth(), activity.getHeight());
                            }
                        }
                        //已执行过的（高亮显示蓝色）
                        if (!id.equals(activity.getId()) && !id2.equals(activity.getId())) {
                            if(type.equals("exclusiveGateway")||type.equals("parallelGateway")||type.equals("inclusiveGateway")){
                                drawHighLight2(processDiagramCanvas, activity);
                            }else{
                            drawHighLight(processDiagramCanvas, activity);}
                        }

                    }
                }
            }

            for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {

                List<Integer> waypoints = ((TransitionImpl) sequenceFlow).getWaypoints();
                for (int i = 2; i < waypoints.size(); i += 2) { // waypoints.size() // minimally 4: x1, y1, // x2, y2
                    boolean drawConditionalIndicator = (i == 2) && sequenceFlow.getProperty(BpmnParse.PROPERTYNAME_CONDITION) != null
                            && !((String) activity.getProperty("type")).toLowerCase().contains("gateway");
                    String name = null;
                    if (sequenceFlow.getProperty("name") != null) {
                        name = sequenceFlow.getProperty("name").toString();
                    }
                    if (i < waypoints.size() - 2) {
                        // 绘制一条流程线中不带箭头的直线部分
                        if (i >= 4) {
                            name = null;
                        }
                        //绘制线条增加显示名称
                        processDiagramCanvas.drawSequenceflowWithoutArrow(name, waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i),
                                waypoints.get(i + 1), drawConditionalIndicator);
                    } else {
                        if (waypoints.size() > 4) {
                            name = null;
                        }
                        //绘制线条增加显示名称
                        processDiagramCanvas.drawSequenceflow(name, waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1),
                                drawConditionalIndicator);
                    }
                }
            }

            // Nested activities (boundary events)
            // 循环绘制当前节点下的子节点
            for (ActivityImpl nestedActivity : activity.getActivities()) {
                drawActivity(processDiagramCanvas, nestedActivity, highLightedActivities);
            }
        }
        return id2;
    }

    private static void drawHighLight(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
        processDiagramCanvas.drawHighLight(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());
    }

    private static String drawUserTaskAndUser(ProcessDiagramCanvas processDiagramCanvas,ActivityImpl source1,String processInstanceId) throws Exception{
        String types1 = (String) source1.getProperty("type");
        String  id2 = source1.getId();
        if(types1.equals("userTask")) {
            //传入参数  processInstanceId 流程实例id和taskDefKey 当前流程id
            processDiagramCanvas.putParamMap("processInstanceId",processInstanceId);
            processDiagramCanvas.putParamMap("taskDefKey",source1.getId());
            //修改背景颜色
            processDiagramCanvas.drawUserTask4((String) source1.getProperty("name"), source1.getX(), source1.getY(),
                    source1.getWidth(), source1.getHeight());
            //修改边框颜色
            processDiagramCanvas.drawExclusive(source1.getX(), source1.getY(), source1.getWidth(), source1.getHeight());
        }else if(types1.equals("exclusiveGateway")||types1.equals("parallelGateway")||types1.equals("inclusiveGateway")){
            drawHighLight3(processDiagramCanvas, source1);
        }
        return id2;
    }
    /**
     * [绘制高亮显示的节点]
     *
     * @param processDiagramCanvas
     * @param activity
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    private static void drawHighLight2(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
        processDiagramCanvas.drawHighLight2(activity,activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());
    }
    private static void drawHighLight3(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
        processDiagramCanvas.drawHighLight3(activity,activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());
    }
    /**
     * [绘制当前节点红色显示]
     *
     * @param processDiagramCanvas
     * @param activity
     * @Author: [Double]
     * @CreateDate: [2015-10-22]
     * @Version: [v2.0.0]
     */
    private static void drawCurrentActivityRed(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
        processDiagramCanvas.drawHighLightRed(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());
    }

    private static void drawCurrentActivityRed2(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
        processDiagramCanvas.drawHighLightRed2(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());
    }

    public static ProcessDiagramCanvas initProcessDiagramCanvas(BpmnModel bpmnModel) {
        // We need to calculate maximum values to know how big the image will be in its entirety
        double minX = Double.MAX_VALUE;
        double maxX = 0;
        double minY = Double.MAX_VALUE;
        double maxY = 0;

        for (Pool pool : bpmnModel.getPools()) {
            GraphicInfo graphicInfo = bpmnModel.getGraphicInfo(pool.getId());
            minX = graphicInfo.getX();
            maxX = graphicInfo.getX() + graphicInfo.getWidth();
            minY = graphicInfo.getY();
            maxY = graphicInfo.getY() + graphicInfo.getHeight();
        }

        List<FlowNode> flowNodes = gatherAllFlowNodes(bpmnModel);

        for (FlowNode flowNode : flowNodes) {
            GraphicInfo flowNodeGraphicInfo = bpmnModel.getGraphicInfo(flowNode.getId());
            // width
            if (flowNodeGraphicInfo.getX() + flowNodeGraphicInfo.getWidth() > maxX) {
                maxX = flowNodeGraphicInfo.getX() + flowNodeGraphicInfo.getWidth();
            }
            if (flowNodeGraphicInfo.getX() < minX) {
                minX = flowNodeGraphicInfo.getX();
            }
            // height
            if (flowNodeGraphicInfo.getY() + flowNodeGraphicInfo.getHeight() > maxY) {
                maxY = flowNodeGraphicInfo.getY() + flowNodeGraphicInfo.getHeight();
            }
            if (flowNodeGraphicInfo.getY() < minY) {
                minY = flowNodeGraphicInfo.getY();
            }

            for (SequenceFlow sequenceFlow : flowNode.getOutgoingFlows()) {
                List<GraphicInfo> graphicInfoList = bpmnModel.getFlowLocationGraphicInfo(sequenceFlow.getId());
                for (GraphicInfo graphicInfo : graphicInfoList) {
                    // width
                    if (graphicInfo.getX() > maxX) {
                        maxX = graphicInfo.getX();
                    }
                    if (graphicInfo.getX() < minX) {
                        minX = graphicInfo.getX();
                    }
                    // height
                    if (graphicInfo.getY() > maxY) {
                        maxY = graphicInfo.getY();
                    }
                    if (graphicInfo.getY() < minY) {
                        minY = graphicInfo.getY();
                    }
                }
            }
        }

        int nrOfLanes = 0;
        for (Process process : bpmnModel.getProcesses()) {
            for (org.activiti.bpmn.model.Lane l : process.getLanes()) {

                nrOfLanes++;

                GraphicInfo graphicInfo = bpmnModel.getGraphicInfo(l.getId());
                // // width
                if (graphicInfo.getX() + graphicInfo.getWidth() > maxX) {
                    maxX = graphicInfo.getX() + graphicInfo.getWidth();
                }
                if (graphicInfo.getX() < minX) {
                    minX = graphicInfo.getX();
                }
                // height
                if (graphicInfo.getY() + graphicInfo.getHeight() > maxY) {
                    maxY = graphicInfo.getY() + graphicInfo.getHeight();
                }
                if (graphicInfo.getY() < minY) {
                    minY = graphicInfo.getY();
                }
            }
        }

        // Special case, see http://jira.codehaus.org/browse/ACT-1431
        if (flowNodes.size() == 0 && bpmnModel.getPools().size() == 0 && nrOfLanes == 0) {
            // Nothing to show
            minX = 0;
            minY = 0;
        }

        return new ProcessDiagramCanvas((int) maxX + 10, (int) maxY + 10, (int) minX, (int) minY);
    }

    protected static List<FlowNode> gatherAllFlowNodes(FlowElementsContainer flowElementsContainer) {
        List<FlowNode> flowNodes = new ArrayList<FlowNode>();

        for (FlowElement flowElement : flowElementsContainer.getFlowElements()) {
            if (flowElement instanceof FlowNode) {
                flowNodes.add((FlowNode) flowElement);
            }

            if (flowElement instanceof FlowElementsContainer) {
                flowNodes
                        .addAll(gatherAllFlowNodes((FlowElementsContainer) flowElement));
            }
        }

        return flowNodes;
    }

    protected static List<FlowNode> gatherAllFlowNodes(BpmnModel bpmnModel) {
        List<FlowNode> flowNodes = new ArrayList<FlowNode>();

        for (Process process : bpmnModel.getProcesses()) {
            flowNodes.addAll(gatherAllFlowNodes(process));
        }

        return flowNodes;
    }


}