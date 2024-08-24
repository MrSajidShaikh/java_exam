public class ascending_order {
    public static void main(String[] args) {

        int [] arr = new int [] {9, 2, 8, 3, 4, 7, 1,0};
        int temp = 0;

        System.out.println("Element of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Element of array sorted in ascending order : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
