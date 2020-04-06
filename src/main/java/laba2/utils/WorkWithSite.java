package laba2.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import laba2.models.*;

import java.util.Objects;

public class WorkWithSite<T> {
    //TODO
    HttpResponse<JsonNode> response;

    public void setResponse(HttpResponse<JsonNode> response) {
        this.response = response;
    }

    public String jsonToString(String url) throws UnirestException {
        setResponse((Unirest.get(url).asJson()));
        return response.getBody().toString();
    }


    public JsonObject getJsonObjectParse(String jsonString) {
        JsonElement jsonElementParse = new JsonParser().parse(jsonString);
        return jsonElementParse.getAsJsonObject();
    }

    public boolean nextPage(String jsonString) {
        JsonObject jsonObjectParse = getJsonObjectParse(jsonString);
        if (jsonObjectParse.get("next").isJsonNull()) {
            return true;
        }
        return false;
    }

}
