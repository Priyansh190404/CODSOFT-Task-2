
import java.util.*;

public class abc {
    public static void main(String[] args) {
        int n,i,sum=0;
        double average;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        n=sc.nextInt();
        int marks[]=new int[n];
        for(i=0;i<n;i++){
        System.out.println("Enter marks in each subject");
        marks[i]=sc.nextInt();
        sum=sum+marks[i];
        }
        average=sum/n;
        System.out.println("average is  "+  average);
        if(average>=90)
        System.out.println("Grade A");
         else if(average>=80)
        System.out.println("Grade B");
        else if(average>=70)
        System.out.println("Grade C");
        else if(average>=60)
        System.out.println("Grade D");
        else
        System.out.println("Grade D");
    }
}

