package laba2.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

import java.util.List;
import java.util.Objects;

public class Planet implements Model {
    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String gravity;
    private String terrarian;
    private String surface_water;
    private String population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url = "https://swapi.co/api/planets/?page=1";
    private HttpResponse<JsonNode> response;
    private List<Planet> results;

    @Override
    public List<Planet> getResults() {
        return results;
    }

    @Override
    public void setResults(List results) {
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrarian() {
        return terrarian;
    }

    public void setTerrarian(String terrarian) {
        this.terrarian = terrarian;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    @Override
    public String getUrl() {
        return url;
    }


    public HttpResponse<JsonNode> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<JsonNode> response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotation_period='" + rotation_period + '\'' +
                ", orbital_period='" + orbital_period + '\'' +
                ", diameter='" + diameter + '\'' +
                ", gravity='" + gravity + '\'' +
                ", terrarian='" + terrarian + '\'' +
                ", surface_water='" + surface_water + '\'' +
                ", population='" + population + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                ", response=" + response +
                ", results=" + results +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name) &&
                Objects.equals(rotation_period, planet.rotation_period) &&
                Objects.equals(orbital_period, planet.orbital_period) &&
                Objects.equals(diameter, planet.diameter) &&
                Objects.equals(gravity, planet.gravity) &&
                Objects.equals(terrarian, planet.terrarian) &&
                Objects.equals(surface_water, planet.surface_water) &&
                Objects.equals(population, planet.population) &&
                Objects.equals(residents, planet.residents) &&
                Objects.equals(films, planet.films) &&
                Objects.equals(created, planet.created) &&
                Objects.equals(edited, planet.edited) &&
                Objects.equals(url, planet.url) &&
                Objects.equals(response, planet.response) &&
                Objects.equals(results, planet.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rotation_period, orbital_period, diameter, gravity, terrarian, surface_water, population, residents, films, created, edited, url, response, results);
    }

}

