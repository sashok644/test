package google;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.GmailPage;
import pages.MailsPage;
import pages.NavigationPage;
import config.TestData;

import java.util.Random;


/**
 * Created by 64 on 06.04.2016.
 */
public class GmailTest {

    static {
        Configuration.timeout = 15000;
    }

    GmailPage gmail = new GmailPage();
    MailsPage mails = new MailsPage();
    NavigationPage navigation = new NavigationPage();

    @Test
    public void testGmailSendAndSearch() {

        gmail.open();
        gmail.login(TestData.email, TestData.password);             // fill in required login and password for email in the ...config/Testada.java
        mails.send(TestData.email, subject);
        navigation.refresh();
        mails.assertMail(0, subject);


        navigation.openSent();
        mails.assertMail(0, subject);

        navigation.openInbox();
        mails.searchBySubject(subject);
        mails.assertMails(subject);
    }

    public static String subject = "subject" + (new Random()).nextInt();
}

