public class CardioExercise extends Exercise {
    private int minutes;
    private String intensity;

    public CardioExercise(String name, String muscularGroup, int minutes, String intensity) {
        super(name, muscularGroup);
        this.minutes = minutes;
        this.intensity = intensity;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @Override
    public String exhibitDetails() {
        return this.getName() + " - " + this.minutes + " Minutes " + " - " +this.intensity + " intensity";
    }
}
