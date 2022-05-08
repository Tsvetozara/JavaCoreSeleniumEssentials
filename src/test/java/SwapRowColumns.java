public class SwapRowColumns {
    public static void main(String args[]) {
        int array[][] = new int[][]{{4, 2}, {5, 3}};

        // Get anti-clockwise swapped array.
        int newArrayAntiClockWise[][] = swapArrayAntiClockWise(array);
        // System.out.println("New array data swapped anti-clockwise.");
        printArrayData(newArrayAntiClockWise);
    }

    /* Print each row and column value in the two dimensional array. */
    private static void printArrayData(int array[][]) {
        // Get row count.
        int rowCount = array.length;
        for (int i = 0; i < rowCount; i++) {
            // Get each row.
            int row[] = array[i];
            // Get column count.
            int columnCount = row.length;
            for (int j = 0; j < columnCount; j++) {
                // Get column value and print.
                int column = row[j];
                System.out.print(column);
                System.out.print(", ");
            }
            // Print a return line at the end of each row.
            System.out.println();
        }
    }

    /* Swap rows and columns in anti-clockwise direction for two dimensional array. */
    public static int[][] swapArrayAntiClockWise(int array[][]) {
        return swapArray(array, false);
    }

    /* Swap rows and columns for two dimensional array. */
    private static int[][] swapArray(int array[][], boolean clockwise) {
        int arrayRowCount = getArrayRowCount(array);
        int arrayColumnCount = getArrayColumnCount(array);
        int newArray[][] = new int[arrayColumnCount][arrayRowCount];
        for (int i = 0; i < arrayRowCount; i++) {
            for (int j = 0; j < arrayColumnCount; j++) {
                if (clockwise) {
                    // Swap in clockwise direction.
                    newArray[j][arrayRowCount - i - 1] = array[i][j];
                } else {
                    // Swap in anti-clockwise direction.
                    newArray[j][i] = array[i][j];
                }
            }
        }
        // Return swapped array.
        return newArray;
    }

    /* Get array row count. */
    private static int getArrayRowCount(int array[][]) {
        int ret = 0;
        if (array != null) {
            ret = array.length;
        }
        return ret;
    }

    /* Get the biggest columns count in the array. */
    private static int getArrayColumnCount(int array[][]) {
        int ret = 0;
        if (array != null) {
            int rowCount = array.length;
            for (int i = 0; i < rowCount; i++) {
                int row[] = array[i];
                if (row.length > ret) {
                    ret = row.length;
                }
            }
        }
        return ret;
    }
}
