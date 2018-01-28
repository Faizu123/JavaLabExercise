package Array;
import java.util.Scanner;
public class CalculateSumPartOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[]{12,85,96,78,12};
        System.out.print("Enter First index: ");
        int firstIndex = input.nextInt();
        System.out.print("Enter Last index: ");
        int lastIndex = input.nextInt();
        System.out.println("Sum= "+sumPartOfNum(num,firstIndex,lastIndex));
    }
    
    public static int sumPartOfNum (int[] num,int firstIndex,int lastIndex){
        int sum=0;
        for(int i=firstIndex;i<=lastIndex;i++){
            sum=sum+num[i];
        }
        return sum;
    }
}
