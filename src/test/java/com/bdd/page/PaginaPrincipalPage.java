package com.bdd.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://www.google.com/intl/es/gmail/about/#")
public class PaginaPrincipalPage extends BasePage {

    //@FindBy(xpath = "//div[@class='h-c-header__cta h-c-header__cta--tier-two']/ul/li/a[contains(.,'Iniciar sesi')]")

   /* @FindBy(xpath = "//div[@class='h-c-header__cta h-c-header__cta--tier-two']/ul/li/a[contains(.,'Iniciar sesi')]")
    private WebElementFacade botonIniciar;

    public void clickBtnIniciarSesion(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        botonIniciar.click();
    }*/
}
