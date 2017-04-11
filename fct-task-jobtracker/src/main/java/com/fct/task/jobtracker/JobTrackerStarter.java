package com.fct.task.jobtracker;

import com.github.ltsopensource.spring.boot.annotation.EnableJobTracker;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ningyang on 2017/4/11.
 */
@SpringBootApplication(scanBasePackages = "com.fct.task.jobtracker")
@EnableJobTracker
public class JobTrackerStarter {

    public static void main(String[] args){
        SpringApplication app = new SpringApplication(JobTrackerStarter.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
