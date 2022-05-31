package com.main;

import com.gitee.starblues.loader.launcher.SpringBootstrap;
import com.gitee.starblues.loader.launcher.SpringMainBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author coderZoe
 * @date 2022/5/31 16:16
 */
@SpringBootApplication
public class Application implements SpringBootstrap {

    public static void main(String[] args) {
        SpringMainBootstrap.launch(Application.class,args);
    }
    @Override
    public void run(String[] strings) throws Exception {
        SpringApplication.run(Application.class,strings);
    }
}
