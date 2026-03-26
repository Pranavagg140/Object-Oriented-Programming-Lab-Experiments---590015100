import java.util.*;

public class set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int choice;

        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Traversal");
            System.out.println("5.Search");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int insert = sc.nextInt();
                    set.add(insert);
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    if(set.remove(del))
                        System.out.println("Deleted");
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    System.out.print("Enter old element: ");
                    int oldVal = sc.nextInt();
                    if(set.contains(oldVal)) {
                        set.remove(oldVal);
                        System.out.print("Enter new element: ");
                        int newVal = sc.nextInt();
                        set.add(newVal);
                        System.out.println("Updated");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    System.out.println("Set elements:");
                    for(int num : set) {
                        System.out.println(num);
                    }
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    if(set.contains(search))
                        System.out.println("Element Found");
                    else
                        System.out.println("Element Not Found");
                    break;

            }

        } while(choice != 6);

        sc.close();
    }
}