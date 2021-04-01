/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentone;

/**
 *
 * @author E7240
 */
public class Calculator {
    private static int ans;
    private static int number1;
    private static int number2;

    public static int getAns() {
        return ans;
    }

    public static int getNumber1() {
        return number1;
    }

    public static int getNumber2() {
        return number2;
        
    }

    public static void setAns(int ans) {
        Calculator.ans = ans;
    }

    public static void setNumber1(int number1) {
        Calculator.number1 = number1;
    }

    public static void setNumber2(int number2) {
        Calculator.number2 = number2;
    }
    public String ToString(){
        System.out.println(ans);
        return null;
    }    
    
}
