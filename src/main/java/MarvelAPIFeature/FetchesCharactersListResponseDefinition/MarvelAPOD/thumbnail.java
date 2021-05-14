package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class thumbnail {

    public final String path;
    public final String extension;

    public thumbnail(@JsonProperty("path") String path,
                     @JsonProperty("extension") String extension
    ){
        this.path = path;
        this.extension = extension;
    }
}
