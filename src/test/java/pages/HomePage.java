package pages;

import hooks.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
    PageFactory.initElements(Hooks.getDriver(),this);
}

    @FindBy(xpath ="//*[@id='a-autoid-1']")
    public WebElement cookiesClosed;
}

