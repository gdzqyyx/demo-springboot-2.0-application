package is.yyx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainEntry implements ApplicationRunner {

    private static Logger logger = LogManager.getLogger(MainEntry.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("==================== My runner start ====================");
        logger.info("Args: " + args.getOptionNames());
    }
}
