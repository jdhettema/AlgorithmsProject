
public class SelectionSort {

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

      for (int l = 0; l < (4 * (1.4 * i - 1.5 * j) - 5); l++)
        System.out.print(" ");

      System.out.print(i);

    }
    System.out.println();
  }

  // Selection sort search for the smallest number in the array
  // saves it in the minimum spot and then repeats searching
  // through the entire array each time

  public void selectionSort() {

    for (int x = 0; x < arraySize; x++) {
      int minimum = x;

      for (int y = x; y < arraySize; y++) {

        // To change direction of sort just change
        // this from > to <

        if (theArray[minimum] > theArray[y]) {
          minimum = y;
        }
      }

      swapValues(x, minimum);

      printHorzArray(x, -1);
    }

  }

  public void swapValues(int indexOne, int indexTwo) {

    int temp = theArray[indexOne];
    theArray[indexOne] = theArray[indexTwo];
    theArray[indexTwo] = temp;
  }

  public static void main(String[] args) {

    SelectionSort newArray = new SelectionSort();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.selectionSort();
  }

}