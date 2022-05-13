package cn.com.sise.dao;

import cn.com.sise.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DeptDao {
//    public List<Dept> selectAllDept();
//    public Dept selectById(Integer id);
//    public int insertDept(Dept dept);
//    public int updateDept(Dept dept);
//    public int deleteDept(Dept dept);
//
    @Select("select * from tb_dept")
    public List<Dept> selectAllDept();
    @Select("select * from tb_dept where dept_id=#{dept_id}")
    public Dept selectById(Integer id);
    @Insert("insert into tb_dept values (#{dept_id}, #{dept_name})" )
    public int insertDept(Dept dept);
    @Update("update tb_dept set dept_id=#{dept_id},dept_name=#{dept_name} where dept_id=#{dept_id}")
    public int updateDept(Dept dept);
    @Delete("delete from tb_dept where dept_id=#{dept_id}")
    public int deleteDept(Dept dept);



}
