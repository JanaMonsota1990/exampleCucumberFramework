package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class urls {
    public final String type;
    public final String url;

    public urls(
            @JsonProperty("activity") String type,
            @JsonProperty("activity") String url
    ){
        this.type = type;
        this.url = url;
    }
}
