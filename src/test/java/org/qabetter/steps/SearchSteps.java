package org.qabetter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class SearchSteps extends BaseSteps{

    @Step
    public void openAplication(String password){
    homePage.enterPassword(password);
    homePage.clickEnterButton();
    }

    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickEnter();
    }

    @Step
    public void isListOfMovieTitlesDisplayed(){
        Assert.assertTrue(homePage.isListOfMovieTitlesDisplayed());
    }

    @Step
    public void isStarTrekFirstContactDisplayed(){
        Assert.assertTrue(homePage.isStarTrekFirstContactDisplayed());
    }

    @Step
    public void isTheShawshankRedemptionNoLongerVisible(){
        Assert.assertFalse(homePage.isTheShawshankRedemptionVisible());
    }

    @Step
    public void openMovieShawshankrRdemption(){
        homePage.clickLearnMoreShawshankRedemption();
    }

    @Step
    public void openMovieTheGodfather(){
        homePage.clickLearnMoreTheGodFather();
    }

    @Step
    public void checkSearchIconIsWorking(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();
    }

    @Step
    public void isTheResultOfSearchingDisplayed(){
    Assert.assertTrue(homePage.isSupermanDisplayed());
    }

}
