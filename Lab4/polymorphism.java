class Subject {
    int sum(int a, int b) {
        return a + b;
    }
}

class Maths extends Subject {
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class polymorphism {
    public static void main(String[] args) {

        Subject s = new Subject();
        System.out.println("Subject Sum: " + s.sum(4, 5));

        Maths m = new Maths();
        System.out.println("Maths Sum: " + m.sum(4, 5, 9));
    }
}
