package laba2.utils.data;

import laba2.models.*;
import laba2.utils.ClientImplementation;

import java.util.ArrayList;
import java.util.List;

public class DataTest {
    ClientImplementation clientImplementation = new ClientImplementation();
    String nameVehicles = "Snowspeeder";
    String nameVehicles2 = "X-34 landspeeder";
    String  expectedNameStarship = "Millennium Falcon";
    String nameStarship = "Sentinel-class landing craft";
    String nameSpecies = "Mon Calamari";
    String nameSpecies2 = "Trandoshan";
    String excectedCollorEya = "yellow";
    String expectedNamePlanet = "Hoth";
    String namePeople = "Leia Organa";
    String nameStarhips = "CR90 corvette";
    People people = new People();
    Films films = new Films();
    Planet planet = new Planet();
    Species species = new Species();
    Starship starship = new Starship();
    Vehicles vehicles = new Vehicles();
    String url2starships = "https://swapi.co/api/starships/2";
    List<People> peopleList = new ArrayList<>();
    List<Planet> planetList = new ArrayList<>();
    List<Films> filmsList = new ArrayList<>();
    List<Species> speciesList = new ArrayList<>();
    List<Starship> starshipList = new ArrayList<>();
    List<Starship> vechiclesList = new ArrayList<>();
    String jsForNullExp = "{\"editsed\":\"2015-04-11T09:46:52.774897Z\",\"director\":\"George Lucas\",\"created\":\"2014-12-10T14:23:31.880000Z\",\"vehicles\":[\"https://swapi.co/api/vehicles/4/\",\"https://swapi.co/api/vehicles/6/\",\"https://swapi.co/api/vehicles/7/\",\"https://swapi.co/api/vehicles/8/\"],\"opening_crawl\":" +
            "\"It is a period of civil war.\\r\\nRebel spaceships, striking\\r\\nfrom a hidden base, have won\\r\\ntheir first victory against\\r\\nthe evil Galactic Empire.\\r\\n\\r\\nDuring the battle, Rebel\\r\\nspies managed to steal secret\\r\\nplans to the Empire's\\r\\nultimate weapon," +
            " the DEATH\\r\\nSTAR, an armored space\\r\\nstation with enough power\\r\\nto destroy an entire planet.\\r\\n\\r\\nPursued by the Empire's\\r\\nsinister agents, Princess\\r\\nLeia races home aboard her\\r\\nstarship, custodian of the\\r\\nstolen plans that can save her\\r\\npeople and restore\\r\\nfreedom to the galaxy....\"," +
            "\"title\":\"A New Hope\",\"url\":\"https://swapi.co/api/films/1/\",\"characters\":[\"https://swapi.co/api/people/1/\",\"https://swapi.co/api/people/2/\",\"https://swapi.co/api/people/3/\",\"https://swapi.co/api/people/4/\",\"https://swapi.co/api/people/5/\",\"https://swapi.co/api/people/6/\",\"https://swapi.co/api/people/7/\",\"https://swapi.co/api/people/8/\",\"https://swapi.co/api/people/9/\"," +
            "\"https://swapi.co/api/people/10/\",\"https://swapi.co/api/people/12/\",\"https://swapi.co/api/people/13/\",\"https://swapi.co/api/people/14/\",\"https://swapi.co/api/people/15/\",\"https://swapi.co/api/people/16/\",\"https://swapi.co/api/people/18/\",\"https://swapi.co/api/people/19/\",\"https://swapi.co/api/people/81/\"],\"episode_id\":4,\"planets\"" +
            ":[\"https://swapi.co/api/planets/2/\",\"https://swapi.co/api/planets/3/\",\"https://swapi.co/api/planets/1/\"],\"release_date\":\"1977-05-25\",\"starships\":[\"https://swapi.co/api/starships/2/\",\"https://swapi.co/api/starships/3/\",\"https://swapi.co/api/starships/5/\",\"https://swapi.co/api/starships/9/\",\"https://swapi.co/api/starships/10/\"," +
            "\"https://swapi.co/api/starships/11/\",\"https://swapi.co/api/starships/12/\",\"https://swapi.co/api/starships/13/\"],\"species\":[\"https://swapi.co/api/species/5/\",\"https://swapi.co/api/species/3/\",\"https://swapi.co/api/species/2/\",\"https://swapi.co/api/species/1/\"," +
            "\"https://swapi.co/api/species/4/\"],\"producer\":\"Gary Kurtz, Rick McCallum\"}";

