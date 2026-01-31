class nonstaticexample {
    int count = 0;   // non-static variable

    nonstaticexample() {
        count++;
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        nonstaticexample obj1 = new nonstaticexample();
        nonstaticexample obj2 = new nonstaticexample();
        nonstaticexample obj3 = new nonstaticexample();
    }
}
