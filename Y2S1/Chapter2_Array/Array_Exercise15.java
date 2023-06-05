import java.util.Random;

public class Array_Exercise15 {
    public static void main(String[] args) 
    { 
        String[] arr={"wb", "mb"}; // 50% of survivale rate
        int survivalChance = 0;
        for(int i=1; i<=100; i++)
        {
        Random r=new Random(); 
        int randomBowl=r.nextInt(arr.length); 
        if(arr[randomBowl]=="wb")
            {
                survivalChance++;
            }
        else
        {
            String[] arr2={"w1", "w2", "b1", "b2", "b3"};// 33% of survival rate
            Random r2=new Random();
            int randomMixedBowl=r2.nextInt(arr2.length);
            if((arr2[randomMixedBowl]=="w1") || (arr2[randomMixedBowl]=="w2"))
                {
                    survivalChance++;
                }
        }
        }
        System.out.println("The total of survival chance is: "+survivalChance);
    } 
}
