import java.util.Scanner;
public class EX10 

{
    public static void main(String[] args) throws Exception 
    {
        int [][][]studentScore={ //score for student before input
                                {{1}, {0,0,0},{0}},
                                {{2}, {0,0,0},{0}},
                                {{3}, {0,0,0},{0}},
                                {{4}, {0,0,0},{0}},
                                {{5}, {0,0,0},{0}},
                                {{6}, {0,0,0},{0}},
                                {{7}, {0,0,0},{0}},
                                {{8}, {0,0,0},{0}}
                               };
        String []subject={"Math", "Physics", "Chemestry"};
        int totalScoregroup1=0;
        int totalScoregroup2=0;
        Scanner scan = new Scanner(System.in);
            for(int i=0; i<studentScore.length; i++) //to input score for each student
            {
                System.out.println("Score for student: "+studentScore[i][0][0]); //[i][0][0] is student number
                for(int j=0; j<studentScore[i][1].length; j++)  
                {
                    System.out.print(subject[j] +" : ");
                    int score = scan.nextInt();
                    studentScore[i][1][j]+=score;//add score for each subject
                    studentScore[i][2][0]+=score;//total score for each student 
                }
            }
                scan.close();
            System.out.println();
            System.out.println("Group1:");
            System.out.println("---------------------------------------------------------");
            System.out.println("Name         Math         Physics      Chemestry    Total");
            System.out.println("---------------------------------------------------------");
            for(int i=0; i<studentScore.length; i++) //for printing back the result
            {  
                if(i<studentScore.length/2)//seperate group 1 for only 4 student
                {
                    System.out.printf("Student:"+"%-6d",studentScore[i][0][0]);
                    for(int k=0; k<studentScore[i][1].length; k++) //print score for each subject
                    {
                        System.out.printf("%-13d", studentScore[i][1][k]);//score
                    }
                    System.out.println( +studentScore[i][2][0]); //total sscore for each student
                    totalScoregroup1+=studentScore[i][2][0]; //total score for group 
                }
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("                                       Total score: "+totalScoregroup1);
            System.out.println();
            System.out.println("Group2:");
            System.out.println("---------------------------------------------------------");
            System.out.println("Name         Math         Physics      Chemestry    Total");
            System.out.println("---------------------------------------------------------");
            for(int i=0; i<studentScore.length; i++)
            {
                if(i>=studentScore.length/2)
                {
                    System.out.printf("Student:"+"%-6d",studentScore[i][0][0]);
                    for(int k=0; k<studentScore[i][1].length; k++)
                    {
                        System.out.printf("%-13d",studentScore[i][1][k]);
                    }
                    System.out.println( +studentScore[i][2][0]);
                    totalScoregroup2+=studentScore[i][2][0];
                }
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("                                       Total score: "+totalScoregroup2);
    }
}
