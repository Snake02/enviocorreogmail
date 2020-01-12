package com.bdd.generic;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebDriverDom extends BaseDom {

    public void JSClickElement(WebElementFacade element){
        JavascriptExecutor ex = (JavascriptExecutor) getDriver();
        ex.executeScript("arguments[0].click();", element);

    }

    protected void clickElement( WebElementFacade element){
        element.click();
    }

    protected void waitForElementAndClick(WebElementFacade element, int timeOnSeconds){
        element.waitUntilVisible().click();
    }

    protected String getTextFromElement( WebElementFacade element){
        return element.getText();
    }

    protected String waitForElementoAndGetText(WebElementFacade element, int timeOnSeconds){
        return element.waitUntilVisible().getText();
    }

    protected void sendKeyElement( WebElementFacade webElement, String value){
        webElement.sendKeys(value);
    }

    protected void waitForElementAndSendKey(WebElementFacade element, String value){
        webDriverWait(element, 60).sendKeys(value);
    }

    protected boolean isElementPresent(WebElementFacade webElement){
        try{
            webElement.isPresent();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    protected void clickElementForAList(List<WebElementFacade> listElement, String value){
        for(WebElementFacade element : listElement){
            if(element.getText().equals(value)){
                element.click();
                break;
            }
        }
    }

    protected void selectOptionFromComboListAndClick(WebElement selectOption, String optionValue){

        Select select = new Select(selectOption);
        for (WebElement webElement : select.getOptions()) {
            if (webElement.getText().contains(optionValue)) {
                webElement.click();
                break;
            }
        }
    }
}
