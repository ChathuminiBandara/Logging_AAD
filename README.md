# Logging AAD

##  Package Used in this;  

* import java.util.logging.Logger;

##  Used


public class Logging {

    private static final Logger logger = Logger.getLogger(Logging.class.getName());
    public static void main(String[] args) {
        logger.info("imfo msg");
        logger.warning("Warning msg");
    }}


# dependency 

 <!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.5.7</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.guicedee.services/slf4j -->
        <dependency>
            <groupId>com.guicedee.services</groupId>
            <artifactId>slf4j</artifactId>
            <version>1.2.2.1</version>
        </dependency>


