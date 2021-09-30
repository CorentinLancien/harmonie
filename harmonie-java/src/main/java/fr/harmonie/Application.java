package fr.harmonie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.harmonie.config.AppConfig;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
