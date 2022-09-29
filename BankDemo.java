import java.util.Scanner;

class Bank {
    private int accNumber;
    private String name;
    private float accBalance;

    Bank() {
        accNumber=0;
        name=null;
        accBalance=0.0f;
    }

    Bank(int an,String n,float ab) {
        accNumber=an;
        name=n;
        accBalance=ab;
    }

    public void read() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number :-");
        accNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name :-");
        name=sc.nextLine();
        System.out.print("Enter Account Balance :-");
        accBalance=sc.nextFloat();
    }

    public void setAccount(int accn) {
        accNumber=accn;
    }

    public void setName(String n) {
        name=n;
    }

    public void setB(float b) {
        accBalance=b;
    }

    public int getAccount() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return accBalance;
    }

    public void print() {
        System.out.println("Account Number :-"+accNumber);
        System.out.println("Name :-"+name);
        System.out.println("Balance :-"+accBalance);
    }
}

class Array {
    private Bank bank[]=new Bank[10];
    private int size;

    Array() {
        size=-1;
    }

    public boolean isEmpty() {
        if(size==-1)
            return true;
        return false;
    }

    public boolean isFull() {
        if(size==200)
            return true;
        return false;
    }

    public void insert(Bank s) {
        if(!isFull()) {
            size++;
            bank[size]=s;
        }
    }

    public void display() {
         for(int i=0;i<=size;i++) {
           System.out.println("Account Number :-"+bank[i].getAccount());
           System.out.println("Name :-"+bank[i].getName());
           System.out.println("Balance :-"+bank[i].getBalance());
           //bank[i].print();
           System.out.println("____________________________");
        }
    }

    public int menu() {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("1.Insert");
        System.out.println("2.Display");
        System.out.println("3.Exit");
        System.out.print("Enter Your choice :-");
        choice=sc.nextInt();
        return choice;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b=new Bank();
		Array a=new Array();
        int menu=0;
        do {
            menu=a.menu();
            switch (menu) {
                case 1:
                    b.read();
                    a.insert(b);
                    Bank b1=new Bank();
                    b=b1;
                    break;
                case 2:
                    a.display();
                    break;
                case 3:
                    System.exit(0);
            }

        }while(true);
    }
    
}
