// PREMISE: create a code that prints the elements that repeat in the array

public class printArrayDuplicates {
    public static void main(String[] args) {
        int[] numbers = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Duplicated elements in the array are: ");
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}

// If the elements are strings all you have to do is change the if statement to
// if(names[i].equals(names[j]))

// THINGS I LEARNED WITH THIS CODE:
//
// During a conversation with a friend, I shared my thoughts on how coding introduces us to a unique perspective
// and a different way of thinking, which may not align with our everyday experiences. To illustrate this concept,
// I decided to use two bottles and my friend's cellphone as props to discuss arrays. I said, "In our daily lives,
// we often refer to items as 'first,' 'second,' and 'third,' but in programming, it's a bit different."
// Continuing, I added, "What's fascinating about programming is how it offers alternative ways of perceiving things.
// For instance, would you agree that 'second' can be thought of as 'first + 1'?" My friend was amazed, and we shared
// a hearty laugh. This was a valuable lesson that will stay with me for a long time."