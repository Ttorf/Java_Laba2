package laba2.utils;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;
import laba2.models.People;


import java.util.ArrayList;
import java.util.List;


public class ClientImplementation implements Client {
    People people = new People();
    Films films = new Films();
    Planet planet = new Planet();
    Species species = new Species();
    Starship starship = new Starship();
    Vehicles vehicles = new Vehicles();
    WorkWithSite workWithSite = new WorkWithSite();
    Gson gson = new Gson();
    String json;
    StringBuilder nextUrl;


    @Override
    public People getPeopleByName(String name) throws UnirestException {
        List<People> peopleList = getAllPeople();
        for (People per : peopleList) {
            if (per.getName().equals(name)) {
                return per;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public People getPeopleByID(int id) throws UnirestException {

        List<People> peopleList = getAllPeople();
        if (!peopleList.isEmpty()) {
            return peopleList.get(id);
        } else throw new NullPointerException("Человек не найден");
    }

    @Override
    public List<People> getAllPeople() throws UnirestException {

        List<People> peopleList = new ArrayList<>();
        peopleList.addAll(getAllPage(people.getUrl(), People.class));
        people.setResults(peopleList);
        return people.getResults();
    }

    @Override
    public Planet getPlanetByName(String name) throws UnirestException {
        List<Planet> planetList = getAllPlanets();
        for (Planet planet : planetList) {
            if (planet.getName().equals(name)) {
                return planet;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public Planet getPlanetByID(int id) throws UnirestException {
        List<Planet> planetList = getAllPlanets();
        if (!planetList.isEmpty()) {
            return planetList.get(id);
        } else throw new NullPointerException("Планета не найдена");
    }

    @Override
    public List<Planet> getAllPlanets() throws UnirestException {

        List<Planet> planetList = new ArrayList<>();
        planetList.addAll(getAllPage(planet.getUrl(), Planet.class));
        planet.setResults(planetList);
        return planet.getResults();
    }

    @Override
    public Films getFilmByTitle(String title) throws UnirestException {
        List<Films> filmsList = getAllFilms();
        for (Films films1 : filmsList) {
            if (films1.getTitle().equals(title)) {
                return films1;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }


    @Override
    public Films getFilmByID(int id) throws UnirestException {

        List<Films> filmsList = getAllFilms();
        if (!filmsList.isEmpty()) {
            for (Films films1 : filmsList) {
                if (films1.getEpisode_id() == id) {
                    return films1;
                }
            }
            return null;
        } else throw new NullPointerException("Фильм не найден");
    }

    @Override
    public List<Films> getAllFilms() throws UnirestException {
        List<Films> filmsList = new ArrayList<>();
        filmsList.addAll(getAllPage(films.getUrl(), Films.class));
        films.setResults(filmsList);
        return films.getResults();
    }

    @Override
    public Species getSpeciesByName(String name) throws UnirestException {
        List<Species> speciesList = getAllSpecies();
        for (Species species1 : speciesList) {
            if (species1.getName().equals(name)) {
                return species1;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public Species getSpeciesByID(int id) throws UnirestException {
        List<Species> speciesList = getAllSpecies();
        if (!speciesList.isEmpty()) {
            return speciesList.get(id);
        } else throw new NullPointerException("Species не найден");
    }

    @Override
    public List<Species> getAllSpecies() throws UnirestException {
        List<Species> speciesList = new ArrayList<>();
        speciesList.addAll(getAllPage(species.getUrl(), Species.class));
        species.setResults(speciesList);
        return species.getResults();
    }

    @Override
    public Vehicles getVehicleByName(String name) throws UnirestException {
        List<Vehicles> vehiclesList = getAllVehicles();
        for (Vehicles vehicles1 : vehiclesList) {
            if (vehicles1.getName().equals(name)) {
                return vehicles1;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public Vehicles getVehicleByID(int id) throws UnirestException {
        List<Vehicles> vehiclesList = getAllVehicles();
        if (!vehiclesList.isEmpty()) {
            return vehiclesList.get(id);
        } else throw new NullPointerException("Транспорт не найден");
    }

    @Override
    public List<Vehicles> getAllVehicles() throws UnirestException {
        List<Vehicles> vehiclesList = new ArrayList<>();
        vehiclesList.addAll(getAllPage(vehicles.getUrl(), Vehicles.class));
        vehicles.setResults(vehiclesList);
        return vehicles.getResults();
    }

    @Override
    public Starship getStarShipByName(String name) throws UnirestException {
        List<Starship> starshipList = getAllStarShips();
        for (Starship starship1 : starshipList) {
            if (starship1.getName().equals(name)) {
                return starship1;
            }
        }
        throw new NullPointerException("Имя не найдено");
    }

    @Override
    public Starship getStarShipByID(int id) throws UnirestException {
        List<Starship> starshipList = getAllStarShips();
        if (!starshipList.isEmpty()) {
            return starshipList.get(id);
        } else throw new NullPointerException("Корабль не найден");
    }

    @Override
    public List<Starship> getAllStarShips() throws UnirestException {
        List<Starship> starshipArrayList = new ArrayList<>();
        starshipArrayList.addAll(getAllPage(starship.getUrl(), Starship.class));
        starship.setResults(starshipArrayList);
        return starship.getResults();
    }
    //TODO
    public <T extends Model> T getOnePage(String json, Class<T> type) throws UnirestException {

        return null;
    }

    private <T extends Model> List<T> getAllPage(String url, Class<T> type) throws UnirestException {
        List<T> listJsons = new ArrayList<>();
        nextUrl = new StringBuilder(url);
        int indexPage = convertUrlToNumberPage(String.valueOf(nextUrl));
        boolean hasNext = false;

        while (!hasNext) {
            listJsons.addAll(getByUrl(type, String.valueOf(nextUrl)));
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

    private <T extends Model> List<T> getByUrl(Class<T> type, String url) throws UnirestException {
        String json = workWithSite.jsonToString(url);
        T result = gson.fromJson(json, type);
        return result.getResults();
    }

    private int convertUrlToNumberPage(String url) {
        String str = String.valueOf(url.charAt(url.length() - 1));
        int page = Integer.parseInt(str);
        return page;
    }
}
