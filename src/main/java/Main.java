import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

class Main {

    final static Logger logCR = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        PasswordChecker password = new PasswordChecker();
        password.passwordIsValid("Bello@09");

        logCR.info("This is an info message");
        logCR.error("This is an Error Log Message");
        if(logCR.isDebugEnabled()){
            logCR.debug("This is a debug Message");
        }
    }
}
