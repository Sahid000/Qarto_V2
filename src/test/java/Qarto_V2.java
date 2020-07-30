import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

@Listeners(ITestListener.class)

public class Qarto_V2 {

    public static WebDriver driver;
    static String BaseURL = "http://qartolab.com";
    static JavascriptExecutor js;

    @BeforeTest
    public static void Websetup() throws Exception {
        //MyScreenRecorder.startRecording("");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fahim\\Desktop\\Selenium_Java\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
        js = (JavascriptExecutor) driver;
        //MyScreenRecorder.stopRecording();
    }

    //@Test(priority = 1)
    public static void Qarto_Website() throws Exception {

        //Quarto_Cookies
        driver.findElement(By.xpath("//*[@id=\"consent\"]/div/p/div/button")).click();
        Thread.sleep(15000);
        //View_Features
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/hero-banner-v4[1]/section[1]/div[1]/div[1]/div[1]/owl-carousel[1]/owl-carousel-child[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();
        Thread.sleep(5000);
        //Up_Arrow
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/quarto-scrolltop[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 2)
    public static void Request_Demo() throws Exception {
        //Request_Demo
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/hero-banner-v4[1]/section[1]/div[1]/div[1]/div[1]/owl-carousel[1]/owl-carousel-child[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")).click();
        Thread.sleep(5000);
        //Name
        driver.findElement(By.xpath("//input[@id='InputName']")).click();
        driver.findElement(By.xpath("//input[@id='InputName']")).sendKeys("Shahid Hossain");
        Thread.sleep(2000);
        //Company_Name
        driver.findElement(By.xpath("//input[@id='InputCompany']")).click();
        driver.findElement(By.xpath("//input[@id='InputCompany']")).sendKeys("Quarto");
        Thread.sleep(2000);
        //Email_address
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/div[3]/contact-v2[1]/section[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/div[3]/contact-v2[1]/section[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("hassanshahid77@yahoo.com");
        Thread.sleep(2000);
        //Phone_Number
        driver.findElement(By.xpath("//input[@name='InputPhone']")).click();
        driver.findElement(By.xpath("//input[@name='InputPhone']")).sendKeys("(123) 123-1234");
        Thread.sleep(2000);
        //Message
        driver.findElement(By.xpath("//textarea[@id='message']")).click();
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("We are Quarto Test Team");
        Thread.sleep(2000);
        //Capcha
        driver.findElement(By.xpath("//input[@id='captcha']")).click();
        driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("29");
        Thread.sleep(2000);
        //Submit
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md mb-3']")).click();
        Thread.sleep(2000);
        //Reset
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/div[3]/contact-v2[1]/section[1]/div[1]/div[3]/button[2]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public static void Login() throws InterruptedException {
        //Login-Button
        driver.findElement(By.cssSelector("header:nth-child(1) nav.navbar-main ul:nth-child(1) li:nth-child(4) > a.login-btn")).click();
        Thread.sleep(3000);
        //user
        driver.findElement(By.xpath("//input[@id='email']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shahid.hassan007@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/login/div/div/div/div[2]/div/div/div/form/div/div[2]/div/a")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //pass
        driver.findElement(By.cssSelector("#password")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys("Admin2020@");
        driver.findElement(By.xpath("/html/body/root/login/div/div/div/div[2]/div/div/div/form/div/div[3]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Assert.assertTrue(driver.getPageSource().contains("Explore Categories"));
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 4)
    public static void Create_Simple_Document() throws InterruptedException {
        //Create_Simple_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[1]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(3000);
        //Document_Title
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Create a Simple Document");
        Thread.sleep(2000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("The more time you spend helping others, the happier you feel with yourself.\n" +
                "When someone says,“Let me ask you question ?”, we tend to recall bad experiences.\n");
        Thread.sleep(3000);
        //ADD_CATEGORIES
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-fresh/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 5)
    public static void Create_Simple_Document_QUIZ() throws InterruptedException {
        //Create_Simple_Document_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[1]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(3000);
        //Document_Title
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Create a Simple Document_QUIZ");
        Thread.sleep(2000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("What golden advice did you learn in your life?\n" +
                "Don’t chew what you can’t swallow. It ain’t worth it.\n" +
                "Don’t believe everything you hear. Sometimes ears hear what you’re not supposed to hear.\n");
        Thread.sleep(3000);
        //ADD_CATEGORIES
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-fresh/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //ADD_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //Answers
        driver.findElement(By.xpath("//div[@class='ng-star-inserted ng-dirty ng-touched ng-valid']//div[2]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //ADD_ANOTHER_QUESTIONS_2
        driver.findElement(By.xpath("//button[@class='btn btn-with-icon btn-success']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 2.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 2.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER_2
        driver.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 2.3");
        Thread.sleep(2000);
        //Answers_2
        driver.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/div/div[3]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 6)
    public static void Create_Multi_Document() throws InterruptedException {
        //Create_Multi_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[2]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@id='docTitle']")).click();
        driver.findElement(By.xpath("//input[@id='docTitle']")).sendKeys("Create Multi-Sectional Document");
        Thread.sleep(2000);
        //Add_Section
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).sendKeys("A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(1000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("One of the most productive emotions in the world is exciting. Ask yourself…When are you most energized, focused, and capable of achieving difficult tasks?");
        Thread.sleep(2000);
        //Add_Section
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).sendKeys("B");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(1000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When you’re the most excited about doing them. So before you sit down to work, ask yourself, “What can I get excited about with the task I’m about to complete?”");
        Thread.sleep(2000);
        //Add_Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/create-stepwise/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/create-stepwise/section/div/div/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 7)
    public static void Create_Multi_Document_QUIZ() throws InterruptedException {
        //Create_Multi_Document_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[2]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@id='docTitle']")).click();
        driver.findElement(By.xpath("//input[@id='docTitle']")).sendKeys("Create Multi-Sectional Document_QUIZ");
        Thread.sleep(2000);
        //Add_Section
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).sendKeys("A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(1000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("One of the most productive emotions in the world is exciting. Ask yourself…When are you most energized, focused, and capable of achieving difficult tasks?");
        Thread.sleep(2000);
        //Add_Section
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Add Section']")).sendKeys("B");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(1000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When you’re the most excited about doing them. So before you sit down to work, ask yourself, “What can I get excited about with the task I’m about to complete?”");
        Thread.sleep(2000);
        //Add_Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/create-stepwise/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //ADD_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//input[1]")).click();
        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//input[1]")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //Answers
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[2]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/create-stepwise/section/div/div/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 8)
    public static void Create_Visual_Document() throws InterruptedException, AWTException {
        //Create_Visual_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[3]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Create Visual Document");
        Thread.sleep(3000);
        //Visual image_2
        driver.findElement(By.xpath("//i[@class='pe-7s-plus']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Documents\\2.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Document_Description
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).sendKeys("But it is always there, where we see it or not, whether we choose to or not.");
        Thread.sleep(2000);
        //Add_Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-imagedocument/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-imagedocument/section/div/div/button[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 9)
    public static void Create_Visual_Document_QUIZ() throws InterruptedException, AWTException {
        //Create_Visual_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[3]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Create Visual Document_QUIZ");
        Thread.sleep(5000);
        //Visual image
        driver.findElement(By.xpath("//i[@class='pe-7s-plus']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Documents\\1.JPG");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(5000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Document_Description
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).sendKeys("But it is always there, where we see it or not, whether we choose to or not.");
        Thread.sleep(2000);
        //Add_Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-imagedocument/section/form/div/div[2]/div[1]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //ADD_QUIZ
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-imagedocument/section/form/div/div[2]/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //Answers
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[1]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-imagedocument/section/div/div/button[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 10)
    public static void Create_Video_Document() throws InterruptedException, AWTException {
        //Create_Video_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[4]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Video_Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Create Video");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-video/create-video-upload-component/form/div[1]/div[1]/div[3]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Upload Video
        driver.findElement(By.xpath("//span[@class='btn btn-light']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Desktop\\Quarto Video\\3.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(5000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Notes
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(2000);
        //CATEGORY LIST
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Save_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(2000);
        //CONFIRM
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 11)
    public static void Create_Video_Document_QUIZ() throws InterruptedException, AWTException {
        //Create_Video_Document_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[4]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Video_Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Create Video with Quiz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-video/create-video-upload-component/form/div[1]/div[1]/div[3]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Upload Video
        driver.findElement(By.xpath("//span[@class='btn btn-light']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Desktop\\Quarto Video\\3B.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(5000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Notes
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(5000);
        //CATEGORY LIST
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Add Quiz
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-video/create-video-upload-component/div/div/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("Video QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        //Answers
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //Click Answer
        driver.findElement(By.xpath("//ngb-modal-window[@class='modal fade show d-block modal-xl']//div[3]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Save Quiz
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Save_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(2000);
        //CONFIRM
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 12)
    public static void Create_or_Upload_Video() throws InterruptedException, AWTException {
        //Create_or_Upload_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create or Upload Video')]")).click();
        Thread.sleep(2000);
        //Video Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Upload Video");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Upload Video File
        driver.findElement(By.xpath("//span[@class='btn btn-light']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Desktop\\Quarto Video\\3.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(5000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Notes
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(2000);
        //CATEGORY LIST
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Save_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(2000);
        //CONFIRM
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 13)
    public static void Create_or_Upload_Video_QUIZ() throws InterruptedException, AWTException {
        //Create_or_Upload_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create or Upload Video')]")).click();
        Thread.sleep(2000);
        //Video Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Upload Video with Quiz");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        //Upload Video File
        driver.findElement(By.xpath("//span[@class='btn btn-light']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Desktop\\Quarto Video\\4.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(6000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(6000);
        //Notes
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(2000);
        //CATEGORY LIST
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Add Quiz
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-video/create-video-upload-component/div/div/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[1]/input")).sendKeys("Video QUIZ QUESTIONS 2");
        Thread.sleep(2000);
        //Answers
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[1]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[1]/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys("QUESTIONS 2.1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[2]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[2]/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[2]/div/div[2]/input")).sendKeys("QUESTIONS 2.2");
        Thread.sleep(2000);
        //Click Answer
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[1]/div/div[1]/label/span")).click();
        Thread.sleep(2000);
        //Save Quiz
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/quiz-create/div[2]/div/div/form/div[2]/button")).click();
        Thread.sleep(2000);
        //Save_Video
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(2000);
        //CONFIRM
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 14)
    public static void ASSIGN_TO_CREATE() throws InterruptedException, AWTException {
        //ASSIGN_TO_CREATE
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Assign To Create')]")).click();
        Thread.sleep(2000);
        //Subject
        driver.findElement(By.xpath("//input[@placeholder='Please add a subject']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Please add a subject']")).sendKeys("Subject Assign To Create");
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add_Comments
        driver.findElement((By.xpath("//textarea[@placeholder='Type your comments']"))).click();
        driver.findElement((By.xpath("//textarea[@placeholder='Type your comments']"))).sendKeys("The truth doesn't care about our needs or wants.");
        Thread.sleep(2000);
        //Due Date
        driver.findElement(By.xpath("//i[@class='icon-due-date icon-large text-success align-middle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'31')]")).click();
        Thread.sleep(2000);
        //Add_Categories
        driver.findElement(By.xpath("//div[@class='btn btn-light btn-with-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[2]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[8]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[2]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
        Thread.sleep(2000);
//        //Preferred Document Type
//        Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='ng-input']")));
//        dropdown.selectByValue("a26f054fa208");
//        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/document-write[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 15)
    public static void Global_Search() throws InterruptedException, AWTException {
        //Global_Search
        driver.findElement(By.xpath("//div[@class='input-group']//input[@placeholder='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='input-group']//input[@placeholder='Search']")).sendKeys("What are some of the dark lessons that life showed you");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'What are some of the dark lessons that life showed')]")).click();
        Thread.sleep(3000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-search-list[1]/section[1]/div[2]/div[2]/list-card[1]/div[1]/a[1]/div[1]/div[2]/p[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 16)
    public static void SHARE_LINK() throws InterruptedException, AWTException {
        //Share_Page
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shahid");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement((By.xpath("//textarea[@id='comment']"))).click();
        driver.findElement((By.xpath("//textarea[@id='comment']"))).sendKeys("Sharing this page");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 17)
    public static void Forum_Notifications() throws InterruptedException, AWTException {
        //See_All_Forum_Notifications
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/ul[1]/li[4]/a[1]/h3[1]")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 18)
    public static void Documents_Notifications() throws InterruptedException, AWTException {
        //See_All_Documents_Notification
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[6]/ul[1]/li[7]/a[1]/h3[1]")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 19)
    public static void User_Profile() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //My_Account
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        Thread.sleep(2000);
        //First_Name
        driver.findElement(By.xpath("//input[@placeholder='e.g. Jenny']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='e.g. Jenny']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='e.g. Jenny']")).sendKeys("Shahid");
        Thread.sleep(2000);
        //Last_Name
        driver.findElement(By.xpath("//input[@placeholder='e.g. Anderson']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='e.g. Anderson']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='e.g. Anderson']")).sendKeys("Hossain");
        Thread.sleep(2000);
        //Title
        driver.findElement(By.xpath("//input[@placeholder='e.g. Product Designer']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='e.g. Product Designer']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='e.g. Product Designer']")).sendKeys("SQA Engineer");
        Thread.sleep(2000);
        //Department
        driver.findElement(By.xpath("//input[@placeholder='e.g. Design Team']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='e.g. Design Team']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='e.g. Design Team']")).sendKeys("Quality Assurance ");
        Thread.sleep(2000);
        //Manager
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(admin@acme.com)')]")).click();
        Thread.sleep(3000);
        //Phone
        //Dropdown
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-user-profile/section/div[2]/div/div/div[1]/form/div[2]/div[8]/intl-input-phone/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-user-profile/section/div[2]/div/div/div[1]/form/div[2]/div[8]/intl-input-phone/div/input")).clear();
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-user-profile/section/div[2]/div/div/div[1]/form/div[2]/div[8]/intl-input-phone/div/input")).sendKeys("01677266742");
        Thread.sleep(2000);
        //Update Button
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-user-profile[1]/section[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
//        //USER PHOTO Uploading
//        //Remove_Image
//        driver.findElement(By.xpath("//button[@class='btn btn-light']")).click();
//        Thread.sleep(6000);
//        //Image_Upload
//        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-user-profile/section/div[2]/div/div/div[2]/div[2]/div[2]/button[1]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='propic']")).click();
//        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Documents\\rsz_thimpuu_67.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//        Thread.sleep(3000);
//        Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(5000);
//        //Done Button
//        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
//        Thread.sleep(5000);
        //CHANGE PASSWORD
//        //Old Password
//        driver.findElement(By.xpath("//input[@id='oldPass']")).click();
//        driver.findElement(By.xpath("//input[@id='oldPass']")).sendKeys("Admin2020#");
//        Thread.sleep(2000);
//        //New Password
//        driver.findElement(By.xpath("//input[@id='newPass']")).click();
//        driver.findElement(By.xpath("//input[@id='newPass']")).sendKeys("Admin2020@");
//        Thread.sleep(2000);
//        //Confirm Password
//        driver.findElement(By.xpath("//input[@id='confirmPass']")).click();
//        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Admin2020@");
//        Thread.sleep(2000);
//        //Update Button
//        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-user-profile/section/div[2]/div/div/div[3]/button")).click();
//        Thread.sleep(2000);
    }

    //@Test(priority = 20)
    public static void History() throws InterruptedException, AWTException {
        //History
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'History')]")).click();
        Thread.sleep(5000);
        //Font_Pagination
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")).click();
        Thread.sleep(4000);
        //Back_Pagination
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(4000);
        //SORT_BY
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Visual_Doc
        driver.findElement(By.xpath("//span[contains(text(),'Visual')]")).click();
        Thread.sleep(6000);
        //SORT_BY
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Video
        driver.findElement(By.xpath("//span[contains(text(),'Video')]")).click();
        Thread.sleep(6000);
        //SORT_BY
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Most_Viewed
        driver.findElement(By.xpath("//span[contains(text(),'Most Viewed')]")).click();
        Thread.sleep(6000);
        //SORT_BY
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Date
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-history[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
        Thread.sleep(6000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 21)
    public static void View_Assignment_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //View_Assignment_Log
        driver.findElement(By.xpath("//a[contains(text(),'View Assignment Log')]")).click();
        Thread.sleep(2000);
        //Article_View
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-report[1]/app-reading-log[1]/section[2]/div[2]/div[1]/div[1]/log-card[1]/div[1]/div[1]/div[1]/a[1]/h2[1]")).click();
        Thread.sleep(5000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 22)
    public static void File_Delete_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //File_Delete_Log
        driver.findElement(By.xpath("//a[contains(text(),'File Delete Log')]")).click();
        Thread.sleep(2000);
        //1st Select
        driver.findElement(By.xpath("//tr[1]//td[1]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        //Restore
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-report[1]/app-file-delete-log[1]/section[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Cancel_Share_Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 23)
    public static void External_Share_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //External_Share_Log
        driver.findElement(By.xpath("//a[contains(text(),'External Share Log')]")).click();
        Thread.sleep(5000);
        //1st Select
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-report/app-share-log/section/div[2]/div/div/table/tbody/tr[1]/td[1]/div/div/label/span")).click();
        Thread.sleep(2000);
        //Cancel_Share
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-report[1]/app-share-log[1]/section[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
      //2nd Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-report[1]/app-share-log[1]/section[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
      //Add_More_User
        driver.findElement(By.xpath("//button[@class='btn btn-spindle']")).click();
        Thread.sleep(2000);
      //Add_User
        driver.findElement(By.xpath("//input[@placeholder='Type and Enter email address']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type and Enter email address']")).sendKeys("testq3394@gmail.com");
        Thread.sleep(1000);
        Robot r = new Robot();
        int keyCode =  KeyEvent.VK_ENTER;
        r.keyPress(keyCode);
        r.keyRelease(keyCode);
        Thread.sleep(2000);
        //Share_Button
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-file-external-share[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(2000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 24)
    public static void Help_Page() throws InterruptedException, AWTException {
        //Help_Page
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
        Thread.sleep(2000);
        //Contact_Support
        driver.findElement(By.xpath("//a[contains(text(),'Contact Support')]")).click();
        Thread.sleep(2000);
        //Subject*
        driver.findElement(By.xpath("//input[@id='title']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("What about the recent feature of Quarto (Test)");
        Thread.sleep(2000);
        //Issue*
        driver.findElement(By.xpath("//textarea[@placeholder='Please provide the details about your query']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@placeholder='Please provide the details about your query']")).sendKeys("Recent feature of Quarto (Test)");
        Thread.sleep(2000);
        //File_Attachment
        driver.findElement(By.xpath("//span[@class='btn btn-light']")).click();
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Documents\\50517162.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Send_Button
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 25)
    public static void Categories_Dashboard() throws InterruptedException, AWTException {
        //Categories_Dashboard
        driver.findElement(By.xpath("//i[@class='icon-bar']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 26)
    public static void Categories_Sort_By() throws InterruptedException, AWTException {
        //Sort_By
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Most_View
        driver.findElement(By.xpath("//span[contains(text(),'Most Viewed')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Z-A
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/quarto-home[1]/explore-category[1]/section[1]/div[1]/div[2]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //A-Z
        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][contains(text(),'A-Z')]")).click();
        Thread.sleep(2000);
    }

    //@Test(priority = 27)
    public static void Categories_Bookmark() throws InterruptedException, AWTException {
        //Categories_Bookmark
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 28)
    public static void Content_of_SQA() throws InterruptedException, AWTException {
        //Content_of_SQA
        driver.findElement((By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/quarto-home[1]/explore-category[1]/section[1]/div[2]/div[8]/category-card[1]/div[1]/a[1]/div[1]"))).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 29)
    public static void Content_of_SQA_Sort_By() throws InterruptedException, AWTException {
        //Sort_By
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(5000);
        //Visual Doc
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[8]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Video Doc
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Most_view Doc
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        //Date Doc
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 30)
    public static void Content_of_SQA_Paging() throws InterruptedException, AWTException {
        //Paging
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[2]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[2]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[2]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[2]/i")).click();
        Thread.sleep(2000);
        //Paging_Back
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[2]/div/a[1]/i")).click();
        Thread.sleep(3000);
    }

    //@Test(priority = 31)
    public static void Content_of_SQA_Grid_List_View() throws InterruptedException, AWTException {
        //Grid_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[2]/i")).click();
        Thread.sleep(10000);
        //List_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[1]")).click();
        Thread.sleep(10000);
    }

    //@Test(priority = 32)
    public static void Content_of_SQA_Article_Assign() throws InterruptedException, AWTException {
        //Show_Options
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/list-card[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assign_This_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/list-card[1]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(5000);
        //Assign_User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Assign_This_Document");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//button[@class='btn btn-secondary mr-2']")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 33)
    public static void Content_of_SQA_Article_Bookmark() throws InterruptedException, AWTException {
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //Bookmark_This_Document
        driver.findElement(By.xpath("//div[@class='dropdown-menu custom-2 show']//a[@class='dropdown-item'][contains(text(),'Bookmark This Document')]")).click();
        Thread.sleep(4000);
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //UnBookmark_This_Document
        driver.findElement(By.xpath("//a[contains(text(),'Unbookmark This Document')]")).click();
        Thread.sleep(4000);
    }

    //@Test(priority = 34)
    public static void Content_of_SQA_Article_Share() throws InterruptedException, AWTException {
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //Share_This_Document
        driver.findElement(By.xpath("//div[@class='dropdown-menu custom-2 show']//i[@class='icon-share']")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("SHARE LINK WITH Shahid Quarto");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//button[@class='btn btn-secondary mr-2']")).click();
        Thread.sleep(5000);
        //Explore Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/quarto-sidebar/div/div[2]/ul/li[1]/a/i")).click();
        Thread.sleep(10000);
    }

    @Test(priority = 35)
    public static void My_Dashboard() throws InterruptedException, AWTException{

        //Categories_Dashboard
        driver.findElement(By.xpath("//i[@class='icon-bar']")).click();
        Thread.sleep(3000);
        //My_Dashboard
        driver.findElement(By.xpath("//span[contains(text(),'My Dashboard')]")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 36)
    public static void Need_Approval() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Need Approval
        driver.findElement(By.xpath("//a[contains(text(),'Need Approval')]")).click();
        Thread.sleep(3000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //1st_Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
//        //Print
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/a[1]")).click();
//        Thread.sleep(2000);
        //Approve
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Need Approval
        driver.findElement(By.xpath("//a[contains(text(),'Need Approval')]")).click();
        Thread.sleep(3000);
        //Reject
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Need Approval
        driver.findElement(By.xpath("//a[contains(text(),'Need Approval')]")).click();
        Thread.sleep(3000);
        //Revise
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/button[3]")).click();
        Thread.sleep(2000);
        //REVISE NOTES
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]")).sendKeys("Test Notes for Revision");
        Thread.sleep(2000);
        //Submit
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 37)
    public  static void Need_Revision() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Need_Revision
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(3000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //1st_Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
//        //Print
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/a[1]")).click();
//        Thread.sleep(3000);
//        //Edit
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
//        Thread.sleep(5000);
//        //Add Categories
//        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-create-fresh/section/form/div/div[2]/div[1]/div[2]/a")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//li[1]//div[1]//div[1]//label[1]//span[1]")).click();
//        Thread.sleep(3000);
//        //Done
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(3000);
//        //Publish
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(2000);
//        //Back to Home
//        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
//        Thread.sleep(2000);
//        //My_Dashboard
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
//        Thread.sleep(5000);
//        //Need_Revision
//        driver.findElement(By.xpath("//a[@class='d-flex justify-content-between ng-star-inserted active']")).click();
//        Thread.sleep(3000);
        //Forward
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("john");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test Content Forward");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(6000);
        //Need_Revision
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(5000);
        //Discard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/button[2]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement((By.xpath("//textarea[@id='comment']"))).click();
        driver.findElement((By.xpath("//textarea[@id='comment']"))).sendKeys("Discard Request");
        Thread.sleep(2000);
        //Submit
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(2000);
        //CONFIRM_No
        driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
        Thread.sleep(2000);
        //Cancel
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);

    }

    @Test (priority = 37)
    public  static void BookMarks() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //BookMarks
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(3000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //1st_Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(5000);
        //PageRefresh
        //BookMarks
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(3000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(5000);
        //PageRefresh
        //BookMarks
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(3000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //AssignUser
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='userText']")).click();
        driver.findElement(By.xpath("//input[@id='userText']")).sendKeys("John");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(ja829767@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test Comments");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //RemoveBookmark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmarked']")).click();
        Thread.sleep(5000);
        //PageRefresh
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 38)
    public static void All_Content() throws  InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //All Content
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Assign
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='userText']")).click();
        driver.findElement(By.xpath("//input[@id='userText']")).sendKeys("Shah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comment
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test Comments");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(6000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(5000);
//        //Print
//        driver.findElement(By.xpath("//a[@class='btn btn-secondary ml-2 rounded d-none justify-content-sm-center d-sm-inline-flex flex-shrink-0 ng-tns-c19-12 ng-star-inserted']")).click();
//        Thread.sleep(2000);
//        //Edit
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
//        Thread.sleep(4000);
//        //Publish
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
//        Thread.sleep(2000);
//        //Confirm
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(2000);
//        //BackToHOme
//        driver.findElement(By.xpath("Thread.sleep(2000);")).click();
//        Thread.sleep(2000);
//        //MyDashboard
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
//        Thread.sleep(3000);
        //Select
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[2]/div[4]/div/div[1]/div/div[1]/div/label/span")).click();
        Thread.sleep(2000);
        //Request_Change
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[3]/div[2]/document-details/div[1]/div[2]/button")).click();
        Thread.sleep(10000);
        //Change Notes
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/textarea[1]")).sendKeys("Test notes for your requested change ");
        Thread.sleep(5000);
        //Save
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 39)
    public  static void Assigned_To_Me_View() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assigned to me(View)
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[1]/div/div[2]/perfect-scrollbar/div/div[1]/ul/li[6]/a")).click();
        Thread.sleep(5000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //1st_Select
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[2]/div[4]/div/div[1]/div/div[1]/div/label/span")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Assign_User
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //Cancel
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(5000);
        //Assigned to me(View)
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[1]/div/div[2]/perfect-scrollbar/div/div[1]/ul/li[6]/a")).click();
        Thread.sleep(3000);
        //2nd_Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        //I_Am_Done
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[3]/div[2]/document-details/div[3]/div/div[5]/div[1]/button")).click();
        Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 40)
    public static void Assigned_To_Me_Create() throws InterruptedException, AWTException{

        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assigned_To_Me_Create
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
        Thread.sleep(2000);
        //Start_Writing
        driver.findElement(By.xpath("//button[@class='btn btn-light ng-star-inserted']")).click();
        Thread.sleep(2000);
        //Simple_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[1]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //Create
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Create Simple Document
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("1.\tNo one is happy with your success, except your family.\n" +
                "2. Love is a myth. Without reason, no one is your friend.\n" +
                "3. The only people that love you without any expectations are your parents.\n" +
                "4. Everyone has a role in your life and when their role ends, they will leave you. So be strong.\n");
        Thread.sleep(3000);
        //ADD_CATEGORIES
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]//div[1]//div[1]//label[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(5000);
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assigned_To_Me_Create
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
        Thread.sleep(2000);
        //Full_View
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]")).click();
        Thread.sleep(2000);

    }

    @Test (priority = 42)
    public static void Assigned_To_Others_View() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assigned_To_Others_View
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
        Thread.sleep(5000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Assign_User
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //Cancel
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(2000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 43)
    public  static void Assigned_To_Others_Create() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Assigned_To_Others_Create
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[9]/a[1]")).click();
        Thread.sleep(5000);
        //View_Comments
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/p[1]/a[1]/i[1]")).click();
        Thread.sleep(3000);
//        //Full_view
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]")).click();
//        Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 44)
    public static void My_Created_Document() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //My_Created_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[10]/a[1]")).click();
        Thread.sleep(5000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Assign_User
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //Cancel
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(2000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);

    }

    @Test (priority = 45)
    public static void Archive() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Archive
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[11]/a[1]")).click();
        Thread.sleep(5000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //Restore
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
        //Confirm_Yes
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 46)
    public static void Draft() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Draft
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[12]/a[1]")).click();
        Thread.sleep(5000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
//        //Edit
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
//        Thread.sleep(2000);
//        //Publish_Document
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
//        Thread.sleep(2000);
//        //Confirm_Yer
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(2000);
//        //BackToHOme
////      driver.findElement(By.xpath("Thread.sleep(2000);")).click();
////      Thread.sleep(2000);
////      //MyDashboard
////      driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
////      Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 47)
    public static void Forwarded_To_Me() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Forwarded_To_Me
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[13]/a[1]")).click();
        Thread.sleep(2000);
        //Checkbox
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
//        //Edit
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
//        Thread.sleep(2000);
//        //Publish_Document
//        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
//        Thread.sleep(2000);
//        //Confirm_Yer
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(2000);
//        //BackToHOme
////      driver.findElement(By.xpath("Thread.sleep(2000);")).click();
////      Thread.sleep(2000);
////      //MyDashboard
////      driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
////      Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 48)
    public static void Delete_Log() throws InterruptedException, AWTException{
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Delete_Log
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[14]/a[1]")).click();
        Thread.sleep(5000);
        //Full_View
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(5000);
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 50)
    public static void Log_out() throws InterruptedException, AWTException {
        //LogOut
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("//a[contains(text(),'Log Out')]"))).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public static void Test_Closure() {
        driver.quit();
    }

}
