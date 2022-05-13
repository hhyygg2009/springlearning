package cn.com.sise.dao.impl;


import cn.com.sise.dao.DeptDao;
import cn.com.sise.pojo.Dept;
import cn.com.sise.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/4/12 10:34
 *
 * mybatis traditional way
 */
public class DeptImpl implements DeptDao {
//    @Autowired
//    iDept deptDao;

    SqlSession session = MybatisUtils.getSession();
    DeptDao deptDao = session.getMapper(DeptDao.class);


    @Override
    public List<Dept> selectAllDept() {
        return deptDao.selectAllDept();
    }

    @Override
    public Dept selectById(Integer id) {
        return deptDao.selectById(id);
    }

    @Override
    public int insertDept(Dept dept) {
        return this.deptDao.insertDept(dept);
    }

    @Override
    public int updateDept(Dept dept) {
        return this.deptDao.updateDept(dept);
    }

    @Override
    public int deleteDept(Dept dept) {
        return deptDao.deleteDept(dept);
    }
}
