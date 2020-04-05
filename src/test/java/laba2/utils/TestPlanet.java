package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestPlanet {
    TestMethods testMethods = new TestMethods();
    @Test
    public void getPlanetByNameTest() throws UnirestException {
        testMethods.getPlanetByName();
    }

    @Test
    public void getPlanetByIDTest() throws UnirestException {
        testMethods.getPlanetByID();
    }

    @Test
    public void getAllPlanetsTest() throws UnirestException {
        testMethods.getAllPlanets();
    }
}
