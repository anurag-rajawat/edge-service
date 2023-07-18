package com.asr.edgeservice;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestEdgeServiceApplication {

//    @Bean
//    @ServiceConnection(name = "redis")
//    GenericContainer<?> redisContainer() {
//        return new GenericContainer<>("redis:latest").withExposedPorts(6379);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.from(EdgeServiceApplication::main).with(TestEdgeServiceApplication.class).run(args);
//    }

}
