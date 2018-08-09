package com.accp.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.accp.mybatis.entity.Goods;

public class Dome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//获得sqlSessionFactory核心对象
		 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 //获得session对象
		 SqlSession session=sqlSessionFactory.openSession();
		 List<Goods> goods=null;
		 {
			 //查询所有
			goods= session.selectList("com.accp.mybatis.mapper.GoodsMapper.selectAll");
			 
		 }
		 System.out.println(goods);
		 {
			 //按id查询
			 Goods good=session.selectOne("com.accp.mybatis.mapper.GoodsMapper.selectByid",53);
			 System.out.println(good);
		 }
		 
		 {
			 //新增
			 Goods good=new Goods();
			 good.setGoodsName("lhsb");
			 good.setGoodsType("sbsb");
			 good.setGoodsClassId(3);
			 good.setGoodsPrice(1234);
			 
			 int i=session.insert("com.accp.mybatis.mapper.GoodsMapper.insert", good);
			 System.out.println("受影响行数"+i);
			 System.out.println("主键"+good.getGoodsId());
		 }
		 
		 {
			 //删除
			 int a=session.delete("com.accp.mybatis.mapper.GoodsMapper.delete", 59);
		 }
		 {
			 //模糊查询
			 goods =session.selectList("com.accp.mybatis.mapper.GoodsMapper.selectlike","%电视级%");
			 System.out.println(goods);
		 }
		 
		 {
			 //多条件查询
			 Map<String,Object> params=new HashMap<String, Object>();
			 params.put("goodsName", "%洗衣液%");
			 params.put("goodsPrice", 8);
			 goods=session.selectList("com.accp.mybatis.mapper.GoodsMapper.selectlikeandPrice", params);
			 System.out.println(goods);
		 }
		 
		 {
			 Goods good=new Goods();
			 good.setGoodsId(60);
			 good.setGoodsName("asd");
			 good.setGoodsType("123");
			 good.setGoodsClassId(1);
			 good.setGoodsPrice(111);
			 
			 
			 int c=session.update("com.accp.mybatis.mapper.GoodsMapper.update", good);
		 }
		//提交事物
		 session.commit();
		 session.close();//关闭连接
	}

}
