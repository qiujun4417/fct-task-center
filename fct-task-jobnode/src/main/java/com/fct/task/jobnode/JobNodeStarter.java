package com.fct.task.jobnode;

import com.github.ltsopensource.spring.boot.annotation.EnableJobClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ningyang on 2017/4/11.
 */
@SpringBootApplication(scanBasePackages = "com.fct.task")
@EnableJobClient
public class JobNodeStarter {

    public static void main(String[] args){
        SpringApplication.run(JobNodeStarter.class, args);
    }
}