    String jsPeople = "{\"films\":[\"https://swapi.co/api/films/2/\",\"https://swapi.co/api/films/6/\"," +
            "\"https://swapi.co/api/films/3/\",\"https://swapi.co/api/films/1/\",\"https://swapi.co/api/films/7/\"]," +
            "\"homeworld\":\"https://swapi.co/api/planets/1/\",\"gender\":\"male\",\"skin_color\":\"fair\",\"edited\":\"" +
            "2014-12-20T21:17:56.891000Z\",\"created\":\"2014-12-09T13:50:51.644000Z\",\"mass\":\"77\",\"vehicles\":[\"" +
            "https://swapi.co/api/vehicles/14/\",\"https://swapi.co/api/vehicles/30/\"],\"url\":\"https://swapi.co/api/people/1/\",\"" +
            "hair_color\":\"blond\",\"birth_year\":\"19BBY\",\"eye_color\":\"blue\",\"species\":[\"https://swapi.co/api/species/1/\"],\"starships\"" +
            ":[\"https://swapi.co/api/starships/12/\",\"https://swapi.co/api/starships/22/\"],\"name\":\"Luke Skywalker\",\"height\":\"172\"}";

    String jsFilm = "{\"edited\":\"2015-04-11T09:46:52.774897Z\",\"director\":\"George Lucas\",\"created\":\"2014-12-10T14:23:31.880000Z\",\"vehicles\":[\"https://swapi.co/api/vehicles/4/\",\"https://swapi.co/api/vehicles/6/\",\"https://swapi.co/api/vehicles/7/\",\"https://swapi.co/api/vehicles/8/\"],\"opening_crawl\":" +
            "\"It is a period of civil war.\\r\\nRebel spaceships, striking\\r\\nfrom a hidden base, have won\\r\\ntheir first victory against\\r\\nthe evil Galactic Empire.\\r\\n\\r\\nDuring the battle, Rebel\\r\\nspies managed to steal secret\\r\\nplans to the Empire's\\r\\nultimate weapon," +
            " the DEATH\\r\\nSTAR, an armored space\\r\\nstation with enough power\\r\\nto destroy an entire planet.\\r\\n\\r\\nPursued by the Empire's\\r\\nsinister agents, Princess\\r\\nLeia races home aboard her\\r\\nstarship, custodian of the\\r\\nstolen plans that can save her\\r\\npeople and restore\\r\\nfreedom to the galaxy....\"," +
            "\"title\":\"A New Hope\",\"url\":\"https://swapi.co/api/films/1/\",\"characters\":[\"https://swapi.co/api/people/1/\",\"https://swapi.co/api/people/2/\",\"https://swapi.co/api/people/3/\",\"https://swapi.co/api/people/4/\",\"https://swapi.co/api/people/5/\",\"https://swapi.co/api/people/6/\",\"https://swapi.co/api/people/7/\",\"https://swapi.co/api/people/8/\",\"https://swapi.co/api/people/9/\"," +
            "\"https://swapi.co/api/people/10/\",\"https://swapi.co/api/people/12/\",\"https://swapi.co/api/people/13/\",\"https://swapi.co/api/people/14/\",\"https://swapi.co/api/people/15/\",\"https://swapi.co/api/people/16/\",\"https://swapi.co/api/people/18/\",\"https://swapi.co/api/people/19/\",\"https://swapi.co/api/people/81/\"],\"episode_id\":4,\"planets\"" +
            ":[\"https://swapi.co/api/planets/2/\",\"https://swapi.co/api/planets/3/\",\"https://swapi.co/api/planets/1/\"],\"release_date\":\"1977-05-25\",\"starships\":[\"https://swapi.co/api/starships/2/\",\"https://swapi.co/api/starships/3/\",\"https://swapi.co/api/starships/5/\",\"https://swapi.co/api/starships/9/\",\"https://swapi.co/api/starships/10/\"," +
            "\"https://swapi.co/api/starships/11/\",\"https://swapi.co/api/starships/12/\",\"https://swapi.co/api/starships/13/\"],\"species\":[\"https://swapi.co/api/species/5/\",\"https://swapi.co/api/species/3/\",\"https://swapi.co/api/species/2/\",\"https://swapi.co/api/species/1/\"," +
            "\"https://swapi.co/api/species/4/\"],\"producer\":\"Gary Kurtz, Rick McCallum\"}";


}
