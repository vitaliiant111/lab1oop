public class Main {
    public static void main(String[] args) {

        int num1 = 1, num2 = 1, num3 = 1, num4 = 1, num5 = 1, num6 = 1, num7 = 1, num8 = 1, num9 = 1, num10 = 1;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        System.out.println("Дія додавання: " + sum);

        int difference = num10 - num9 - num8 - num7 - num6 - num5 - num4 - num3 - num2 - num1;
        System.out.println("Дія віднімання: " + difference);

        long product = 1L * num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
        System.out.println("Дія множення: " + product);

        double quotient = (double) num10 / num9 / num8 / num7 / num6 / num5 / num4 / num3 / num2 / num1;
        System.out.println("Дія ділення: " + quotient);


        String word1 = "Я" ;
        String word2 = " Віталік " ;
        String word3 = " мені " ;
        String word4 = " 19 " ;
        String word5 = " років " ;
        String word6 = " вчусь " ;
        String word7 = " в " ;
        String word8 = " університеті " ;
        String word9 = " Політех " ;
        String word10  = "." ;

        String sentence = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10 + " ";

        System.out.println(sentence);

        User user1 = new User(1, 15, "Naruto ", "Uzumaki", 61.5, 173.0);
        User user2 = new User(2, 16, "Sasuke ", "Uchiha", 62.0, 174.0);
        User user3 = new User(3, 15, "Sakura ", "Haruno", 49.0, 161.0);
        User user4 = new User(4, 25, "Kakashi ", "Hatake", 75.5, 182.0);
        User user5 = new User(5, 15, "Hinata ", "Hyuga", 48.0, 161.0);
        User user6 = new User(6, 16, "Shino ", "Aburame", 70.0, 173.0);
        User user7 = new User(7, 16, "Shikamaru ", "Nara", 64.0, 178.0);
        User user8 = new User(8, 34, "Asuma ", "Sarutobi", 80.0, 183.0);
        User user9 = new User(9, 37, "Rock ", "Lee", 79.0, 175.0);
        User user10 = new User(10, 100, "Obito", "Uchiha", 78.0, 174.0);


        System.out.println("Ім'я: " + "/" + user1.name + " " + user1.surname + "/" + " " + "/" + user2.name + " " + user2.surname + "/"+ " " +"/" +  user3.name + " " + user3.surname + "/" + " " + "/" + user4.name + " " + user4.surname + "/" +  " " + "/" + user5.name + " " + user5.surname + "/" +  " " + "/" + user6.name + " " + user6.surname + "/" +  " " + "/" + user7.name + " " + user7.surname + "/" +  " " + "/" + user8.name + " " + user8.surname + "/" +" " + "/" + user9.name + " " + user9.surname + "/" +" " + "/" + user10.name + " " + user10.surname +"/");

        int totalAge = user1.age + user2.age + user3.age + user4.age+ user5.age + user6.age + user7.age + user8.age + user9.age + user10.age;
        System.out.println("totalAge: " + totalAge);

        double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        System.out.println("totalWeight: " + totalWeight);

        double totalHeight = user1.height + user2.height + user3.height + user4.height + user5.height + user6.height + user7.height + user8.height + user9.height + user10.height;
        System.out.println("totalHeight: " + totalHeight);

        Car car1 = new Car(500, 5.0, "BMW", "M1", 2020, true);
        Car car2 = new Car(600, 5.5, "BMW", "M2", 2021, false);
        Car car3 = new Car(650, 5.8, "BMW", "M3", 2021, true);
        Car car4 = new Car(700, 5.0, "BMW", "M4", 2022, true);
        Car car5 = new Car(760, 5.0, "BMW", "M5", 2023, false);
        Car car6 = new Car(600, 5.4, "BMW", "M6", 2023, true);
        Car car7 = new Car(800, 5.0, "BMW", "M8", 2021, true);
        Car car8 = new Car(740, 5.5, "porshe", "911", 2022, true);
        Car car9 = new Car(550, 5.3, "porshe", "panamera", 2022, false);
        Car car10 = new Car(1000, 6.3, "renault", "megane", 2015, false);


        double totalEngineVolume = car1.engineVolume + car2.engineVolume + car3.engineVolume + car4.engineVolume + car5.engineVolume + car6.engineVolume + car7.engineVolume + car8.engineVolume + car9.engineVolume + car10.engineVolume;
        System.out.println("Значення їх об'ємів " + totalEngineVolume + " Літрів");

        int totalHorsepower = car1.horsepower + car2.horsepower + car3.horsepower + car4.horsepower + car5.horsepower + car6.horsepower + car7.horsepower + car8.horsepower + car9.horsepower + car10.horsepower;
        System.out.println("Значення їх потужностей: " + totalHorsepower + " Кінських Сил");


        int number = 412;
        int reversedNumber = reverseNumber(number);
        System.out.println("Оригінальне число: " + number);
        System.out.println("Реверснуте число: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}

class User {
    int id;
    int age;

    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}

class Car {
    int horsepower;
    double engineVolume;
    String make;
    String model;
    int year;
    boolean isAutomatic;

    public Car(int horsepower, double engineVolume, String make, String model, int year, boolean isAutomatic) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAutomatic = isAutomatic;
    }
}