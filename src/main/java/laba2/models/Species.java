package laba2.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

import java.util.List;
import java.util.Objects;

public class Species implements Model {
    private String name;
    private String classification;
    private String designation;
    private String naverage_heightame;
    private String skin_colors;
    private String hair_colors;
    private String eye_colors;
    private String skin_average_lifespancolors;
    private String homeworld;
    private String language;
    private List<String> people;
    private List<String> films;
    private String created;
    private String edited;
    private String url = "https://swapi.co/api/species/?page=1";
    ;
    private HttpResponse<JsonNode> response;
    private List<Species> results;

    @Override
    public List<Species> getResults() {
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNaverage_heightame() {
        return naverage_heightame;
    }

    public void setNaverage_heightame(String naverage_heightame) {
        this.naverage_heightame = naverage_heightame;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getSkin_average_lifespancolors() {
        return skin_average_lifespancolors;
    }

    public void setSkin_average_lifespancolors(String skin_average_lifespancolors) {
        this.skin_average_lifespancolors = skin_average_lifespancolors;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
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
        return "Species{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", designation='" + designation + '\'' +
                ", naverage_heightame='" + naverage_heightame + '\'' +
                ", skin_colors='" + skin_colors + '\'' +
                ", hair_colors='" + hair_colors + '\'' +
                ", eye_colors='" + eye_colors + '\'' +
                ", skin_average_lifespancolors='" + skin_average_lifespancolors + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", language='" + language + '\'' +
                ", people=" + people +
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
        Species species = (Species) o;
        return Objects.equals(name, species.name) &&
                Objects.equals(classification, species.classification) &&
                Objects.equals(designation, species.designation) &&
                Objects.equals(naverage_heightame, species.naverage_heightame) &&
                Objects.equals(skin_colors, species.skin_colors) &&
                Objects.equals(hair_colors, species.hair_colors) &&
                Objects.equals(eye_colors, species.eye_colors) &&
                Objects.equals(skin_average_lifespancolors, species.skin_average_lifespancolors) &&
                Objects.equals(homeworld, species.homeworld) &&
                Objects.equals(language, species.language) &&
                Objects.equals(people, species.people) &&
                Objects.equals(films, species.films) &&
                Objects.equals(created, species.created) &&
                Objects.equals(edited, species.edited) &&
                Objects.equals(url, species.url) &&
                Objects.equals(response, species.response) &&
                Objects.equals(results, species.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classification, designation, naverage_heightame, skin_colors, hair_colors, eye_colors, skin_average_lifespancolors, homeworld, language, people, films, created, edited, url, response, results);
    }
}
