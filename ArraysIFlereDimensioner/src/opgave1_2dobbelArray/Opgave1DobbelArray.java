package opgave1_2dobbelArray;

import eksempeldobbelarray.DobbelArray;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0, 4, 3, 9, 6}, {1, 3, 5, 2, 2}, {3, 3, 1, 0, 1}, {0, 0, 9, 7, 1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        DobbelArrayMethods dA = new DobbelArrayMethods();
        System.out.println("\nOpgave 1 metodernee ");

        System.out.println(dA.getValueAt(values, 0, 1));

        System.out.println(dA.sumRow(values, 1));

        System.out.println(dA.sumCol(values, 1));

        System.out.println(dA.sum(values));

        dA.setValueAt(values, 0, 1, 24);

        System.out.println(dA.getValueAt(values, 0, 1));

        System.out.println(dA.sum(values));

        System.out.println();




        /*
        Initializing arrays with random values. The following loop initializes the array with
        random values between 0 and 99:
         */
        int[][] test = new int[2][20];
        for (int row = 0; row < test.length; row++) {
            for (int column = 0; column < test[row].length; column++) {
                test[row][column] = (int) (Math.random() * 100);
            }
        }
        /*
          Initializing arrays with input values. The following loop initializes the array with user
           input values:
         */
        int[][] test2 = new int[2][3];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + test2.length + " rows and " +
                test2[0].length + " columns: ");
        for (int row = 0; row < test2.length; row++) {
            for (int column = 0; column < test2[row].length; column++) {
                test2[row][column] = input.nextInt();
            }
        }

        /*
        Printing arrays. To print a two-dimensional array, you have to print each element in the
         array using a loop like the following loop:
         */
//        System.out.println();
//        for (int row = 0; row < test.length; row++) {
//            for (int column = 0; column < test[row].length; column++) {
//                System.out.print(test2[row][column] + " ");
//            }
//            System.out.println();

            da.udskrivArray(test);

            System.out.println();
            da.udskrivArray(test2);


            //TODO Tilføj kode der afprøver metoderne du programmerer i klassen DobbelArray til opgave 1

        }


    }
//}
