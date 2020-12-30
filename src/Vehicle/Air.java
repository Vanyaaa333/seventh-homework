package Vehicle;

public class Air {

    public static double wingSpan;
    public static int minLengthOfRunwayStrip;

    public Air(double wingSpan, int minLengthOfRunwayStrip) {
        this.wingSpan = wingSpan;
        this.minLengthOfRunwayStrip = minLengthOfRunwayStrip;
    }

    public static double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public static int getMinLengthOfRunwayStrip() {
        return minLengthOfRunwayStrip;
    }

    public void setMinLengthOfRunwayStrip(int minLengthOfRunwayStrip) {
        this.minLengthOfRunwayStrip = minLengthOfRunwayStrip;
    }
}
