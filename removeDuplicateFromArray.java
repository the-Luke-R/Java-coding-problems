// PREMISE: remove repeated elements from inside an array

public class removeDuplicateFromArray{
    public static int removeDuplicates(int arr[], int count){
        // lets check if the array has zero or only one value (if it does it means there are no repeated values)
      if (count==0 || count==1){
        return count;
      }
      // create a temporary array the same size of the original
      int[] temp = new int[count];
      // create a variable to keep track of index in temp array
      int j = 0;
      // Iterate from the first element to the last in the array (count - 1)
      for (int i=0; i<count-1; i++){
        // if the element is not equal to the next element (index number + 1)
        if (arr[i] != arr[i+1]){
            // If the element is not equal add it to j and increment its index number
          temp[j++] = arr[i];
        }
      }
      // After the loop we add the last element to the temp array since we don't have anyting to compare the last element to
      temp[j++] = arr[count-1];
      // copying the temp array to the original array
      for (int i=0; i<j; i++){
        arr[i] = temp[i];
      }
      return j;
    }
  
    public static void main (String[] args) {
      int arr[] = {1, 2, 2, 3, 4, 5, 5, 5};
      System.out.print("Original Array: ");
      int length = arr.length;
      for (int i=0; i<length; i++)
        System.out.print(arr[i]+" ");
  
      //getting the new array size after removing duplicates
      length = removeDuplicates(arr, length);
  
      //for new line
      System.out.println("");
  
      //Displaying array with non-duplicate elements
      System.out.print("Array after removing duplicate elements: ");
      for (int i=0; i<length; i++)
        System.out.print(arr[i]+" ");
    }
  }


  /* WHAT I PICKED UP FROM THIS CODE
   *
   * 1. code doesn't always kick off right from the top. That's a friendly reminder that tidy code structure matters.
   *
   * 2. Java and Python, they're not that different when it comes to looping through arrays.
   * It seems like folks prefer working with indexes instead of diving into what's inside.
   * The good news is, I don't have to wrestle with stuff like 'range(len())' or 'enumerate'.
   * 
   * 3. I kinda miss the simplicity of 'print()' in Python. In Java, we're rollin' with
   * 'System.out.println,' and it's quite the mouthful in comparison.
   */