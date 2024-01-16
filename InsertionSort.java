
public class InsertionSort {

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

  // *The Insertion Sort is normally the best of
  // the elementary sorts. Unlike the other sorts that
  // had a group sorted at any given time, groups are
  // only partially sorted here.*

  public void insertionSort() {

    for (int i = 1; i < arraySize; i++) {
      int j = i;
      int toInsert = theArray[i];

      while ((j > 0) && (theArray[j - 1] > toInsert)) {

        theArray[j] = theArray[j - 1];
        j--;

        printHorzArray(i, j);

      }
      theArray[j] = toInsert;

      printHorzArray(i, j);

      System.out
          .println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");
    }
  }

  public static void main(String[] args) {

    InsertionSort newArray = new InsertionSort();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.insertionSort();
  }

}