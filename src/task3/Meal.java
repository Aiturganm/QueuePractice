package task3;

public class Meal {
    private String name;
    private String nationalCuisine;

    public Meal(String name, String nationalCuisine) {
        this.name = name;
        this.nationalCuisine = nationalCuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCuisine() {
        return nationalCuisine;
    }

    public void setNationalCuisine(String nationalCuisine) {
        this.nationalCuisine = nationalCuisine;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", nationalCuisine='" + nationalCuisine + '\'' +
                '}';
    }
}
