package cn.com.sise.controller;

import cn.com.sise.dao.MajorDao;
import cn.com.sise.pojo.Major;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/4/13 10:26
 */
@Controller
@RequestMapping("/major")
public class MajorController {

    @Autowired
    MajorDao majorDao;


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
    public ModelAndView selectClass(@RequestParam(required = false) String id, ModelAndView modelAndView) {
        List dataList = null;
        String dataid = null;

        dataList = majorDao.selectAllMajor();
        dataid = "major_id";

        modelAndView.addObject("datalist", listToMap(dataList, dataid));
        modelAndView.setViewName("view/list");
        return modelAndView;
    }

    @GetMapping("/update")
    public ModelAndView updateClass(String id, ModelAndView modelAndView) {
        String dataid = null;

        dataid = "major";
        Major data = majorDao.selectById(id);


        modelAndView.addObject("data", objectToMap(data, dataid));
        modelAndView.setViewName("view/edit");
        return modelAndView;
    }

    @PostMapping("/update")
    public String majorUpdateAction(Major major){
        int result=this.majorDao.updateMajor(major);
        return "redirect:/major/select";

    }

    @RequestMapping("/delete")
    public String majorDelete(int id){
        int result=this.majorDao.deleteMajor(id);
        return "redirect:/major/select";
    }

}
