package components;

public class Person {
    private int age;
    private String lastName;
    private boolean male;
    static private int counter = 0;
    static private int maleCounter = 0;
    static private int ageCounter = 0;

    public Person() {
        counter++;
    }

    public Person(String lastName, boolean male) {
        int age = 19;
        this.age = age;
        this.lastName = lastName;
        this.male = male;
        counter++;
        maleCounter += male ? 1 : 0;
        ageCounter += age;
    }

    public Person(String lastName, boolean male, int age) {
        this.lastName = lastName;
        this.male = male;
        this.age = age;
        counter++;
        maleCounter += male ? 1 : 0;
        ageCounter += age;
    }

    public Person(Person obj) {
        this.lastName = obj.lastName;
        this.male = obj.male;
        this.age = obj.age;
        counter++;
        maleCounter += obj.male ? 1 : 0;
        ageCounter += obj.age;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMale() {
        return male;
    }

    static public int getNumber() {
        return counter;
    }

    static public int getMaleNumber() {
        return maleCounter;
    }

    static public int getAverageAge() {
        return ageCounter / counter;
    }

    public void print() {
        System.out.println("\nLast name: " + lastName);
        System.out.println("Sex: " + (male ? "Male" : "Female"));
        System.out.println("Age: " + age);
    }
}
