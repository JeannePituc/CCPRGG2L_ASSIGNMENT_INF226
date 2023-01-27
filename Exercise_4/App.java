public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");

        // person object
        Person Me = new Person ("Jeanne", 19);
        // person object
        Person Friend = new Person ("Klar", 69);

        Me.addFriend(Friend);

        //pet object
        Pet Dog = new Pet ("Kobe", 4, Me);
        Dog.showOwner();

        //classmate object
        Person classmate = new Person ("Aalliyah");
        Person classmate2 = new Person ("Bianca");
        Person classmate3 = new Person ("Jennifer");
       Me.addClassmate(classmate);
       Me.addClassmate(classmate2);
       Me.addClassmate(classmate3);

       //car object
       Car carOwn = new Car ("Honda Civic", "red", Me);
      carOwn.carOwner();

    }

}
