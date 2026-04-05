public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] array = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    array[0] = "One";
    array[1] = "Two";
    array[2] = "Three";
    array[3] = "Four";


    // Get the value of the array at index 2
    System.out.println(array[2]);

    // Get the length of the array
    System.out.println(array.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < array.length;i++){
      System.out.println(array[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String str : array){
      System.out.println(str);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
