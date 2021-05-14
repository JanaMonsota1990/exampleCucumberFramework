package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class results {
    public final String id;
    public final String name;
    public final String description;
    public final String modified;
    public final String thumbnail;
    public final String resourceURI;
    public final String comics;
    public final String series;
    public final String stories;
    public final String events;
    public final String urls;

    public results(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("modified") String modified,
            @JsonProperty("thumbnail") String thumbnail,
            @JsonProperty("resourceURI") String resourceURI,
            @JsonProperty("comics") String comics,
            @JsonProperty("series") String series,
            @JsonProperty("stories") String stories,
            @JsonProperty("events") String events,
            @JsonProperty("urls") String urls
    ){
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.thumbnail = thumbnail;
        this.resourceURI = resourceURI;
        this.comics = comics;
        this.series = series;
        this.stories = stories;
        this.events = events;
        this.urls = urls;
    }

}
