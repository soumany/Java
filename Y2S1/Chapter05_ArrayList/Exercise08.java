import java.util.ArrayList;

public class Exercise08 {
    
    public static Double locateSmallest(Double[][] numbers) {
        Double minValue = numbers[0][0];
        int row=0, columm=0;

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                    row = j;        
                    columm = i;     
                }
            }
        }
        System.out.println("Row: " + row);
        System.out.println("Columm: " + columm);
        return minValue;
    }
     public static Double[][] convertTo2DArray(ArrayList<ArrayList<Double>> arrayList2D) {
        Double[][] numbers = new Double[arrayList2D.size()][arrayList2D.get(0).size()];
        for (int i = 0; i < arrayList2D.size(); i++) {
            for (int j = 0; j < arrayList2D.get(i).size(); j++) {
                numbers[i][j] = arrayList2D.get(i).get(j);
            }
        }
        return numbers;
    }
    public static void main(String[] args) {

        // Multi-dimensional ArrayLists 2D (3 x 4)
        ArrayList<ArrayList<Double>> arrayList2D = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Double> arrayList1D = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                double rand = 100 + (Math.random() * 101);
                arrayList1D.add(rand);
            }
            arrayList2D.add(arrayList1D);
        }

        // Display the 2D arrayList
        for (ArrayList<Double> arrayList1D : arrayList2D) {
            for (double rand : arrayList1D) {
                System.out.printf("%.2f" + "\t", rand);
            }
            System.out.println();
        }

        // Find the smallest value in the 2D ArrayList
        Double minValue = locateSmallest(convertTo2DArray(arrayList2D));
        System.out.printf("The smallest element is: " + "%.2f", minValue);
    }


   
}

