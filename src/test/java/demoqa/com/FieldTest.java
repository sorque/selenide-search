package demoqa.com;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FieldTest {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @AfterEach
    void tearDown() {
        System.out.println("done");
    }

    @Test
    void positiveFieldTest() {
        open("/text-box");
        $("#userName").setValue("Mike");
        $("#userEmail").setValue("sdd@corp.ru");
        $("#currentAddress", 0).setValue("someStreet");
        $("#permanentAddress").setValue("anotherAdress");
        $("#submit").click();

        $("#name").shouldHave(text("Mike"));
        $("#email").shouldHave(text("sdd@corp.ru"));
        $("#currentAddress", 1).shouldHave(text("someStreet"));
        $("#permanentAddress", 1).shouldHave(text("anotherAdress"));
    }
}
