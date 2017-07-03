package com.simple.login;

import common.BaseController;
import common.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Suresh kumar on 06-05-2017.
 */
@Controller
public class LoginController extends BaseController<LoginFormData> {

    private static final String PATH = "/login";
    private static final String TEMPLATE = "content/login/login";

    public LoginController() {
        super(TEMPLATE, PATH, "Login");
    }

    @GetMapping("/")
    public String start() {
        return "redirect:" + PATH;
    }

    @GetMapping(PATH)
    public ModelAndView renderLogin() {
        return renderForm();
    }

    @PostMapping(PATH)
    public ModelAndView submitForm(@Valid LoginFormData loginFormData, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // do error logic
        }
        return onPostForm();
    }

    @Override
    protected LoginFormData get(FormData formData) {
        return formData.getLoginFormData();
    }

    @Override
    protected void set(FormData formData, LoginFormData data) {
        formData.setLoginFormData(data);
    }
}
