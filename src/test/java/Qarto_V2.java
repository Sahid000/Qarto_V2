import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    static String BaseURL = "http://quartolab.com";
    static JavascriptExecutor js;

    @BeforeTest
    public static void Websetup() throws Exception {
        //MyScreenRecorder.startRecording("");
        //MyScreenRecorder.stopRecording();
        //Set_the_Driver_location
        //System.setProperty("webdriver.gecko.driver",  "G:\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",  "G:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //Assert.assertTrue(driver.getTitle().contains("Quarto | Home"));
        js = (JavascriptExecutor) driver;

    }

    //@Test(priority = 0)
    public static void Qarto_Website() throws Exception {

//        //Quarto_Cookies
//        driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
//        Thread.sleep(15000);
        //View_Features
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/app-homepage[1]/hero-banner-v4[1]/section[1]/div[1]/div[1]/div[1]/owl-carousel[1]/owl-carousel-child[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]")).click();
        Thread.sleep(5000);
        //Up_Arrow
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/quarto-scrolltop[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 1)
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
        Thread.sleep(2000);
        //Up_Arrow
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/app-website[1]/quarto-scrolltop[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public static void Login() throws InterruptedException {
        //Login-Button
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        Thread.sleep(1000);
        //Email_User
        driver.findElement(By.xpath("//input[@id='email']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sqa9512@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/root/login/div/div/div/div[2]/div/div/div/form/div/div[2]/div/a")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Password
        driver.findElement(By.cssSelector("#password")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("Admin2020@");
        Thread.sleep(1000);
        //Login_Button
        driver.findElement(By.xpath("/html/body/root/login/div/div/div/div[2]/div/div/div/form/div/div[3]/div/button")).click();
        Thread.sleep(10000);
        //Assert.assertTrue(driver.getPageSource().contains("Explore Categories"));

    }

    //@Test(priority = 3)
    public static void Sidebar_Menu () throws InterruptedException {
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Explore_Category
        driver.findElement(By.xpath("//span[contains(text(),'Explore Categories')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //My_Dashboard
        driver.findElement(By.xpath("//span[contains(text(),'Content Manager')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Company_Settings
        driver.findElement(By.xpath("//span[contains(text(),'Company Settings')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Kudos_Dashboard
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //File_Manager
        driver.findElement(By.xpath("//span[contains(text(),'File Manager')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Task_Manager
        driver.findElement(By.xpath("//span[contains(text(),'Task Manager')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Forum_Dashboard
        driver.findElement(By.xpath("//span[contains(text(),'Forum')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Analytics_Dashboard
        driver.findElement(By.xpath("//span[contains(text(),'Analytics')]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        //Landing_Page
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 4)
    public static void GiveKudos() throws InterruptedException {
        //GiveKudos
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //User_Name
        driver.findElement(By.xpath("//input[@id='user']")).click();
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shahid");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Say_Something_Nice
        driver.findElement(By.xpath("//i[contains(text(),'We are proud of you!')]")).click();
        driver.findElement(By.xpath("//i[contains(text(),'Thank You!')]")).click();
        Thread.sleep(2000);
//        //Company_Values
//        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/div[3]/div[2]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/div[3]/div[2]/div[3]/button[1]")).click();
//        Thread.sleep(2000);
//        //Add_Reward
//        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-give-kudos/div[2]/form/div[3]/div/div")).click();
//        Thread.sleep(3000);
//        //Reward_Kudos
//        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/div[5]/div[1]/div[1]/label[1]/span[1]")).click();
//        Thread.sleep(3000);
//        //Giving_balance
//        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/div[5]/div[4]/input[1]")).click();
//        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/div[5]/div[4]/input[1]")).sendKeys("10");
//        Thread.sleep(3000);
        //Submit_Kudos
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-give-kudos[1]/div[2]/form[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(10000);
        //Not_Now
        driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 5)
    public static void Global_Search() throws InterruptedException, AWTException {
        //Global_Search
        driver.findElement(By.xpath("//div[@class='input-group']//input[@placeholder='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='input-group']//input[@placeholder='Search']")).sendKeys("LAUGH - A lot of us have forgotten to really laugh");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'LAUGH - A lot of us have forgotten to really laugh')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-search-list[1]/section[1]/div[2]/div[2]/list-card[1]/div[1]/a[1]/div[1]/div[2]/h2[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 6)
    public static void Article_Claps() throws InterruptedException, AWTException {
        //Claps
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 7)
    public static void Article_Bookmark() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 8)
    public static void Article_Assign() throws InterruptedException, AWTException {
        //Assign_User
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[3]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        //Select_User
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Add_Comments
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test_Assign_Comment");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 9)
    public static void Article_Clean_View_Mode() throws InterruptedException, AWTException {
        //Clean_View_Mode
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[4]/div[1]/i[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/view-document[1]/section[1]/div[1]/div[2]/document-details[1]/div[3]/div[1]/div[1]/div[4]/div[1]/i[1]")).click();
        Thread.sleep(5000);


    }

    //@Test(priority = 10)
    public static void SHARE_LINK() throws InterruptedException, AWTException {
        //Share_Page
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[3]/a[1]/i[1]")).click();
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
        driver.findElement((By.xpath("//textarea[@id='comment']"))).sendKeys("Test Sharing");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);
        //Sidebar_Menu
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(3000);
        //Explore_Category
        driver.findElement(By.xpath("//span[contains(text(),'Explore Categories')]")).click();
        Thread.sleep(4000);

    }

    //@Test(priority = 11)
    public static void Simple_Document() throws InterruptedException {
        //Create_Simple_Document_QUIZ
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]"))).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Create Document')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[1]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(3000);
        //Document_Title
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Simple Document");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("What golden advice did you learn in your life?\n" +
                "Don’t chew what you can’t swallow. It ain’t worth it.\n" +
                "Don’t believe everything you hear. Sometimes ears hear what you’re not supposed to hear.\n");
        Thread.sleep(5000);
        //ADD_CATEGORIES
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(2000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 12)
    public static void Simple_Document_QUIZ() throws InterruptedException {
        //Create_Simple_Document_QUIZ
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[1]/label[1]/img[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //CREATE
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary']")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Simple Document_QUIZ");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("Can you create a habit of improving yourself every day and becoming better the next day?\n" +
                "This is the whole purpose of good habits, isn’t it? “Habit of improving yourself” is a gibberish. You create a few or several habits that help you to improve in specific areas. Then, synergy kicks in and you are becoming better.\n" +
                "\n" +
                "This is the nature of habits. They shape your character. They make you who you are. Start some improvement habits and you will improve yourself.\n" +
                "My Story\n" +
                "\n" +
                "It blows my mind when I think about it. For 16 years I was neglecting any self-analysis, any serious thoughts about the future. I abandoned any hope of creating my life consciously..\n");
        Thread.sleep(5000);
        //ADD_QUIZ
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //Quiz_Questions
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        //Answer1
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        //Answer2
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        //Answer3
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //ANSWER
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[contains(text(),'Save Quiz')]")).click();
        Thread.sleep(2000);
        //ADD_CATEGORIES
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(2000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 13)
    public static void Multi_Sectional_Document() throws InterruptedException {
        //Create_Multi_Document_QUIZ
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[2]/label[1]/img[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@id='docTitle']")).click();
        driver.findElement(By.xpath("//input[@id='docTitle']")).sendKeys("Multi-Sectional Document");
        Thread.sleep(2000);
        //Add_Section_1
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("A");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(3000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("One of the most productive emotions in the world is exciting. Ask yourself…When are you most energized, focused, and capable of achieving difficult tasks?");
        Thread.sleep(5000);
        //Add_Section_2
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("B");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(3000);
       //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When you’re the most excited about doing them. So before you sit down to work, ask yourself, “What can I get excited about with the task I’m about to complete?”");
        Thread.sleep(5000);
        //ADD_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(3000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(3000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 14)
    public static void Multi_Sectional_Document_QUIZ() throws InterruptedException {
        //Create_Multi_Document_QUIZ
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[2]/label[1]/img[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//input[@id='docTitle']")).click();
        driver.findElement(By.xpath("//input[@id='docTitle']")).sendKeys("Multi-Sectional Document_QUIZ");        Thread.sleep(2000);
        //Add_Section_1
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("A");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(3000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("One of the most productive emotions in the world is exciting. Ask yourself…When are you most energized, focused, and capable of achieving difficult tasks?");
        Thread.sleep(5000);
        //Add_Section_2
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("B");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
        Thread.sleep(3000);
        //Document_Body
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).click();
        driver.findElement(By.xpath("//div[@class='fr-element fr-view']")).sendKeys("When you’re the most excited about doing them. So before you sit down to work, ask yourself, “What can I get excited about with the task I’m about to complete?”");
        Thread.sleep(5000);
        //ADD_QUIZ
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //Quiz_Questions
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        //Answer1
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        //Answer2
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        //Answer3
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //ANSWER
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[contains(text(),'Save Quiz')]")).click();
        Thread.sleep(2000);
        //ADD_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/create-stepwise[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(3000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(3000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 15)
    public static void Visual_Document() throws InterruptedException, AWTException {
        //Create_Visual_Document
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
//        //Page_Scroll
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,850)", "");
//        Thread.sleep(3000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[3]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Visual Document");
        Thread.sleep(5000);
        //Visual image
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/i[1]")).click();
        StringSelection s = new StringSelection("C:\\Users\\u\\Downloads\\123.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Document_Description
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).sendKeys("But it is always there, where we see it or not, whether we choose to or not.");
        Thread.sleep(3000);
        //ADD_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(3000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(3000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 16)
    public static void Visual_Document_QUIZ() throws InterruptedException, AWTException {
        //Create_Visual_Document_QUIZ
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[3]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(2000);
        //Document_Title
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Visual Document__QUIZ");
        Thread.sleep(5000);
        //Visual image
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/i[1]")).click();
        StringSelection s = new StringSelection("C:\\Users\\u\\Downloads\\123.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Document_Description
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[1]/div[7]/textarea[1]")).sendKeys("But it is always there, where we see it or not, whether we choose to or not.");
        Thread.sleep(3000);
        //ADD_QUIZ
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //Quiz_Questions
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        //Answer1
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        //Answer2
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        //Answer3
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //ANSWER
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[contains(text(),'Save Quiz')]")).click();
        Thread.sleep(2000);
        //ADD_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-imagedocument[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //Select_Categories
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(3000);
        //Publish_Document
        driver.findElement(By.xpath("//button[contains(text(),'Publish Document')]")).click();
        Thread.sleep(3000);
        //Please_Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(2000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 17)
    public static void Video_Document() throws InterruptedException, AWTException {
        //Create_Video_Document
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[4]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(3000);
        //Video_Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Create Video");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Upload Video
        driver.findElement(By.xpath("//span[contains(text(),'Browse Files')]")).click();
        StringSelection s = new StringSelection("C:\\Users\\u\\Downloads\\Video\\3.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        //Notes
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(5000);
        //Select_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[2]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        //Save
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(5000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 18)
    public static void Video_Document_QUIZ() throws InterruptedException, AWTException {
        //Create_Video_Document__QUIZ
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        //Select_Document_Type
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-select-document[1]/div[2]/form[1]/div[4]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //CREATE
        driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();
        Thread.sleep(3000);
        //Video_Title
        driver.findElement(By.xpath("//input[@id='title']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Create Video_QUIZ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Upload Video
        driver.findElement(By.xpath("//span[contains(text(),'Browse Files')]")).click();
        StringSelection s = new StringSelection("C:\\Users\\u\\Downloads\\Video\\3.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        //Notes
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]")).click();
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]")).sendKeys("When we like someone, powerful forces within us begin to drive our behavior.");
        Thread.sleep(5000);
        //ADD_QUIZ
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Quiz_Questions
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter question here']")).sendKeys("QUIZ QUESTIONS 1");
        Thread.sleep(2000);
        //Answer1
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.1");
        Thread.sleep(2000);
        //Answer2
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("QUESTIONS 1.2");
        Thread.sleep(2000);
        //ADD_ANOTHER_ANSWER
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        //Answer3
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/div[3]/div/div[2]/input")).sendKeys("QUESTIONS 1.3");
        Thread.sleep(2000);
        //ANSWER
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/quiz-create[1]/div[2]/div[1]/div[1]/form[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Save_Quiz
        driver.findElement(By.xpath("//button[contains(text(),'Save Quiz')]")).click();
        Thread.sleep(2000);
        //ADD_Categories
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/form[1]/div[1]/div[2]/categorylist[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(5000);
        //Save
        driver.findElement(By.xpath("//body/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-video[1]/create-video-upload-component[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(5000);
        //Back_To_Home
        driver.findElement(By.xpath("//button[contains(text(),'BACK TO HOME')]")).click();
        Thread.sleep(5000);

    }

    //@Test(priority = 19)
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
        //Done
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/document-write[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(5000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 20)
    public static void Create_Event() throws InterruptedException, AWTException {
        //Create_Event
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(2000);
        //Provide_title
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Event");
        Thread.sleep(2000);
        //Venue
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Dallas");
        Thread.sleep(2000);
        //Action_Button_Text
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("See More");
        Thread.sleep(2000);
        //Action_Button_Link
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("http://acme.qartolab.com/");
        Thread.sleep(2000);
        //Start Date
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[5]/div[1]/input[1]")).click();
        driver.findElement((By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[5]/div[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month-view[1]/div[6]/div[6]/div[1]"))).click();
        Thread.sleep(2000);
        //Start Time
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).sendKeys("0");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
        Thread.sleep(2000);
        //End_Date
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[7]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[7]/div[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month-view[1]/div[6]/div[6]/div[1]")).click();
        Thread.sleep(2000);
        //End Time
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("3");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[3]/input[1]")).sendKeys("0");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[8]/div[1]/ngb-timepicker[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
        Thread.sleep(2000);
        //Text color
        driver.findElement(By.xpath("//label[contains(text(),'White')]")).click();
        Thread.sleep(2000);
        //Upload_Background_Image
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[9]/div[3]/div[1]/input[1]")).click();
        StringSelection s = new StringSelection("C:\\Documents\\123.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Notes
        driver.findElement(By.xpath("//textarea[@id='notes']")).click();
        driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("This is automation Test Event");
        Thread.sleep(2000);
        //Text_Alignment
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[11]/div[1]/div[2]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //See Preview
        driver.findElement(By.xpath("//button[contains(text(),'See Preview')]")).click();
        Thread.sleep(5000);
        //PREVIEW_Okay
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
        Thread.sleep(6000);
        //Publish
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(5000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 21)
    public static void Create_News() throws InterruptedException, AWTException {
        //Create__CompanyNews
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(2000);
        //Select_News
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
        Thread.sleep(3000);
        //Provide_a_title
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Create News");
        Thread.sleep(2000);
//        //Text color
//        driver.findElement(By.xpath("//label[contains(text(),'White')]")).click();
//        Thread.sleep(2000);
        //Upload Background Image
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).click();
        StringSelection s = new StringSelection("C:\\Documents\\White.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Description*
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]")).sendKeys("This automation Test Company News");
        Thread.sleep(3000);
        //Choose_Text_Alignment
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/div[2]/label[1]/img[1]")).click();
        Thread.sleep(2000);
        //See_Preview
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(6000);
        //PREVIEW_Okay
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
        Thread.sleep(6000);
        //Publish
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/announcement-component[1]/section[1]/div[1]/div[1]/div[1]/button[2]")).click();
        Thread.sleep(5000);
        //Explore_Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 22)
    public static void Create_Forum_Post() throws InterruptedException, AWTException{
        //Create_Forum_Post
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[5]/a[1]")).click();
        Thread.sleep(2000);
        //Post_Title
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/forum[1]/app-create[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/forum[1]/app-create[1]/section[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Post");
        Thread.sleep(2000);
        //Post_Description
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/forum[1]/app-create[1]/section[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/forum[1]/app-create[1]/section[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]")).sendKeys("Test Description");
        Thread.sleep(2000);
        //ADD_To_CATEGORY
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/forum[1]/app-create[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        //CATEGORY_LIST
        driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[10]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/categorylist[1]/ul[1]/li[10]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(2000);
        //Submit_Post
        driver.findElement(By.xpath("//button[contains(text(),'Submit Post')]")).click();
        Thread.sleep(5000);
    }


    //@Test (priority = 23)
    public static void Kudos_Notifications() throws InterruptedException, AWTException{
        //Kudos_Notifications
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/ul[1]/li[2]/a[1]/h3[1]")).click();
        Thread.sleep(2000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);

    }

    //@Test (priority = 24)
    public static void Todo_Notifications() throws InterruptedException, AWTException{
        //See_All_Task_Notifications
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[6]/ul[1]/li[4]/a[1]/h3[1]")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 25)
    public static void Forum_Notifications() throws InterruptedException, AWTException {
        //See_All_Forum_Notifications
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[5]/ul[1]/li[2]/a[1]/h3[1]")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 26)
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

    //@Test(priority = 27)
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

    //@Test(priority = 28)
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
         //Back_Pagination
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

    //@Test(priority = 29)
    public static void View_Assignment_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //Log
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[7]/ul[1]/li[4]/a[1]")).click();
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

    //@Test(priority = 30)
    public static void File_Delete_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //Log
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[7]/ul[1]/li[4]/a[1]")).click();
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
        //Confirm_No
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(3000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 31)
    public static void External_Share_Log() throws InterruptedException, AWTException {
        //User_Profile
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        //Log
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/quarto-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[7]/ul[1]/li[4]/a[1]")).click();
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
        driver.findElement(By.xpath("//input[@placeholder='Press Comma/Space/Enter to add']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Press Comma/Space/Enter to add']")).sendKeys("testq3394@gmail.com");
        Thread.sleep(2000);
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

    //@Test(priority = 32)
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
        StringSelection s = new StringSelection("C:\\Users\\Fahim\\Documents\\architecture.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        //Send_Button
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(6000);
        //Explore Categories
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 30)
    public static void Categories_Dashboard() throws InterruptedException, AWTException {
        //Categories_Dashboard
        driver.findElement(By.xpath("//i[@class='icon-bar']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 31)
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

    //@Test(priority = 32)
    public static void Categories_Bookmark() throws InterruptedException, AWTException {
        //Categories_Bookmark
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 33)
    public static void Content_of_SQA() throws InterruptedException, AWTException {
        //Content_of_SQA
        driver.findElement((By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/quarto-home[1]/explore-category[1]/section[1]/div[2]/div[9]/category-card[1]/div[1]/a[1]/div[1]"))).click();
        Thread.sleep(5000);
    }

    //@Test(priority = 34)
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

    //@Test(priority = 35)
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

    //@Test(priority = 36)
    public static void Content_of_SQA_Grid_List_View() throws InterruptedException, AWTException {
        //Grid_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[2]/i")).click();
        Thread.sleep(10000);
        //List_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[1]")).click();
        Thread.sleep(10000);
    }

    //@Test(priority = 37)
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

    //@Test(priority = 38)
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

    //@Test(priority = 39)
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

    //@Test(priority = 40)
    public static void My_Dashboard() throws InterruptedException, AWTException{

        //Categories_Dashboard
        driver.findElement(By.xpath("//i[@class='icon-bar']")).click();
        Thread.sleep(3000);
        //My_Dashboard
        driver.findElement(By.xpath("//span[contains(text(),'My Dashboard')]")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 41)
    public static void Need_Approval_Edit() throws InterruptedException, AWTException {
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
        //Edit
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(5000);
        //Publish
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Back to Home
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 42)
    public static void Need_Approval_Approve() throws InterruptedException, AWTException {
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
        //Approve
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
        Thread.sleep(2000);
        //Confirm_Yes
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 43)
    public static void Need_Approval_Reject() throws InterruptedException, AWTException {
        //Need Approval
        driver.findElement(By.xpath("//a[contains(text(),'Need Approval')]")).click();
        Thread.sleep(3000);
        //Reject
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
        Thread.sleep(2000);
        //Confirm_Yes
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 44)
    public static void Need_Approval_Revise() throws InterruptedException, AWTException{
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

    //@Test (priority = 45)
    public static void Request_Change() throws InterruptedException, AWTException{
        //MyDashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(3000);
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

    //@Test (priority = 46)
    public  static void Need_Revision_Edit() throws InterruptedException, AWTException {
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
        //Edit
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(5000);
        //Publish
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //Back to Home
        driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
        Thread.sleep(2000);
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 47)
    public  static void Need_Revision_Forward() throws InterruptedException, AWTException {
        //Need_Revision
        driver.findElement(By.xpath("//a[@class='d-flex justify-content-between ng-star-inserted active']")).click();
        Thread.sleep(3000);
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
    }

    //@Test (priority = 48)
    public  static void Need_Revision_Discard() throws InterruptedException, AWTException {
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

    //@Test (priority = 49)
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

    //@Test (priority = 50)
    public static void All_Content_Archive() throws  InterruptedException, AWTException {
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
    }

    //@Test (priority = 51)
    public static void All_Content_Delete() throws  InterruptedException, AWTException {
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
    }

    //@Test (priority = 52)
    public static void All_Content_Assign() throws  InterruptedException, AWTException {
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
    }

    //@Test (priority = 53)
    public static void All_Content_BookMark() throws  InterruptedException, AWTException {
        //Select
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
        Thread.sleep(2000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 54)
    public static void All_Content_Edit() throws InterruptedException, AWTException{
        //Edit
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(5000);
        //Publish
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(5000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //CreateAnotherDocument
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(3000);
        //My_Dashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 55)
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
        //I_Am_Done
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[3]/div[2]/document-details/div[3]/div/div[5]/div[1]/button")).click();
        Thread.sleep(5000);
        //BookMark
        driver.findElement(By.xpath("//i[@class='icon icon-bookmark']")).click();
        Thread.sleep(5000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 56)
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

    //@Test (priority = 57)
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

    //@Test (priority = 58)
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

    //@Test (priority = 59)
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

    //@Test (priority = 60)
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

    //@Test (priority = 61)
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
        //Edit
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(2000);
         //Confirm_Yea
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //CreateAnotherDocument
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //MyDashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
//        //Filter_Refresh
//        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
//        Thread.sleep(5000);
    }

   // @Test (priority = 62)
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
        //Edit
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashbaord[1]/div[1]/div[3]/div[2]/document-details[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        //Publish_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-fresh[1]/section[1]/div[1]/div[1]/button[4]")).click();
        Thread.sleep(2000);
        //Confirm_Yes
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //CreateAnotherDocument
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(5000);
        //MyDashboard
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/quarto-sidebar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
        Thread.sleep(5000);
//        //Filter_Refresh
//        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
//        Thread.sleep(5000);
    }

    //@Test (priority = 63)
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

    @Test(priority = 70)
    public static void Log_out() throws InterruptedException, AWTException {
        //LogOut
        driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[9]/a[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("//header/nav[1]/div[2]/ul[1]/li[9]/ul[1]/li[6]/a[1]"))).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public static void Test_Closure() {
        driver.quit();
    }

}
