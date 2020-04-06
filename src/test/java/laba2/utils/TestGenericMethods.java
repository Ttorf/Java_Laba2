package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;


public class TestGenericMethods {
    TestMethods testMethods = new TestMethods();
    @Test
    public void getByUrlTest() throws UnirestException {
        testMethods.getByUrl();
    }

    @Test
    public void getAllPageTest() throws UnirestException {
      //
    }

    @Test
    public void getOnePageTest() throws UnirestException {
        testMethods.getOnePage();
    }
}
