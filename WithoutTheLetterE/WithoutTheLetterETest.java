import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WithoutLetterETest {

  @Test
  public void findE() {
    assertEquals("Should return \"There is no \"e\".\"", "There is no \"e\".", WithoutLetterE.findE("actual"));
    assertEquals("Should return \"1\"", "1", WithoutLetterE.findE("e"));
    assertEquals("Should return \"1\"", "1", WithoutLetterE.findE("English"));
    assertEquals("Should return \"4\"", "4", WithoutLetterE.findE("English exercise"));
    assertEquals("Should return \"\"", "", WithoutLetterE.findE(""));
    assertEquals("Should return null", null, WithoutLetterE.findE(null));
  }
}
