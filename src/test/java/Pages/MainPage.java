package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement KullanıcıGirisi;

    @FindBy(xpath = "//*[text()='Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement aboneEmailSearch;

    @FindBy(xpath = "//a[contains(@href,'/view_cart')]")
    public WebElement cartButonu;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButonu;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement kategoriWomen;

    @FindBy(xpath = "//*[@href='#Men']")
    public WebElement kategoriMen;

    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement kategoriWomenDress;

    @FindBy(css= "a#scrollUp")
    public WebElement yukariOkTusu;

    @FindBy(xpath= "//iframe[@id='google_esf']")
    public WebElement iframe;


}
