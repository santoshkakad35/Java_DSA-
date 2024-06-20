package Main;

import java.util.*;

public class main {
     public  static void main(String[] args) {
          Student s = new Student();
          s.rno = 89;
          s.marks = 90;
          s.name = "santosh";

          System.out.println(s.marks);
          System.out.println(s.rno);
          System.out.println(s.name);
     }


}

class Student {
     int rno;
     String name;
     float marks;
}
