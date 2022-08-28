import java.util.Scanner;

public class DeleteOrder_ll
{
    static Node head,tail,delete_purpose,getDelete_purpose2;

    class Node
    {
        int val;
        Node previous;
        Node next;

        Node(int a)
        {
            val = a;
            previous = null;
            next = null;
        }
    }

    public void insert(int a)
    {
        Node node = new Node(a);

        if(head==null)
        {
            head = node;
            head.previous=tail;
            tail = node;
            tail.next=head;
        }
        else
        {
            node.previous = tail;
            tail.next = node;
            tail = node;
            head.previous = tail;
            node.next = head;
        }
    }

    public void delete(int n)
    {
        int count=0;
        delete_purpose = head;
        getDelete_purpose2 = head;

            while(delete_purpose!=tail)
            {
                count++;
                delete_purpose = delete_purpose.next;
            }


//        System.out.println("Total number of elements in linked list is : "+count);

        while(count!=1)
        {
            for(int i=1;i<=n;i++)
            {
                if(i==n)
                {
                    System.out.println(getDelete_purpose2.val);

                    if(getDelete_purpose2 == head){
                        getDelete_purpose2.previous.next = getDelete_purpose2.next;
                        getDelete_purpose2.next.previous = getDelete_purpose2.previous;
                        head=getDelete_purpose2.next;
                        getDelete_purpose2=getDelete_purpose2.next;
                    }
                    else if(getDelete_purpose2 == tail)
                    {
                        getDelete_purpose2.previous.next = getDelete_purpose2.next;
                        getDelete_purpose2.next.previous=getDelete_purpose2.previous;
                        tail = getDelete_purpose2.previous;
                        getDelete_purpose2 = getDelete_purpose2.next;
                    }
                    else
                    {
                        getDelete_purpose2.previous.next = getDelete_purpose2.next;
                        getDelete_purpose2.next.previous = getDelete_purpose2.previous;
                        getDelete_purpose2 = getDelete_purpose2.next;

                    }

                }
                else{
                    getDelete_purpose2 = getDelete_purpose2.next;
                }
                    
            }
            count = 0;
            if(getDelete_purpose2==tail){
                count=1;
            }

            while(delete_purpose!=tail)
            {
                count++;
                delete_purpose = delete_purpose.next;

            }

            if(count==1)
            {
                System.out.println(getDelete_purpose2.val);
                getDelete_purpose2.previous = null;
                getDelete_purpose2.next = null;
                break;
            }

        }
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DeleteOrder d = new DeleteOrder();

        d.insert(1);
        d.insert(2);
        d.insert(3);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        d.insert(7);
        d.insert(8);

        d.delete(5);

//        System.out.println("Head value = "+head.val);
//        System.out.println("Tail value = "+tail.val);
//        System.out.println("Head value = "+tail.next.val);
    }
}