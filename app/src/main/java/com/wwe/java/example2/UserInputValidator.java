package com.wwe.java.example2;

/**
 * @name AndroidTest
 * @class name：com.wwe.java.example2
 * @class describe
 * @anthor David
 * @time 2019/1/30 5:06 PM
 * @class describe
 */
public class UserInputValidator {

    public boolean isValidFullName(String fullName) {
        return FullNameValidator.isValidFullName(fullName);
    }

    public boolean isValidUsername(String username) {
        return ServerUsernameValidator.isValidUsername(username);
    }
}
