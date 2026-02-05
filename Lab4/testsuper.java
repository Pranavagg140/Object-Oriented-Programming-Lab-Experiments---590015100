class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();   // first call to constructoree of parent class
    //super();   
        System.out.println("Child Constructor");
    }
}

public class testsuper {
    public static void main(String[] args) {
        Child pranav = new Child();
    }
}
