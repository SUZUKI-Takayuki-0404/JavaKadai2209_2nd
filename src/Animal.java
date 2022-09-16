public class Animal {

    //fields
    private String animalType;
    private String personalName;
    private String gender;
    private int age;

    //constructor
    public Animal(String animalType, String personalName, String gender, int age) {
        this.animalType = animalType;
        this.personalName = personalName;
        this.gender = gender;
        this.age = age;
    }

    //methods
    public String getAnimalType() {
        return animalType;
    }

    public String getPersonalName() {
        return personalName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
