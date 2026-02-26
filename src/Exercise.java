public abstract class Exercise {
    private String name, muscularGroup;

    public Exercise(String name, String muscularGroup) {
        this.name = name;
        this.muscularGroup = muscularGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscularGroup() {
        return muscularGroup;
    }

    public void setMuscularGroup(String muscularGroup) {
        this.muscularGroup = muscularGroup;
    }

    public abstract String exhibitDetails();

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", muscularGroup='" + muscularGroup + '\'' +
                '}';
    }
}
