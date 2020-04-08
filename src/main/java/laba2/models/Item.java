package laba2.models;

import java.util.List;

public interface Item<T> {
    List<T> getResults();

    void setResults(List<T> res);

    String getUrl();

    public String getUrlId();
}
