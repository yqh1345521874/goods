package com.accp.jsp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.accp.jsp.dao.CatDao;
import com.accp.jsp.entity.Cat;
import com.accp.jsp.util.DbHelper;

public class CatDaoImpl implements CatDao {

	@Override
	public List<Cat> selectCat(int userid) {
		List<Cat> list=null;
		Connection conn=null;
		String sql="SELECT cat.`id`,`image`,`goodsType`,`descrption`,goods.`price`,`color`,`cont`,goods.`Price` FROM `cat`,`goods` WHERE `cat`.`goodsId`=goods.id and userid=?";
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.query(conn, sql,new BeanListHandler<Cat>(Cat.class),userid);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int delete(int id) {
		String sql=" DELETE FROM `cat` WHERE `id`=?";
		Connection conn=null;
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.update(conn, sql,id);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int update(int count,int id,double zPrice) {
		String sql="update `cat` set cont=?,zPrice=? where id=?";
		Connection conn=null;
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.update(conn, sql,count,id,zPrice);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public Cat selectByid(int id) {
		String sql="";
		return null;
	}
	
	
	
}
