package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class SignUpLogin {

    public SignUpLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//form[@action='/login']/child::button")
    public WebElement LoginButtonu;

    @FindBy(css= "input[data-qa='login-email']")
    public WebElement loginEmailButtonu;

    @FindBy(css= "input[data-qa='login-password']")
    public WebElement loginPasswordButtonu;

    @FindBy(xpath= "//*[text()='Your email or password is incorrect!']")
    public WebElement negatifGirisText;

    @FindBy(xpath= "//*[text()='Email Address already exist!']")
    public WebElement tanimliEmailUyariMesaji;

}
