
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

    public String checkDate(String date, boolean check) {

        String outputStr = "";
        LocalDate today = LocalDate.now();

        LocalDate minDate = today.plusYears(-16);
        LocalDate maxDate = today.plusYears(-25);

        LocalDate DOB = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if (minDate.isBefore(DOB)) {
            outputStr = "TOO YOUNG";
            check = false;
        } else if (DOB.isBefore(maxDate)) {
            outputStr = "TOO OLD";
            check = false;
        } else {
            outputStr = "";
            check = true;
        }

        return outputStr;
    }

    public boolean checkAge(String date) {
        String outputStr = "";
        LocalDate today = LocalDate.now();
        LocalDate minDate = today.plusYears(-16);

        LocalDate DOB = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if (DOB.isBefore(minDate)) {
            return true;
        } else {
            return false;
        }

    }

    public String checkBlank(String check, boolean isBlank) {

        if (check.isBlank()) {
            isBlank = false;
            return "Please fill in";
        } else {
            isBlank = true;
            return "";
        }

    }

    public String checkLetters(String id, boolean check) {

        String output = "";
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                output = "ID inncorrect";
                check = false;
            } else {
                output = "";
                check = true;
            }
        }
        return output;
    }

    public String checkNumbers(String fullname, boolean check) {

        String output = "";

        for (int i = 0; i < fullname.length(); i++) {
            if (Character.isDigit(fullname.charAt(i))) {
                output = "Name inculde numbers";
                check = false;
            } else {
                output = "";
                check = true;
            }
        }
        return output;
    }

    public String checkPassword(String password, boolean check) {
        String output = "";
        int letterCount = 0;
        int numberCount = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentChar = password.charAt(i);

            if (Character.isDigit(currentChar)) {
                numberCount++;
            } else if (Character.isLetter(currentChar)) {
                letterCount++;
            } else {
                output = "Password is Weak";
                check = false;
                break;
            }

        }
        if (letterCount == 5 && numberCount == 4) {
            output = "";
            check = true;
        } else {
            output = "Password is Weak";
            check = false;
        }

        return output;
    }

    public String checkEmail(String email, boolean check) {
        String output = "";
        if (!(email.contains("@") && email.contains(".com"))) {
            output = "Please enter valid email address";
            check = false;
        } else {
            output = "";
            check = true;
        }

        return output;
    }
}

