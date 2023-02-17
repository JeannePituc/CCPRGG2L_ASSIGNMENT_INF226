public class App {
    public static void main(String[] args) throws Exception {

        Person me = new Person ();

      //  System.out.print(me.name);
      
      //set method 
      me.setName("jeanne");

      //get method
      System.out.println(me.getName());

      //daughter object
      Daughter myself = new Daughter ();

      System.out.println(myself.surname);

      myself.showSurname();
    }
}
