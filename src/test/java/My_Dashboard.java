import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;

public class My_Dashboard extends Qarto_V2{

    //@Test (priority = 1)
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
        Thread.sleep(2000);
        //Need Approval
        driver.findElement(By.xpath("//a[contains(text(),'Need Approval')]")).click();
        Thread.sleep(3000);
        //Reject
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
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
        Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 2)
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
        Thread.sleep(2000);
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
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//        Thread.sleep(2000);
    }

    //@Test (priority = 3)
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
        driver.findElement(By.xpath("//input[@id='userText']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
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
        Thread.sleep(5000);

    }

    //@Test (priority = 3)
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
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //Archive
        driver.findElement(By.xpath("//i[@class='icon icon-box']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //Delete
        driver.findElement(By.xpath("//i[@class='icon icon-delete']")).click();
        Thread.sleep(2000);
        //Confirm
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
        Thread.sleep(2000);
        //Assign
        driver.findElement(By.xpath("//i[@class='icon icon-user-add']")).click();
        Thread.sleep(2000);
        //User
        driver.findElement(By.xpath("//input[@id='userText']")).click();
        driver.findElement(By.xpath("//input[@id='userText']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comment
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test Comments");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("btn btn-secondary mr-2")).click();
        Thread.sleep(5000);
        //Select
        driver.findElement(By.xpath("//div[@class='card card-flush card-selected ng-star-inserted']//span[@class='check']")).click();
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
        Thread.sleep(5000);
        //Change Notes
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-invalid ng-touched']")).click();
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Test notes for your requested change ");
        Thread.sleep(5000);
        //Save
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
        Thread.sleep(2000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 4)
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
        Thread.sleep(2000);
        //Assigned to me(View)
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[1]/div/div[2]/perfect-scrollbar/div/div[1]/ul/li[6]/a")).click();
        Thread.sleep(5000);
        //I_Am_Done
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-dashbaord/div[1]/div[3]/div[2]/document-details/div[3]/div/div[5]/div[1]/button")).click();
        Thread.sleep(3000);
        //Filter_Refresh
        driver.findElement(By.xpath("//i[@class='icon-refresh icon-mid']")).click();
        Thread.sleep(5000);
    }

    //@Test (priority = 5)
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

    @Test(priority = 6)
    public static void Log_out() throws InterruptedException, AWTException {
        //LogOut
        driver.findElement(By.xpath("//a[@class='nav-link user-circle']//img[@class='img-fluid']")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("//a[contains(text(),'Log Out')]"))).click();
        Thread.sleep(5000);
    }

}
