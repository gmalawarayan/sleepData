import java.util.HashMap;
import java.util.Map;

public class Main {

  private final Map<String, String> dateWithSleepHours = new HashMap<>();
  int rewardPoints = 0;

  public static void main(String[] args) {
    Main main = new Main();
    int rewardPoints = main.getPointsForSleepData("1000", "09March2022");
  }

  public int getPointsForSleepData(String sleepminutes, String dateForWhichSleepDataIsProvided) {
    int sleepTarget = 8;
    int incomingSleepHours = ((Integer.parseInt(sleepminutes) / 60));
    dateWithSleepHours.put(dateForWhichSleepDataIsProvided, sleepminutes);
    if (dateWithSleepHours.size() < 3) {
      if (incomingSleepHours >= sleepTarget) {
        rewardPoints = incomingSleepHours * 1;
      }
    } else {
      if (incomingSleepHours == sleepTarget) {
        rewardPoints = incomingSleepHours * 5;
      }
    }
    return rewardPoints;
  }
}
