// File: Animal.java
    public abstract class Animal {

        // A concrete method shared by all animals.
        public void sleep() {
            System.out.println("The animal is sleeping.");
        }

        // Abstract methods to be implemented by subclasses.
        public abstract void makeNoise();
        public abstract void roam();
    }
