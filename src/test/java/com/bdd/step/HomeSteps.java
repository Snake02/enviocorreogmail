package com.bdd.step;

import com.bdd.page.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {

    private HomePage homePage;

    @Step
    public void clickRedactarNuevoCorreo(){
        homePage.clickRedactarNuevoCorreo();
    }
}
