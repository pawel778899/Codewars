import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
  
    @Test
    public void basicTest() {
        assertEquals("Woohoo!", BumpsTheRoad.bumps("n"));
        assertEquals("Woohoo!", BumpsTheRoad.bumps("__nn_nnnn__n_n___n____nn__nnn"));
        assertEquals("Woohoo!", BumpsTheRoad.bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        assertEquals("Car Dead", BumpsTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        assertEquals("Woohoo!", BumpsTheRoad.bumps("______n___n_"));
        assertEquals("Car Dead", BumpsTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }
}
