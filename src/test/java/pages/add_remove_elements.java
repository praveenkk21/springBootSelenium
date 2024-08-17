package pages;
import libraries.driverSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.By.xpath;

@Component
public class add_remove_elements extends driverSelection{
    private WebDriver driver;
    private By add_element=xpath("//*[@id='content']/div/button");

    @Autowired
    public add_remove_elements(WebDriver driver){
        this.driver=driver;
    }
    public void click_add_element(){
        driver.findElement(add_element).click();
    }
}
