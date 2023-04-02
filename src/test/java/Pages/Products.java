package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class Products {

    public Products(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='productinfo text-center']/child::img")
    public List<WebElement> tumUrunler;

    @FindBy(xpath = "//div[@class='choose']//self::li//a[@href='/product_details/1']")
    public WebElement urunSecmeButtonu;

    @FindBy(css = "button[type^='but']")
    public WebElement urununSecildiginiGoruntuleme;

    @FindBy(xpath = "//div[@class='product-information']//following-sibling::font")
    public List<WebElement> urununOzellikleri;

    @FindBy(css = "input#search_product")
    public WebElement urunAramaGirisi;

    @FindBy(css = "button#submit_search")
    public WebElement urunAramaButtonu;

    @FindBy(xpath = "//div[starts-with(@class,'product-overlay')]//p")
    public List<WebElement> urunAitOzellik;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public WebElement ilkUrunResmi;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]//i")
    public WebElement Ilkurun;

    @FindBy(xpath = "(//*[text()='Add to cart'])[2]")
    public WebElement Ikinciurun;

    @FindBy(xpath = "//div[@class='choose']//self::li//a[@href='/product_details/2']")
    public WebElement ikinciUrunuGoruntuleme;

    @FindBy(xpath = "//td[@class='cart_description']//following-sibling::p")
    public List<WebElement> sepetteBulunanUrunler;

    @FindBy(xpath = "//td[@class='cart_total']//following-sibling::p")
    public List<WebElement> cartTotal;

    @FindBy(css = "li.active")
    public WebElement sepetSayasiniDogrulama;

    @FindBy(xpath = "//div[@class='col-sm-6']//self::a")
    public WebElement odemeSayfasınaYonlendirme;

    @FindBy(xpath = "//a[@href='/login']//self::u")
    public WebElement kaydolGirisYapSayfasınaYonlendirme;

    @FindBy(xpath = "(//*[text()='Sleeveless Dress'])[1]")
    public WebElement ArananElbise;

    @FindBy(xpath = "//*[@src='/get_product_picture/3']")
    public WebElement ArananElbiseninResmi;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement ArananElbisenyiSepeteEklemeButonu;

    @FindBy(xpath = "(//*[@href='/view_cart'])[2]")
    public WebElement sepeteGoruntulemeButonu;

    @FindBy(css = "input#name")
    public WebElement urunIncelemeAdBolumu;

    @FindBy(css = "button#button-review")
    public WebElement urunIncelemeSubmitButtonu;

}
