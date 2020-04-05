package laba2.utils.data;


import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.Films;
import laba2.models.People;
import laba2.models.Planet;
import laba2.models.Starship;
import org.junit.Assert;
import org.junit.Test;


public class TestMethods {
    DataTest dataTest = new DataTest();

    public void getByUrl() throws UnirestException {
        Starship starship1 = (Starship) dataTest.clientImplementation.getByUrl(dataTest.url2starships, dataTest.starship);
        checkStringValues(dataTest.nameStarhips, starship1.getName());
    }

    public void getAllPage() throws UnirestException {
        int size = 10;
        dataTest.planetList = dataTest.clientImplementation.getAllPage(dataTest.planet.getUrl(), dataTest.planet);
        checkNumValues(size, dataTest.planetList.size());
    }

    public void getOnePage() throws UnirestException {
        String name = "Luke Skywalker";
        People people3 = (People) dataTest.clientImplementation.getOnePage(dataTest.jsPeople, dataTest.people);
        checkStringValues(name, people3.getName());
    }

    public void getFilmByTitle() throws UnirestException {
        String title = "Attack of the Clones";
        Films films = dataTest.clientImplementation.getFilmByTitle(title);
        checkStringValues(title, films.getTitle());
    }


    public void getFilmByIDt() throws UnirestException {
        int id = 4;
        String expectedName = "A New Hope";
        Films films4 = dataTest.clientImplementation.getFilmByID(id);
        checkStringValues(expectedName, films4.getTitle());

    }


    public void getAllFilms() throws UnirestException {
        int expectedSize = 7;
        dataTest.filmsList = dataTest.clientImplementation.getAllFilms();
        checkNumValues(expectedSize, dataTest.filmsList.size());

    }

    public void getPeopleByName() throws UnirestException {
        dataTest.people = dataTest.clientImplementation.getPeopleByName(dataTest.namePeople);
        checkStringValues(dataTest.namePeople, dataTest.people.getName());
    }


    public void getPeopleByID() throws UnirestException {
        String expectedName = "Obi-Wan Kenobi";
        int id = 9;
        dataTest.people = dataTest.clientImplementation.getPeopleByID(id);
        checkStringValues(expectedName, dataTest.people.getName());
    }


    public void getAllPeople() throws UnirestException {
        int excpectedSize = 10;
        dataTest.peopleList = dataTest.clientImplementation.getAllPeople();
        checkNumValues(excpectedSize, dataTest.peopleList.size());

    }

    public void getPlanetByName() throws UnirestException {
        dataTest.planet = dataTest.clientImplementation.getPlanetByName(dataTest.expectedNamePlanet);
        checkStringValues(dataTest.expectedNamePlanet, dataTest.planet.getName());
    }


    public void getPlanetByID() throws UnirestException {
        int id = 2;
        dataTest.planet = dataTest.clientImplementation.getPlanetByID(id);
        checkStringValues(dataTest.expectedNamePlanet, dataTest.planet.getName());
    }


    public void getAllPlanets() throws UnirestException {
        int expectedSize = 10;
        dataTest.planetList = dataTest.clientImplementation.getAllPlanets();
        checkNumValues(expectedSize, dataTest.planetList.size());
    }


    public void getSpeciesByName() throws UnirestException {

        dataTest.species = dataTest.clientImplementation.getSpeciesByName(dataTest.nameSpecies);
        checkStringValues(dataTest.excectedCollorEya, dataTest.species.getEye_colors());
    }


    public void getSpeciesByID() throws UnirestException {
        dataTest.species = dataTest.clientImplementation.getSpeciesByID(2);
        checkStringValues(dataTest.nameSpecies2, dataTest.species.getName());
    }


    public void getAllSpecies() throws UnirestException {
        int expectedSize = 10;
        dataTest.speciesList = dataTest.clientImplementation.getAllSpecies();
        checkNumValues(expectedSize, dataTest.speciesList.size());

    }

    public void getStarshipByName() throws UnirestException {
        dataTest.starship = dataTest.clientImplementation.getStarshipByName(dataTest.nameStarship);
        checkStringValues(dataTest.nameStarship, dataTest.starship.getName());
    }


    public void getStarshipByID() throws UnirestException {
        int id = 3;
        dataTest.starship = dataTest.clientImplementation.getStarshipByID(id);
        checkStringValues(dataTest.expectedNameStarship, dataTest.starship.getName());

    }


    public void getAllStarships() throws UnirestException {
        int expectedSize = 10;
        dataTest.starshipList = dataTest.clientImplementation.getAllStarships();
        checkNumValues(expectedSize, dataTest.starshipList.size());
    }


    public void getVehicleByName() throws UnirestException {
        dataTest.vehicles = dataTest.clientImplementation.getVehicleByName(dataTest.nameVehicles);
        checkStringValues(dataTest.nameVehicles, dataTest.vehicles.getName());
    }


    public void getVehicleByID() throws UnirestException {
        int id = 2;
        dataTest.vehicles = dataTest.clientImplementation.getVehicleByID(id);
        checkStringValues(dataTest.nameVehicles2, dataTest.vehicles.getName());

    }


    public void getAllVehicles() throws UnirestException {
        int expectedSize = 10;
        dataTest.vechiclesList = dataTest.clientImplementation.getAllVehicles();
        checkNumValues(expectedSize, dataTest.vechiclesList.size());

    }

    public void checkNumValues(int expected, int current) {

        Assert.assertEquals(expected, current);

    }

    public void checkStringValues(String expected, String current) {

        Assert.assertEquals(expected, current);
    }
}
