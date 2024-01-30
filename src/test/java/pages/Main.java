package pages;

public class Main extends BasePage {
    public Main() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }
}
