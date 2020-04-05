package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestPeople {
    TestMethods testMethods = new TestMethods();
    @Test
    public void getPeopleByNameTest() throws UnirestException {
       testMethods.getPeopleByName();
    }

    @Test
    public void getPeopleByIDTest() throws UnirestException {
        testMethods.getPeopleByID();
    }

    @Test
    public void getAllPeopleTest() throws UnirestException {
        testMethods.getAllPeople();
    }

}
