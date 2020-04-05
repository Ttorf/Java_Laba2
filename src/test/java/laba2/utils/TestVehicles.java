package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestVehicles {
    TestMethods testMethods = new TestMethods();

    @Test
    public void getVehicleByNameTest() throws UnirestException {
        testMethods.getVehicleByName();
    }

    @Test
    public void getVehicleByIDTest() throws UnirestException {
        testMethods.getVehicleByID();
    }

    @Test
    public void getAllVehiclesTest() throws UnirestException {
        testMethods.getAllVehicles();
    }
}
