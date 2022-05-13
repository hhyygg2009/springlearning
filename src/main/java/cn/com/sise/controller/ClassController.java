package cn.com.sise.controller;

import cn.com.sise.dao.ClassDao;
import cn.com.sise.pojo.Class;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author:hhyygg2009
 * @date:Createdin2021/4/209:24
 */
@RequestMapping("/class")
@Controller
public class ClassController {
    @Autowired
    ClassDao classDao;


    Map objectToMap(Object o, String id) {
        Map<String, Object> map = JSONObject.parseObject(JSONObject.toJSONString(o), Map.class);
        map.put("id", map.get(id));
        return map;
    }

    List<Map<String, Object>> listToMap(List<Object> dataList, String dataid) {
        List<Map<String, Object>> MapList = new ArrayList<>();
        assert dataList != null;
        for (Object c : dataList) {
            MapList.add(objectToMap(c, dataid));
        }
        return MapList;
    }

    @GetMapping("/select")
    public ModelAndView selectClass( @RequestParam(required = false) String id, ModelAndView modelAndView) {
        List dataList = null;
        String dataid = null;

            dataList = classDao.selectAllClass();
            dataid = "classId";



        modelAndView.addObject("datalist", listToMap(dataList, dataid));
        modelAndView.setViewName("view/list");
        return modelAndView;
    }

    @GetMapping("/update")
    public ModelAndView updateClass( int id, ModelAndView modelAndView) {

        List dataList = null;
        String dataid=null;

            dataList = classDao.selectAllClass();
            dataid="classId";


        Class c = classDao.selectClassById(id);

        modelAndView.addObject("data", objectToMap(c, dataid));
        modelAndView.setViewName("view/edit");
        return modelAndView;

    }

}
