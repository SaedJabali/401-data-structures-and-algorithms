import data.Node;

import java.io.IOException;

public class AnimalShelter<T> {
    Node<T> front;
    Node<T> rear ;

    public AnimalShelter(T value){
        this.front= new Node<T> (value);
        this.rear=this.front;
    }

    public AnimalShelter() {

    }

    public void enqueue(T animal){
        try {
            if (rear == null){
                front =new Node<>(animal);
                rear=front;
            }else {
                this.rear.next=new Node<>(animal);
                this.rear=this.rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public String dequeue(String pref) throws IOException {
        try {
            if (isEmpty()){
                new NullPointerException();
            }
                        else if (pref != "cat" && pref !="dog"){
                pref=null;

            }
            else {
                    this.front=this.front.next;
                }

        }catch (Exception ex){
            System.out.println(ex);
        }
        return pref;
    }


    public boolean isEmpty(){
        return front==null;
    }

    public void valuesToString() {
        Node<T> current = this.front;
        String allValues = "";
        while (current != null) {
            System.out.print("{ " + current.value + " } -> ");
            allValues = allValues + "{ " + current.value + " } -> ";
            current = current.next;
        }
        allValues = allValues + "NULL";
        System.out.print("NULL");

    }
    @Override
    public String toString(){

        return "Shelter {" + "front =" + front + " , "+ " rear = "+ rear + " }";
    }
}
