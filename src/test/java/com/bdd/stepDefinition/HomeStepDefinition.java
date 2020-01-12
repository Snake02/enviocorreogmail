package com.bdd.stepDefinition;

import com.bdd.step.HomeSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeStepDefinition {

    @Steps
    HomeSteps redactarNuevoCorreo;

    @Then("^Estoy en el home doy click en redactar$")
    public void click_redactar_nuevo_correo(){
        System.out.println("Click en botón redactar");
        redactarNuevoCorreo.clickRedactarNuevoCorreo();
    }
}
