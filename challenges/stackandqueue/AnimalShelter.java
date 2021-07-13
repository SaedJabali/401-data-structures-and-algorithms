////package stackandqueue;
//
//import data.Node;
////import Queue;
//import java.io.IOException;
//
//public class AnimalShelter<T> {
//    //    Node<T> front;
////    Node<T> rear;
//    Queue<Animal> animal;
////    Queue<T> dog ;
//
////    public AnimalShelter(Node<T> front, Node<T> rear) {
////        this.front = null;
////        this.rear = null;
////    }
//
//
//    public AnimalShelter() {
//        this.animal = new Queue<>();
//    }
//
//    public void enqueue(Animal animal) {
//        if (animal instanceof Dog) {
//            this.animal.enqueue(animal);
//        } else if (animal instanceof Cat) {
//            this.animal.enqueue(animal);
//        }
//    }
//
//
//    public String dequeue(String pref) {
//        try {
//            if (isEmpty()){
//                return "The queue is empty";
//            }
//                        else if (!pref.equals("cat") && !pref.equals("dog")){
//                pref=null;
//
//            }
//            else {
//                    this.front=this.front.next;
//                }
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//        return pref;
//    }
//
//
//    public boolean isEmpty(){
//        return this.animal==null;
//    }
//
//    public void toSstring() {
//        this.animal.valuesToString();
//    }
//}
