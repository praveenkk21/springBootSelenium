package testcases;

import libraries.driverSelection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.BeforeTest;
import pages.add_remove_elements;

@SpringBootTest(classes = {driverSelection.class,add_remove_elements.class})
class DemoApplicationTests {

@Autowired
private driverSelection driverSelection;

@Autowired
private add_remove_elements add_remove_elements;

    @Test
	void contextLoads() {
		System.out.print("test");
	}

	@Test
	public void setDriver(){
        WebDriver driver = driverSelection.driver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).click();
		add_remove_elements.click_add_element();
		driver.close();
	}
}
