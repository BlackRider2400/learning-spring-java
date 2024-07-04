package com.blackrider2400.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) { }
record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Krzysztof";
    }

    @Bean
    public int age() {
        return 10;
    }

    @Bean
    public Person person() {
        return new Person("Krzysztof", 20, new Address("Swietojanska", "Warsaw"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("123 Fake Street", "Warsaw");
    }

}
