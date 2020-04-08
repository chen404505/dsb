package com.dsb.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.dsb.pms.dao")
@RefreshScope
public class DsbPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsbPmsApplication.class, args);
    }

}
