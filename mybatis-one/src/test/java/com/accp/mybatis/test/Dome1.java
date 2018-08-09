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
		//���sqlSessionFactory���Ķ���
		 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 //���session����
		 SqlSession session=sqlSessionFactory.openSession();
		 List<Goods> goods=null;
		 {
			 //��ѯ����
			goods= session.selectList("com.accp.mybatis.mapper.GoodsMapper.selectAll");
			 
		 }
		 System.out.println(goods);
		 {
			 //��id��ѯ
			 Goods good=session.selectOne("com.accp.mybatis.mapper.GoodsMapper.selectByid",53);
			 System.out.println(good);
		 }
		 
		 {
			 //����
			 Goods good=new Goods();
			 good.setGoodsName("lhsb");
			 good.setGoodsType("sbsb");
			 good.setGoodsClassId(3);
			 good.setGoodsPrice(1234);
			 
			 int i=session.insert("com.accp.mybatis.mapper.GoodsMapper.insert", good);
			 System.out.println("��Ӱ������"+i);
			 System.out.println("����"+good.getGoodsId());
		 }
		 
		 {
			 //ɾ��
			 int a=session.delete("com.accp.mybatis.mapper.GoodsMapper.delete", 59);
		 }
		 {
			 //ģ����ѯ
			 goods =session.selectList("com.accp.mybatis.mapper.GoodsMapper.selectlike","%���Ӽ�%");
			 System.out.println(goods);
		 }
		 
		 {
			 //��������ѯ
			 Map<String,Object> params=new HashMap<String, Object>();
			 params.put("goodsName", "%ϴ��Һ%");
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
		//�ύ����
		 session.commit();
		 session.close();//�ر�����
	}

}
