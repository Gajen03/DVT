/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gajendran
 */
public class TEST {
    public static void main(String[] args) {
         
        String test = "TES1T";
        
        for (int i = 0; i < test.length(); i++) {
             if(!Character.isDigit(test.charAt(i))){
                 System.out.println(test.charAt(i));
             }else{
                 System.out.println("");
             }
            
        }
        
        
        
        
    }
}
