package MarvelAPIFeature.FetchesCharactersListResponseDefinition.MarvelAPOD;

import com.fasterxml.jackson.annotation.JsonProperty;

public class response {

    public final String code;
    public final String status;
    public final String copyright;
    public final String attributionText;
    public final String attributionHTML;
    public final String etag;
    public final String data;

    public response(@JsonProperty("code") String code,
            @JsonProperty("status") String status,
            @JsonProperty("copyright") String copyright,
            @JsonProperty("attributionText") String attributionText,
            @JsonProperty("attributionHTML") String attributionHTML,
            @JsonProperty("etag") String etag,
            @JsonProperty("data") String data
    ){
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.etag = etag;
        this.data = data;
    }
}
