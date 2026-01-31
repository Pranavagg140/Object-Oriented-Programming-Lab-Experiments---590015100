class parent {
    int x = 10;
}

class Child extends parent {
    int x = 20;

    void show() {
        System.out.println("Child x using this: " + this.x);
        System.out.println("Parent x using super: " + super.x);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
