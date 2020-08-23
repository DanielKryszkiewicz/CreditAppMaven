package creditapp.core.scoring;

public class ScoringUtils {

    public static String getPointsString(int points){
        return points > 0 ? "(+"+points+" points)" : " ("+points+" points";
    }
}

