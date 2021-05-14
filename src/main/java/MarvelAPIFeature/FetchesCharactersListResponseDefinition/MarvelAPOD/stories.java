package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class stories {

    public final String available;
    public final String collectionURI;
    public final String items;
    public final String returned;

    public stories(
            @JsonProperty("available") String available,
            @JsonProperty("collectionURI") String collectionURI,
            @JsonProperty("items") String items,
            @JsonProperty("returned") String returned
    ){
        this.available = available;
        this.collectionURI = collectionURI;
        this.items = items;
        this.returned = returned;

    }
}
