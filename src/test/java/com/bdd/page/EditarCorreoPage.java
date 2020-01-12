package com.bdd.page;

import com.bdd.generic.WebDriverDom;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class EditarCorreoPage extends WebDriverDom {

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElementFacade textAreaDestinatarios;
    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElementFacade textAreaAsunto;
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    private WebElementFacade textAreaMensaje;
    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
    private WebElementFacade enviarButton;

    public void ingresarEmailDestinatario(String emailDestinatario) {
        textAreaDestinatarios.click();
        sendKeyElement(textAreaDestinatarios, emailDestinatario);
    }

    public void ingresarAsuntoEmal(String asuntoEmail) {
        sendKeyElement(textAreaAsunto, asuntoEmail);
    }

    public void ingresarMensaje(String mensaje) {
        sendKeyElement(textAreaMensaje, mensaje);
    }

    public void clickEnviarButton() {
        enviarButton.click();
    }
}
