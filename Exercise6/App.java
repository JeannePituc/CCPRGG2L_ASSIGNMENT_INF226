public class App {
    public static void main(String[] args) throws Exception {

//item in a form of a toothbrush
//polymorphic variable
GroceryItem item1 = new Toothbrush ();
item1.name = "Oral B";
item1.showItemName();

// item in a form of a toothpaste
GroceryItem item2 = new Toothpaste () ;
item2.name = "Colgate";
item2.showItemName();
System.out.println();

// cashier object
Cashier c1 = new Cashier();
item1.price = 60.00;
c1.showPrice(item1);

item2.price = 75.00;
c1.showPrice(item2);
System.out.println();


//polymorphic parameter
c1.checkOut(item1);
c1.checkOut(item2);
System.out.println();

//Polymorphic array
GroceryItem[] itemArray = new GroceryItem[2];

itemArray[0] = item1;
itemArray[1] = item2;

double totalAmount = 00.0;
for (int i = 0; i < itemArray.length; i++) {
    itemArray[i].showItemName();
    totalAmount = totalAmount + itemArray[i].price;
    //totalAmount += itemArray[i].price;
}
System.out.println("You have to pay " + "₱" + totalAmount + ",Please prepare exact amount.");
System.out.println();

Dog myDog = new Dog();
myDog.eat();

    }
}


