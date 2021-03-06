package taskhtml;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


import java.util.List;

public class Lesson4 {

    String name;
    String hight;
    String mass;
    String hairCollor;
    String skin_color;
    String eyeCollor;
    String birth_year;
    String gender;
    String homeworld;
    List<String> films;
    List<String> species;
    List<String> vehicles;
    List<String> starships;
    String url = "https://swapi.co/api/people/1/";
    HttpResponse<JsonNode> response;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairCollor() {
        return hairCollor;
    }

    public void setHairCollor(String hairCollor) {
        this.hairCollor = hairCollor;
    }

    public String getSkinCollor() {
        return skin_color;
    }

    public void setSkinCollor(String skinCollor) {
        this.skin_color = skinCollor;
    }

    public String getEyeCollor() {
        return eyeCollor;
    }

    public void setEyeCollor(String eyeCollor) {
        this.eyeCollor = eyeCollor;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static void main(String[] args) throws UnirestException {
        String json = json();
        Gson gson = new Gson();

        Lesson4 item;

        item = gson.fromJson(json, Lesson4.class);
        String name2 = item.getSkinCollor();
        System.out.println(json());

    }

    public static String json() throws UnirestException {
        Lesson4 lesson4 = new Lesson4();
        lesson4.response = Unirest.get(lesson4.url).asJson();
        return lesson4.response.getBody().toString();
    }

}
