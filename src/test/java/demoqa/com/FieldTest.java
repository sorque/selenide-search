package demoqa.com;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class FieldTest {

    @Test
    void positiveFieldTest() {
        open("https://demoqa.com/text-box");
    }
}
