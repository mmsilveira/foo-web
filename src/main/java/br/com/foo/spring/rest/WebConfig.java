package br.com.foo.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = { "br.com.foo.login", "br.com.foo.contact" })
@EnableWebMvc
public class WebConfig {

}
