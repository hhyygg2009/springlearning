package cn.com.sise.dao;

import cn.com.sise.dao.impl.MajorImpl;
import cn.com.sise.pojo.Major;
import cn.com.sise.service.MajorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author hhyygg2009
 * @date Created in 2021/5/12 16:50
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MajorDaoTest {
    @Autowired
    MajorImpl major;

    /* using SqlSessionDaoSupport: inject SqlSession */
    @Test
    public void MajorSelectTest() {
        List<Major> majors = major.selectAllMajor();
        System.out.println(majors.toString());
        Assert.assertNotNull(majors.get(0));
    }

    @Autowired
    MajorAnno majorAnno;

    /* using mybatis annotation @Select */
    @Test
    public void setMajorAnnoTest(){
        List<Major> majors= majorAnno.selectAllMajor();
        Assert.assertNotNull(majors);
    }

    @Autowired
    MajorDao majorDao;

    /* using mapper file */
    @Test
    public void setMajorDaoTest(){
        List<Major> majors=majorDao.selectAllMajor();
        Assert.assertNotNull(majors);
    }
}