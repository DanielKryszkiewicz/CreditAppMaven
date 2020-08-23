package creditapp.core.model;

public enum MartialStatus {
    SINGLE,
    MARRIED(100),
    DIVORCED,
    SEPARATED(100),
    WIDOWED;


    private final int scoringPoints;

    MartialStatus(){
        this.scoringPoints = 0;
    }


    MartialStatus(int scoringPoints) {
        this.scoringPoints = scoringPoints;
    }

    public int getScoringPoints() {
        return scoringPoints;
    }
}
