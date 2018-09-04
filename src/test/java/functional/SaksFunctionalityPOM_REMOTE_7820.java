package functional;

import com.saksfifthave.qa.framework.utils.POM.ScriptCompositeSaks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SaksFunctionalityPOM extends ScriptCompositeSaks {
    @Test
    public void mergeConflictTest(){
        
        
    }
     @Test
    public void mergeConflictTest4(){
        
        
    }
     @Test
    public void mergeConflictTest2(){
        
        
    }
    @Test
    public void mergeConflictLocal(){

    }

    


    @Test
    public void verifyHomepage(){
        homePage.browseToSite();
        homePage.iframeHome();
    }




    @Test
    public void validEmailPassword() {

        homePage.browseToSite();
        verificationPage.verifyBeforeSignIn();
        homePage.iframeHome();
        loginPage.userClickSignInLink();
        loginPage.userEnterEmail("yusufahmedny@gmail.com");
        loginPage.userEnterPassword("Shift1234!");
        loginPage.userClickSignIn();
        verificationPage.succesFullyLogedIn();
    }
    @Test
    public void validEmailInValidPassword() {

        homePage.browseToSite();
        verificationPage.verifyBeforeSignIn();
        homePage.iframeHome();
        loginPage.userClickSignInLink();
        loginPage.userEnterEmail("yusufahmedny@gmail.com");
        loginPage.userEnterPassword("Shift1234");
        loginPage.userClickSignIn();

       // verificationPage.incorrectPassword();
    }
    @Test
    public void addToCart(){
        homePage.browseToSite();
        verificationPage.verifyBeforeSignIn();
        homePage.iframeHome();
        shoppingCartPage.clickMenWear();
        shoppingCartPage.displayMenPage();
        shoppingCartPage.clickMenFromCatagory();
        shoppingCartPage.displayMenWearList();
        shoppingCartPage.clickPaige();
        shoppingCartPage.displayPaigeSizePage();
        shoppingCartPage.clickSize_28();
        shoppingCartPage.incraseQuantity();
        shoppingCartPage.clickAddToBag();
    }
@Test
    public void checkout(){
    homePage.browseToSite();
    verificationPage.verifyBeforeSignIn();
    homePage.iframeHome();
    shoppingCartPage.clickMenWear();
    shoppingCartPage.displayMenPage();
    shoppingCartPage.clickMenFromCatagory();
    shoppingCartPage.displayMenWearList();
    shoppingCartPage.clickPaige();
    shoppingCartPage.displayPaigeSizePage();
    shoppingCartPage.clickSize_28();
    shoppingCartPage.incraseQuantity();
    shoppingCartPage.clickAddToBag();
    checkOutPage.clickCheckOutButton();
    checkOutPage.displayCheckOutPage();
}


@Test
    public void shipToCountry(){
        homePage.browseToSite();
        homePage.iframeHome();
        shipTo.clickShipToLink();
        shipTo.verifyShipToPage();
        shipTo.selectCountry();
        shipTo.saveContinue();

}










}
