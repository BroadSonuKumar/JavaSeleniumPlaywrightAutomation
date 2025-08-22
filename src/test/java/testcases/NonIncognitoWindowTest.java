package testcases;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class NonIncognitoWindowTest {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
//        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Browser browserContext = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
//        BrowserContext browserContext = playwright.chromium().launchPersistentContext(Paths.get("C:/Users/kumarson/AppData/Local/Google/Chrome/User Data/Default"), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
        //BrowserContext browserContext = playwright.chromium().launchPersistentContext(Paths.get("C:\\Users\\kumarson\\AppData\\Local\\Google\\Chrome\\User Data\\Default"), new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setExecutablePath(Paths.get("C:/Broadridge/Discloser/Automation/Demo Playwright/demoPlaywright/src/main/resources/windows/chromedriver.exe")));
        Page page = browserContext.newPage();
        page.navigate("http://way2automation.com");
        System.out.println(page.title());
        page.close();
        System.out.println(page.isClosed());
        playwright.close();
        browserContext.close();
    }
}
