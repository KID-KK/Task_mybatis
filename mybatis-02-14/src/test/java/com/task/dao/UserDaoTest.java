package com.task.dao;

import com.task.pojo.User;
import com.task.utils.MybatisUtils;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
   @Test
   public void test1()
   {
      SqlSession sqlSession= MybatisUtils.getSqlSession();
      UserDao userDao=sqlSession.getMapper(UserDao.class);
      List<User>userList=userDao.getUserList();
      for(User user:userList)
      {
         System.out.println(user);
      }
      sqlSession.close();
   }
   @Test
   public void test2()
   {
      SqlSession sqlSession= MybatisUtils.getSqlSession();
      UserDao userDao=sqlSession.getMapper(UserDao.class);
      User user=userDao.getUserById(1);
      System.out.println(user);
      sqlSession.close();
   }
   @Test
   public void test3()
   {
      SqlSession sqlSession= MybatisUtils.getSqlSession();
      UserDao userDao=sqlSession.getMapper(UserDao.class);
      userDao.addUser(new User(4,"Ee","377221"));
      sqlSession.commit();
      sqlSession.close();
   }
   @Test
   public  void test4()
   {
      SqlSession sqlSession= MybatisUtils.getSqlSession();
      UserDao userDao=sqlSession.getMapper(UserDao.class);
      userDao.updateUser(new User(1,"Aa","526731"));
      sqlSession.commit();
      sqlSession.close();
   }
   @Test
   public void test5()
   {
      SqlSession sqlSession= MybatisUtils.getSqlSession();
      UserDao userDao=sqlSession.getMapper(UserDao.class);
      userDao.deleteUser(2);
      sqlSession.commit();
      sqlSession.close();
   }

}
