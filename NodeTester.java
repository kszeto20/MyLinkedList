public class NodeTester {

  public static void main (String[] args) {
    Node test = new Node("testing string");
    Node prevTest = new Node("prev string");
    Node nextTest = new Node("next string");
    test.setNext(nextTest);
    test.setPrev(prevTest);
    System.out.println(test.getPrev());
    System.out.println(test.getData());
    System.out.println(test.getNext());

    MyLinkedList listTest = new MyLinkedList();

    System.out.println(listTest.add("hello"));
    System.out.println(listTest.add("my name is"));
    System.out.println(listTest.add("Kirsten"));

    System.out.println(listTest);
    System.out.println(listTest.get(0));
  }
}
