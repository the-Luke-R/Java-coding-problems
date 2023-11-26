// PREMISE: find the smallest or biggest value inside the array

// to find the smallest value inside the array we create a variable that contais the first value inside the array
// this variable will be compared with each element inside the array, if it is smaller, then it becomes the value
// and keeps going through the array until it iterates through all values

public class SmallestInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {3, 8, 1, 12, 7, 99};

        int smallestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallestElement)
                smallestElement = arr[i];
        }
        System.out.println("Smallest element of given array: " + smallestElement);
    }
}

// NOTE: if you want to find the biggest value then all you have to do is change the "<" insede the loop to ">"