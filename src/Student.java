public class Student {
    String birthday;
    String name;
    String surname;
    int age;

    public Student(String birthday, String name, String surname, int age) {
        this.birthday = birthday;
        this.name = name;
        this.surname = surname;
        if (age > 0) {
            this.age = age;
        }
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student\n" +
                "birthday: " + birthday + "\n" +
                " name: " + name + "\n" +
                "surname: " + surname + "\n" +
                " age: " + age;
    }
}
