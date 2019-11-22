package ua.edu.ucu;


class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object elem) {

        if (!(elem instanceof Student)) {
            return false;
        }
        Student student1 = (Student) elem;
        // if (comparee.hashCode() != this.hashCode())
        // {
        // return false;
        // }
        return student1.GPA == GPA && year == student1.year && surname.equals(student1.surname)
                && name.equals(student1.name);
    }

    @Override
    public int hashCode() {
        return (getName().hashCode() + getSurname().hashCode() + (int) (getGPA() * 100) + getYear()) % 2147483647;
    }

}
