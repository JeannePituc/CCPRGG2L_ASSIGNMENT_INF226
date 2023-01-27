public class Car {
    //attributes
    String model;
    String color;
    Person owner; 

    //constructors
    Car(String carModel, String carColor, Person ownerName) {
        this.model = carModel;
        this.color = carColor;
        this.owner = ownerName;
    }
    
    //method
    void carOwner() {
        System.out.println(owner.name + " owns this " + color + " "+ model);
    
    }


}

