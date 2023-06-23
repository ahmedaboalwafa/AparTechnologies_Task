package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Actions;

public class Home_Page {
    WebDriver driver;

    private By languageTransactionBTN = new By.ById("translation-btn");
    private By countryBTN = new By.ById("country-btn");
    private By saudiCountry=new By.ById("sa");
    private By kuwiatCountry=new By.ById("kw");
    private By bahrinCountry=new By.ById("bh");

    private By enLitePackagePrice =new By.ByXPath("//div[@id='currency-lite']//b");
    private By enClassicPackagePrice =new By.ByXPath("//div[@id='currency-classic']//b");
    private By enPrimiumPackagePrice =new By.ByXPath("//div[@id='currency-premium']//b");

    private By arLitePackagePrice=new By.ByXPath("//div[@id='currency-لايت']//b");
    private By arClassicPackagePrice=new By.ByXPath("//div[@id='currency-الأساسية']//b");
    private By arPrimiumPackagePrice=new By.ByXPath("//div[@id='currency-بريميوم']//b");

    private By enPackageCurrancy =new By.ByXPath("//div[@id='currency-lite']//i");
    private By arPackageCurrancy=new By.ByXPath("//div[@id='currency-الأساسية']//i");

    private
    Actions actions;
    public Home_Page(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void convertLanguage(String Language){

        if(Language != actions.getText(languageTransactionBTN)){
            actions.clickButton(languageTransactionBTN);
        }


    }

    // Select countries  -------------------------------------------------------------------------------------------------------------------------->

    // this function created to Select the saudi Arabia country
    public void selectSaudiCountry(){
        actions.clickButton(countryBTN);
        actions.clickButton(saudiCountry);
    }

    // this function created to Select the Kuwait country
    public void selectKuwaitCountry(){
        actions.clickButton(countryBTN);
        actions.clickButton(kuwiatCountry);
    }

    // this function created to Select the Bahrin country
    public void selectBahrinCountry(){
        actions.clickButton(countryBTN);
        actions.clickButton(bahrinCountry);
    }

    // Price  -------------------------------------------------------------------------------------------------------------------------->
    // this function created to get lite package Price in English
    public String getEnglishLitePackagePrice(){
        return actions.getText(enLitePackagePrice);
    }


    // this function created to get Classic package Price in English
    public String getEnglishClassicPackagePrice(){
        return actions.getText(enClassicPackagePrice);
    }

    // this function created to get Primum package Price in English
    public String getEnglishPrimumPackagePrice(){
        return actions.getText(enPrimiumPackagePrice);
    }


    // this function created to get lite package Price in Arabic
    public String getArabicLitePackagePrice(){
        return actions.getText(arLitePackagePrice);
    }

    // this function created to get Classic package Price in Arabic
    public String getArabicClassicPackagePrice(){
        return actions.getText(arClassicPackagePrice);
    }

    // this function created to get Primum package Price in Arabic
    public String getArabicPrimumPackagePrice(){
        return actions.getText(arPrimiumPackagePrice);
    }

    // Currency -------------------------------------------------------------------------------------------------------------------------->
    // this function created to get the country currancy in English
    public String getEnglishPackageCurrancy(){
        return actions.getText(enPackageCurrancy);
    }

    // this function created to get the country currancy in Arabic
    public String getArabicPackageCurrancy(){
        return actions.getText(arPackageCurrancy);
    }

}
