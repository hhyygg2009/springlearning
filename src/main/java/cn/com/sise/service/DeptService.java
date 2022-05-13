package cn.com.sise.service;



import cn.com.sise.dao.DeptDao;
import cn.com.sise.pojo.Dept;


/**
 * @author :hhyygg2009
 * @date :Created in  2021/3/30 11:00
 */
public class DeptService {
    private DeptDao dept;


    public void insertDept(Dept d){
        dept.insertDept(d);
    }

    public void updateDept(Dept d){
        dept.updateDept(d);
    }

    public void deleteDept(Dept d){
        dept.deleteDept(d);
    }

    public void selectDept(int id){
        dept.selectById(id);
    }

	public void setDept(DeptDao dept) {
		this.dept = dept;
	}
    
    
}
