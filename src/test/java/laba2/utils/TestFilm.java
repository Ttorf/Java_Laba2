package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.utils.data.TestMethods;
import org.junit.Test;

public class TestFilm {
    TestMethods testMethods = new TestMethods();

    @Test
    public void getFilmByTitleTest() throws UnirestException {
       testMethods.getFilmByTitle();
    }

    @Test
    public void getFilmByIDTest() throws UnirestException {
        testMethods.getFilmByIDt();
    }

    @Test
    public void getAllFilmsTest() throws UnirestException {
        testMethods.getAllFilms();
    }

}
