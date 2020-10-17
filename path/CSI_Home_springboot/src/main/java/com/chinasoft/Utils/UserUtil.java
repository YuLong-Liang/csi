package com.chinasoft.Utils;

import java.io.IOException;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinasoft.Utils.SqlSessionFactoryUtil;
import com.chinasoft.pojo.User;




public class UserUtil {
//	查询单个记录
	@Test
    public static User selectUser() throws IOException {
        // 获得sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSession session = SqlSessionFactoryUtil.openSqlSession();
        User user = session.selectOne("com.chinasoft.pojo.Interface.UserMapper.selectUser");
        System.out.println(user);
        inputStream.close();
        session.close();
        return user;
    }
//  注解实现+$ 和# 实现 指定关键字查找
//  @Test
//  public static User selectUserByPar(String column,String value) throws IOException {
//      // 获得sqlSessionFactory
//      String resource = "mybatis-config.xml";
//      InputStream inputStream = Resources.getResourceAsStream(resource);
//      SqlSession session = SqlSessionFactoryUtil.openSqlSession();
//      UserMapper userMapper = session.getMapper(UserMapper.class);
//      User user = userMapper.selectUserByPara(column,value);
//      System.out.println(user);
//      inputStream.close();
//      session.close();
//      return user;
//  }
	
//	查询id顺序 所有记录
	@Test
    public static List<User> selectAllUser() {
        // 获得sqlSessionFactory
        InputStream inputStream = null;
        SqlSession session = null;
        List<User> users = null;
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            session = SqlSessionFactoryUtil.openSqlSession();
            users = session
                    .selectList("com.chinasoft.pojo.Interface.UserMapper.selectAllUser");
            for (User user : users) {
                System.out.println(user);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (session!=null) {
                session.close();
            }
        }
        return users;
    }
	
//    接口实现按关键字排序查找
//  @Test
//  public static List<User> selectAllUser3(String column) {
//      // 获得sqlSessionFactory
//      InputStream inputStream = null;
//      SqlSession session = null;
//      List<User> users = null;
//      try {
//          String resource = "mybatis-config.xml";
//          inputStream = Resources.getResourceAsStream(resource);
//          session = SqlSessionFactoryUtil.openSqlSession();
//          UserMapper mapper = session.getMapper(UserMapper.class);
//          users = mapper.selectOrderBy(column);
//          for (User user : users) {
//              System.out.println(user);
//          }
//      } catch (IOException e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//      } finally {
//          if (inputStream != null) {
//              try {
//                  inputStream.close();
//              } catch (IOException e) {
//                  // TODO Auto-generated catch block
//                  e.printStackTrace();
//              }
//          }
//          if (session!=null) {
//              session.close();
//          }
//      }
//      return users;
//  }
//  按参数增加
  @Test
  public static Boolean addUserByParameter(User user) throws IOException {
      // 获得sqlSessionFactory
      String resource = "mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSession session = SqlSessionFactoryUtil.openSqlSession();
      int frag = session.insert("com.chinasoft.pojo.Interface.UserMapper.addUserByParameter",user);
      // session提交 事务提交
      session.commit();
      inputStream.close();
      session.close();
      if(frag > 0) 
    	  return true;
      else
    	  return false;
  }
  
//  @Test
//  public static void updateUserByParameter(User user,String column,String value) throws IOException {
//      // 获得sqlSessionFactorey
//      String resource = "mybatis-config.xml";
//      InputStream inputStream = Resources.getResourceAsStream(resource);
//      SqlSession session = SqlSessionFactoryUtil.openSqlSession();
//      UserMapper usermapper = session.getMapper(UserMapper.class);
//      usermapper.updateUserByParameter(user,column,value);
//      session.commit();
//      inputStream.close();
//      session.close();
//      
//  }
  
  @Test
  public void deleteUserByParameter(int id) throws IOException {
      // 获得sqlSessionFactorey
      String resource = "mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSession session = SqlSessionFactoryUtil.openSqlSession();
      session.delete("com.chinasoft.pojo.Interface.UserMapper.deleteUserByParameter",id);
      session.commit();
      inputStream.close();
      session.close();
  }
}
