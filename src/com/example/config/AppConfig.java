package com.example.config;

import org.springframework.config.java.plugin.context.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.example")  // ✅ Corrected
@EnableAspectJAutoProxy  // ✅ AspectJ enabled
public class AppConfig {
}
