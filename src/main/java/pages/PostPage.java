package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by 64 on 11.04.2016.
 */
public class PostPage {

    public void send(String text) {
        $(byText("Create a Post")).click();
        $(byCssSelector("._1mf._1mj")).setValue(text);
        $(byText("Post")).click();
    }
}
