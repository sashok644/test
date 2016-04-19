package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 64 on 11.04.2016.
 */
public class NavigationPage {

    public void openSent() {
        $(byText("Sent Mail")).click();
    }

    public void openInbox() {
        $(By.partialLinkText("Inbox")).click();
    }

    public void refresh() {
        $(" .asf").click();
    }
}
