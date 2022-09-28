import java.util.Scanner;

class Customer {
    private int accNumber;
    private String name;
    private float balance;

    public void setAccount(int a) {
        accNumber=a;
    }

    public void setName(String n) {
        name=n;
    }

    public void setBalance(float b) {
        balance=b;
    }

    public int getAccounts() {
        return accNumber;
    }

    public void read() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number :-");
        accNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name :-");
        name=sc.nextLine();
        System.out.print("Enter Account balance :-");
        balance=sc.nextFloat();
    }

    public void print() {
        System.out.println("Account Number :-"+accNumber);
        System.out.println("Name :-"+name);
        System.out.println("Balance :-"+balance);
    }
}

class Node {
    private Customer cs;
    private Node next;

    Node() {
        next=null;
    }

    public Node createNode() {
        Node newNode=new Node();
        return newNode;
    }

    public void readNode() {
        cs.read();
    }

    public void printNode() {
        cs.print();
    }

    public void setNext(Node n) {
        next=n;
    }

    public Node getNext() {
        return next;
    }
    
    public void setdata(Customer c) {
        cs=c;
    }

    public Customer getData() {
        return cs;
    }

}

class LinkedList {
    private Node head;
    private Node tail;

    LinkedList() {
        head=null;
        tail=null;
    }

    public void insertNodeFirst(Node n) {
        Node p=head;
        n.setNext(head);
        head=n;
    }

    public void insertNodeAny(Node n) {
        Node p,q;
        p=q=head;
        if(head==null) {
            head=n;
            return;
        }
        while(p!=null && p.getData().getAccounts()<n.getData().getAccounts()) {
            q=p;
            p=p.getNext();
        }
        if(p==head) {
            n.setNext(p);
            head=n;
        }else if(p==null) {
            q.setNext(n);
        }else {
            n.setNext(p);
            q.setNext(n);
        }
    }

    public void insertNode(Node n) {
        Node p=head;
        if(head==null) {
            head=n;
            return;
        }
        while(p.getNext()!=null) {
            p=p.getNext();
        }
        p.setNext(n);
    }

    public void display() {
        Node p=head;
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        while(p!=null) {
            p.printNode();
            System.out.println("______________________________________");
            p=p.getNext();
        }
    }

    public Node search(int account) {
        Node p=head;
        Node q=null;
        while(p!=null && p.getData().getAccounts()==account) {
            p=p.getNext();
        }
        if(p!=null) {
            q=p.getNext();
        }else {
            System.out.println("not found");
        }
        return q;
    }

    public void deleteLast() {
        Node p,q;
        p=q=head;
        if(head==null) {
            System.out.println("No Node");
            return;
        }
        while(p.getNext()!=null) {
            q=p;
            p=p.getNext();
        }if(q!=p) {
            q.setNext(p.getNext());
        }
    }

    public void deleteFirst() {
        Node p,q;
        p=q=head;
        if(head==null) {
            System.out.println("No Node");
        }while(p.getNext()!=null) {
            q=p;
            p=p.getNext();
        }if(q==p) {
            head=p.getNext();
        }
    }

    public void deleteAny(int account) {
        Node p,q;
        p=q=head;
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }while(p.getNext()!=null && p.getData().getAccounts()==account) {
            q=p;
            p=p.getNext();
        }if(q==p) {
            head=p.getNext();
        }else if(q!=p) {
            q.setNext(p.getNext());
        }
    }

    public int menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Insert");
        System.out.println("3.Append");
        System.out.println("4.Display");
        System.out.println("5.Search");
        System.out.println("6.Delete First");
        System.out.println("7.Delete Any");
        System.out.println("8.Delete Last");
        System.out.println("9.Exit");
        System.out.print("Enter Your Choice :-");
        int choice=sc.nextInt();
        return choice;
    }

    public Node getData(Node q) {
        Node n;
        return n=getData(q);
    }
}

public class CustomerDetails {
public static void main(String[] args) {
    Customer c=new Customer();
    Node n=new Node();
    LinkedList ll=new LinkedList();
    int account;
    Node q;
    do {
        int choice=ll.menu();
        switch (choice) {
            case 1:
                c.read();
                n.createNode();
                n.setdata(c);
                ll.insertNodeFirst(n);
                Customer c1=new Customer();
                Node n1=new Node(); 
                c=c1;
                n=n1;
                break;
            case 2:
                c.read();
                n.createNode();
                n.setdata(c);
                ll.insertNodeAny(n);;
                Customer c2=new Customer();
                Node n2=new Node(); 
                c=c2;
                n=n2;
                break;
            case 3:
                c.read();
                n.createNode();
                n.setdata(c);
                ll.insertNode(n);
                Customer c3=new Customer();
                Node n3=new Node(); 
                c=c3;
                n=n3;
            case 4:
                ll.display();
                break;
            case 5:
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Account number to be searched :-");
                account=sc.nextInt();
                q=ll.search(account);
                System.out.println(ll.getData(q));
                break;
            case 6:
                ll.deleteFirst();
                System.out.println("Deleted First Element");
               break;
            case 7:
                Scanner s=new Scanner(System.in);
                System.out.print("Enter Account number to be searched :-");
                account=s.nextInt();
                ll.deleteAny(account);
                break;
            case 8:
               ll.deleteLast();
                System.out.println("Deleted Last Element");
                break;
            case 9:
                System.exit(0);
            default :
                System.out.println("Please enter Valid Choice");
        }
    }while(true);
    }
}