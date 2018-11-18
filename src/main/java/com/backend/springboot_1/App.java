package com.backend.springboot_1;

import com.backend.springboot_1.config.Duck;
import com.backend.springboot_1.config.MyConfig3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class App {

	public static void main(String[] args) {
		// 指定运行某环境下的配置
		SpringApplication app = new SpringApplication(App.class);
		app.setAdditionalProfiles("dev");
		ConfigurableApplicationContext context = app.run();
//		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		// 获取配置文件值1
		log.info(context.getEnvironment().getProperty("local.ip"));
		// 获取配置文件值2
		context.getBean(MyConfig3.class).show();
		// 获取自定配置文件的值
		context.getBean(Duck.class).show();



	}
}
