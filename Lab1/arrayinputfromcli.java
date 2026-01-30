
public class arrayinputfromcli {
    
    public static void main(String[] args) {
        System.out.println("Array elements are:");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}


