package com.example.demo;

import libraries.driverSelection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

@Autowired
private driverSelection driverSelection;

@Value("${browser.name}")
private String environmnet;

    @Test
	void contextLoads() {
		System.out.print(environmnet);
	}

	@Test
	public void browser(){
		driverSelection test =new driverSelection();

	}
//		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.23.0");
//		driver.findElement(By.id("includelink")).click();
//	}

}
