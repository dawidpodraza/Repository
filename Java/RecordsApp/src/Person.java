public record Person(
        String firstName,
        String LastName,
        int age
) {
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age;
    }
}


