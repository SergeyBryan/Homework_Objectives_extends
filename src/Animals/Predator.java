package Animals;

import java.util.Objects;

public final class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String name, int age, String place, int movementSpeed, String typeOfFood) {
        super(name, age, place, movementSpeed);
        if (typeOfFood == null) {
            this.typeOfFood = "не указано";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public final void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Животное относится к млекопитающим хищникам, название животного " + getName() + ", возвраст: "+ getAge() + "год, место обитания: "+ getPlace() + ", питается "+getTypeOfFood()+ ", скорость передвижения " + getMovementSpeed();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println(getName() + " передвигается");

    }

    @Override
    public void walking() {
        System.out.println(getName() + " гуляет");
    }

    public void hunting() {
        System.out.println(getName() + " охотится на кого-то");
    }
}
