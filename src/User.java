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
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Double getIMC() {
        return IMC;
    }

    public void setIMC(Double IMC) {
        this.IMC = IMC;
    }

    public Double getLowBMI() {
        return LowBMI;
    }

    public void setLowBMI(Double lowBMI) {
        LowBMI = lowBMI;
    }

    public Double getHighBMI() {
        return highBMI;
    }

    public void setHighBMI(Double highBMI) {
        this.highBMI = highBMI;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Height=" + Height +
                ", Weight=" + Weight +
                ", IMC=" + IMC +
                ", LowBMI=" + LowBMI +
                ", highBMI=" + highBMI +
                '}';
    }

    /**
     * Method that returns the age difference between two Users
     * @param user1
     * @param user2
     * @return the difference between two Users
     */
    public int AgeDif (User user1, User user2){
        int dif = Math.abs (user1.getAge() - user2.getAge());

        return  dif;

    }
    /**
     *
     * @param user
     * @return User IMC(BMI)
     */
    public Double CalculateIMC (User user){
        user.IMC = user.getWeight()/ (user.getHeight()*user.getHeight()) ;
        return IMC;
    }

    /**
     *
     * @param user
     * @return the Degree of Obisity of the user
     */
    public int calculateDegreeOfObesity(User user){
        Double BMI = user.getIMC();

        if (BMI > 25) {
            System.out.println("Obese");
            return 3;
        } else if (18 > BMI) {
            System.out.println("Skinny");
            return 1;
        } else {
            System.out.println("Healthy");
            return 2;
        }
    }

    /**
     * Checks if an user is Healthy
     * @param user
     */
    public void checkHealthy(User user){
        if(calculateDegreeOfObesity(user) == 2){
            System.out.println("User is Healthy");
        }else{
            System.out.println("User is not Healthy");
        }
    }

    /**
     * checks the younger of 2 users
     * @param user1
     * @param user2
     */
    public void youngerUser (User user1, User user2){
        if(AgeDif(user1,user2) == 0){
            System.out.println("Users have the same age");
        }else{
            if(user1.getAge() > user2.getAge()){
                System.out.println(user2.getName() + "is the youngest");
            }else{
                System.out.println(user1.getName() + "is the youngest");
            }
        }
    }
}