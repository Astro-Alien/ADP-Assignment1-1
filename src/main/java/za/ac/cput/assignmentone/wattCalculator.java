/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentone;

/**
 *
 * @author Sinenhlanhla - 220008922
 * 
 * This is a fitness calculator for athletes
 * 
 */

public class wattCalculator 
{
    public int wattFormula(int weight, int wattPerKg)
    {
        int ans = weight * wattPerKg;
        return ans;
    }
}
