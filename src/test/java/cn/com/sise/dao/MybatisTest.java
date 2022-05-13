package cn.com.sise.dao;

import cn.com.sise.dao.DeptDao;
import cn.com.sise.dao.FreshmanDao;
import cn.com.sise.dao.MajorDao;
import cn.com.sise.pojo.Dept;
import cn.com.sise.pojo.Freshman;
import cn.com.sise.pojo.Major;
import cn.com.sise.dao.sql.FreshmanSqlProvider;
import cn.com.sise.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@FixMethodOrder(MethodSorters.DEFAULT)
public class MybatisTest {
    static DeptDao idept;

//    public MybatisTest(iMajor iMajor){
//        this.iMajor=iMajor;
//    }


    static MajorDao MajorDao;

    static FreshmanDao FreshmanDao;
    static SqlSession session;

    static {
        session = MybatisUtils.getSession();
        idept = session.getMapper(DeptDao.class);
        MajorDao = session.getMapper(MajorDao.class);
        FreshmanDao = session.getMapper(FreshmanDao.class);
    }


    @Test
    public void MajorSelectTest() {
        List<Major> majors = MajorDao.selectAllMajor();
        System.out.println(majors.toString());
        Assert.assertNotNull(majors.get(0).getDept());
    }

    @Test
    public void MajorselectByMajorNameTest() {
        List<Major> majors = MajorDao.selectByMajorName("工程");
        System.out.println(majors.toString());
        Assert.assertNotNull(majors.get(0).getDept());
    }


    @Test
    public void DeptSelectTest() {
//        List<Dept> depts=session.selectList("DeptMapper.selectAllDept","外");
        List<Dept> depts = idept.selectAllDept();
        System.out.println(depts.toString());

    }

    @Test
    public void DeptInsertTest() {
        Dept dept = new Dept();
        dept.setDept_id(100);
        dept.setDept_name("dept");
//        idept.insertDept(dept);
        Assert.assertTrue(idept.insertDept(dept) > 0);
    }

    @Test
    public void DeptUpdateTest() {
        Dept dept = new Dept();
        dept.setDept_id(100);
        dept.setDept_name("deptUpdate");
        idept.updateDept(dept);

    }

    @Test

    public void DeptDeleteTest() {
        Dept dept = new Dept();
        dept.setDept_id(100);

        idept.deleteDept(dept);
    }

    @Test
    public  void freshmanTest(){
    }

}
