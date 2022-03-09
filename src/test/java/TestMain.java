import org.junit.jupiter.api.Test;

public class TestMain {

  @Test
  public void test() {
    Main main = new Main();
    int rewardPoints = main.getPointsForSleepData("1000", "09March2022");
    System.out.println(rewardPoints);
  }

}
