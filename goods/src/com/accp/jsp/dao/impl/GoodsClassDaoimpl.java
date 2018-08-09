package com.accp.jsp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.accp.jsp.dao.GoodsClassDao;
import com.accp.jsp.entity.GoodsClass;
import com.accp.jsp.util.DbHelper;

public class GoodsClassDaoimpl implements GoodsClassDao{

	@Override
	public List<GoodsClass> selectAll() {
		List<GoodsClass> list=null;
		String sql="select * from goodsclass";
		Connection conn=null;
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.query(conn, sql,new BeanListHandler<GoodsClass>(GoodsClass.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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

}
