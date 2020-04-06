package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestStarhip {
    TestMethods testMethods = new TestMethods();

    @Test
    public void getStarShipByNameTest() throws UnirestException {
        testMethods.getStarShipByName();
    }

    @Test
    public void getStarShipByIDTest() throws UnirestException {
        testMethods.getStarShipByID();
    }

    @Test
    public void getAllStarShipsTest() throws UnirestException {
        testMethods.getAllStarShips();
    }
}
