
public class ArrayStructures {

  private int[] theArray = new int[50];
  private int arraySize = 10;

  public void generateRandomArray() {

    for (int i = 0; i < arraySize; i++) {

      theArray[i] = (int) (Math.random() * 10) + 10;
    }
  }

  /*
   * public void printArray() {
   * System.out.println("----------");
   * 
   * for (int i = 0; i < arraySize; i++) {
   * System.out.print("| " + i + " | ");
   * System.out.println(theArray[i] + " |");
   * System.out.print("----------");
   * }
   * }
   */
  // Horiz Array
  /*
   * public void printArray() {
   * 
   * System.out.println("----------");
   * 
   * for (int i = 0; i < arraySize; i++) {
   * 
   * System.out.print("| " + i + " | ");
   * System.out.println(theArray[i] + " |");
   * System.out.println("----------");
   * }
   * }
   */

  /*
   * public void deleteIndex(int index){
   * 
   * if(index < arraySize){
   * for(int i = index; i < (arraySize - 1); i++){
   * 
   * theArray[i] = theArray[i+1];
   * 
   * }
   * 
   * arraySize--;
   * 
   * }
   * }
   */

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

    // FOR BUBBLE SORT
    /*
     * if (j != -1) {
     * 
     * // ADD THE +2 TO FIX SPACING
     * for (int k = 0; k < ((j * 5) + 2); k++) {
     * System.out.print(" ");
     * System.out.print(j);
     * }
     * }
     * 
     * 
     * // THEN ADD THIS CODE
     * 
     * if (i != -1) {
     * 
     * // ADD THE -1 TO FIX SPACING
     * for (int l = 0; l < (5 * (i - j) - 1); l++) {
     * System.out.print(" ");
     * System.out.print(i);
     * }
     * }
     * 
     * System.out.println();
     */
  }

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

  public static void main(String[] args) {

    ArrayStructures newArray = new ArrayStructures();
    newArray.generateRandomArray();
    newArray.printHorzArray(-1, -1);
    newArray.linearSearchForValue(13);
  }

}