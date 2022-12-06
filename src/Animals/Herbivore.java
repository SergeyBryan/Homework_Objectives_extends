package Animals;

public final class Herbivore extends Mammal {
    private String typeOfFood;

    public Herbivore(String name, int age, String place, int movementSpeed, String typeOfFood) {
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
    public void walking() {
        System.out.println(getName() + " гуляет");
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
        System.out.println(getName() + " двигается");
    }

    public void pasture() {
        System.out.println(getName() + " пасется");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Животное относится к млекопитающим травоядным, название животного " + getName() + ", возвраст: "+ getAge() + "год, место обитания: "+ getPlace() + ", питается "+getTypeOfFood()+ ", скорость передвижения " + getMovementSpeed();
    }
}

