package com.bdd.step;

import com.bdd.page.EditarCorreoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EditarCorreoSteps extends ScenarioSteps {

    private EditarCorreoPage editarCorreoPage;

    @Step
    public void ingresarDatosDeCorreo(String receptor, String asunto, String mensaje){
        editarCorreoPage.ingresarEmailDestinatario(receptor);
        editarCorreoPage.ingresarAsuntoEmal(asunto);
        editarCorreoPage.ingresarMensaje(mensaje);
        editarCorreoPage.clickEnviarButton();
    }

}
