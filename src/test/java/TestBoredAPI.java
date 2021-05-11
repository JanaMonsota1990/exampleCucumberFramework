import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestBoredAPI {
    @Test
    @DisplayName("connectionBoredAPIdemo Test")
    public void connectionBoredAPIdemo() throws IOException {
        JavaHttpURLConnectionDemo connectionDemo = new JavaHttpURLConnectionDemo();
        System.out.println(connectionDemo);
    }


}
