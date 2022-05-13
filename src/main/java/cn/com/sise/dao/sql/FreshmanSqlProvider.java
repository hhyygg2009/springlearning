package cn.com.sise.dao.sql;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/3/15 11:55
 * MyBatis Sql Provider
 */
public class FreshmanSqlProvider {
    public String selectLike(Map<String,Object> map){
        return new SQL(){{
            SELECT("*");
            FROM("tb_freshman");
            for(Map.Entry<String, Object> entry :map.entrySet()){
                WHERE(entry.getKey()+"="+entry.getValue());
            }
        }}.toString();
    }
}
