package javapractice;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode)&&
                         myLinkedList.tail.equals(myThirdNode);
        System.out.println(result);
    }
}
