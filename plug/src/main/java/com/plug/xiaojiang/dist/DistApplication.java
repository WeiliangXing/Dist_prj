package com.plug.xiaojiang.dist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistApplication {
    protected final static Logger logger = LoggerFactory.getLogger(DistApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DistApplication.class, args);
		logger.info("Application is success!");
	}
}
