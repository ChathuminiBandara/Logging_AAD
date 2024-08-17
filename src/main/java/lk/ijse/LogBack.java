package lk.ijse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBack {
    static Logger logger  = LoggerFactory.getLogger(LogBack.class); //passing the class type as the param

    public static void main(String[] args) {
        logger.info("this is the logging info msg");
    }


}
