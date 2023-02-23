
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gajendran
 */
public class backend {

    public String checkDate(String date) {

        String outputStr = "";
        LocalDate today = LocalDate.now();

        LocalDate minDate = today.plusYears(-16);
        LocalDate maxDate = today.plusYears(-25);

        LocalDate DOB = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if (minDate.isBefore(DOB)) {
            outputStr = "TOO YOUNG";
        } else if (DOB.isBefore(maxDate)) {
            outputStr = "TOO OLD";
        } else {
            outputStr = "";
        }

        return outputStr;
    }
    
    public boolean checkBlank(String check) {
        
        if (check.isBlank()) {
            return true;
        } else {
            return false;
        }
      
    }
    
    public String checkLetters(String id){
        
        String output = "";
        for (int i = 0; i < id.length(); i++) {
             if(!Character.isDigit(id.charAt(i))){
                 output = "ID inncorrect";
             }else{
                 output = "";
             }
        }
        return output;
    }
    
    public String checkNumbers(String fullname){
        
        String output = "";
        
        for (int i = 0; i < fullname.length(); i++) {
             if(Character.isDigit(fullname.charAt(i))){
                 output = "Name inculde numbers";
             }else{
                 output = "";
             }
        }
       return output; 
    }
    
    public String checkPassword(String password){
        String output = "";
        int letterCount = 0;
        int numberCount = 0;
        for (int i = 0; i <= password.length(); i++) {
            char currentChar = password.charAt(i);
            
            if(Character.isDigit(currentChar)){
                numberCount ++;
            }else if(Character.isLetter(currentChar)){
                letterCount++;
            }else{
                output = "Password is Weak";
            }
            
            
        }
        if(letterCount == 5 && numberCount == 4){
            output = "";
        }else{
            output = "Password is Weak";
        }
        
       return output; 
    }
    
    public String checkEmail(String email){
        String output = "";
        if(!(email.contains("@") && email.contains(".com"))){
            output = "Please enter valid email address";
        }else{
            output = "";
        }
        
       return output;
    }
}

