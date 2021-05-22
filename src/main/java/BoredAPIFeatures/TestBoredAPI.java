package BoredAPIFeatures;


import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class TestBoredAPI {
    @Test
    //@DisplayName("Price Test")
    public void connectionBoredAPIdemo_Price() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        Assert.assertEquals(0,connectionDemo.getPrice());
    }

    @Test
    //@DisplayName("Activity Test")
    public void connectionBoredAPIdemo_Activity() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        System.out.println(connectionDemo.getActivity());
        Assert.assertFalse(connectionDemo.getActivity().equalsIgnoreCase("Listen to music you heard alot"));
    }

    @Test
    //@DisplayName("Participants Test")
    public void connectionBoredAPIdemo_Participants() throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connectionDemo = new JavaHttpURLConnectionDemoBoredAPi();
        int participantsNmbr = parseInt(connectionDemo.getParticipants());
        Assert.assertTrue("should be more than 1 participant", participantsNmbr > 0);
    }



}
