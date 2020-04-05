package laba2;


import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;
import laba2.utils.ClientImplementation;
import laba2.utils.WorkWithPeople;

import java.util.List;

public class Test {
    static WorkWithPeople workWithPersonData;

    public static void main(String[] args) throws UnirestException {
        ClientImplementation clientImplementation = new ClientImplementation();
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

    }


}
