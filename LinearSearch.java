
public class LinearSearch {
  //Random Array For Example
  private int[] theArray = new int[50];
  private int arraySize = 10;

  public void generateRandomArray() {

    for (int i = 0; i < arraySize; i++) {

      theArray[i] = (int) (Math.random() * 10) + 10;
    }
  }

  // Horiz Array Display With Insertion Pointer
  public void printHorzArray(int i, int j) {

    for (int n = 0; n < 51; n++) {
      System.out.print("-");
    }

    System.out.println();

    for (int n = 0; n < arraySize; n++) {
      System.out.print("| " + n + "  ");
    }

    System.out.println("|");

    for (int n = 0; n < 51; n++) {
      System.out.print("-");
    }

    System.out.println();

    for (int n = 0; n < arraySize; n++) {
      System.out.print("| " + theArray[n] + " ");
    }

    System.out.println("|");

    for (int n = 0; n < 51; n++) {
      System.out.print("-");
    }

    System.out.println();

    if (i != -1) {

      for (int l = 0; l < (4 * (1.4 * i - 1.5 * j) - 5); l++)
        System.out.print(" ");

      System.out.print(i);

    }

    System.out.println();
  }

  //Using Linear Search on the Random Array
  public String linearSearchForValue(int value) {
    boolean valueInArray = false;
    String indexesWithValue = "";

    for (int i = 0; i < arraySize; i++) {
      if (theArray[i] == value) {
        valueInArray = true;
        indexesWithValue += i + "  ";
      }

      printHorzArray(i, -1);
    }

    if (!valueInArray) {
      indexesWithValue = "None";
    }

    System.out.println("Value " + value + " was found at: " + indexesWithValue);
    System.out.println();
    return indexesWithValue;
  }

  //Main Code
  public static void main(String[] args) {

    ArrayStructures newArray = new ArrayStructures();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.linearSearchForValue(13);
  }
}