public enum Gender {

    //enumerators
    MALE("male"), FEMALE("female");

    //fields
    private final String value;

    //constructor
    private Gender(String value) {
        this.value = value;
    }

    //to convert variable type from Enum to String
    @Override
    public String toString() {
        return this.value;
    }

}
