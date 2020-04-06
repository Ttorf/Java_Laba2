package laba2.models;

import java.util.List;

public interface Model<T> {
    List<T> getResults();

    void setResults(List<T> res);

    String getUrl();

}
