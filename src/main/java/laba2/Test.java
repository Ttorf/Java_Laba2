package laba2;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.Films;
import laba2.models.Model;
import laba2.models.People;
import laba2.models.Planet;
import laba2.utils.ClientImplementation;
import laba2.utils.WorkWithSite;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) throws UnirestException {
        Gson gson = new Gson();
        ClientImplementation clientImplementation = new ClientImplementation();
        WorkWithSite workWithSite = new WorkWithSite();
        List<People> people;
        Films films1 = new Films();
        List<Films> filmsList = new ArrayList<>();

        String json = workWithSite.jsonToString("https://swapi.co/api/people/?page=1");
        Planet planet = new Planet();
//        Model modelMark = new People();
//        people = clientImplementation.getAllPage(pp.getUrl(), modelMark);
//        System.out.println(people.size());
//        pp.setResults(people);
//
//          pp.setResults(clientImplementation.getAllPage("https://swapi.co/api/planets/?page=1)",pp));
//            System.out.println(pp.getResults());
//            }
//        people = clientImplementation.getAllPeople(pp.getUrl());
//        pp.setResults(people);
//        System.out.println(people.size());

//        System.out.println(pp.getResults().size());
//        filmsList = clientImplementation.getAllFilms();
//
//        System.out.println(filmsList.size());
//
//        films1.setResults(filmsList);
//       pp.setResults(clientImplementation.getOnePageClass(People.class, pp.getUrl()));
//        for (People people1 : pp.getResults()) {
//            System.out.println(people1.getName());
//        }
//
//    }
        People pp = new People();
        List<People> peopleList = new ArrayList<>();
        peopleList.addAll(clientImplementation.getAllPeople(pp.getUrl()));

        System.out.println(peopleList.size());
//        List<Planet> planetList = new ArrayList<>();
//        planetList.addAll(clientImplementation.getAllPage(planet.getUrl(),Planet.class));
//        System.out.println(planetList.size());
//    }
    }
}
