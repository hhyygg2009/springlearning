package cn.com.sise.dao;

import cn.com.sise.dao.MajorDao;

import cn.com.sise.pojo.Class;
import cn.com.sise.pojo.Dept;
import cn.com.sise.pojo.Major;
import cn.com.sise.pojo.Teacher;
import cn.com.sise.service.MajorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author :hhyygg2009
 * @date :Created in  3/16/2021 9:28 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:bean.xml"})
public class SpringBeanTest {
    //加载配置文件，实例化Spring容器

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void IOCTest() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dept dept = (Dept) applicationContext.getBean("dept");

        System.out.println(dept);

        Major major = (Major) applicationContext.getBean("major");
        Teacher teacher1 = (Teacher) applicationContext.getBean("teacher1");
        Teacher teacher2 = (Teacher) applicationContext.getBean("teacher2");
        Class kecheng = (Class) applicationContext.getBean("class");

        System.out.println(kecheng);

    }

    //测试计算机系信息的注入情况
    //测试专业信息的注入情况
    //测试学习导师信息的注入情况
    //测试辅导员信息的注入情况
    //测试班级信息的注入情况





}
