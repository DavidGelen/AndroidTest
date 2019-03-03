package com.wwe.java;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/29 5:10 PM
 * @class describe
 */
public class Calculator {

    public int add(int one, int another) {
        return one + another;
    }

    public int multiply(int one, int another) {
        // 为了简单起见，暂不考虑溢出等情况。
        return one * another;
    }

    public double divide(double divident, double dividor) {
        if (dividor == 0) throw new IllegalArgumentException("Dividor cannot be 0");
        return divident / dividor;
    }

}
