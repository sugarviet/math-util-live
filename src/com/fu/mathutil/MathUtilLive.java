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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Expected 5!=; actual: "+MathUtil.getFactorial(5));
        
        System.out.println("-5!= "+MathUtil.getFactorial(-5));
    }
    
}
