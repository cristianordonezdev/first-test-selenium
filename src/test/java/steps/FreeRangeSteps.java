package steps;

import io.cucumber.java.en.Given;
import pages.Main;

public class FreeRangeSteps {
    
    Main main = new Main();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        main.navigateToFreeRangeTesters();
    }

}
