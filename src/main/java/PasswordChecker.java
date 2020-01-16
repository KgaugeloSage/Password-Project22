import java.util.logging.*;

public class PasswordChecker {
    private final static Logger LogPWC = Logger.getLogger( Logger.GLOBAL_LOGGER_NAME );


    private boolean lowerCaseCheck=true,upperCaseCheck=true,chara=true,exist=true,number=true,length=true;
    int counter=6;
    
    void passwordIsValid(String password)  {
        if (!doesDasswordExist(password)) {

            System.out.println("password should exist");
            exist = false;
            counter --;
        }
        if (!longerThan(password)) {
            System.out.println("password should be longer than than 8 characters");
            length = false;
            counter --;
        }
        if (!lowerCase(password)) {
            System.out.println("password should have at least one lowercase letter");
            lowerCaseCheck = false;
            counter --;
        }
        if (!upperCase(password)) {
            System.out.println("password should have at least one uppercase letter");
            upperCaseCheck = false;
            counter --;
        }
        if (!figure(password)) {
            System.out.println("password should have at least have one digit");
            number = false;
            counter --;
        }
        if (!character(password)) {
            System.out.println("password should have at least one special character");
            chara = false;
            counter --;
        }
        if (number && lowerCaseCheck && length && upperCaseCheck && exist && chara) {
            System.out.println("password meets all requirements");
        }
    }


    boolean passwordIsOk() {

        boolean results = true;
        if (counter <= 3) {
            results = false;
        }
        return results;
    }

    private boolean doesDasswordExist(String password) {
        boolean results = true;
        if (password.length() < 1) {
            results = false;
        }
        return results;
    }

    private boolean longerThan(String password) {
        boolean results = true;
        if (password.length() < 8) {
            results = false;
        }
        return results;
    }

    private boolean lowerCase(String password) {
        boolean results = false;
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }

    private boolean upperCase(String password) {
        boolean results = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                results = true;
                break;
            }
        }
        return results;
    }

    private boolean figure(String password) {
        boolean results =  false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                results = true;
                break;
            }
        }
        return results;
    }

    private boolean character(String password) {
        boolean results = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                results = true;
                break;
            }
        }
        return results;
    }



}
