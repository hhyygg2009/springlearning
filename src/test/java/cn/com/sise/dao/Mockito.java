package cn.com.sise.dao;

import cn.com.sise.dao.DeptDao;
import cn.com.sise.pojo.Dept;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/3/30 11:14
 */
public class Mockito {

    DeptDao deptDao=mock(DeptDao.class);
    Dept dept=new Dept();

    @Before
    public void setUp(){
        when(deptDao.insertDept(dept)).thenReturn(1);
        dept.setDept_id(408);
        dept.setDept_name("测试");
    }

    @Test
    public void insertDept(){
        int result=deptDao.insertDept(dept);
        //result=deptDao.insertDept(dept);

        Assert.assertEquals(1,result);
        verify(deptDao).insertDept(dept);
    }


}
