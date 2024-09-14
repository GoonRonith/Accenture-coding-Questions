public class MiddleOfLinkedList {
        public static void main(String[] args) {
            NodeList head=null;
            head=insertAtEnd(1, head);
            head=insertAtEnd(2, head);
            head=insertAtEnd(3, head);
            head=insertAtEnd(4, head);
            head=insertAtEnd(5, head);
            head=insertAtEnd(6, head);
            head=insertAtEnd(7, head);
            NodeList middleNode=getMiddleNode(head);
            System.out.println("middle Node value->"+middleNode.data);
            // System.out.println(isCyclePresent(head));
            NodeList newHead=modifyList(head);
            while (newHead!=null) {
                System.err.println(newHead.data);
                newHead=newHead.next;
            }
        }

        public static NodeList modifyList(NodeList head){
            NodeList start=head.next.next;
            NodeList temp=head;
            while (start!=null) {
                start.data=start.data+temp.data;
                start=start.next;
                temp=temp.next;
            }
            return head;
        }

        public static boolean isCyclePresent(NodeList head){
            NodeList fast=head;
            NodeList slow=head;
            while (fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast) return true;
            }
            return false;
        }



        public static NodeList getMiddleNode(NodeList head){

            NodeList n1=head;
            NodeList n2=head;
            while (n1!=null && n1.next!=null) {
                n1=n1.next.next;
                n2=n2.next;
            }
            return n2;
        }

        public static NodeList insertAtEnd(int data,NodeList head){
            NodeList newNode=new NodeList(data,null);
            NodeList temp=head;
            if(head==null){
                head=newNode;
            }
            else{
                while (temp.next!=null) {
                    temp=temp.next;
                }
                temp.next=newNode;
                // if(data==60){  //make cycle for checking for the last node
                //     newNode.next=head;
                // }
            }
            
            return head;
        }
}
