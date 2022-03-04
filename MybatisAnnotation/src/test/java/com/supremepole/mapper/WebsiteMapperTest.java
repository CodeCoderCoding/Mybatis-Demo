package com.supremepole.mapper;

import com.supremepole.mapper.WebsiteMapper;
import com.supremepole.model.Website;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @author CodeCoderCoding
 */
public class WebsiteMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException ignore) {
            ignore.printStackTrace();
        }
    }

    @Test
    public void testSelectById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            WebsiteMapper websiteMapper = sqlSession.getMapper(WebsiteMapper.class);
            Website website=websiteMapper.selectById(1);
            System.out.println(website);
        } finally {
            sqlSession.close();
        }
    }
}
