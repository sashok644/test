package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 64 on 11.04.2016.
 */
public class FBPage {

    public void open() {
        Selenide.open("https://www.facebook.com/");
    }

    public void login(String email, String password) {
        $("#email").setValue(email).pressTab();
        $("#pass").setValue(password).pressEnter();
    }
}




