package testcases;

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
private driverSelection driverSelections;

@Autowired
private WebDriver driver;
@Value("${browser.name}")
private String environmnet;

    @Test
	void contextLoads() {
		System.out.print(environmnet);
	}

	@Test
	public void browser(){
		driver= driverSelections.browser2();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.23.0");
		driver.findElement(By.id("includelink")).click();
	}

}
