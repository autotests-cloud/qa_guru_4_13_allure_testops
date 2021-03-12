package tests;

import config.ConfigHelper;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("web")
@Feature("Login tests")
@Story("Some story")
public class WithStoryTests extends TestBase {
    @Test
    @DisplayName("Some fake test with story")
    void storyTest() {
        assertTrue(true);
    }
}