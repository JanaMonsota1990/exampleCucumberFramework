package BoredAPIFeatureTests;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import jdk.swing.interop.SwingInterOpUtils;
import BoredAPIFeatures.JavaHttpURLConnectionDemoBoredAPi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestBoredAPI {
    @Test
    @DisplayName("Price Test")
    public void connectionBoredAPIdemo_Price() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        assertEquals(0,connectionDemo.getPrice());
    }

    @Test
    @DisplayName("Activity Test")
    public void connectionBoredAPIdemo_Activity() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        assertFalse(connectionDemo.getActivity().equalsIgnoreCase("Listen to music you heard alot"));
    }

    @Test
    @DisplayName("Participants Test")
    public void connectionBoredAPIdemo_Participants() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        int participantsNmbr = parseInt(connectionDemo.getParticipants());
        assertTrue(participantsNmbr > 0,"should be more than 1 participant");
    }



}
