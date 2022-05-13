package cn.com.sise.dao;

import cn.com.sise.pojo.Major;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorAnno
{
    @Result(column = "dept_id", property = "dept_id")
    @Result(column = "dept_name", property = "dept_name")
    @Result(column = "dept_id", property = "dept"
            , one = @One(select = "cn.com.sise.dao.DeptDao.selectById", fetchType = FetchType.EAGER))
    @Select("select * from tb_major")
    List<Major> selectAllMajor();

    @Result(column = "dept_id", property = "dept_id")
    @Result(column = "dept_name",property = "dept_name")
    @Result(column = "dept_id", property = "dept"
            , one = @One(select = "cn.com.sise.dao.iDept.selectById", fetchType = FetchType.EAGER))

        @Select("select * from tb_major where major_name like '%${major_name}%'")
    List<Major> selectByMajorName(String major_name);



}
