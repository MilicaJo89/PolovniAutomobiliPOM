package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;

public class PAHvalaPage extends Methods {

    //paths
    public By poruka = By.xpath("//p[@class='uk-alert uk-alert-warning']");

    public void verifyHvalaMessage() throws InterruptedException {
        Thread.sleep(3000);
        ElementisPresent(poruka);
    }


}
