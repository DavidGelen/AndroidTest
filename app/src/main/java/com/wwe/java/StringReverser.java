package com.wwe.java;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 4:06 PM
 * @class describe
 */
public class StringReverser {

    public String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

}
