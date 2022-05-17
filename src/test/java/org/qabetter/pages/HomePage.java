package org.qabetter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {

    @FindBy(css = "div > input")
    private WebElementFacade searchField;

    @FindBy(css = "#pwbox-4212")
    private WebElementFacade passwordField;

    @FindBy(css = "p:nth-child(2) > input[type=submit]")
    private WebElementFacade enterButton;

    @FindBy(css = "#root > div > div")
    private WebElementFacade listOfMovieTitles;

    @FindBy(css = "div:nth-child(6) > div.jss91 > h2")
    private WebElementFacade starTrekFirstContact;

    @FindBy(css = "div:nth-child(1) > div.jss91 > h2")
    private WebElementFacade theShawshankRedemption;

    @FindBy(css = "div:nth-child(1) > div.jss92 > button > span.jss95")
    private WebElementFacade learnMoreButtonShawshankRedemption;

    @FindBy(css = "div:nth-child(3) > div.jss92 > button > span.jss95")
    private WebElementFacade learnMoreButtonGodfather;

    @FindBy(css = "#root > div > header > div > form > div > div > span")
    private WebElementFacade searchIcon;

    @FindBy(css = "[title=Superman]")
    private WebElementFacade supermanMovie;



    public void enterPassword(String pass){
        typeInto(passwordField, pass);
    }

    public void setSearchField(String name){
        typeInto(searchField, name);
    }

    public void clickEnter(){
        enter(Keys.ENTER);
    }

    public void clickEnterButton(){
        clickOn(enterButton);
    }

    public void clickLearnMoreShawshankRedemption(){
        clickOn(learnMoreButtonShawshankRedemption);
    }

    public boolean isListOfMovieTitlesDisplayed(){
        listOfMovieTitles.isDisplayed();
        return true;
    }

    public boolean isStarTrekFirstContactDisplayed(){
        starTrekFirstContact.isDisplayed();
        return true;
    }

    public boolean isTheShawshankRedemptionVisible(){
        theShawshankRedemption.isCurrentlyVisible();
        return false;
    }

    public void clickLearnMoreTheGodFather(){
        clickOn(learnMoreButtonGodfather);
    }

    public void clickSearchButton(){
        clickOn(searchIcon);
    }

    public boolean isSupermanDisplayed(){
        supermanMovie.isDisplayed();
        return true;
    }



}
