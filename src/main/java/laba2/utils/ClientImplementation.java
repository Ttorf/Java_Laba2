package laba2.utils;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;
import laba2.models.People;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class ClientImplementation implements Client {
    People people = new People();

    List<Planet> planetList = new ArrayList<>();
    List<Films> filmsList = new ArrayList<>();
    People p = new People();
    Films films = new Films();
    Planet planet = new Planet();
    Species species = new Species();
    Starship starship = new Starship();
    Vehicles vehicles = new Vehicles();
    WorkWithSite workWithSite = new WorkWithSite();
    Gson gson = new Gson();
    String json;
    StringBuilder nextUrl;
    boolean tempboolean = false;


    @Override
    public People getPeopleByName(String name) throws UnirestException {
        List<People> peopleList = getAllPeople(people.getUrl());
        for (People per : peopleList) {
            if (per.getName().equals(name)) {
                return per;
            }
        }
        throw new NullPointerException("Имя не найдено");

    }

    @Override
    public People getPeopleByID(int id) throws UnirestException {

        List<People> peopleList = getAllPeople(people.getUrl());
        if (!peopleList.isEmpty()) {
            return peopleList.get(id);
        } else throw new NullPointerException("Человек не найден");
    }

    @Override
    public List<People> getAllPeople(String url) throws UnirestException {

        List<People> peopleList = new ArrayList<>();
        peopleList.addAll(getAllPage(people.getUrl(), People.class));
        people.setResults(peopleList);
        return people.getResults();
    }

    @Override
    public Planet getPlanetByName(String name) throws UnirestException {
        planetList = getAllPlanets();
        for (Planet planet : planetList) {
            if (planet.getName().equals(name)) {
                return planet;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public Planet getPlanetByID(int id) throws UnirestException {
        planetList = getAllPlanets();
        if (!planetList.isEmpty()) {
            return planetList.get(id);
        } else throw new NullPointerException("Человек не найден");
    }

    @Override
    public List<Planet> getAllPlanets() throws UnirestException {
        Model planet2 = new People();
        List<Planet> planetlist;
        //   planetlist = getAllPage(planet.getUrl(), Planet.class);
        //    planet.setResults(planetlist);
        return planet.getResults();
    }

    @Override
    public Films getFilmByTitle(String title) throws UnirestException {
        filmsList = getAllFilms();
        for (Films films1 : filmsList) {
            if (films1.getTitle().equals(title)) {
                return films1;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }


    @Override
    public Films getFilmByID(int id) throws UnirestException {

        filmsList = getAllFilms();
        if (!filmsList.isEmpty()) {
            return filmsList.get(id);
        } else throw new NullPointerException("Фильм не найден");
    }

    @Override
    public List<Films> getAllFilms() throws UnirestException {
        Model film2 = new Films();
        List<Films> filmslist1;
        //  filmslist1 = getAllPage(films.getUrl(), film2);
        //   films.setResults(filmslist1);
        return films.getResults();
    }

    @Override
    public Species getSpeciesByName(String name) throws UnirestException {
        json = workWithSite.jsonToString(species.getUrl());
        species = gson.fromJson(json, Species.class);
        for (Species speciestemp : species.getResults()) {
            if (speciestemp.getName().equals(name)) {
                return speciestemp;
            }
        }
        throw new NullPointerException("Разновидность не найдена");
    }

    @Override
    public Species getSpeciesByID(int id) throws UnirestException {
        json = workWithSite.jsonToString(species.getUrl());
        species = gson.fromJson(json, Species.class);
        if (!species.getResults().isEmpty()) {
            return species.getResults().get(id);
        } else throw new NullPointerException("Разновидность не найдена");
    }

    @Override
    public List<Species> getAllSpecies() throws UnirestException {
        json = workWithSite.jsonToString(species.getUrl());
        species = gson.fromJson(json, Species.class);
        return species.getResults();
    }

    @Override
    public Vehicles getVehicleByName(String name) throws UnirestException {
        json = workWithSite.jsonToString(vehicles.getUrl());
        vehicles = gson.fromJson(json, Vehicles.class);
        for (Vehicles vehicles : vehicles.getResults()) {
            if (vehicles.getName().equals(name)) {
                return vehicles;
            }
        }
        throw new NullPointerException("Техника не найдена");
    }

    @Override
    public Vehicles getVehicleByID(int id) throws UnirestException {
        json = workWithSite.jsonToString(vehicles.getUrl());
        vehicles = gson.fromJson(json, Vehicles.class);
        if (!vehicles.getResults().isEmpty()) {
            return vehicles.getResults().get(id);
        } else throw new NullPointerException("Техника не найдена");
    }

    @Override
    public List<Vehicles> getAllVehicles() throws UnirestException {
        json = workWithSite.jsonToString(vehicles.getUrl());
        vehicles = gson.fromJson(json, Vehicles.class);
        return vehicles.getResults();
    }

    @Override
    public Starship getStarshipByName(String name) throws UnirestException {
        json = workWithSite.jsonToString(starship.getUrl());
        starship = gson.fromJson(json, Starship.class);
        for (Starship starship : starship.getResults()) {
            if (starship.getName().equals(name)) {
                return starship;
            }
        }
        throw new NullPointerException("Корабль не найден");
    }

    @Override
    public Starship getStarshipByID(int id) throws UnirestException {
        json = workWithSite.jsonToString(starship.getUrl());
        starship = gson.fromJson(json, Starship.class);
        if (!starship.getResults().isEmpty()) {
            return starship.getResults().get(id);
        } else return null;
    }

    @Override
    public List<Starship> getAllStarships() throws UnirestException {
        json = workWithSite.jsonToString(starship.getUrl());
        starship = gson.fromJson(json, Starship.class);
        return starship.getResults();
    }
    //TODO

    public <T extends Model> T getByUrl(String json, Class<T> type) throws UnirestException {

        return null;

    }

    public <T extends Model> List<T> getAllPage(String url, Class<T> type) throws UnirestException {
        List<T> listJsons = new ArrayList<>();
        nextUrl = new StringBuilder(url);
        int indexPage = convertUrltoNumberPage(String.valueOf(nextUrl));
        boolean hasNext = false;

        while (!hasNext) {
            listJsons.addAll(getOnePageClass(type, String.valueOf(nextUrl)));
            json = workWithSite.jsonToString(String.valueOf(nextUrl));
            nextUrl.deleteCharAt(nextUrl.length() - 1);
            indexPage = indexPage + 1;
            nextUrl.append(indexPage);

            if (workWithSite.nextPage(json)) {
                hasNext = true;
            }

        }
        return listJsons;


    }
    //TODO

    public <T extends Model> List<T> getOnePageClass(Class<T> type, String url) throws UnirestException {
        String json = workWithSite.jsonToString(url);
        T result = gson.fromJson(json, type);
        return result.getResults();

    }

    private int convertUrltoNumberPage(String url) {
        String str = String.valueOf(url.charAt(url.length() - 1));
        int page = Integer.parseInt(str);
        return page;
    }
}
