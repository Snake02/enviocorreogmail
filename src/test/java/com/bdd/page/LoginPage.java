package com.bdd.page;

import com.bdd.generic.WebDriverDom;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
public class LoginPage extends WebDriverDom {

    //@FindBy(xpath = "//*[@id=identifierId']")
    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElementFacade emailOTelefonoEditText;
    @FindBy(xpath = "//span/span[contains(.,'Siguiente')]")
    private WebElementFacade siguienteButton;
    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade contrasenaEditText;

    public void ingresarEmailOTelefono(String emailoTelefono){
        sendKeyElement(emailOTelefonoEditText, emailoTelefono);
    }

    public void clickSiguiente(){
        siguienteButton.click();
    }

    public void ingresarContrasena(String contrasena){

        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 60);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[type=password]"))).sendKeys(contrasena);

        //sendKeyElement(contrasenaEditText, contrasena);
    }
}
