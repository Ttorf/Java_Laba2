package laba2.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

import java.util.List;
import java.util.Objects;

public class Starship implements Model {
    private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String consumables;
    private String hyperdrive_rating;
    private String MGLT;
    private String starship_class;
    private List<String> pilots;
    private List<String> films;
    private String created;
    private String edited;
    private String url = "https://swapi.co/api/starships/?page=1";
    private HttpResponse<JsonNode> response;
    private List<Starship> results;

    @Override
    public List<Starship> getResults() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public List<String> getPilots() {
        return pilots;
    }

    public void setPilots(List<String> pilots) {
        this.pilots = pilots;
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
        return "Starship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost_in_credits='" + cost_in_credits + '\'' +
                ", length='" + length + '\'' +
                ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", consumables='" + consumables + '\'' +
                ", hyperdrive_rating='" + hyperdrive_rating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                ", starship_class='" + starship_class + '\'' +
                ", pilots=" + pilots +
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
        Starship starship = (Starship) o;
        return Objects.equals(name, starship.name) &&
                Objects.equals(model, starship.model) &&
                Objects.equals(manufacturer, starship.manufacturer) &&
                Objects.equals(cost_in_credits, starship.cost_in_credits) &&
                Objects.equals(length, starship.length) &&
                Objects.equals(max_atmosphering_speed, starship.max_atmosphering_speed) &&
                Objects.equals(crew, starship.crew) &&
                Objects.equals(passengers, starship.passengers) &&
                Objects.equals(consumables, starship.consumables) &&
                Objects.equals(hyperdrive_rating, starship.hyperdrive_rating) &&
                Objects.equals(MGLT, starship.MGLT) &&
                Objects.equals(starship_class, starship.starship_class) &&
                Objects.equals(pilots, starship.pilots) &&
                Objects.equals(films, starship.films) &&
                Objects.equals(created, starship.created) &&
                Objects.equals(edited, starship.edited) &&
                Objects.equals(url, starship.url) &&
                Objects.equals(response, starship.response) &&
                Objects.equals(results, starship.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, consumables, hyperdrive_rating, MGLT, starship_class, pilots, films, created, edited, url, response, results);
    }

}
