package testcases;

import java.nio.file.Paths;
import java.nio.file.Path;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UploadMultipleFiles {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_multiple");
        page.waitForLoadState();
        page.wait(1000);
        page.frameLocator("iframe#iframeResult").locator("input#myFile").setInputFiles(new Path[] {
                Paths.get("./src/test/resources/files/IMG-6873.jpg"),
                Paths.get("./src/test/resources/files/IMG-6874.jpg")});
        page.close();
        browser.close();
        playwright.close();
    }
}