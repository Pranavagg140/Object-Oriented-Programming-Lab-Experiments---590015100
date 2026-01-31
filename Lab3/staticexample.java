class staticexample {
    static int count = 0;   // static variable

    staticexample() {
        count++;
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        staticexample obj1 = new staticexample();
        staticexample obj2 = new staticexample();
        staticexample obj3 = new staticexample();
    }
}
