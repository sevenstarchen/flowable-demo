package com.hyyj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
public class FlowableDemoApplication {
    private final static Logger logger = LoggerFactory.getLogger(FlowableDemoApplication.class);

    public static void main(String[] args) {
        logger.info("开始启动服务 ");
        SpringApplication.run(FlowableDemoApplication.class, args);
        logger.info("完成启动服务 ");
    }

}
