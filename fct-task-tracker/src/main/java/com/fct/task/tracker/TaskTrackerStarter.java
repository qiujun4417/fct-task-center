package com.fct.task.tracker;

import com.github.ltsopensource.spring.boot.annotation.EnableTaskTracker;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ningyang on 2017/4/11.
 */
@SpringBootApplication(scanBasePackages = "com.fct.task.tracker")
@EnableTaskTracker
public class TaskTrackerStarter {

    public static void main(String[] args){
        SpringApplication app = new SpringApplication(TaskTrackerStarter.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
