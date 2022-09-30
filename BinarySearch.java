import java.util.Scanner;

class Binary {
    private static int size=5;
    private int[] a=new int[size];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++) {
            System.out.print("Enter Elements of an array :-");
            a[i]=sc.nextInt();
        }
    }

    public void search() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key Element :-");
        int key=sc.nextInt();
        int lb=0,ub=size-1;
        int mid=0;
        int found=0;
        while(lb<=ub) {
            mid=(lb+ub)/2;
            if(a[mid]==key) {
                found=1;
                break;
            }else if(key>a[mid])
                lb=mid+1;
            else 
                ub=mid-1;
        }

        if(found==1) 
            System.out.println("Element found at :-"+(mid+1));
        else
            System.out.println("Not Found");
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Binary b=new Binary();
        b.read();
        b.search();
    }
}
