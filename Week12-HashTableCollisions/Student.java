class Student {
    private String firstName;
    private int idNumber;

    public Student(String firstName, int idNumber) {
        this.firstName = firstName;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
