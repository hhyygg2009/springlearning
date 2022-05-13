package cn.com.sise.dao.impl;

import cn.com.sise.dao.MajorDao;
import cn.com.sise.pojo.Major;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/4/12 10:42
 * using SqlSessionDaoSupport: inject SqlSession
 */
@Component
public class MajorImpl extends SqlSessionDaoSupport {

    MajorDao majorDao;

    /* using constructor */
//    @Autowired
//    public MajorImpl(SqlSessionFactory sqlSessionFactory) {
//        this.setSqlSessionFactory(sqlSessionFactory);
//        majorDao = getSqlSession().getMapper(MajorDao.class);
//    }

    /* using setter autowired */
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /* improve */
    @PostConstruct
    public void MajorInit() {
        majorDao = getSqlSession().getMapper(MajorDao.class);

    }

    public List<Major> selectAllMajor() {
        return majorDao.selectAllMajor();
    }


    public List<Major> selectByMajorName(String major_name) {
        return majorDao.selectByMajorName(major_name);
    }


}
