package Oops.Encapsulations;


class Student {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(21);
        s1.setName("sk");

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
