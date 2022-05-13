package cn.com.sise.vildator;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author: hhyygg2009
 * @date: Created in 2021/4/27 11:20
 */
@Repository
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"account",null,"登录名不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password",null,"密码不能为空");

    }
}
