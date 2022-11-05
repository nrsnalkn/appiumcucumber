package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PreferenceDependenciesPage {
    public PreferenceDependenciesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement wifiCheckbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public  MobileElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    public  MobileElement textBox;

    @AndroidFindBy(id = "android:id/button1")
    public  MobileElement tamam;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement iptal;
}
