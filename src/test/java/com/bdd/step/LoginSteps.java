package com.bdd.step;


import com.bdd.lib.WebDriverManager;
import com.bdd.page.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    private LoginPage loginPage;

    @Step
    public void cargarPaginaLogin() {
        loginPage.setDriver(WebDriverManager.setCustomDriver("chrome"));
        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
        //loginPage.waitForAngularRequestsToFinish();
    }

    @Step
    public void iniciarSesion(String user, String password) {

        loginPage.ingresarEmailOTelefono(user);
        loginPage.clickSiguiente();
        loginPage.ingresarContrasena(password);
        loginPage.clickSiguiente();

    }
}
