package com.bdd.page;

import com.bdd.generic.WebDriverDom;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends WebDriverDom {

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
    private WebElementFacade redactarButton;

    public void clickRedactarNuevoCorreo(){
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 60);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(redactarButton)).click();
    }

}
