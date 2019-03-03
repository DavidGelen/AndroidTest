package com.wwe.java.example2;

/**
 * @name AndroidTest
 * @class name：com.wwe.java.example2
 * @class describe
 * @anthor David
 * @time 2019/1/30 5:05 PM
 * @class describe
 */
public class ServerUsernameValidator {

    public static boolean isValidUsername(String username) {
        try {
            Thread.sleep(1000);
            throw new RuntimeException("no network connection");
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
