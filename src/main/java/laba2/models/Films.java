package laba2.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

import java.util.List;
import java.util.Objects;

public class Films implements Model {
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;
    private List<Films> results;
    private String created;
    private String edited;
    private String url = "https://swapi.co/api/films/?page=1";
    private HttpResponse<JsonNode> response;

    @Override
    public List<Films> getResults() {
        return results;
    }

    @Override
    public void setResults(List results) {
        this.results = results;
    }


    public HttpResponse<JsonNode> getResponse() {
        return response;
    }


    public void setResponse(HttpResponse<JsonNode> response) {
        this.response = response;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public void setPlanets(List<String> planets) {
        this.planets = planets;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
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

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", episode_id=" + episode_id +
                ", opening_crawl='" + opening_crawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", characters=" + characters +
                ", planets=" + planets +
                ", starships=" + starships +
                ", vehicles=" + vehicles +
                ", species=" + species +
                ", results=" + results +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                ", response=" + response +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Films films = (Films) o;
        return episode_id == films.episode_id &&
                Objects.equals(title, films.title) &&
                Objects.equals(opening_crawl, films.opening_crawl) &&
                Objects.equals(director, films.director) &&
                Objects.equals(producer, films.producer) &&
                Objects.equals(characters, films.characters) &&
                Objects.equals(planets, films.planets) &&
                Objects.equals(starships, films.starships) &&
                Objects.equals(vehicles, films.vehicles) &&
                Objects.equals(species, films.species) &&
                Objects.equals(results, films.results) &&
                Objects.equals(created, films.created) &&
                Objects.equals(edited, films.edited) &&
                Objects.equals(url, films.url) &&
                Objects.equals(response, films.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, episode_id, opening_crawl, director, producer, characters, planets, starships, vehicles, species, results, created, edited, url, response);
    }
}
