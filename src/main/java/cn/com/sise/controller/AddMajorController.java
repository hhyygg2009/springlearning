package cn.com.sise.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/4/13 9:45
 */

public class AddMajorController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("major", "123");
        return new ModelAndView("hello", "rants", "hello,world");
    }
}
