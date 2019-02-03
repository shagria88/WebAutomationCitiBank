package databaseTest;

import dataBaseLoin.LoginFromDB;
import base.BaseUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginFromDB extends BaseUtil {
    LoginFromDB loginFromDB;

    @BeforeMethod
    public void initialization2(){loginFromDB= PageFactory.initElements(driver,LoginFromDB.class);}

    @Test
    public void signUpUsingDataFromBD() throws Exception {

        loginFromDB.signUpFromDataBase();
        LoginFromDB.signOnSubmitButton.click();
    }
}
