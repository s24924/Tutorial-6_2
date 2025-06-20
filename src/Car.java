public class Car extends Vehicle {

        private int numberOfSeats;

        public Car(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }
        public int getNumberOfSeats() {
            return this.numberOfSeats;
        }
    @Override
    public void start() {
        System.out.println("The car's engine has started.");
    }
    @Override
    public void stop() {
        System.out.println("The car's engine has stopped.");
    }
}
