package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='address_delivery']//self::li")
    public List<WebElement> teslimatAdresi;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement teslimatMesajı;

    @FindBy(css = "a[href='/payment']")
    public WebElement siparisVerButtonu;

    @FindBy(xpath = "//label[@class='control-label']/following::input")
    public List<WebElement> hesapKartBilgileri;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement siparişOnaylamaButtonu;

    @FindBy(xpath = "//h2[@class='title text-center']//following-sibling::p")
    public WebElement siparişOnaylamaMesaji;

    @FindBy(xpath = "//td[@class='cart_delete']//a")
    public WebElement siparisUrununuCıkarma;

    @FindBy(xpath = "///a[@href='/download_invoice/500']")
    public WebElement faturaindirmebuttonu;
}
