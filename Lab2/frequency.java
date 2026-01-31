import java.util.Scanner;
class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 2, 4, 2, 5};

        System.out.print("Enter number to find frequency: ");
        int key = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " = " + count);
    }
}
