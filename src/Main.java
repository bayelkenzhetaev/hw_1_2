public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals(2018, Colors.BLACK);
        Dogs dogs = new Dogs(2019, Colors.GREEN);
        Ovcharka ovcharka = new Ovcharka(2020, Colors.RED);
        System.out.printf("Animals: " + animals.getInfo() + "\nDogs: " + dogs.getInfo() + "\nOvcharka: " + ovcharka.getInfo());
    }
}