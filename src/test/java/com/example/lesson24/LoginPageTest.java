package com.example.lesson24;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Slf4j
public class LoginPageTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
//        Selenide.open("https://lms.ithillel.ua/auth");
        loginPage = new LoginPage();
        loginPage.openPage();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }

//    @Test(dataProvider = "userWithNotValidDataProvider")
    @Test()
    public void signInWithInvalidData() {
        String email = "123sdgfsd@fasd.com";
        String password = "12345678";

//        Stub
        LoginUser user = new LoginUser(email, password);

//        Spy
//        LoginUser spyUser = Mockito.spy(user);
//        Mockito.when(spyUser.getEmail()).thenReturn("another@fasd");

//        Mock
//        LoginUser mockUser = Mockito.mock(LoginUser.class);
//        Mockito.when(mockUser.getEmail()).thenReturn("123sdgfsd@fasd.com");
//        Mockito.when(mockUser.getPassword()).thenReturn("pass");




        String expectedMessage = "Incorrect email or password";

//        loginPage.fillEmailField(email);
//        loginPage.fillPasswordField(password);
        loginPage.fillForm(user);
        loginPage.clickSignInButton();

        String actualValidationMessage = loginPage.getValidationMessage();

        try {
            Assert.assertEquals(actualValidationMessage, expectedMessage);
//            Mockito.verify(user, Mockito.times(1)).getEmail();
        } catch (AssertionError e) {
            log.error("Test failed with info: {}", e.getMessage());
            throw e;
        }

        log.info("Test passed with email: {} and password: {}", email, password);
    }

    @DataProvider
    public Object[][] userWithNotValidDataProvider() {
        Faker faker = Faker.instance();
        return new Object[][] {
                {new LoginUser(faker.internet().emailAddress(), faker.internet().password())},
                {new LoginUser(faker.internet().emailAddress(), faker.internet().password())},
                {new LoginUser(faker.internet().emailAddress(), faker.internet().password())},
                {new LoginUser(faker.internet().emailAddress(), faker.internet().password())}
        };
    }
}