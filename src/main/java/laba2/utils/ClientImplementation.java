package laba2.utils;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;


import java.util.List;

public class ClientImplementation<T> implements Client {
    People people = new People();
    Films films = new Films();
    Planet planet = new Planet();
    Species species = new Species();
    Starship starship = new Starship();
    Vehicles vehicles = new Vehicles();
    WorkWithSite workWithSite = new WorkWithSite();
    Gson gson = new Gson();
    String json;

    @Override
    public People getPeopleByName(String name) throws UnirestException {
        json = workWithSite.JsonToString(people);
        people = gson.fromJson(json, People.class);
        for (People per : people.getResults()) {
            if (per.getName().equals(name)) {
                return per;
            }
        }
        throw new NullPointerException("Имя не найдено");

    }

    @Override
    public People getPeopleByID(int id) throws UnirestException {

        json = workWithSite.JsonToString(people);
        people = gson.fromJson(json, People.class);
        if (!people.getResults().isEmpty()) {
            return people.getResults().get(id);
        } else throw new NullPointerException("Человек не найден");
    }

    @Override
    public List<People> getAllPeople() throws UnirestException {
        json = workWithSite.JsonToString(people);
        people = gson.fromJson(json, People.class);
        return people.getResults();
    }

    @Override
    public Planet getPlanetByName(String name) throws UnirestException {
        json = workWithSite.JsonToString(planet);
        planet = gson.fromJson(json, Planet.class);
        for (Planet planet : planet.getResults()) {
            if (planet.getName().equals(name)) {
                return planet;
            }
        }
        throw new NullPointerException("Планета не найдена");
    }

    @Override
    public Planet getPlanetByID(int id) throws UnirestException {
        json = workWithSite.JsonToString(planet);
        planet = gson.fromJson(json, Planet.class);
        if (!planet.getResults().isEmpty()) {
            return planet.getResults().get(id);
        } else throw new NullPointerException("Планета не найдена");
    }

    @Override
    public List<Planet> getAllPlanets() throws UnirestException {
        json = workWithSite.JsonToString(planet);
        planet = gson.fromJson(json, Planet.class);
        return planet.getResults();
    }

    @Override
    public Films getFilmByTitle(String title) throws UnirestException {
        json = workWithSite.JsonToString(films);
        films = gson.fromJson(json, Films.class);
        for (Films films : films.getResults()) {
            if (films.getTitle().equals(title)) {
                return films;
            }
        }
        throw new NullPointerException("Фильм не найден");
    }


    @Override
    public Films getFilmByID(int id) throws UnirestException {
        List<Films> filmsList = (List<Films>) getAllPage(films.getUrl(), films);
        if (!filmsList.isEmpty())
            for (Films filmTemp : filmsList) {
                if (filmTemp.getEpisode_id() == id)
                    return filmTemp;
            }
        throw new NullPointerException("Фильм не найден");
    }

    @Override
    public List<Films> getAllFilms() throws UnirestException {
        json = workWithSite.JsonToString(films);
        films = gson.fromJson(json, Films.class);
        return films.getResults();
    }

    @Override
    public Species getSpeciesByName(String name) throws UnirestException {
        json = workWithSite.JsonToString(species);
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
        json = workWithSite.JsonToString(species);
        species = gson.fromJson(json, Species.class);
        if (!species.getResults().isEmpty()) {
            return species.getResults().get(id);
        } else throw new NullPointerException("Разновидность не найдена");
    }

    @Override
    public List<Species> getAllSpecies() throws UnirestException {
        json = workWithSite.JsonToString(species);
        species = gson.fromJson(json, Species.class);
        return species.getResults();
    }

    @Override
    public Vehicles getVehicleByName(String name) throws UnirestException {
        json = workWithSite.JsonToString(vehicles);
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
        json = workWithSite.JsonToString(vehicles);
        vehicles = gson.fromJson(json, Vehicles.class);
        if (!vehicles.getResults().isEmpty()) {
            return vehicles.getResults().get(id);
        } else throw new NullPointerException("Техника не найдена");
    }

    @Override
    public List<Vehicles> getAllVehicles() throws UnirestException {
        json = workWithSite.JsonToString(vehicles);
        vehicles = gson.fromJson(json, Vehicles.class);
        return vehicles.getResults();
    }

    @Override
    public Starship getStarshipByName(String name) throws UnirestException {
        json = workWithSite.JsonToString(starship);
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
        json = workWithSite.JsonToString(starship);
        starship = gson.fromJson(json, Starship.class);
        if (!starship.getResults().isEmpty()) {
            return starship.getResults().get(id);
        } else return null;
    }

    @Override
    public List<Starship> getAllStarships() throws UnirestException {
        json = workWithSite.JsonToString(starship);
        starship = gson.fromJson(json, Starship.class);
        return starship.getResults();
    }

