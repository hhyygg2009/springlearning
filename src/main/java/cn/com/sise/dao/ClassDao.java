package cn.com.sise.dao;

import cn.com.sise.pojo.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:hhyygg2009
 * @date:Createdin2021/4/209:25
 */
@Repository
public interface ClassDao {
    public int addClass(Class c);
    public int updateClass(Class c);
    public int deleteClass(Class c);
    public List<Class> selectAllClass();
    public Class selectClassById(int id);

}
