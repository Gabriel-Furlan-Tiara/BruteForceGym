public class StrengthExercise extends Exercise {
    private int series, reps;
    private double weightKg;

    public StrengthExercise(String name, String muscularGroup, int series, int reps, double weightKg) {
        super(name, muscularGroup);
        this.series = series;
        this.reps = reps;
        this.weightKg = weightKg;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public String exhibitDetails() {
        return getName() + " - " + getMuscularGroup() + " - " + this.series+"x"+this.reps + " - " + this.weightKg + "Kg";
    }
}
