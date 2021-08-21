package August2021;

public class Inheritance_03 {

    public class Car {

        private String model;
        private int maxSpeed;
        private int yearOfManufacture;

        public Car(String model, int maxSpeed, int yearOfManufacture) {
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.yearOfManufacture = yearOfManufacture;
        }
    }

    public class Truck extends Car {

        public Truck(String model, int maxSpeed, int yearOfManufacture) {
            super(model, maxSpeed, yearOfManufacture);
        }
    }

    public class Sedan extends Car {
        public Sedan(String model, int maxSpeed, int yearOfManufacture) {
            super(model, maxSpeed, yearOfManufacture);
        }
    }
}
