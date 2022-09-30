import java.util.Scanner;

class SubArrays {
    static int n=10;
    private int[] a=new int[n];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            System.out.print("Enter Element of an array :-");
            a[i]=sc.nextInt();
        }
    }
int count=0;
int k=0,temp=0;
    public void SubArray() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Subarray :-");
        k=sc.nextInt();
        for(int i=0;i<n;i++) {
            count++;
            if(count==k) {
                for(int j=i;j>=temp;j--) {
                    System.out.print(a[j]+" ");
                }
                temp=temp+3;
                count=0;
            }
            if(i==(n-1)) {
                for(int j=i;j>=temp;j--) {
                    System.out.print(a[j]+" ");
                }
            }
                       
        }
    }
}

public class SubArray {
    public static void main(String[] args) {
        SubArrays s=new SubArrays();
        s.read();
        s.SubArray();
    }
}
