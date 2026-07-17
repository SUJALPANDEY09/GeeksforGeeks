/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node temp = head;
        
        Node tem = new Node(x);
        if (head == null) {
            return tem;
        }
        // code here
        while(temp.next !=null){
            temp = temp.next;
        }
        
        temp.next = tem;
        
        return head;
    }
    
}