package cn.com.sise.dao.mapper;

import cn.com.sise.pojo.Dept;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author :hhyygg2009
 * @date :Created in  2021/3/30 9:55
 */
public class DeptMapper implements RowMapper<Dept> {
    @Override
    public Dept mapRow(ResultSet resultSet, int i) throws SQLException {
        Dept dept=new Dept();

        dept.setDept_id(resultSet.getInt("dept_id"));
        dept.setDept_name(resultSet.getString("dept_name"));

        return dept;
    }
}
