package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 64 on 11.04.2016.
 */
public class GmailPage {

    public void open() {
        Selenide.open("http://gmail.com");
    }

    public void login(String email, String password) {
        $("#Email").setValue(email).pressEnter();
        $("#Passwd").setValue(password).pressEnter();
    }
}
