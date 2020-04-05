package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestSpecies {
    TestMethods testMethods = new TestMethods();

    @Test
    public void getSpeciesByNameTest() throws UnirestException {
        testMethods.getSpeciesByName();
    }

    @Test
    public void getSpeciesByIDTest() throws UnirestException {
        testMethods.getSpeciesByID();
    }

    @Test
    public void getAllSpeciesTest() throws UnirestException {
        testMethods.getAllSpecies();
    }
}
