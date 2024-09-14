
public class NodeList{
    int data;
    NodeList next;
    NodeList(){
        this.next=null;
    }
    NodeList(int data){
        this.data=data;
    }
    NodeList(int data,NodeList next){
        this.data=data;
        this.next=next;
    }
}

