package com.wwe.java.example3;

public class LoginPresenter {
    private UserManager mUserManager;
    private final PasswordValidator mPasswordValidator;

    public LoginPresenter() {
        this(null, null);
    }

    public LoginPresenter(UserManager userManager, PasswordValidator passwordValidator) {
        this.mUserManager = userManager;
        this.mPasswordValidator = passwordValidator;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        //if (!mPasswordValidator.verifyPassword(password)) return;
        mUserManager.performLogin(username, password);
    }

    public void setUM(UserManager um) {
        mUserManager = um;
    }

    public UserManager getUM() {
        return mUserManager;
    }

}
