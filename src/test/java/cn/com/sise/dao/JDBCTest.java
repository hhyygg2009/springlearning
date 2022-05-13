package cn.com.sise.dao;

import cn.com.sise.pojo.Dept;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/3/30 9:56
 */

public class JDBCTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    JdbcTemplate jdbcTemplate=applicationContext.getBean(JdbcTemplate.class);

    @Test
    public void DeptTest(){
        List<Dept> depts=jdbcTemplate.query("select * from tb_dept", BeanPropertyRowMapper.newInstance(Dept.class));
//        List<Dept> depts=jdbcTemplate.query("select * from tb_dept",new DeptMapper());

        for(Dept dept:depts){
            System.out.println(dept.toString());
        }

//        jdbcTemplate.update("update tb_dept set dept_name='修改1' where dept_id=412");

//        jdbcTemplate.execute("insert into tb_dept values (413,'树莓系1')");
//        jdbcTemplate.execute("delete from tb_dept where dept_id=413");
    }

}
