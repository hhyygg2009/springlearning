package cn.com.sise.pojo;

import java.util.List;

/**
 * 系别类
 */
public class Dept{
    private Integer dept_id;//系别ID
    private String dept_name;//系名

    public List<Major> getMajors() {
        return majors;
    }

    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }

    private List<Major> majors;

    public Dept() {

    }

    public Dept(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    /*
    @since 2
    差不多得了，不会真的有人看吧

    */
    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", majors=" + majors +
                '}';
    }
}