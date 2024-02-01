package pages;

public class Main extends BasePage {

    private static String path_button = "//section[@class='sc-hiSaRn ijpPKy sc-jONmMj jSCqUM']//a[@class='sc-hHftZz fCaYAt'][normalize-space()='Ver cursos']";

    public Main() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");

        clickElement(path_button);
    }
}
