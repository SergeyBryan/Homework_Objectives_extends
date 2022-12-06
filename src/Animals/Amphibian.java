package Animals;

import java.util.Objects;

public final class Amphibian extends Animal {
    private String place;

    public Amphibian(String place, String name, int age) {
        super(name, age);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    protected final void setPlace(String place) {
        this.place = place;
    }

    public void hunt() {
        System.out.println(getName() + " начинает охотиться");
    }

    public void sleep() {
        System.out.println(getName() + " начинает спать");
    }

    public void eat() {
        System.out.println(getName() + " начинает кушать");
    }

    public void move() {
        System.out.println(getName() + " начинает перемещаться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian that = (Amphibian) o;
        return Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place);
    }

    @Override
    public String toString() {
        return "Животное относится к земноводным, название животного " + getName() + ", возвраст: "+ getAge() + "год, место обитания: "+ getPlace();
    }
}

