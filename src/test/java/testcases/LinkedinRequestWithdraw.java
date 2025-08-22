package testcases;

import com.microsoft.playwright.*;

public class LinkedinRequestWithdraw {

    public static void main() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.linkedin.com/mynetwork/invitation-manager/sent/");
        page.locator("#username").fill("shahil.yahoo@gmail.com");
        page.locator("#password").fill("Prity@1997");
        page.locator("//button[@type='submit']").click();
        page.waitForLoadState();

//        while (page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count() > 0) {
//            while (page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count() > 0) {
//                page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").nth(0).click();
//                page.locator("(//button[contains(@class,'artdeco-button artdeco-button--2')]//span[@class='artdeco-button__text'])[2]").click();
//            }
//            page.reload();
//        }

//        for (int i= 0; i< page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count();i++){
//            page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").nth(i).click();
//            page.locator("(//button[contains(@class,'artdeco-button artdeco-button--2')]//span[@class='artdeco-button__text'])[2]").click();
//        }


        try {
            do {
                page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").nth(0).click();
                page.locator("(//button[contains(@class,'artdeco-button artdeco-button--2')]//span[@class='artdeco-button__text'])[2]").click();
            } while (page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count() > 0);
            page.reload();
            do {
                page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").nth(0).click();
                page.locator("(//button[contains(@class,'artdeco-button artdeco-button--2')]//span[@class='artdeco-button__text'])[2]").click();
            } while (page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count() > 0);

        } catch (Error e) {
            page.reload();
            do {
                page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").nth(0).click();
                page.locator("(//button[contains(@class,'artdeco-button artdeco-button--2')]//span[@class='artdeco-button__text'])[2]").click();
            } while (page.locator("//div[@class='invitation-card__action-container pl3']//span[@class='artdeco-button__text']").count() > 0);
        }
        page.close();
        browser.close();
        playwright.close();
    }
}
