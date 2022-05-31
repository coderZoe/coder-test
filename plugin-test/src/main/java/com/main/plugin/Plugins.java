package com.main.plugin;
import com.gitee.starblues.bootstrap.SpringPluginBootstrap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author coderZoe
 * @date 2022/5/31 16:53
 */
@SpringBootApplication
public class Plugins extends SpringPluginBootstrap{
    public static void main(String[] args) {
        new Plugins().run(args);
    }
}
