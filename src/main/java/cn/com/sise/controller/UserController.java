package cn.com.sise.controller;

import cn.com.sise.dao.impl.UserDaoImpl;
import cn.com.sise.pojo.User;
import cn.com.sise.vildator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author : hhyygg2009
 * @date : Created in 2021/4/19 20:56 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDaoImpl userDao;

    @Autowired
    UserValidator userValidator;


    @RequestMapping("/test")
    public String test(Model model, User user, Errors errors, HttpServletRequest request, HttpServletResponse response){
//        LocaleResolver resolver=RequestContextUtils.getLocaleResolver(request);
//        resolver.setLocale(request,response,Locale.US);
//        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,new Locale("en","US"));
        userValidator.validate(user,errors);


        return "test";
    }

    @RequestMapping("/index")
    public String index(){
        return "user/index";
    }

    @GetMapping("/login")
    public String login(){
        return "user/login";
    }


    @PostMapping("/login")
    public String loginCheck(User loginuser, HttpSession session){
        User user=userDao.login(loginuser);
        if(user!=null){
            session.setAttribute("user",user);
            return "redirect:/user/index";
        }else {
            return "redirect:/user/login";
        }
    }
}
