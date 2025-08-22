package testcases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;


public class HandlingMouseOver {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.broadridge.com/");
        page.locator("//a[contains(text(),'Industries & Segments')]").hover();
        page.locator("//a[contains(text(),'Asset Managers')]").click();
        page.locator("//div[@class='description__info']").textContent().equalsIgnoreCase("Transform your operations, strengthen client relationships and uncover new opportunities with solutions and services specifically for asset managers.");

        // Assert that the text content is as expected
        PlaywrightAssertions.assertThat(page.locator("//div[@class='description__info']"))
                .hasText("Transform your operations, strengthen client relationships and uncover new opportunities with solutions and services specifically for asset managers.");
        System.out.println("Test Case Passed");
        page.close();
        browser.close();
        playwright.close();
    }
}
