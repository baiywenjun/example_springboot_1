package com.backend.springboot_1;

import com.backend.springboot_1.component.MyAppInitializer;
import com.backend.springboot_1.config.Duck;
import com.backend.springboot_1.config.MyConfig3;
import com.backend.springboot_1.event.MyEvent;
import com.backend.springboot_1.event.MyListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Slf4j
public class App {

	public static void main(String[] args) {
		// 指定运行某环境下的配置
		SpringApplication app = new SpringApplication(App.class);
//		app.setBannerMode(Banner.Mode.OFF);
		app.addInitializers(new MyAppInitializer());
		// 设置环境
		app.setAdditionalProfiles("dev");
		// 添加自定义事件
//		app.addListeners(new MyListener());
		ConfigurableApplicationContext context = app.run();
//		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		// 获取配置文件值1
		log.info(context.getEnvironment().getProperty("local.ip"));
		// 获取配置文件值2
		context.getBean(MyConfig3.class).show();
		// 获取自定配置文件的值
		context.getBean(Duck.class).show();

		// 发布事件，事件监听器就会监听到事件
		context.publishEvent(new MyEvent(new Object()));

		context.stop();
		context.close();
	}
}
