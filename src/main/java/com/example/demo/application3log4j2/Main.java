package com.example.demo.application3log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Logger logger = LogManager.getLogger();

        // 同時に出力するとメッセージが前後したりするので、要所でスリープさせている

        System.out.println("fatalログ出力開始");
        Thread.sleep(100);
        logger.fatal("fatal!");
        Thread.sleep(100);
        System.out.println();
        Thread.sleep(100);

        System.out.println("errorログ出力開始");
        Thread.sleep(100);
        logger.error("error!");
        Thread.sleep(100);
        System.out.println();
        Thread.sleep(100);

        System.out.println("warnログ出力開始");
        Thread.sleep(100);
        logger.warn("warn!");
        Thread.sleep(100);
        System.out.println();
        Thread.sleep(100);

        System.out.println("infoログ出力開始");
        Thread.sleep(100);
        logger.info("info!");
        Thread.sleep(100);
        System.out.println();
        Thread.sleep(100);

        System.out.println("debugログ出力開始");
        Thread.sleep(100);
        logger.debug("debug!");
        Thread.sleep(1000);
        System.out.println();
        Thread.sleep(100);

        System.out.println("traceログ出力開始");
        Thread.sleep(100);
        logger.trace("trace!");
    }

}
