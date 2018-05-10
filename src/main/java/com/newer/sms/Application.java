package com.newer.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot 应用程序
 *
 * @author SONG
 */
@SpringBootApplication
@MapperScan("com.newer.sms.mapper")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
