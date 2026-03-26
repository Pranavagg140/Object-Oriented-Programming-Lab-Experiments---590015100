import java.util.*;

public class sortedset{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SortedSet<Integer> set = new TreeSet<>();

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
                    set.add(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    if(set.remove(sc.nextInt()))
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
                        set.add(sc.nextInt());
                        System.out.println("Updated");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Sorted Elements:");
                    for(int num : set)
                        System.out.println(num);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    if(set.contains(sc.nextInt()))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;

            }

        } while(choice != 6);

        sc.close();
    }
}