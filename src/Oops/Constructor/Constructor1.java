package Oops.Constructor;
//**** constructor inside the class

//public class Constructor1 {
//    int  x;
//    public Constructor1() {
//        x = 5;
//    }
//
//    public static void main(String[] args) {
//        Constructor1 myObj = new Constructor1(); // Create an object of class Main (This will call the constructor)
//        System.out.println(myObj.x);
//    }
//}


//**** constructor outside the class

class Constructor {
    int x;

    public Constructor() {
        x = 10;
    }
}

class Constructor1 {
    public static void main(String[] args) {
        Constructor obj = new Constructor(); // Creating an object of Constructor
        System.out.println(obj.x);          // Output: 10
    }
}
