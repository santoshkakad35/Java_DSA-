package Test00;

class Constructor {
    String name;
    int regNo;

    Constructor(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    Constructor(Constructor c1) {
        name = c1.name;
        regNo = c1.regNo;
    }

    void display() {
        System.out.println(name+" "+regNo);
    }
}

class First {
    public static void main(String[] args) {
        Constructor c1 = new Constructor("sk", 21071028);
        Constructor c2 = new Constructor(c1);
        c1.display();
        c2.display();
    }
}
