package StepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TrainBookingSteps {

    WebDriver driver;

    @Given("Launch blibli travel website")
    public void launch_blibli_travel_website() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.blibli.com/travel/");
        Thread.sleep(1000);

    }
    @When("Cars tab is selected")
    public void cars_tab_is_selected()
    {
        WebElement tab = driver.findElement(By.xpath("//*[@id=\"tab-rail\"]/a"));
        tab.click();
    }
    @Then("I enter the origin location")
    public void i_enter_the_origin_location() {

    }
    @Then("i enter the destination location")
    public void i_enter_the_destination_location() {

    }
    @Then("I enter the date")
    public void i_enter_the_date() {

    }
    @Then("I select the one-way radio button")
    public void i_select_the_one_way_radio_button() {

    }
    @Then("choose no of tickets")
    public void choose_no_of_tickets() {

    }
    @Then("click find tickets")
    public void click_find_tickets() {


    }

//    @Given("Launch blibli travel website")
//    public void i_launch_blibli_travel_website() throws InterruptedException
//    {
//        System.setProperty("webdriver.chrome.driver","src/test/java/resources/driver/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.blibli.com/travel/");
//        Thread.sleep(1000);
//    }
//
//
//    @Then("Cars tab is selected")
//    public void cars_tab_is_selected()
//    {
//        WebElement tab = driver.findElement(By.xpath("//*[@id=\"tab-rail\"]/a"));
//        tab.click();
//    }
//    @Then("I enter the origin location")
//    public void i_enter_destination_as_singapore_sin()
//    {
//
//
//    }
//
//    @Then("i enter the destination location")
//    public void i_enter_date_of_travel() throws InterruptedException {
//
//    }
//    @Then("I enter the date")
//    public void click_on_one_way_radio_button() throws InterruptedException {
//
//
//        Thread.sleep(1000);
//
//    }
//    @Then("I select the one-way radio button")
//    public void click_to_choose_passengers() throws InterruptedException {
//
//
//        Thread.sleep(1000);
//
//    }
//    @Then("choose no of tickets")
//    public void choose_flight_class() throws InterruptedException {
//
//
//
//    }
//    @Then("click find tickets")
//    public void hit_find_tickets() throws InterruptedException
//    {
//
//    }

}
