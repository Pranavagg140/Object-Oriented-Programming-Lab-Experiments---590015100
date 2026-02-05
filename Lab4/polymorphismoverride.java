class Subject {
    int sum(int a, int b) {
        return a + b;
    }
}

class BMW extends Subject {
    int sum(int a, int b) {
        return a - b;
    }

    int display() {
        Subject v = new BMW();
        return v.sum(4, 5);
    }
}

class polymorphismoverride {
    public static void main(String args[]) {
        Subject d = new Subject();
        BMW b = new BMW();

        System.out.println(b.sum(7, 3));
        System.out.println(b.display());
    }
}
