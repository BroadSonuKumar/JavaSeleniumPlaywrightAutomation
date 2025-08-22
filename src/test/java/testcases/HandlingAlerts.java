package testcases;


import com.microsoft.playwright.Page;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;


public class HandlingAlerts {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://demo.automationtesting.in/Alerts.html");

        page.onDialog(dialog -> {
            dialog.accept();
            System.out.println(dialog.message());
        });

        page.locator("//button[@onclick='alertbox()']").click();

        page.close();
        playwright.close();
    }

}
