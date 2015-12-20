import com.orcestr.Piano;
import com.orcestr.Pipep;
import com.orcestr.Violin;
import org.junit.Test;

//import java.nio.channels.Pipe;

import static org.junit.Assert.assertEquals;

/**
 * Created by superova on 19.12.2015.
 */
public class TestOrc {
    @Test

    public void testOrc1() throws Exception {
        Violin viol = new Violin();
        viol.play();
    }

    @Test

    public void testOrc2() throws Exception {
        Pipep pipe = new Pipep();
        pipe.play();
    }

    @Test

    public void testOrc3() throws Exception {
        Piano piano = new Piano();
        piano.play();
    }
}
