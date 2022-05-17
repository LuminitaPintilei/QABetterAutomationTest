package org.qabetter.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class MovieSteps extends BaseSteps{

    @Step
    public void checkReleaseDate(String date){
        moviePage.getReleaseDate();
    }

    @Step
    public void hasDateRelesedOnExpectedValue(){
        Assert.assertTrue(moviePage.checkDateReleasedOnFormat());
    }

    @Step
    public void hasPopularityExpectedValue(){
        Assert.assertTrue(moviePage.checkPopularityField());
    }

    @Step
    public void hasVoteAverageExpectedValue(){
        Assert.assertTrue(moviePage.checkVoteAverageField());
    }

    @Step
    public void hasVoteCountExpectedValue(){
        Assert.assertTrue(moviePage.checkVoteCountField());
    }

    @Step
    public void closeMoviePage(){
        moviePage.closeMoviePage();
    }

}
