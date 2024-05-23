package com.example.lesson24;

import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.FileAppender;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {
    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    private final SelenideElement emailInput = Selenide.$(".hi-input[type='email']");
    private final SelenideElement passwordInput = Selenide.$(".hi-input[type='password']");
    private final SelenideElement signInButton = Selenide.$(".hi-button[type='submit']");
    private final SelenideElement loginValidationMessage = Selenide.$("p.page-login__actions-validation");


    public void openPage() {
        Selenide.open("https://lms.ithillel.ua/auth");
        logger.info("Open page for authorization");
    }

    public void fillForm(LoginUser user) {
        fillEmailField(user.getEmail());
        fillPasswordField(user.getPassword());
        logger.info("Login with email: {} and password: {}", user.getEmail(), user.getPassword());
    }

    public void fillEmailField(String email) {
        emailInput.type(email);
    }

    public void fillPasswordField(String password) {
        passwordInput.type(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getValidationMessage() {
        return loginValidationMessage
                .shouldBe(Condition.visible)
                .text();
    }
}
