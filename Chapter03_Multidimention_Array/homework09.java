package ProjectRUPP.Week6;
import java.util.Scanner;

public class homework09 {
  static final int ID = 0;
    static final int LOAN = 1;
    static double[][][] mBanks;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // First ask for number of banks and minimum limit
        System.out.print("Enter the number of banks: ");
        int numberOfBank = input.nextInt();

        System.out.print("Enter minimum limit: ");
        int limit = input.nextInt(); // limit is the minimum total assets for keeping a bank safe

        mBanks = new double[numberOfBank][][];

        System.out.println("Example:");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", 
                        "bank # |", "balance |", "Loaned# |", "Bank ID |", "Amounts |", "Bank ID |", "Amounts |");
        System.out.printf("%-7d|%8.2f|%8d|", 1, 200.0, 2);
        System.out.printf("%8.0f|%8.2f|", 2.0, 73.0);
        System.out.printf("%8.0f|%8.2f|\n\n", 1.0, 130.0);

        for (int i = 0; i < mBanks.length; i++) {
            System.out.print("Enter bank #"+ i +" : \n\n");

            System.out.print("\tEnter balance bank :");
            double balance = input.nextDouble();

            System.out.print("\tEnter loaned bank :");
            int numBanks = input.nextInt();
            System.out.println("");

            mBanks[i] = new double[++numBanks][2];
            mBanks[i][0][0] = balance; // banks balance

            System.out.println("Enter ID and Amounts from your loaned bank");
            System.out.println("\n");

            for (int bank = 1; bank < mBanks[i].length; bank++) {

                System.out.print("\tEnter bank ID : ");
                mBanks[i][bank][ID] = input.nextDouble();

                System.out.print("\tEnter amounts : ");
                mBanks[i][bank][LOAN] = input.nextDouble();
            }

        }
        System.out.println("");

        displayMatrix(mBanks);

        boolean[] unsafeIndex = scanBanks(mBanks, limit);

        for (int i = 0; i < unsafeIndex.length; i++) {
            System.out.println("Bank# " + i + " unsafe: " + unsafeIndex[i] );
        }
        input.close();
    }

    public static void displayMatrix(double[][][] m) {

        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n" ,
                          "bank # |", "balance |", "Loaned# |", "Bank ID |", "Amounts |", "Bank ID |", "Amounts |");

        for (int banks = 0; banks < m.length; banks++) {

            System.out.printf("%-7d|%8.2f|%8d|", banks, m[banks][0][0], m[banks].length -1);

            for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++){

                System.out.printf("%8.0f|%8.2f|" , m[banks][LoanedBanks][ID], m[banks][LoanedBanks][LOAN]);
            }

            System.out.println("");
        }
    }

    public static boolean[] scanBanks(double[][][] m, int limit) {

        boolean[] indexUnsafeBanks = new boolean[m.length];
        double total;
        boolean isSafe = false;
        // keep looping until indexUnsafe isn't modified
        // throw an entire iteration

        while (!isSafe) {

            isSafe = true; // gets set false if indexUnsafeBanks is changed

            for (int banks = 0; banks < m.length; banks++) {

                total = m[banks][0][0];

                for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
                    int index = (int)m[banks][LoanedBanks][ID];

                    if (!indexUnsafeBanks[index])
                        total += m[banks][LoanedBanks][LOAN];
                }
                // Update indexUnsafeBanks if bank is under limit
                // and indexUnsafeBanks has not yet marked current bank unsafe
                if (total < limit && !indexUnsafeBanks[banks]) {

                    indexUnsafeBanks[banks] = true;
                    isSafe = false;
                }
            }
        }
        return indexUnsafeBanks;
    }
}
