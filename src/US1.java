import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class US1 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement accountGiris= driver.findElement(By.xpath("//*[@href='/akakcem/giris/?m=1&s=1']"));
        accountGiris.click();
        MyFunc.Bekle(2);

        WebElement userName= driver.findElement(By.xpath("//input[@id='rnufn']"));
        userName.sendKeys("Alper");
        MyFunc.Bekle(2);

        WebElement lastName= driver.findElement(By.xpath("//input[@id='rnufs']"));
        lastName.sendKeys("Aygun");
        MyFunc.Bekle(2);

        WebElement ePosta= driver.findElement(By.xpath("//input[@id='rnufe1']"));
        ePosta.sendKeys("alper2344@gmail.com");
        MyFunc.Bekle(2);

        WebElement reEposta= driver.findElement(By.xpath("//input[@id='rnufe2']"));
        reEposta.sendKeys("alper2344@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='rnufp1']"));
        password.sendKeys("Alper2344");
        MyFunc.Bekle(2);

        WebElement rePassword= driver.findElement(By.xpath("//input[@id='rnufp2']"));
        rePassword.sendKeys("Alper2344");
        MyFunc.Bekle(2);

        WebElement gender= driver.findElement(By.xpath("//*[@id='rngm']"));
        gender.click();
        MyFunc.Bekle(2);

        WebElement city= driver.findElement(By.xpath("//select[@id='locpr']"));
        city.click();
        MyFunc.Bekle(2);

        WebElement cityValue= driver.findElement(By.xpath(" //option[@value='44']"));
        cityValue.click();
        MyFunc.Bekle(2);

        WebElement district= driver.findElement(By.xpath("//select[@id='locds']"));
        district.click();
        MyFunc.Bekle(2);

        WebElement districtValue= driver.findElement(By.xpath(" //option[@value='611']"));
        districtValue.click();
        MyFunc.Bekle(2);

        WebElement day= driver.findElement(By.cssSelector("select[id='bd']"));
        day.click();
        MyFunc.Bekle(2);

        WebElement dayValue= driver.findElement(By.cssSelector(" select[id='bd']>:nth-child(11)"));
        dayValue.click();
        MyFunc.Bekle(2);

        WebElement month= driver.findElement(By.cssSelector("select[id='bm']"));
        month.click();
        MyFunc.Bekle(2);

        WebElement monthValue= driver.findElement(By.cssSelector(" select[id='bm']>:nth-child(2)"));
        monthValue.click();
        MyFunc.Bekle(2);

        WebElement year= driver.findElement(By.xpath("//select[@id='by']"));
        year.click();
        MyFunc.Bekle(2);

        WebElement yearValue= driver.findElement(By.xpath(" //option[@value='1983']"));
        yearValue.click();
        MyFunc.Bekle(2);

        WebElement btnClick= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        btnClick.click();
        MyFunc.Bekle(2);

        WebElement btnClickEnd= driver.findElement(By.xpath("//input[@id='rfb']"));
        btnClickEnd.click();
        MyFunc.Bekle(2);









        BekleVeKapat();


    }








    }

