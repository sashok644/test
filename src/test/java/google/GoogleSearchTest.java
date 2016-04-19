package google;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

/**
 * Created by 64 on 06.04.2016.
 */
public class GoogleSearchTest {

    @Test
    public void testGoogleSearch() {

        open("http://google.com/ncr");
        $(By.name("q")).setValue("Selenium automates browsers").pressEnter();
        searchResults.shouldHaveSize(10);
        searchResults.get(0).shouldHave(text("Selenium automates browsers"));
        searchResults.get(0).find(".r").click();
        $("h1").shouldHave(exactText("Browser Automation"));
        assertEquals("http://www.seleniumhq.org/", url());
    }

    ElementsCollection searchResults = $$(".srg>.g");
}

