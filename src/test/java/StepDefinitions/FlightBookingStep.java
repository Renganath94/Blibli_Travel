package StepDefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class FlightBookingStep {

    WebDriver driver;

    @Given("I launch blibli travel website")
    public void i_launch_blibli_travel_website() throws InterruptedException
    {
          System.setProperty("webdriver.chrome.driver","src/test/java/resources/driver/chromedriver");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.blibli.com/travel/");
          Thread.sleep(1000);
    }


    @Then("I enter origin as jakarta\\(CGK)")
    public void i_enter_origin_as_jakarta_cgk()
    {
        WebElement origin = driver.findElement(By.xpath("//input[@placeholder=\"Pilih kota asal\"]"));
        origin.clear();
        origin.sendKeys("Jakarta (CGK)");
        origin.sendKeys(Keys.RETURN);


    }
    @Then("I enter destination as Singapore\\(SIN)")
    public void i_enter_destination_as_singapore_sin()
    {
        WebElement destination = driver.findElement(By.xpath("//*[@placeholder=\"Pilih kota tujuan\"]"));
        destination.clear();
        destination.sendKeys("Singapore (SIN)");
        destination.sendKeys(Keys.RETURN);

    }

    @Then("I enter date of travel")
    public void i_enter_date_of_travel() throws InterruptedException {
        WebElement date = driver.findElement(By.xpath("(//button[@class='date__text--btn'])[1]"));
        date.click();
        date.findElement(By.xpath("(//table//tbody//tr//td[@data-day=25])[1]")).click();
        Thread.sleep(1000);
    }
    @Then("click on one-way radio_button")
    public void click_on_one_way_radio_button() throws InterruptedException {
        WebElement one_way = driver.findElement(By.xpath("(//*[@class=\"list__togel-label\"])[1]"));
        one_way.click();
        Thread.sleep(1000);

    }
    @Then("click to choose passengers")
    public void click_to_choose_passengers() throws InterruptedException {
        WebElement passenger = driver.findElement(By.xpath("(//div//select[@class=\"passanger_chooser\"])[1]"));
        passenger.click();
        passenger.sendKeys("3");
        passenger.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
//       WebElement passenger1=driver.findElement(By.xpath("(//div//select//option[@value=\"2\"])[1]"));
//       passenger1.click();
//       passenger1.sendKeys(Keys.RETURN);
    }
    @Then("choose flight class")
    public void choose_flight_class() throws InterruptedException {
        WebElement classch = driver.findElement(By.xpath("//div//select[@class='classType']"));
        classch.click();
        classch.sendKeys("Business");
        classch.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"travel-blibli-app\"]/div/main/div[5]/main/div[2]/div/div/div/div/div/div[3]/div/button")).click();


    }
    @Then("Hit find tickets")
    public void hit_find_tickets() throws InterruptedException {
        WebElement findbutton = driver.findElement(By.xpath("//*[@class=\"button button--orange button--big button--full form__button\"]"));
        assertTrue("Button not working",findbutton.isEnabled());
        findbutton.click();
//        Thread.sleep(30000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"travel-blibli-app\"]/div/main/div[1]/section/div/div[1]/div/a")));
    }
    @Then("Book Garuda Indonesia Flight on {int}:{int}")
    public void book_garuda_indonesia_flight_on(Integer int1, Integer int2)
    {

    }
    @Then("Fill form details and click order")
    public void fill_form_details_and_click_order()
    {

    }
    @Then("do Payment at the booth")
    public void do_payment_at_the_booth()
    {

    }
    @Then("Pay Now")
    public void pay_now()
    {

    }
    @Then("verify recommendation stay is there")
    public void verify_recommendation_stay_is_there()
    {


    }
    @Then("hit order now and check the hotel names before and after")
    public void hit_order_now_and_check_the_hotel_names_before_and_after()
    {


    }
    @Then("close the browser")
    public void close_the_browser() throws InterruptedException
    {

    }




}
