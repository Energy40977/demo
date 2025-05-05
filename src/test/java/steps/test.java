package steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utils.driverManager;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class test {

    AndroidDriver driver;

    public test() {
        try {
            driver = driverManager.getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Driver could not be initialized", e);
        }
    }

    @Given("The application has been started")
    public void theApplicationHasBeenStarted() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("az.kapitalbank.mbanking:id/intro_title")).isDisplayed();
    }

    @When("Click the skip button")
    public void clickTheSkipButton(){
        driver.findElement(By.id("az.kapitalbank.mbanking:id/tv_skip")).click();
    }

    @And("Click the eye")
    public void clickTheEye() {
        driver.findElement(By.id("az.kapitalbank.mbanking:id/ibDebugScreen")).click();
    }

    @And("Click the enviroment section")
    public void clickTheEnviromentSection() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")).click();
    }

    @And("Select preprod")
    public void selectPreprod() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
    }

    @Then("Login button should be displayed")
    public void loginButtonShouldBeDisplayed() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("az.kapitalbank.mbanking:id/btnLogin")).isDisplayed();
    }
}
