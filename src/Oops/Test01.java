package Oops;

//Object and Class Example: main outside the class
class Student {
    int id = 10;
    String name = "sk";
}

class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
