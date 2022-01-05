package com.anma.sb.mongodbgenerator.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

   private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading data in Bootstrap");
        loadData();
    }

    private void loadData() {


    }
}
