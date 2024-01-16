
public class BubbleSort {
  // Generate Random Array
  private int[] theArray = new int[50];
  private int arraySize = 10;

  public void generateRandomArray() {

    for (int i = 0; i < arraySize; i++) {

      theArray[i] = (int) (Math.random() * 10) + 10;
    }
  }

  // Horizontal Array Display
  public void printHorzArray(int i, int j) {

    for (int n = 0; n < 47; n++) {
      System.out.print("-");
    }
    System.out.println();

    for (int n = 0; n < arraySize; n++) {

      System.out.print("| " + n + "  ");

    }

    System.out.println("|");

    for (int n = 0; n < 47; n++) {
      System.out.print("-");
    }

    System.out.println();

    for (int n = 0; n < arraySize; n++) {

      System.out.print("| " + theArray[n] + " ");

    }

    System.out.println("|");

    for (int n = 0; n < 47; n++) {
      System.out.print("-");
    }

    System.out.println();

    if (j != -1) {

      // **ADD THE +1.5 TO FIX SPACING
      for (int k = 0; k < ((j * 5.8) + 1.5); k++) {
        System.out.print(" ");
      }

      System.out.print(j);

    }

    if (i != -1) {

      for (int l = 0; l < (4 * (1.4 * i - 1.5 * j) - 1); l++) {
        System.out.print(" ");
      }

      System.out.print(i);
    }

    System.out.println();
  }

  // This bubble sort will sort everything from
  // smallest to largest or (by changing one tiny piece of code
  // from largest to smallest)

  public void bubbleSort() {
    // i starts at the end of the Array
    // As it is decremented all indexes greater
    // than it are sorted

    for (int i = arraySize - 1; i > 1; i--) {

      // The inner loop starts at the beginning of
      // the array and compares each value next to each
      // other. If the value is greater then they are
      // swapped
      for (int j = 0; j < i; j++) {

        // To change sort to Descending change to <

        if (theArray[j] > theArray[j + 1]) {

          swapValues(j, j + 1);

          printHorzArray(i, j);
        }
      }
    }
  }

  public void swapValues(int indexOne, int indexTwo) {

    int temp = theArray[indexOne];
    theArray[indexOne] = theArray[indexTwo];
    theArray[indexTwo] = temp;
  }

  public static void main(String[] args) {

    BubbleSort newArray = new BubbleSort();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.bubbleSort();
  }

}