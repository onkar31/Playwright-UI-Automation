package playwrightDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();    //This will start Playwright server
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://www.amazon.in");

        String title = page.title();
        System.out.println("Page title is : "+ title);

        String url = page.url();
        System.out.println("url is : "+ url);

        browser.close();
        playwright.close();
    }
}
