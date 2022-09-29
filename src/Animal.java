public class Animal {

    //fields
    private String animalType;
    private String personalName;
    private Gender gender;
    private int age;

    //constructor
    public Animal(String animalType, String personalName, Gender gender, int age) {
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
        return gender.toString();
    }

    public int getAge() {
        return age;
    }

}
