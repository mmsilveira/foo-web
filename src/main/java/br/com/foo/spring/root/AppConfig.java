package br.com.foo.spring.root;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ImportResource({ "classpath*:/rest_config.xml" })
@ComponentScan(basePackages = { "br.com.foo.login", "br.com.foo.contact" })
@PropertySource({ "classpath:rest.properties", "classpath:web.properties" })
public class AppConfig {

	@Bean
	public static PropertyPlaceholderConfigurer properties() {
		return new PropertyPlaceholderConfigurer();
	}
	
}
