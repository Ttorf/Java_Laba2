package laba2;


import com.google.gson.Gson;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;
import laba2.utils.ClientImplementation;
import laba2.utils.WorkWithPeople;
import laba2.utils.WorkWithSite;

import java.util.List;

public class Test {
    static WorkWithPeople workWithPersonData;

    public static void main(String[] args) throws UnirestException {
        ClientImplementation clientImplementation = new ClientImplementation();
        WorkWithSite workWithSite = new WorkWithSite();
        String name = "Leia Organa";
        People people = new People();
        Films films = new Films();
        Planet planet = new Planet();
        Species species = new Species();
        Starship starship = new Starship();
        Vehicles vehicles = new Vehicles();

//        People people2 = clientImplementation.getPeopleByName(name);
//   System.out.println(people2.getMass());
//   people = clientImplementation.getPeopleByID(9);
//        System.out.println(people2.getName());
//
//
//        String title = "Attack of the Clones";
//        Films films = clientImplementation.getFilmByTitle(title);
//        System.out.println(films.getEpisode_id());
//
//        String namepl = "Hoth";
//        Planet planet = clientImplementation.getPlanetByName(namepl);
//        System.out.println(planet.getGravity());

//        List<People> peopleList = clientImplementation.getAllPeople();
//        List<Films> filmsList = clientImplementation.getAllFilms();
//        List<Planet> planetsList = clientImplementation.getAllPlanets();
//        List<Species> speciesList = clientImplementation.getAllSpecies();
//        List<Starship> starshipsList = clientImplementation.getAllStarships();
//        List<Vehicles> vehiclesList = clientImplementation.getAllVehicles();

//        for(People people1:peopleList2)
//        {
//            System.out.println(people1.getName());
//        }
//        for(Films films2:films1)
//        {
//            System.out.println(films2.getTitle());
//        }
//        for(Planet planet2:planets)
//        {
//            System.out.println(planet2.getName());
//        }
//        for(Species species2:species1)
//        {
//            System.out.println(species2.getName());
//        }
//        for(Starship starship1:starships)
//        {
//            System.out.println(starship1.getName());
//        }
//        for(Vehicles vehicles2:vehicles1)
//        {
//            System.out.println(vehicles2.getName());
//        }

//        List<Films> filmsList = clientImplementation.getAllPage(films.getUrl(),films);
//
//        for(Films film:filmsList)
//        {
//            System.out.println(film.getTitle());
//        }
//
//        List<People> peopleList = clientImplementation.getAllPage(people.getUrl(),people);
//
//        for(People people2:peopleList)
//        {
//            System.out.println(people2.getName());
//        }
//        List<Planet> planetList = clientImplementation.getAllPage(planet.getUrl(),planet);
//
//        for(Planet planet1:planetList)
//        {
//            System.out.println(planet1.getName());
//        }
//        List<Species> speciesList = clientImplementation.getAllPage(species.getUrl(),species);
//
//        for(Species species1:speciesList)
//        {
//            System.out.println(species1.getName());
//        }
//        List<Starship> starshipsList = clientImplementation.getAllPage(starship.getUrl(),starship);
//
//        for(Starship starship1:starshipsList)
//        {
//            System.out.println(starship1.getName());
//        }
//
//        List<Vehicles> vehicles1List = clientImplementation.getAllPage(vehicles.getUrl(),vehicles);
//
//        for(Vehicles vehicles1:vehicles1List)
//        {
//            System.out.println(vehicles1.getName());
//        }
//        String urlpeople1 = "https://swapi.co/api/people/1";
//        People people2 = (People) clientImplementation.getByUrl(urlpeople1, people);
//        System.out.println(people2.getName());
//
//        String urlplanet = "https://swapi.co/api/planets/1";
//        Planet planet1 = (Planet) clientImplementation.getByUrl(urlplanet, planet);
//        System.out.println(planet1.getName());
//
//        String urlfilm = "https://swapi.co/api/films/1";
//        Films films1 = (Films) clientImplementation.getByUrl(urlfilm, films);
//        System.out.println(films1.getTitle());
//
//        String urlspecies = "https://swapi.co/api/species/1";
//        Species species1 = (Species) clientImplementation.getByUrl(urlspecies, species);
//        System.out.println(species1.getName());
//
//        String urlvehicles = "https://swapi.co/api/vehicles/6";
//        Vehicles vehicles1 = (Vehicles) clientImplementation.getByUrl(urlvehicles, vehicles);
//        System.out.println(vehicles1.getName());
//
//        String urlstarships = "https://swapi.co/api/starships/2";
//        Starship starship1 = (Starship) clientImplementation.getByUrl(urlstarships, starship);
//        System.out.println(starship1.getName());
        String js2 = "{\"films\":[\"https://swapi.co/api/films/2/\",\"https://swapi.co/api/films/6/\"," +
                "\"https://swapi.co/api/films/3/\",\"https://swapi.co/api/films/1/\",\"https://swapi.co/api/films/7/\"]," +
                "\"homeworld\":\"https://swapi.co/api/planets/1/\",\"gender\":\"male\",\"skin_color\":\"fair\",\"edited\":\"" +
                "2014-12-20T21:17:56.891000Z\",\"created\":\"2014-12-09T13:50:51.644000Z\",\"mass\":\"77\",\"vehicles\":[\"" +
                "https://swapi.co/api/vehicles/14/\",\"https://swapi.co/api/vehicles/30/\"],\"url\":\"https://swapi.co/api/people/1/\",\"" +
                "hair_color\":\"blond\",\"birth_year\":\"19BBY\",\"eye_color\":\"blue\",\"species\":[\"https://swapi.co/api/species/1/\"],\"starships\"" +
                ":[\"https://swapi.co/api/starships/12/\",\"https://swapi.co/api/starships/22/\"],\"name\":\"Luke Skywalker\",\"height\":\"172\"}";


        String urlpeople1 = "https://swapi.co/api/people/2";
        People people2 = (People) clientImplementation.getByUrl(urlpeople1, people);

//        List<People> listPeople = (List<People>) clientImplementation.getAllPage(people.getUrl(), people);
//        for (People peopleTemp : listPeople) {
//            if (people2.equals(peopleTemp))
//                System.out.println(peopleTemp.toString());
//        }

        People people3 = (People) clientImplementation.getOnePage(js2,people);
        System.out.println(people3.getName());
    }


}




