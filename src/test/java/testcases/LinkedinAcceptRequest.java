package testcases;

import com.microsoft.playwright.*;


public class LinkedinAcceptRequest {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.linkedin.com/feed/");
        page.locator("#username").fill("shahil.yahoo@gmail.com");
        page.locator("#password").fill("Prity@1997");
        page.locator("//button[@type='submit']").click();

        page.locator("//span[@title='My Network']").click();
        page.waitForTimeout(3000);
        for (int i = 0; i < page.locator("#connect-small").last().count(); i++) {
            page.locator("#connect-small").click();
            page.waitForLoadState();
            if (page.locator("#connect-small").last().count() == (page.locator("#connect-small").last().count() - 1)) {
                page.reload();
            }
        }
        page.close();
        browser.close();
        playwright.close();

    }
}
