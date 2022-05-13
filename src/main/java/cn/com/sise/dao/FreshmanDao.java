package cn.com.sise.dao;

import cn.com.sise.pojo.Freshman;
import cn.com.sise.dao.sql.FreshmanSqlProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

public interface FreshmanDao {
//    List<Freshman> select(Freshman freshman);
    @SelectProvider(type = FreshmanSqlProvider.class,method = "selectLike")
    List<Freshman> selectLike(Map list);
}
