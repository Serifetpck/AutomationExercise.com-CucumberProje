package StepDefinitions.PozitifKullaniciGirisi;

import Pages.CartPage;
import io.cucumber.java.en.And;
import utulities.ReusableMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class FaturayiIndirdiginiDogrulama {
    CartPage cartPage=new CartPage();

    @And("Faturayı İndir düğmesini tıklayın ve faturanın başarıyla indirildiğini doğrulayın.")
    public void faturayıİndirDüğmesiniTıklayınVeFaturanınBaşarıylaIndirildiğiniDoğrulayın() throws IOException {

        ReusableMethods.sayfayıAsagıDogruKaydırma(cartPage.faturaindirmebuttonu);
        cartPage.faturaindirmebuttonu.click();

        String filePath="C:\\Users\\Serife\\Desktop\\invoce.txt.txt";
        assertTrue(Files.exists(Paths.get(filePath)));

        Path filePaths = Path.of("C:\\Users\\Serife\\Desktop\\invoce.txt.txt");
        String invoice = Files.readString(Path.of(filePaths.toString()));
        System.out.println("invoice \n" + invoice);

    }
}
