package Animals;

import java.util.Objects;

public class Flying extends Bird {
    private String typeOfMove;

    public Flying(String name, int age, String place, String typeOfMove) {
        super(name, age, place);
        if (typeOfMove == null) {
            this.typeOfMove = "Не указано";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    public final void setTypeOfMove(String typeOfMove) {
        this.typeOfMove = typeOfMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMove, flying.typeOfMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMove);
    }

    @Override
    public String toString() {
        return "Животное относится к летающей птице, название животного " + getName() + ", возвраст: "+ getAge() + "год, место обитания: "+ getPlace() + ", передвигается "+getTypeOfMove()+ " способом.";
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void hunting() {
        super.hunting();
    }

    public void flying() {
        System.out.println(getName() + " взлетает и летит.");
    }
}