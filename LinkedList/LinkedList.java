package LinkedList;

public class LinkedList {
    static class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val=val;
        }
    }

    static class LinkList{
         Node addFirst(int val , Node head){
             Node a = new Node(val);
            a.next=head;
            head=a;
            printList(head);
            return head;
        }
        void printList (Node head){
            Node curr = head;
            while(curr != null ){
                System.out.print(curr.val + " -> ");
                curr= curr.next;
            }
            System.out.print("null");
            System.out.println();
        }
        Node arrToLl(int[] arr){
            if(arr.length==0) return null;
             Node head = new Node(arr[0]);
             Node current  = head;
            for (int i = 1; i < arr.length; i++) {
                current.next= new Node(arr[i]);
                current= current.next;
            }
            return head;
        }

        Node arrToRevL(int[] arr){
             if(arr.length==0) return null;
             Node head = new Node(arr[arr.length-1]);
             Node current =head;
            for (int i = arr.length-2; i >=0; i--) {
                current.next= new Node(arr[i]);
                current=current.next;
            }
            return head;
        }

        Node nToSll(int n){
             Node dummy = new Node(0);
             if(n==0) return null;
             int i=1;
             Node current = dummy;
             while(i<=n){
                 current.next=new Node(i);
                 current=current.next;
                 i++;
             }
             return dummy.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        Node head4 = new Node(0);
        list.addFirst(1,head4);
        int[] arr = {1,2,3,4,5,6};
        Node head = list.arrToLl(arr);
        list.printList(head);
        Node head2 = list.arrToRevL(arr);
        list.printList(head2);
        Node head3=list.nToSll(10);
        list.printList(head3);
    }
}
