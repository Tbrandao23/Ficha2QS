// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class User {
    /**
     * Variables
     */
    String Name ;
    String Gender;
    int Age;
    Double Height;
    Double Weight;
    Double IMC = 0.0;
    Double LowBMI = 0.0;
    Double highBMI = 0.0;

    /**
     * Empty Constructor
     */
    public User() {

    }

    /**
     * Simple Constructor
     * @param name
     * @param age
     */
    public User(String name, int age) {
        Name = name;
        Age = age;

    }

    /**
     * Complete Constructor
     * @param name
     * @param gender
     * @param age
     * @param height
     * @param weight
     */
    public User(String name, String gender, int age, Double height, Double weight) {
        Name = name;
        Gender = gender;
        Age = age;
        Height = height;
        Weight = weight;
    }
}