    public T getByUrl(String url, Object type) throws UnirestException {


        if (type.getClass().equals(people.getClass())) {
            String json = workWithSite.JsonToString(people, url);
            return (T) (this.people = gson.fromJson(json, People.class));

        } else if (type.getClass().equals(films.getClass())) {
            String json = workWithSite.JsonToString(films, url);
            return (T) (this.films = gson.fromJson(json, Films.class));
        } else if (type.getClass().equals(planet.getClass())) {
            json = workWithSite.JsonToString(planet, url);
            return (T) (this.planet = gson.fromJson(json, Planet.class));

        } else if (type.getClass().equals(species.getClass())) {
            json = workWithSite.JsonToString(species, url);
            return (T) (this.species = gson.fromJson(json, Species.class));

        } else if (type.getClass().equals(starship.getClass())) {
            json = workWithSite.JsonToString(starship, url);
            return (T) (this.starship = gson.fromJson(json, Starship.class));

        } else if (type.getClass().equals(vehicles.getClass())) {
            json = workWithSite.JsonToString(vehicles, url);
            return (T) (this.vehicles = gson.fromJson(json, Vehicles.class));

        } else {
            throw new NullPointerException("Url не найден");
        }
    }

    public List<T> getAllPage(String url, Object type) throws UnirestException {


        if (type.getClass().equals(people.getClass())) {
            String json = workWithSite.JsonToString(people, url);
            this.people = gson.fromJson(json, People.class);
            return (List<T>) this.people.getResults();
        } else if (type.getClass().equals(films.getClass())) {
            String json = workWithSite.JsonToString(films, url);
            this.films = gson.fromJson(json, Films.class);
            return (List<T>) this.films.getResults();
        } else if (type.getClass().equals(planet.getClass())) {
            json = workWithSite.JsonToString(planet, url);
            this.planet = gson.fromJson(json, Planet.class);
            return (List<T>) this.planet.getResults();
        } else if (type.getClass().equals(species.getClass())) {
            json = workWithSite.JsonToString(species, url);
            this.species = gson.fromJson(json, Species.class);
            return (List<T>) this.species.getResults();
        } else if (type.getClass().equals(starship.getClass())) {
            json = workWithSite.JsonToString(starship, url);
            this.starship = gson.fromJson(json, Starship.class);
            return (List<T>) this.starship.getResults();
        } else if (type.getClass().equals(vehicles.getClass())) {
            json = workWithSite.JsonToString(vehicles, url);
            this.vehicles = gson.fromJson(json, Vehicles.class);
            return (List<T>) this.vehicles.getResults();
        } else {
            throw new NullPointerException("Страницы не найдены");

        }
    }

    public T getOnePage(String jsonStr, Object type) throws UnirestException {
        if (type.getClass().equals(people.getClass())) {
            people = new People();
            People people2 = gson.fromJson(jsonStr, People.class);
            List<People> listPeople = (List<People>) getAllPage(people.getUrl(), people);
            for (People peopleTemp : listPeople) {
                if (peopleTemp.equals(people2))
                    return (T) peopleTemp;
            }
        } else if (type.getClass().equals(films.getClass())) {
            films = new Films();
            Films films2 = gson.fromJson(jsonStr, Films.class);
            List<Films> listFilms = (List<Films>) getAllPage(films.getUrl(), films);
            for (Films filmsTemp : listFilms) {
                if (filmsTemp.equals(films2))
                    return (T) filmsTemp;
            }
        } else if (type.getClass().equals(planet.getClass())) {

            planet = new Planet();
            Planet planet2 = gson.fromJson(jsonStr, Planet.class);
            List<Planet> listPlanets = (List<Planet>) getAllPage(planet.getUrl(), planet);
            for (Planet planetTemp : listPlanets) {
                if (planetTemp.equals(planet2))
                    return (T) planetTemp;
            }

        } else if (type.getClass().equals(species.getClass())) {
            species = new Species();
            Species species2 = gson.fromJson(jsonStr, Species.class);
            List<Species> listSpecies = (List<Species>) getAllPage(species.getUrl(), species);
            for (Species speciesTemp : listSpecies) {
                if (speciesTemp.equals(species2))
                    return (T) speciesTemp;
            }
        } else if (type.getClass().equals(starship.getClass())) {

            starship = new Starship();
            Starship starship2 = gson.fromJson(jsonStr, Starship.class);
            List<Starship> liststarship = (List<Starship>) getAllPage(starship.getUrl(), starship);
            for (Starship starshipTemp : liststarship) {
                if (starshipTemp.equals(starship2))
                    return (T) starshipTemp;
            }
        } else if (type.getClass().equals(vehicles.getClass())) {

            vehicles = new Vehicles();
            Vehicles vehicles2 = gson.fromJson(jsonStr, Vehicles.class);
            List<Vehicles> listsVehicles = (List<Vehicles>) getAllPage(vehicles.getUrl(), vehicles);
            for (Vehicles vehiclesTemp : listsVehicles) {
                if (vehiclesTemp.equals(vehicles2))
                    return (T) vehiclesTemp;
            }
        }
        throw new NullPointerException("Json не найден");
    }
}