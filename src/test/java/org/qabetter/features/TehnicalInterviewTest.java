package org.qabetter.features;

import org.junit.Test;
import org.qabetter.utils.EnvConstants;

public class TehnicalInterviewTest extends BaseTest {

    @Test
    public void openAplicationAndCheckIfListOfMovieTitlesIsDisplayed(){
        searchSteps.openAplication(EnvConstants.LOGIN_PASS);
        searchSteps.isListOfMovieTitlesDisplayed();
    }

    @Test
    public void openTheShawshankRedemptionMovieTest(){
        searchSteps.openAplication(EnvConstants.LOGIN_PASS);
        searchSteps.executeSearch("The Shawshank Redemption");
        searchSteps.openMovieShawshankrRdemption();
        movieSteps.checkReleaseDate("1994-09-23");
    }

    @Test
    public void searchStarTrekMovieTest(){
        searchSteps.openAplication(EnvConstants.LOGIN_PASS);
        searchSteps.executeSearch("Star Trek");
        searchSteps.isStarTrekFirstContactDisplayed();
        searchSteps.isTheShawshankRedemptionNoLongerVisible();
    }

    @Test
    public void checkIfMovieFieldsHaveExpectedValues(){
        searchSteps.openAplication(EnvConstants.LOGIN_PASS);
        searchSteps.executeSearch("The Godfather");
        searchSteps.openMovieTheGodfather();
        movieSteps.hasDateRelesedOnExpectedValue();
        movieSteps.hasPopularityExpectedValue();
        movieSteps.hasVoteAverageExpectedValue();
        movieSteps.hasVoteCountExpectedValue();
        movieSteps.closeMoviePage();
    }

    @Test
    public void doSearchClickingOnSearchIcon(){
        searchSteps.openAplication(EnvConstants.LOGIN_PASS);
        searchSteps.checkSearchIconIsWorking("Superman");
        searchSteps.isTheResultOfSearchingDisplayed();
    }

}
