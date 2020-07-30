import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;

public class Explore_Categories extends Qarto_V2 {

    @Test(priority = 0)
    public static void Categories_Dashboard() throws InterruptedException, AWTException{
        //Categories_Dashboard
        driver.findElement(By.xpath("//i[@class='icon-close animated fadeIn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon-close animated fadeIn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Explore Categories')]")).click();
        Thread.sleep(2000);
        //Sort_By
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Z-A')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Most Viewed')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='ng-option-label'][contains(text(),'A-Z')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon-business-research']")).click();
        Thread.sleep(3000);
        //Content_of_SQA
        driver.findElement((By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/quarto-home[1]/explore-category[1]/section[1]/div[2]/div[8]/category-card[1]/div[1]/a[1]/div[1]"))).click();
        Thread.sleep(2000);
        //Sort_By
        driver.findElement(By.xpath("//div[@class='ng-input']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[8]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
        Thread.sleep(5000);
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
        Thread.sleep(2000);
        //Grid_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[2]/i")).click();
        Thread.sleep(2000);
        //List_View
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[1]/div[3]/a[1]")).click();
        Thread.sleep(2000);
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //Assign_This_Document
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        //Assign_User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Assign_This_Document");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//button[@class='btn btn-secondary mr-2']")).click();
        Thread.sleep(2000);
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //Bookmark_This_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/list-card[1]/div[1]/div[2]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //UnBookmark_This_Document
        driver.findElement(By.xpath("/html[1]/body[1]/root[1]/dashboard-layout[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-category-details[1]/section[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/list-card[1]/div[1]/div[2]/a[2]")).click();
        Thread.sleep(2000);
        //Show_Options
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/perfect-scrollbar/div/div[1]/div/div/div/app-category-details/section/div/div[2]/section/div[2]/div/div[1]/list-card/div/div[1]/a/i")).click();
        Thread.sleep(2000);
        //Share_This_Document
        //User
        driver.findElement(By.xpath("//input[@id='user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(text(),'(testq3394@gmail.com)')]")).click();
        Thread.sleep(2000);
        //Add Comments
        driver.findElement(By.xpath("//textarea[@id='comment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("SHARE LINK WITH");
        Thread.sleep(2000);
        //Done
        driver.findElement(By.xpath("//button[@class='btn btn-secondary mr-2']")).click();
        Thread.sleep(5000);
        //Explore Categories
        driver.findElement(By.xpath("/html/body/root/dashboard-layout/div/quarto-sidebar/div/div[2]/ul/li[1]/a/i")).click();
        Thread.sleep(5000);

    }

}
