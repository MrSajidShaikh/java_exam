public class largest_element {
    public static void main(String args[]) {

        int arr[] = {12, 13, 1, 10, 34, 10, 50};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}