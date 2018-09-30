package lab2;
import components.Person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person();
        people[1] = new Person("Test", true);
        people[2] = new Person("Anonim", false, 28);
        people[3] = new Person(people[1]);

        for (int i = 0; i < people.length; i++) {
            people[i].print();
        }
        System.out.println("\nAverage age = " + Person.getAverageAge());
        System.out.println("Male number = " + Person.getMaleNumber());
        System.out.println("People number = " + Person.getNumber());
    }
}
