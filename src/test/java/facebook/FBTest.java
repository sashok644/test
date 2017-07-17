package facebook;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.FBPage;
import pages.PostPage;
import config.TestData;


/**
 * Created by 64 on 06.04.2016.
 */
public class FBTest {

    static {
        Configuration.timeout = 30000;
        Configuration.browser = "gecko";
    }

    FBPage facebook = new FBPage();
    PostPage post = new PostPage();

    @Test
    public void testGmailSendAndSearch() {

        facebook.open();
        facebook.login(TestData.email, TestData.password);             // fill in required login and password for email in the ...config/Testada.java
        post.send(TestData.text);
    }
}

