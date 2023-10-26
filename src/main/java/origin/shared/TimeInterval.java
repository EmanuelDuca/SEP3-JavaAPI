package origin.shared;

public class TimeInterval {
    private final String startDate;
    private final String endDate;

    public TimeInterval(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
