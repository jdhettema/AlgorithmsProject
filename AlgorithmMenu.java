import java.util.Scanner; // Import the Scanner class
import java.io.IOException;

public class AlgorithmMenu {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) { // Loop until user chooses to exit
      displayMenu(); // Display the menu

      int choice = scanner.nextInt(); // Read user's choice
      scanner.nextLine(); // Consume new line character

      switch (choice) {
        case 1:
          // Bubble
          displayCode("Bubble Sort", getBubbleSortCode());
          runBubbleSortExample();
          return;
        case 2:
          // Selection
          displayCode("Selection Sort", getSelectionSortCode());
          runSelectionSortExample();
          return;
        case 3:
          // Insertion
          displayCode("Insertion Sort", getInsertionSortCode());
          runInsertionSortExample();
          return;
        case 4:
          // Linear Search
          displayCode("Linear Search", getLinearSearchCode());
          runLinearSearchExample();
          return;
        case 5:
          // Binary Search
          displayCode("Binary Search", getBinarySearchCode());
          runBinarySearchExample();
          return;
        case 0:
          // Exit
          System.out.println("Exiting...");
          System.exit(0); // pass exit code to the script for "normal" exit
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    }
  }

  // display menu options
  private static void displayMenu() {
    System.out.println("Choose an algorithm: ");
    System.out.println("1. Bubble Sort");
    System.out.println("2. Selection Sort");
    System.out.println("3. Insertion Sort");
    System.out.println("4. Linear Search");
    System.out.println("5. Binary Search");
    System.out.println("0. Exit");
  }

  // Display the algorithm name and also the code used to run it
  private static void displayCode(String algorithmName, String code) {
    System.out.println("\n" + algorithmName + " Code:\n");
    System.out.println(code);
    System.out.println("\n Press Enter to continue...");
    new Scanner(System.in).nextLine();
  }

  private static String getBubbleSortCode() {
    // Code for bubbleSort
    String bubSortCode = """
        The bubble sort starts an index 'i' at the end of the Array.
        As it is decremented all indexes greaterthan it are sorted.
        The inner loop 'j' starts at the beginning of the array and compares each value next to each
        other. If the value is greater then they are swapped. Here is the code:

                      public void bubbleSort() {

                        for (int i = arraySize - 1; i > 1; i--) {

                          for (int j = 0; j < i; j++) {

        // You can also change the direction of the sort to descending just by changing the '>' to a '<' in the below code.

                            if (theArray[j] > theArray[j + 1]) {

                              swapValues(j, j + 1);
                            }
                          }
                        }
                      }

        //A second method is used here to swap the values once the j index finds a value that is greater than the next value. This is a classic "temp" method to swap values. The code for that is below:

                      public void swapValues(int indexOne, int indexTwo) {

                        int temp = theArray[indexOne];
                        theArray[indexOne] = theArray[indexTwo];
                        theArray[indexTwo] = temp;
                      }

        To see the bubble sort in action, Press the enter key. You'll see an unsorted array become a sorted array before your eyes. Notice that the j index loops more than once through the array. This will often happen and can even happen more than twice. The time complexity for a bubble sort is O(n^2). The space complexity for a bubble sort is O(1).""";

    return bubSortCode;
  }

  private static String getSelectionSortCode() {
    String selSortCode = """ 
Selection sort search for the smallest number in the array
saves it in the minimum spot and then repeats searching
through the entire array each time

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
        }
      }

//A second method is used here to swap the values once the j index finds a value that is greater than the next value. This is a classic "temp" method to swap values. The code for that is below:
      
      public void swapValues(int indexOne, int indexTwo) {

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
      }"""
    return selSortCode;
  }

  private static String getInsertionSortCode() {
    String insSortCode = """
        The Insertion Sort is normally the best of
        the elementary sorts. Unlike the other sorts that
        had a group sorted at any given time, groups are
        only partially sorted here. See the code below:

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
        You can see the code at work below by pressing Enter. The time complexity of the insertion sort is O(n^2). The space complexity of the insertion sort is O(1).""";

    return insSortCode;
  }

  private static String getLinearSearchCode() {
    // Code for LinearSearch
    String linSearchCode = """
        First, set up the search method with a parameter for a value that the user is searching for. Also set the boolean to false and start a string "counter" to hold the output
        Then, create a for loop that will iterate through the array and check if the value at the current index is equal to the value that was passed in. If it is, set the boolean to true and break the loop. If it is not, increment the counter by 1.
        The counter will run through the array one index at a time and perform this same check.
        Finally, output the indexes where the value was found.
        This search will have a time complexity of O(n) because it will iterate through the array once for each value in the array.
        This search will have a space complexity of O(1) because it does not create any new variables or data structures. Here is the code:

                public String linearSearchForValue(int value) {
                    boolean valueInArray = false;
                    String indexesWithValue = "";

                    for (int i = 0; i < arraySize; i++) {
                      if (theArray[i] == value) {
                        valueInArray = true;
                        indexesWithValue += i + "  ";
                      }
                    }

                    if (!valueInArray) {
                      indexesWithValue = "None";
                    }

                    System.out.println("Value " + value + " was found at: " + indexesWithValue);
                    System.out.println();
                    return indexesWithValue;
                  }

        We can see an example of this search on a random array. The array will display at each loop with the index visible so you can see the process. This particular search will look for the value 13. Press enter to see the code run step-by-step""";

    return linSearchCode;
  }

  private static String getBinarySearchCode() {
    String binSearchCode = """
        The Binary Search is quicker than the linear search
        because all the values are sorted. Because everything
        is sorted once you get to a number larger than what
        you are looking for you can stop the search. Also
        you will be able to start searching from the middle
        which speeds the search. It also works best when
        there are no duplicates. The code looks like this:

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
                        }
                      }
        To see an example of this search, Press Enter. Notice the speed with which the search is able to find the value. This is because it is iteratively dividing the search space in half. The time complexity for a binary search is O(log n) because it will iterate through the array logarithmically. The space complexity for a binary search is O(1) because it does not create any new variables or data structures.""";
    return binSearchCode;
  }

  // Running Code Examples
  // Example methods for each algorithm
  private static void runBubbleSortExample() {
    System.out.println("Running Bubble Sort Example...");

    try {
      ProcessBuilder processBuilder = new ProcessBuilder("java", "BubbleSort");
      Process runProcess = processBuilder.start();

      // Capture the output of the subprocess
      Scanner scanner = new Scanner(runProcess.getInputStream());
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      int runExitCode = runProcess.waitFor();
      if (runExitCode != 0) {
        System.out.println("Error running BubbleSort.java. Exit code: " + runExitCode);
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void runSelectionSortExample() {
    System.out.println("Running Selection Sort Example...");

    try {
      ProcessBuilder processBuilder = new ProcessBuilder("java", "SelectionSort");
      Process runProcess = processBuilder.start();

      // Capture the output of the subprocess
      Scanner scanner = new Scanner(runProcess.getInputStream());
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      int runExitCode = runProcess.waitFor();
      if (runExitCode != 0) {
        System.out.println("Error running SelectionSort.java. Exit code: " + runExitCode);
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void runInsertionSortExample() {
    System.out.println("Running Insertion Sort Example...");

    try {
      ProcessBuilder processBuilder = new ProcessBuilder("java", "InsertionSort");
      Process runProcess = processBuilder.start();

      // Capture the output of the subprocess
      Scanner scanner = new Scanner(runProcess.getInputStream());
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      int runExitCode = runProcess.waitFor();
      if (runExitCode != 0) {
        System.out.println("Error running InsertionSort.java. Exit code: " + runExitCode);
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void runLinearSearchExample() {
    System.out.println("Running Linear Search Example...");

    try {
      ProcessBuilder processBuilder = new ProcessBuilder("java", "LinearSearch");
      Process runProcess = processBuilder.start();

      // Capture the output of the subprocess
      Scanner scanner = new Scanner(runProcess.getInputStream());
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      int runExitCode = runProcess.waitFor();
      if (runExitCode != 0) {
        System.out.println("Error running LinearSearch.java. Exit code: " + runExitCode);
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void runBinarySearchExample() {
    System.out.println("Running Binary Search Example...");

    try {
      ProcessBuilder processBuilder = new ProcessBuilder("java", "BinarySearch");
      Process runProcess = processBuilder.start();

      Scanner scanner = new Scanner(runProcess.getInputStream());
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      int runExitCode = runProcess.waitFor();
      if (runExitCode != 0) {
        System.out.println("Error running BinarySearch.java. Exit code: " + runExitCode);
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}