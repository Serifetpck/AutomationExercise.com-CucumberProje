package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class Login {

   public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpButton;

   @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement signHeader;

   @FindBy(xpath = "//input[contains(@type,'text')]")
    public WebElement signName;

   @FindBy(xpath = "//input[starts-with(@data-qa, 'signup-email')]")
    public WebElement signEmail;

   @FindBy(css = "button[data-qa='signup-button']")
    public WebElement signUpButtonu;

   @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement hesapBilgileriHeader;

   @FindBy (css = "input#id_gender2")
    public WebElement radioButton;
   @FindBy (css = "input[type^='chec']")
    public List<WebElement> checkbox;

   @FindBy (xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton;

   @FindBy (xpath= "//*[text()='Account Created!']")
    public WebElement AccountCreatedText;

   @FindBy (css= "a[data-qa]")
    public WebElement continueButton;

   @FindBy (xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedText;
   @FindBy (xpath = "//*[@id='ad_iframe']")
    public WebElement frame;

   @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement hesapolusturuldugunuDogrulama;

   @FindBy (xpath = "//*[text()='Continue']")
    public WebElement hesapolusturulduDevamEtButtonu;






}
