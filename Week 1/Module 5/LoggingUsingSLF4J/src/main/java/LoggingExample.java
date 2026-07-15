import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public void processUser(String username) {

        logger.info("Processing user: {}", username);

        logger.debug("Checking user details");

        if (username == null) {
            logger.warn("Username is empty");
        }

        logger.error("Example error message");
    }

    public static void main(String[] args) {

        LoggingExample example = new LoggingExample();

        example.processUser("Nivashini");
    }
}