import java.util.*;

public class map {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

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
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value: ");
                    String value = sc.next();
                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to delete: ");
                    int delKey = sc.nextInt();
                    if(map.remove(delKey) != null)
                        System.out.println("Deleted");
                    else
                        System.out.println("Key not found");
                    break;

                case 3:
                    System.out.print("Enter key to update: ");
                    int upKey = sc.nextInt();
                    if(map.containsKey(upKey)) {
                        System.out.print("Enter new value: ");
                        String newVal = sc.next();
                        map.put(upKey, newVal);
                        System.out.println("Updated");
                    } else {
                        System.out.println("Key not found");
                    }
                    break;

                case 4:
                    System.out.println("Map elements:");
                    for(Map.Entry<Integer,String> e : map.entrySet()) {
                        System.out.println(e.getKey() + " -> " + e.getValue());
                    }
                    break;

                case 5:
                    System.out.print("Enter key to search: ");
                    int searchKey = sc.nextInt();
                    if(map.containsKey(searchKey))
                        System.out.println("Value = " + map.get(searchKey));
                    else
                        System.out.println("Key not found");
                    break;

            }

        } while(choice != 6);

        sc.close();
    }
}