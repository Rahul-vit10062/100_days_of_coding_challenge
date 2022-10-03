import java.util.Scanner;

class K{
    private static int n=10;
    private int[] a=new int[n];
    private int[][] b=new int[3][n];
    private int m=4,size=0;

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            System.out.print("Enter Elements :-");
            a[i]=sc.nextInt();
        }
    }

    public void occur() {
        int c=0;
        for(int i=0;i<n;i++) {
            int count=1;
            for(int j=(i+1);j<n;j++) {
                if(a[i]==a[j]) {
                    count++;
                    b[0][c]=j;
                    b[1][c]=a[j];
                    b[2][c]=count;
                    c++;
                    //size++;
                }
            }
        }
    }

    public void print() {
        for(int i=0;i<=b.length;i++) {
            if(b[2][i]==m) {
                System.out.println(b[1][i]);
                break;
            }
        }
    }
}

public class KTimes {
    public static void main(String[] args) {
        K kt=new K();
        kt.read();
        kt.occur();
        kt.print();
    }
}
