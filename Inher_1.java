// Create a superclass Vehicle with a method move(), and two subclasses, Car and Bicycle, each overriding the move() method with specific behaviors.

class Vehicle {
    void move(){
        System.out.println("This is Vehicle Superclass");
    }
}

class Car extends Vehicle {
    @Override
    void move (){
        System.out.println("This is Car Subclass");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move (){
        System.out.println("This is Bicycle Subclass");
    }
}

public class Inher_1{
    public static void main(String[] args){
            Vehicle vehicle = new Vehicle();
            Car car = new Car();
            Bicycle bi = new Bicycle();
            car.move();
            vehicle.move();
            bi.move();
    }
}



