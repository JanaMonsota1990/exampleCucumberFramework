import com.fasterxml.jackson.annotation.JsonProperty;

public class BoredAPOD {

        public final String activity;
        public final String type;
        public final String participants;
        public final String price;
        public final String link;
        public final String key;
        public final String accessibility;


        public BoredAPOD(@JsonProperty("activity") String activity,
                    @JsonProperty("type") String type,
                    @JsonProperty("participants") String participants,
                    @JsonProperty("price") String price,
                    @JsonProperty("link") String link,
                    @JsonProperty("key") String key,
                    @JsonProperty("accessibility") String accessibility){
            this.activity = activity;
            this.type = type;
            this.participants = participants;
            this.price = price;
            this.link = link;
            this.key = key;
            this.accessibility = accessibility;

        }

}
