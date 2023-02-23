
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
public class TEST {
    public static void main(String[] args) {
         
//        String test = "TES1T";
//        
//        for (int i = 0; i < test.length(); i++) {
//             if(!Character.isDigit(test.charAt(i))){
//                 System.out.println(test.charAt(i));
//             }else{
//                 System.out.println("");
//             }
//            
//        }
//        
        LocalDate today = LocalDate.now();

        LocalDate minDate = today.plusYears(-16);
        LocalDate maxDate = today.plusYears(-25);

        try {
            LocalDate DOB = LocalDate.parse("3 Jan 2006", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            if (minDate.isBefore(DOB)) {
                System.out.println("TOO YOUNG");
            } else if (DOB.isBefore(maxDate)) {
                System.out.println("TOO OLD");
            } else {
                System.out.println("ALLLLL GOOOD");
            }

        } catch (Exception e) {
            System.out.println("Please input date in correct format");
        }

    }
}
