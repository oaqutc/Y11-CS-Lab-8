
public class Array2dUtility {

    // Declare all methods as static.
    // 1. print
    // Implement a method called print that prints out the values of a 2D array of
    // integers row by row.
    public static void print(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + ", ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array2d) {
        int total = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                total += array2d[i][j];
            }
        }
        return total;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D
    // array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number
    // of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array2d) {
        int totalElements = 0;
        for (int i = 0; i < array2d.length; i++) {
            totalElements += array2d[i].length;
        }
        return (double) sum(array2d) / totalElements;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D
    // array of integers.
    public static int minimum(int[][] array2d) {
        int min = array2d[0][0];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] < min) {
                    min = array2d[i][j];
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D
    // array of integers.
    public static int maximum(int[][] array2d) {
        int max = array2d[0][0];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] > max) {
                    max = array2d[i][j];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even
    // numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array2d) {
        int evenCount = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even
    // numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array2d) {
        int evenCount = 0;
        for (int[] array : array2d) {
            for (int n : array) {
                if (n % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in
    // a 2D array of integers are positive.
    public static boolean allPositive(int[][] array2d) {
        for (int[] array : array2d) {
            for (int n : array) {
                if (n <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that
    // contains the sum of each row at each index.
    public static int[] rowSums(int[][] array2d) {
        int[] sumRow = new int[array2d.length];
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum = 0;
            for (int j = 0; j < array2d.length; j++) {
                sum += array2d[i][j];
            }
            sumRow[i] = sum;
        }
        return sumRow;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that
    // contains the sum of each col at each index.
    public static int[] colSums(int[][] array2d) {
        int[] sumCol = new int[array2d[0].length];
        int sum = 0;
        for (int i = 0; i < array2d[0].length; i++) {
            sum = 0;
            for (int j = 0; j < array2d.length; j++) {
                sum += array2d[j][i];
            }
            sumCol[i] = sum;
        }
        return sumCol;
    }

}