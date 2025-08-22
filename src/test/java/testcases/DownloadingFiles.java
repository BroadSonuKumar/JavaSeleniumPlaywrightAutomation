package testcases;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;


import javax.swing.*;

public class DownloadingFiles {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.selenium.dev/downloads/");

        page.getByRole(AriaRole.BUTTON);
        page.getByTestId("/html/body/div/main/div[4]/div[2]/div/div/p[1]/a").evaluate("e => e.scrollTop += 100");


        Download file = page.waitForDownload(() -> {
            page.locator("/html/body/div/main/div[4]/div[2]/div/div/p[1]/a").click();
        });

        file.saveAs(Paths.get("./src/test/resources/files/selenium.jar"));
        page.close();
        browser.close();
        playwright.close();
    }
}