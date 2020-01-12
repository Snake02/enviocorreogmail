package com.bdd.stepDefinition;

import com.bdd.step.EditarCorreoSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;


public class EditarCorreoStepDefinition {
    @Steps
    private EditarCorreoSteps editarCorreoSteps;

    @And("^Ingresar datos del mensaje: \"([^\"]*)\",\"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresar_datos_correo(String receptor, String asunto, String mensaje){
        editarCorreoSteps.ingresarDatosDeCorreo(receptor,asunto,mensaje);
    }
}
