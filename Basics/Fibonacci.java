
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3;
        System.out.println("enter the no upto which you want fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
ArrayList l = new ArrayList();
int n = nums.length;
Arrays.sort(nums);
int count=0,j=0,m=n/3;
for(int i=0;i<n;i+=count){
j=i;
count=0;
while(j<n && nums[j]==nums[i]){
count++;
j++;
}
if(count>m) l.add(nums[i]);
}
return l;
}}
