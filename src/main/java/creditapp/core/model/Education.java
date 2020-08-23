package creditapp.core.model;

public enum Education {
    NONE(-200),
    PRIMARY(-100),
    MIDDLE,
    SECONDARY,
    POST_SECONDARY,
    TERTIARY(100);


    private final int scoringPoints;

    Education(){
        this.scoringPoints = 0;
    }


    Education(int scoringPoints) {
        this.scoringPoints = scoringPoints;
    }

    public int getScoringPoints() {
        return scoringPoints;
    }
}
