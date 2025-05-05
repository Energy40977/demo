package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class driverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("platformName", "Android");
        config.setCapability("deviceName", "emulator-5554");
        config.setCapability("noReset", "false");
        config.setCapability("fullReset", "false");
        config.setCapability("appWaitActivity", "*");
        config.setCapability("app", "/Users/alakbarlinn/Downloads/ares-loyalty-android-177acd31f6c7e78a03a77436a8ccaaa15f1196f9/app/app.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), config);
        return driver;
    }

}
