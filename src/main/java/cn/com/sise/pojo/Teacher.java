package cn.com.sise.pojo;

/**
 * 老师类
 */
public class Teacher{
    private String jobId;//工号
    private String teacherName;
    private String gender;//性别
    private String tel;
    private String role;//角色   0：学习导师，1：辅导员
    private Integer deptId;

    public Teacher(String jobId, String teacherName, String gender, String tel, String role, Integer deptId) {
        this.jobId = jobId;
        this.teacherName = teacherName;
        this.gender = gender;
        this.tel = tel;
        this.role = role;
        this.deptId = deptId;
    }

    //添加无参构造函数
  public Teacher(){
        jobId="114514";
        teacherName="李田所";
        gender="男";
        tel="1414141414141";
        role="0";
        deptId=123;
  }

    public Teacher(String jobId, String gender, String role) {
        this.jobId = jobId;
        this.gender = gender;
        this.role = role;

    }

    //添加有参构造函数，


    //为属性提供setter和getter方法
    


    @Override
    public String toString() {
        return "Teacher{" +
                "jobId='" + jobId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", role='" + role + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}