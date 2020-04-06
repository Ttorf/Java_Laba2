package laba2.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;

import java.util.List;

public interface Client<T> {
    People getPeopleByName(String name) throws UnirestException;

    People getPeopleByID(int id) throws UnirestException;

    List<People> getAllPeople(String url) throws UnirestException;

    Planet getPlanetByName(String name) throws UnirestException;

    Planet getPlanetByID(int id) throws UnirestException;

    List<Planet> getAllPlanets() throws UnirestException;

    Films getFilmByTitle(String title) throws UnirestException;

    Films getFilmByID(int id) throws UnirestException;

    List<Films> getAllFilms() throws UnirestException;

    Species getSpeciesByName(String name) throws UnirestException;

    Species getSpeciesByID(int id) throws UnirestException;

    List<Species> getAllSpecies() throws UnirestException;

    Vehicles getVehicleByName(String name) throws UnirestException;

    Vehicles getVehicleByID(int id) throws UnirestException;

    List<Vehicles> getAllVehicles() throws UnirestException;

    T getStarshipByName(String name) throws UnirestException;

    T getStarshipByID(int id) throws UnirestException;

    T getAllStarships() throws UnirestException;


}
