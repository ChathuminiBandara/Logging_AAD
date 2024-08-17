package lk.ijse;

import java.util.logging.Logger;

public class Logging {

    private static final Logger logger = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {
        logger.info("imfo msg");
        logger.warning("Warning msg");
    }

}
