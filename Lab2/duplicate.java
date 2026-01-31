class duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2};

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }
        }

        if (duplicate)
            System.out.println("Array contains duplicate elements");
        else
            System.out.println("Array does not contain duplicates");
    }
}
