package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class data {

    public final String offset;
    public final String limit;
    public final String total;
    public final String count;
    public final String results;

    public data (@JsonProperty("offset") String offset,
                 @JsonProperty("limit") String limit,
                 @JsonProperty("total") String total,
                 @JsonProperty("count") String count,
                 @JsonProperty("results") String results
    ){
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

}
