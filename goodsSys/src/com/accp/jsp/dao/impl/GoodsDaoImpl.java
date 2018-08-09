package com.accp.jsp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.accp.jsp.dao.GoodsDao;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.util.DbHelper;

public class GoodsDaoImpl implements GoodsDao{

	@Override
	public List<Goods> selectAll() {
		List<Goods> list=null;
		Connection conn=null;
		String sql="SELECT `goodsType`,`descrption`,`color`,`price`,`image`,id FROM `goods`";
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.query(conn, sql, new BeanListHandler<Goods>(Goods.class));
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
	public Goods selectId(int id){
		Connection conn=null;
		String sql="SELECT * FROM `goods` WHERE id=?";
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.query(conn, sql,new BeanHandler<Goods>(Goods.class),id);
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
		return null;
	}

	@Override
	public int insertCat(int uid,int gid,double jg,int cont) {
		Connection conn=null;
		String sql="INSERT INTO `cat`(userid,goodsId,zprice,cont,CreatedDate) VALUES(?,?,?,?,now())";
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.update(conn, sql,uid,gid, jg,cont);
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

}
