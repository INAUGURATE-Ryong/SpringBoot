package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
class AppConfig{
    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public Address address(){
        return new Address();
    }
}
@Component
class Employee{
    Address address;

//	public Employee() {
//		address = new Address();
//	}

//	public Employee(Address address) {
//		this.address = address;
//	}

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}

@Component
class Address{
    private String getLocation;

    public String getGetLocation() {
        return getLocation;
    }

    public void setGetLocation(String getLocation) {
        this.getLocation = getLocation;
    }

}


public class MyspringApp {
    public static void main(String[] args) {
        //어노테이션 방식
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Address address = context.getBean(Address.class);
        address.setGetLocation("Seoul");
        System.out.println(address.getGetLocation());

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee.getAddress().getGetLocation());

        //XMl 방식
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //자바 방식
//		Address address = new Address();
//		Employee employee = new Employee();

        //Employee employee1 = new Employee(address);
    }
}
