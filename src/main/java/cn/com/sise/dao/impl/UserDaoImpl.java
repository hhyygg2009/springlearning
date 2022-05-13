package cn.com.sise.dao.impl;

import cn.com.sise.dao.UserDao;
import cn.com.sise.pojo.User;
import cn.com.sise.util.MD5Util;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //定义JdbcTemplate属性及其getter和setter方法
    @Resource
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int addUser(User user) {
        String password = MD5Util.MD5Encode(user.getPassword());
        System.out.println(password);
        //定义SQL语句
        String sql = "insert into tb_user(account,password,role_id) values(?,?,?)";
        //存放SQL语句的参数
        Object[] params = new Object[]{user.getAccount(), password, user.getRoleId()};
        //执行SQL，获取返回结果
        int flag = this.jdbcTemplate.update(sql, params);
        return flag;
    }


    public int updateUser(User user) {
        String password = MD5Util.MD5Encode(user.getPassword());

        //定义SQL语句
        String sql = "update tb_user set account = ?,password=? where id = ?";
        //存放SQL语句的参数
        Object[] params = new Object[]{user.getAccount(), password, user.getId()};
        //执行SQL，获取返回结果
        int flag = this.jdbcTemplate.update(sql, params);
        return flag;
    }


    public int deleteUserById(Integer id) {
        //定义SQL语句
        String sql = "delete from tb_user where id = ?";
        //执行SQL，获取返回结果
        int flag = this.jdbcTemplate.update(sql, id);
        return flag;
    }


    public List<User> findUserByRoleId(Integer role_id) {
        //定义SQL语句
        String sql = "select * from tb_user where role_id =" + role_id;
		/*
		 * 提供默认实现类 BeanPropertyRowMapper ， javabean属性和表的字段必须一致
		   BeanPropertyRowMapper将结果集通过java的反射机制映射到java对象中
		 */
        RowMapper<User> rowMapper = BeanPropertyRowMapper
                .newInstance(User.class);
        //使用query方法执行查询，并返回一个集合
        return this.jdbcTemplate.query(sql, rowMapper);
    }


    public User findUserById(Integer id) {
        //定义SQL语句
        String sql = "select * from tb_user where id = ?";
        RowMapper<User> rowMapper = BeanPropertyRowMapper
                .newInstance(User.class);
        //使用queryForObject方法查询，返回单行记录
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }


    //登陆验证
    public User login(User user) {

        String password = MD5Util.MD5Encode(user.getPassword());
        System.out.println("user:"+user);
        System.out.println("password:" + password);
        //定义SQL语句
        String sql = "select * from tb_user where account=? and password=? and role_id=?";
        RowMapper rowMapper = BeanPropertyRowMapper.newInstance(User.class);
        Object[] params = new Object[]{user.getAccount(), password, user.getRoleId()};
        try {
            User userResult = (User) jdbcTemplate.queryForObject(sql, rowMapper, params);

            return userResult;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
