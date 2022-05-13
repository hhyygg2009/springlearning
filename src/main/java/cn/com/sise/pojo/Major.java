package cn.com.sise.pojo;

public class Major {
    String major_id,major_name;
    Integer tuition,dept_id;
    Dept dept;

    public Major(String major_id, String major_name, Integer tuition, Integer dept_id) {
        this.major_id = major_id;
        this.major_name = major_name;
        this.tuition = tuition;
        this.dept_id = dept_id;
    }

    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Major{" +
                "major_id='" + major_id + '\'' +
                ", major_name='" + major_name + '\'' +
                ", tuition=" + tuition +
                ", dept_id=" + dept_id +
                ", dept=" + dept +
                '}';
    }
}
