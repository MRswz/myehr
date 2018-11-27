package com.myehr.common.mybatis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.controller.login.Login;

public class MybatisUtil {
	
	private static Logger logger = LoggerFactory.getLogger(MybatisUtil.class);
	
	public static SqlSessionFactory getSqlSessionFactory(){
		
		String contextholderKey = CustomerContextHolder.getContextType();
		if (contextholderKey==null) {
			contextholderKey = "dafaultsource";
		}
		logger.info(contextholderKey);
		
		return  (SqlSessionFactory) SpringContextUtils.getBeanById(contextholderKey+"sqlsessionfactory");
	}
	
	public static BasicDataSource getBasicDataSource(){
		
		String contextholderKey = CustomerContextHolder.getContextType();
		if (contextholderKey==null) {
			contextholderKey = "dafaultsource";
		}
		return  (BasicDataSource) SpringContextUtils.getBeanById(contextholderKey);

	}
	
	/**
	 * 查询一条数据
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static<T> T  queryOne(String sqlId,Object params) throws Exception{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			 return  sqlSession.selectOne(sqlId, params);
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 查询多条数据
	 * @param <T>
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static <T> List<T>  queryList(String sqlId,Object params) throws Exception{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			 return  sqlSession.selectList(sqlId, params);
		}catch (RuntimeException e) {
			// TODO: handle exception
			logger.info(e.getMessage());
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 分页查询多条数据
	 * @param <T>
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T>  queryListWithPage(String sqlId,Object params,Pager page) throws Exception{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			PageHelper.startPage(page.start, page.limt,true);		
			Page<T> p =  (Page<T>) sqlSession.selectList(sqlId, params);
			page.total =p.getTotal(); 
			return p;
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 插入操作
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static int  insert(String sqlId,Object params) throws Exception{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			 return  sqlSession.insert(sqlId, params);
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 插入操作
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static int  insert1(String sqlId,Object params) throws RuntimeException{
		SqlSession sqlSession =  MybatisUtil.getSqlSessionFactory().openSession();
		try {
			  int res =   sqlSession.insert(sqlId, params);
			  return res;
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  new  RuntimeException(e);
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}

	/**
	 * 更新操作
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static int  update(String sqlId,Object params) throws Exception{
		SqlSession sqlSession =  MybatisUtil.getSqlSessionFactory().openSession();
		try {
			 return  sqlSession.update(sqlId, params);
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 删除操作
	 * @param sqlId
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static int  delete(String sqlId,Object params) throws Exception{
		SqlSession sqlSession =  MybatisUtil.getSqlSessionFactory().openSession();
		try {
			 return  sqlSession.delete(sqlId, params);
		}catch (RuntimeException e) {
			// TODO: handle exception
			throw  new  RuntimeException(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	
	public static Connection getConnection(){
		try {
			return   MybatisUtil.getBasicDataSource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			logger.error(e.getMessage(),e);
		}
		return null;
	}
	
	public static int execSql(String sql) throws DcfException{
		Connection conn =  null;
		Statement stat = null;
		try {
			conn = MybatisUtil.getBasicDataSource().getConnection();
			stat = conn.createStatement();
			stat.execute(sql);
			
		}catch (Exception e) {
			throw new DcfException(e.getMessage());
		}finally{
			close(null,stat,conn);
		}
		return 0;
	}
	/**
	    * 关闭连接
	    */
	   public static void close(ResultSet rs,Statement stat,Connection conn){
	       if(rs!=null){
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();logger.error(e.getMessage(),e);
	    			logger.error(e.getMessage(),e);
	            }finally{
	                rs=null;
	            }
	        }
	        if(stat!=null){
	            try {
	                stat.close();
	            } catch (SQLException e) {
	                e.printStackTrace();logger.error(e.getMessage(),e);
	    			logger.error(e.getMessage(),e);
	            }finally{
	                stat=null;
	            }
	        }
	        if(conn!=null){
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();logger.error(e.getMessage(),e);
	    			logger.error(e.getMessage(),e);
	            }finally{
	                conn=null;
	            }
	        }
	   }
	
}
