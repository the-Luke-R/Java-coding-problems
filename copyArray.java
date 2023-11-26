public class copyArray {
    public static void main(String[] args) {
        int[] originalArray = new int[] {2, 5, 7, 9, 10};
        int[] copyArray = new int[originalArray.length];

        // display original array
        System.out.println("Elements of first array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println(originalArray[i] + " ");
        }

        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        //Displaying elements of secondArray
        System.out.println();
        System.out.println("Elements of Copied array: ");
        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(copyArray[i] + " ");
        }
    }
}
