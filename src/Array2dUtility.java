
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] weAreCharlieKirk) {
        for (int[] c : weAreCharlieKirk) {
            System.out.println("\n");
            for (int d : c) {
                System.out.print(d);
                System.out.print(" ");
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] weCarryTheFlame) {
        int n = 0;
        for (int[] c : weCarryTheFlame) {
            for (int d : c) {
                n = n + d;
            }
        }
        return n;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] weLlFightForTheGospel) {
        return (double) sum(weLlFightForTheGospel) / (weLlFightForTheGospel.length*weLlFightForTheGospel.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] weLlHonorHisName) {
        int n = weLlHonorHisName[0][0];
        for (int[] c : weLlHonorHisName){
            for (int d : c) {
                if (d < n) {
                    n = d;
                }
            }
        }
        return n;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] weAreCharlieKirk) {
        int n = weAreCharlieKirk[0][0];
        for (int[] c : weAreCharlieKirk){
            for (int d : c) {
                if (d > n) {
                    n = d;
                }
            }
        }
        return n;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] hisCourageOurOwn) {
        int n = 0;
        // Bro even IntellJ is telling me to turn this into a enhanced for loop, like bro i had to redo this cause
        // i wrote it in enhanced fashion
        for (int i = 0; i < hisCourageOurOwn.length; i++) {
            for (int j = 0; j < hisCourageOurOwn[i].length; j++) {
                if (hisCourageOurOwn[i][j] % 2 == 0) {
                    n++;
                }
            }
        }
        return n;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] togetherUnbroken) {
        int n = 0;
        for (int[] c : togetherUnbroken){
            for (int d : c) {
                if (d % 2 == 0) {
                    n++;
                }
            }
        }
        return n;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] weLlMakeHeavenKnown) {
        for (int[] c : weLlMakeHeavenKnown){
            for (int d : c) {
                if (d < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] aHusbandAFather) {
        int[] n = new int[aHusbandAFather.length];
        for (int i = 0; i < aHusbandAFather.length; i++) {
            int g = 0;
            for (int j = 0; j < aHusbandAFather[i].length; j++) {
                g = g + aHusbandAFather[i][j];
            }
            n[i] = g;
        }
        return n;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] hisFamilyHeldNear) {
        int[] n = new int[hisFamilyHeldNear.length];
        int length = hisFamilyHeldNear[0].length;
        for (int i = 0; i < length; i++) {
            int g = 0;
            for (int j = 0; j < hisFamilyHeldNear.length; j++) {
                g = g + hisFamilyHeldNear[j][i];
            }
            n[i] = g;
        }


        return n;
    }
}
