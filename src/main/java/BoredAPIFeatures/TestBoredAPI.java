package BoredAPIFeatures;

import static java.lang.Integer.parseInt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestBoredAPI {
    @Test
    @DisplayName("Price Test")
    public void connectionBoredAPIdemo_Price() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        Assertions.assertEquals(0,connectionDemo.getPrice());
    }

    @Test
    @DisplayName("Activity Test")
    public void connectionBoredAPIdemo_Activity() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        System.out.println(connectionDemo.getActivity());
        Assertions.assertFalse(connectionDemo.getActivity().equalsIgnoreCase("Listen to music you heard alot"));
    }

    @Test
    @DisplayName("Participants Test")
    public void connectionBoredAPIdemo_Participants() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        int participantsNmbr = parseInt(connectionDemo.getParticipants());
        Assertions.assertTrue(participantsNmbr > 0,"should be more than 1 participant");
    }



}
