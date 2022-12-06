import Animals.*;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f);
        Car audiA8 = new Car("Audi", "A8 L TDI quattro", 2020, "Германия", "черный", 3f);
        Car bmwz8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3f);
        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);
        Car.printCarInfo(audiA8);
        Car.printCarInfo(kiaSportage4);
        Train lastochka = new Train(
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажириский",
                11,
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                301
        );
        Train leningrad = new Train(
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград-Пассажириский",
                8,
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                270
        );
        Train.printTrainInfo(lastochka);
        Train.printTrainInfo(leningrad);
        Bus cityBus = new Bus("Liaz", "Model 2019", 2019, "Россия", "синий", 200);
        Bus tourBus = new Bus("Mercedes", "Citaro", 2015, "Germany", "белый", 320);
        Bus travelBus = new Bus("Liaz", "Model 2015", 2017, "Россия", "зеленый", 67);
        Bus.printBusInfo(cityBus);
        Bus.printBusInfo(tourBus);
        Bus.printBusInfo(travelBus);
        System.out.println(leningrad.fuelPercentage);
        leningrad.refill();
        System.out.println(leningrad.fuelPercentage);
        System.out.println(audiA8.fuelPercentage);
        audiA8.refill();
        System.out.println(audiA8.fuelPercentage);
        Amphibian frog = new Amphibian("Болото", "Лягушка", 1);
        Amphibian snake = new Amphibian("Хвойный лес", "Уж пресноводный", 3);
        Herbivore gazelle = new Herbivore("Газель", 6, "Степи", 40, "цветы");
        Herbivore horse = new Herbivore("Лошадь", 10, "Шотландия", 60, "сено");
        Herbivore giraffe = new Herbivore("Жираф", 8, "Степи", 54, "цветы");
        Predator giena = new Predator("Гиена", 12, "Степи", 64, "мясо травоядного");
        Predator tiger = new Predator("Тигр", 15, "Степи", 65, "мясо травоядного");
        Predator bear = new Predator("Медведь", 10, "Сибирский лес", 40, "");
        Flyingless pavlin = new Flyingless("Павлин", 5, "Степи", "Пешим");
        Flyingless pingouin = new Flyingless("Пингвин", 2, "Антарктида", "Пешим");
        Flyingless dodoBird = new Flyingless("Птица додо", 3, "Остров", "Пешим");
        Flying seagull = new Flying("Чайка", 3, "Москва", "Летает");
        Flying diomedea = new Flying("Альбатрос", 5, "Южный океан", "Летает");
        Flying falcon = new Flying("Сокол", 1, "Волгоградская область", "Летает");
        falcon.flying();
        diomedea.sleep();
        seagull.hunting();
        dodoBird.walking();
        pingouin.move();
        pavlin.sleep();
        bear.move();
        tiger.eat();
        giena.hunting();
        giraffe.eat();
        horse.pasture();
        gazelle.sleep();
        snake.hunt();
        frog.move();
        System.out.println((check(frog,giraffe)) ? "животные из одного семейства" : "животные из разных семейств");
        System.out.println((check(horse,giraffe))? "животные из одного семейства" : "животные из разных семейств");
        System.out.println((check(horse,giena))? "животные из одного семейства" : "животные из разных семейств");
        System.out.println((check(pingouin,dodoBird))? "животные из одного семейства" : "животные из разных семейств");
        System.out.println(frog);
        System.out.println(gazelle);
        System.out.println(giena);
        System.out.println(dodoBird);
        System.out.println(seagull);
        lastochka.setPrice(200);
        Train.printTrainInfo(lastochka);
    }

    public static boolean check(Object obj, Object obj1) {
        if(obj == null || obj1 == null) return false;
        boolean b =obj.getClass().hashCode() == obj1.getClass().hashCode();
        return b;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}