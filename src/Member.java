import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private double weight, height;
    private List<Exercise> exercises;

    public Member(int id, String name, String email, double weight, double height) {
        super(id, name, email);
        this.weight = weight;
        this.height = height;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return super.toString() + " Member{" +
                "weight=" + weight +
                ", height=" + height +
                ", workouts=" + exercises +
                '}';
    }
}