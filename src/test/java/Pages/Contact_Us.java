package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class Contact_Us {

    public Contact_Us(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[type='file']")
    public WebElement dosyaSecButtonu;

    @FindBy(css = "input[type='submit']")
    public WebElement submitButtonu;

    @FindBy(xpath = "//div[@id='form-section']/child::a")
    public WebElement returnHomeButtonu;



}
