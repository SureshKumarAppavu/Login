package common;

import com.simple.login.LoginFormData;

/**
 * Created by Suresh kumar on 07-05-2017.
 */
public class FormData {

    private LoginFormData loginFormData = new LoginFormData();

    public LoginFormData getLoginFormData() {
        return loginFormData;
    }

    public void setLoginFormData(LoginFormData loginFormData) {
        this.loginFormData = loginFormData;
    }
}
