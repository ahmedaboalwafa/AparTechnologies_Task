package testCases;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Home_Page;
import utilities.JsonDataReader;

import java.io.IOException;

import static org.testng.asserts.SoftAssert.*;
import static utilities.Configuration_Data_Reader.getConfigData;
public class ArabicPackagePlans_Tests extends BaseTests{

    public JsonDataReader jsonDataReader = new JsonDataReader();

    @Test
    public void validate_Arabic_SaudiArabia_lite_Package_Price() throws IOException, ParseException {
        Home_Page homePage = new Home_Page(driver);
        homePage.convertLanguage(jsonDataReader.JsonReader("ArabicLanguage"));
        homePage.selectSaudiCountry();

        Assert.assertEquals(homePage.getArabicLitePackagePrice(),getConfigData("SA_LitePackagePrice"));
        SoftAssert as = new SoftAssert();
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_SaudiArabia_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicClassicPackagePrice(),getConfigData("SA_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_SaudiArabia_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicPrimumPackagePrice(),getConfigData("SA_PrimiumPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_SaudiArabia_Currancy() throws IOException, ParseException {
        Home_Page homePage = new Home_Page(driver);
        try {
            Assert.assertEquals(homePage.getArabicPackageCurrancy(),jsonDataReader.JsonReader("Arabic_SA_Currency"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Kuwait_lite_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        homePage.selectKuwaitCountry();

        Assert.assertEquals(homePage.getArabicLitePackagePrice(),getConfigData("KU_LitePackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Kuwait_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicClassicPackagePrice(),getConfigData("KU_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Kuwait_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicPrimumPackagePrice(),getConfigData("KU_PrimiumPackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Kuwait_Currancy() throws IOException, ParseException {
        Home_Page homePage = new Home_Page(driver);
        try {
            Assert.assertEquals(homePage.getArabicPackageCurrancy(),jsonDataReader.JsonReader("Arabic_KU_Currency"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Bahrain_lite_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        homePage.selectBahrinCountry();
        Assert.assertEquals(homePage.getArabicLitePackagePrice(),getConfigData("BA_LitePackagePrice"));
    }
    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Bahrain_Classic_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicClassicPackagePrice(),getConfigData("BA_ClassicPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Bahrain_Primum_Package_Price(){
        Home_Page homePage = new Home_Page(driver);
        Assert.assertEquals(homePage.getArabicPrimumPackagePrice(),getConfigData("BA_PrimiumPackagePrice"));
    }

    @Test(dependsOnMethods = {"validate_Arabic_SaudiArabia_lite_Package_Price"})
    public void validate_Arabic_Bahrain_Currancy() throws IOException, ParseException {
        Home_Page homePage = new Home_Page(driver);
        try {
            Assert.assertEquals(homePage.getArabicPackageCurrancy(),jsonDataReader.JsonReader("Arabic_BA_Currency"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


}
