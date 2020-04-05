package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestStarhip {
    TestMethods testMethods = new TestMethods();

    @Test
    public void getStarshipByNameTest() throws UnirestException {
        testMethods.getStarshipByName();
    }

    @Test
    public void getStarshipByIDTest() throws UnirestException {
        testMethods.getStarshipByID();
    }

    @Test
    public void getAllStarshipsTest() throws UnirestException {
        testMethods.getAllStarships();
    }
}
