package org.qabetter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.validator.GenericValidator;



public class MoviePage extends BasePage {

    @FindBy(css = "div.jss122 > div:nth-child(3) > div > input")
    WebElementFacade releaseDateField;

    @FindBy(css = "div.jss168 > div:nth-child(4) > div > input")
    WebElementFacade popularityField;

    @FindBy(css = "div.jss168 > div:nth-child(5) > div > input")
    WebElementFacade voteAverage;

    @FindBy(css = "div.jss168 > div:nth-child(6) > div > input")
    WebElementFacade voteCount;

    @FindBy(css = "div.jss140 > button > span.jss95")
    WebElementFacade closeButton;

    public String getReleaseDate(){
        waitFor(releaseDateField);
        return releaseDateField.getTextContent();
    }

    public boolean checkDateReleasedOnFormat(){
        GenericValidator.isDate(String.valueOf(releaseDateField),"YYYY-MM-DD",true);
        return true;
    }

    public boolean checkPopularityField(){
        GenericValidator.isFloat(String.valueOf(popularityField));
        return true;
    }

    public boolean checkVoteAverageField(){
        GenericValidator.isFloat(String.valueOf(voteAverage));
        return true;
    }

    public boolean checkVoteCountField(){
        GenericValidator.isInt(String.valueOf(voteCount));
        return true;
    }

    public void closeMoviePage(){
        clickOn(closeButton);
    }


}
