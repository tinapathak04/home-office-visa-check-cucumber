package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement partenerOrFamily;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickingContinue;


    public void clickFamilyForLongStay(){
        clickOnElement(partenerOrFamily);
    log.info("Click with : " + partenerOrFamily.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(clickingContinue);
        log.info("click next step : " + clickingContinue.toString());
    }
}
