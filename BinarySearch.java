
public class BinarySearch {

  private int[] theArray = new int[50];
  private int arraySize = 10;

  public void generateRandomArray() {

    for (int i = 0; i < arraySize; i++) {

      theArray[i] = (int) (Math.random() * 10) + 10;
    }
  }

  // Vert Array Display
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

      for (int l = 0; l < (4 * (1.4 * i - 1.5 * j) - 5); l++) {
        System.out.print(" ");
      }
      System.out.print(i);
    }

    System.out.println();
  }

  // Bubble Sort to sort the array first
  public void bubbleSort() {

    for (int i = arraySize - 1; i > 1; i--) {
      for (int j = 0; j < i; j++) {
        if (theArray[j] > theArray[j + 1]) {

          swapValues(j, j + 1);
        }
      }
    }
  }

  public void swapValues(int indexOne, int indexTwo) {

    int temp = theArray[indexOne];
    theArray[indexOne] = theArray[indexTwo];
    theArray[indexTwo] = temp;
  }

  // The Binary Search is quicker than the linear search
  // because all the values are sorted. Because everything
  // is sorted once you get to a number larger than what
  // you are looking for you can stop the search. Also
  // you be able to start searching from the middle
  // which speeds the search. It also works best when
  // there are no duplicates

  public void binarySearchForValue(int value) {

    int lowIndex = 0;
    int highIndex = arraySize - 1;

    while (lowIndex <= highIndex) {

      int middleIndex = (highIndex + lowIndex) / 2;
      // we start the search from the middle, which increases the speed

      if (theArray[middleIndex] < value)
        lowIndex = middleIndex + 1;

      else if (theArray[middleIndex] > value)
        highIndex = middleIndex - 1;

      else {

        System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);

        lowIndex = highIndex + 1;

      }

      printHorzArray(middleIndex, -1);

    }

  }

  public static void main(String[] args) {

    BinarySearch newArray = new BinarySearch();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.bubbleSort();
    newArray.binarySearchForValue(15);
  }

}