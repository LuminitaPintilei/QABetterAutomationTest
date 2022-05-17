package org.qabetter.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.qabetter.steps.MovieSteps;
import org.qabetter.steps.SearchSteps;
import org.qabetter.utils.EnvConstants;


@RunWith(SerenityRunner.class)

public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }

    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected MovieSteps movieSteps;




}
