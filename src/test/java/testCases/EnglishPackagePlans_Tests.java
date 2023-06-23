package testCases;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home_Page;
import utilities.JsonDataReader;

import java.io.IOException;

import static utilities.Configuration_Data_Reader.getConfigData;

public class EnglishPackagePlans_Tests extends BaseTests{

    public JsonDataReader jsonDataReader = new JsonDataReader();
    @Test
    public void validate_English_SaudiArabia_lite_Package_Price() throws IOException, ParseException {
        Home_Page homePage = new Home_Page(driver);
        homePage.selectSaudiCountry();

        Assert.assertEquals(homePage.getEnglishLitePackagePrice(),getConfigData("SA_LitePackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_SaudiArabia_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishClassicPackagePrice(),getConfigData("SA_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_SaudiArabia_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPrimumPackagePrice(),getConfigData("SA_PrimiumPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_SaudiArabia_Currancy(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPackageCurrancy(),getConfigData("SA_Currency"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Kuwait_lite_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        homePage.selectKuwaitCountry();

        Assert.assertEquals(homePage.getEnglishLitePackagePrice(),getConfigData("KU_LitePackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Kuwait_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishClassicPackagePrice(),getConfigData("KU_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Kuwait_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPrimumPackagePrice(),getConfigData("KU_PrimiumPackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Kuwait_Currancy(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPackageCurrancy(),getConfigData("KU_Currency"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Bahrain_lite_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        homePage.selectBahrinCountry();
        Assert.assertEquals(homePage.getEnglishLitePackagePrice(),getConfigData("BA_LitePackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Bahrain_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishClassicPackagePrice(),getConfigData("BA_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Bahrain_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPrimumPackagePrice(),getConfigData("BA_PrimiumPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_English_SaudiArabia_lite_Package_Price"})
    public void validate_English_Bahrain_Currancy(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getEnglishPackageCurrancy(),getConfigData("BA_Currency"));
    }


}
