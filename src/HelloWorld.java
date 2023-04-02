

public class HelloWorld {
    public static void main(String[] args){

        Character person1 = new Character("Ali",10,10);
        Character person2 = new Character("Musse",10,10);

        person1.sayHello();
        person2.sayHello();

        person1.walk();
        person1.attack(person2);

        person1.statusUpdate();
        person2.statusUpdate();



    }
}
