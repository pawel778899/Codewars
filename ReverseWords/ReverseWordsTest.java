import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords("apple"));
        assertEquals("a b c d", Kata.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
    }
}
