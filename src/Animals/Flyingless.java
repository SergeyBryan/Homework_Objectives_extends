package Animals;

import java.util.Objects;

public final class Flyingless extends Bird {
    private String typeOfMove;

    public Flyingless(String name, int age, String place, String typeOfMove) {
        super(name, age, place);
        if (typeOfMove == null) {
            typeOfMove = "не указано";
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
        if (!super.equals(o)) return false;
        Flyingless flyingless = (Flyingless) o;
        return Objects.equals(typeOfMove, flyingless.typeOfMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMove);
    }

    @Override
    public String toString() {
        return "Животное относится к нелетающей птице, название животного " + getName() + ", возвраст: "+ getAge() + "год, место обитания: "+ getPlace() + ", передвигается "+getTypeOfMove()+ " способом.";
    }

    @Override
    protected void eat() {
        super.eat();
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

    public void walking() {
        System.out.println(getName() + " гуляет");
    }
}
