/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author ACER
 */
public class Lab_Act1_Arithmetics {
    
    public static void main(String[] args){
        int firstnumber= 10;
        int secondnumber= 4;
        int thirdnumber= 6;
        
        int addition= firstnumber * secondnumber + thirdnumber;
        int subtraction= (firstnumber - secondnumber) % thirdnumber;
        int multiply= (firstnumber + secondnumber + thirdnumber) / 3;
        int division= firstnumber * thirdnumber - (secondnumber * secondnumber) ;
        System.out.println("10 * 4 + 6 = " + addition);
        System.out.println("10 - 4) % 6 = " + subtraction);
        System.out.println("10 + 4 + 6 / 3 = " + multiply);
        System.out.println("10 * 6 - 4 * 2 = "  + division);
    }
        
   
    
}
