import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryLogin {

    public static void main(String[] args) throws IOException {
        var pass__ = new String(Files.readAllBytes(Path.of("pass")));
        System.out.println("TEst");
        System.setProperty("webdriver.gecko.driver", "/home/romanx/Downloads/driver/geckodriver");
        var Driver = new FirefoxDriver();
        Driver.get("http://192.168.0.2:4567");
        WebElement login= Driver.findElement(By.name("login"));
        login.sendKeys("roman");
        WebElement pass= Driver.findElement(By.name("password"));
        pass.sendKeys(pass__);
        WebElement submit = Driver.findElement(By.tagName("button"));
        submit.click();
        WebElement elem = Driver.findElement(By.tagName("i"));  elem.click();




    }
}
