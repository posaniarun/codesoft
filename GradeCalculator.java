
import java.util.Scanner;

public class GradeCalculator{
    public static void grade(int a[],int sub){
        for(int i=0;i<sub;i++){
            if(a[i]>=91 && a[i]<=100)
            System.out.println("grade for "+a[i]+" marks is = A");
        else if(a[i]>=81 && a[i]<=90)
            System.out.println("grade for "+a[i]+" marks is = B");
        else if(a[i]>=71 && a[i]<=80)
            System.out.println("grade for "+a[i]+" marks is = C");
        else if(a[i]>=61 && a[i]<=70)
            System.out.println("grade for "+a[i]+" marks is = D");
        else if(a[i]>=35 && a[i]<=60)
            System.out.println("grade for "+a[i]+" marks is = P");
        else
            System.out.println("failed");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of subjects");
        int sub=sc.nextInt();
        System.out.printf("enter marks obtained in %d subjects (out of 100) marks: ",sub);
        int a[]=new int[sub];
        int i;
        for(i=0;i<sub;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<sub;i++){
            sum+=a[i];
        }
        System.out.println("sum of marks is: "+sum);
        int average=sum/sub;
        System.out.println("Average of marks is: "+average);
        grade(a,sub);
    }
    
}

