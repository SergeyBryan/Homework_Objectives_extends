package Animals;

import java.util.Objects;

public class Bird extends Animal {
    private String place;

    protected Bird(String name, int age, String place) {
        super(name, age);
        if (place == null) {
            this.place = "не указано";
        } else {
            this.place = place;
        }
    }

    public String getPlace() {
        return place;
    }

    protected final void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(place, bird.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place);
    }

    @Override
    public String toString() {
        return "Птица";
    }

    @Override
    protected void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    protected void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    protected void move() {
        System.out.println(getName() + " передвигается");
    }

    protected void hunting() {
        System.out.println(getName() + " охотится на кого-то");
    }
}
