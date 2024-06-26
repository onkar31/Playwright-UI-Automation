package playwrightDemo;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

//Code Generated by Playwright Inspector

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.stonex.com/");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("ACCEPT ALL COOKIES")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
            page.locator("form div").filter(new Locator.FilterOptions().setHasText("Tell us about yourself. Are")).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Financial Institution")).click();
            page.getByLabel("First name").click();
            page.getByLabel("First name").fill("qwerty");
            page.getByLabel("Last name").click();
            page.getByLabel("Last name").fill("zxcvbn");
            page.getByLabel("Company", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Company", new Page.GetByLabelOptions().setExact(true)).fill("qwerty.in");
            page.getByLabel("Email").click();
            page.getByLabel("Email").fill("qwerty@gmail.com");
            page.getByPlaceholder("Phone number").click();
            page.getByPlaceholder("Phone number").fill("789654123");
            page.getByPlaceholder("Phone number").press("ArrowRight");
            page.getByPlaceholder("Phone number").fill("7896541230");
            page.locator("form div").filter(new Locator.FilterOptions().setHasText("Country Afghanistan Aland")).getByRole(AriaRole.TEXTBOX).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("India").setExact(true)).click();
            page.getByPlaceholder("Please let us know what").click();
            page.getByPlaceholder("Please let us know what").fill("financial services");
            page.frameLocator("iframe[name=\"a-irv89hofhg5o\"]").getByLabel("I'm not a robot").click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Skip")).click();
            page.locator("div:nth-child(29) > div").first().click();
            page.frameLocator("iframe[name=\"a-irv89hofhg5o\"]").getByLabel("I'm not a robot").click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td:nth-child(2)").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td:nth-child(3)").click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator(".rc-imageselect-tile").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("td:nth-child(3)").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("td:nth-child(2)").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("td:nth-child(4)").first().click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").locator("tr:nth-child(2) > td:nth-child(4)").click();
            page.frameLocator("iframe[name=\"c-irv89hofhg5o\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Verify")).click();
        }
    }
}
