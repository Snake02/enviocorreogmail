package com.bdd.stepDefinition;

import com.bdd.step.LoginSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefiniton {

    @Steps
    private LoginSteps loginSteps;

    @Given("^Cargar la pagina de Login$")
    public void cargar_Pagina_Login(){
        loginSteps.cargarPaginaLogin();
    }

    @Given("^Que inicio sesion con mis credenciales: \"([^\"]*)\" y \"([^\"]*)\"$")
    public void loging_cuenta_gmail(String user , String password){

        loginSteps.iniciarSesion(user, password);

    }


}
