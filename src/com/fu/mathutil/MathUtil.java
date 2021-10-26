/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    //using recursion
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between [0-20]");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {

            return n * getFactorial(n - 1);
        }
    }
    

}
