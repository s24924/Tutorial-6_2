public class Main {
    public static void main(String[] args) {
            System.out.println("--- Demonstrating Vehicle and Car (Tasks 1 & 2) ---");
            Car myCar = new Car(5);

            System.out.println("My car has " + myCar.getNumberOfSeats() + " seats.");
            myCar.start();
            myCar.stop();

        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };
        for (Animal animal : animals) {
            animal.sleep();
            animal.makeNoise();
            animal.roam();
            System.out.println();
        }
    }
}
