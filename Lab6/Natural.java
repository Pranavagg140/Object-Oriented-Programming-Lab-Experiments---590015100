package Lab6;
class NumberThread extends Thread {

    int start, end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Natural {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1, 5);
        NumberThread t2 = new NumberThread(6, 10);

        t1.start();

        try {
            t1.join();   // wait until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}
