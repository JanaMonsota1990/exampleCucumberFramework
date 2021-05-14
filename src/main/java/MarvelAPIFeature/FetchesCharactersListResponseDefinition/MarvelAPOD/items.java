package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class items {

    public final String resourceURI;
    public final String name;
    public final String type;

    public items(@JsonProperty("resourceURI") String resourceURI,
                 @JsonProperty("name") String name,
                 @JsonProperty("type") String type
    ){
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }
}
