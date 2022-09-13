import static java.util.Arrays.copyOfRange;
import static java.util.stream.IntStream.range;

public class Solution {
  public static int[] rowWeights(int[] weights) {
    range(2, weights.length).forEach(i -> weights[i % 2] += weights[i]);
    return copyOfRange(weights, 0, 2);
  }
}
