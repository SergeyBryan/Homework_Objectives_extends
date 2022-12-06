package Animals;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private String place;
    private int movementSpeed;

    public Mammal(String name, int age, String place, int movementSpeed) {
        super(name, age);
        if (place == null) {
            this.place = "не указано";
        } else {
            this.place = place;
        }
        if (movementSpeed <= 0) {
            this.movementSpeed = 1;
        } else {
            this.movementSpeed = movementSpeed;
        }

    }

    public String getPlace() {
        return place;
    }

    public final void setPlace(String place) {
        this.place = place;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public final void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return movementSpeed == mammal.movementSpeed && Objects.equals(place, mammal.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place, movementSpeed);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "place='" + place + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }

    protected abstract void walking();
}
