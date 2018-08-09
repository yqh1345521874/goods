package com.accp.jsp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.accp.jsp.dao.GoodsDao;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.util.DbHelper;

public class GoodsDaoimpl implements GoodsDao {




	@Override
	public List<Goods> selectALL() {
		Connection conn = null;
		List<Goods> list = null;
		// 获得连接对象
	
		try {
			conn = DbHelper.getConnection();
			String sql = "SELECT goodsid,goodsName,goodsType,goodsClassId,goodsPrice FROM goods";
			QueryRunner query = new QueryRunner();
			list = query.query(conn, sql, new BeanListHandler<Goods>(Goods.class));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	public int delete(int goodsId) {
		String sql = "delete from goods where goodsId=?";
		Connection conn = null;
		try {
			conn = DbHelper.getConnection();
			QueryRunner query = new QueryRunner();
			return query.update(conn, sql, goodsId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int update(Goods goods) {
		String sql = "update goods set goodsName=?,goodsType=?,goodsClassId=?,goodsPrice=? where goodsId=?";
		Connection conn = null;
		try {
			conn = DbHelper.getConnection();
			QueryRunner query = new QueryRunner();
			return query.update(conn, sql, goods.getGoodsName(), goods.getGoodsType(), goods.getGoodsClassId(),
					goods.getGoodsPrice(),goods.getGoodsId());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	public int insert(Goods goods) {
		String sql = "insert into goods values(0,?,?,?,?)";
		Connection conn = null;
		try {
			conn = DbHelper.getConnection();
			QueryRunner query = new QueryRunner();
			return query.update(conn, sql, goods.getGoodsName(), goods.getGoodsType(), goods.getGoodsClassId(),
					goods.getGoodsPrice());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
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
	public Goods selectById(int goodsId) { 
		String sql = "select * from goods where goodsId=?";
		Connection conn = null;
		try {
			conn = DbHelper.getConnection();
			QueryRunner query = new QueryRunner();
			return query.query(conn, sql, new BeanHandler<Goods>(Goods.class), goodsId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}


}
