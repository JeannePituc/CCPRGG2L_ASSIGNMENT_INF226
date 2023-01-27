public class Person {
    String name;
    int age;

    Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    Person(String classmateName) {
        this.name = classmateName;
    }

    void addFriend(Person friend){
        System.out.println(this.name + " is friends with " + friend.name);
    }

    void addClassmate(Person classmate) {
        System.out.println(this.name + " is classmate's with " + classmate.name);
    }

    }