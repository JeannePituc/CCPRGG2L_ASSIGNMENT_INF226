public class Pet {
    //attributes
    String name;
    int age;
    Person owner; 

    // constructor
    Pet(String petName, int petAge, Person ownerName) {
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;

}
// method
void showOwner() {
    System.out.println("Hi! My name is "+ this.name + ", I'm a Beagle and I like eating Dentastix. My owner's name is " + owner.name);

}
}