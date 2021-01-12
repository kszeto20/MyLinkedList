public class NodeTester {

  public static void main (String[] args) {

/*
    Node test = new Node("testing string");
    Node prevTest = new Node("prev string");
    Node nextTest = new Node("next string");
    test.setNext(nextTest);
    test.setPrev(prevTest);
    System.out.println((test.getPrev()).getData());
    System.out.println(test.getData());
    System.out.println((test.getNext()).getData());

*/
    MyLinkedList listTest = new MyLinkedList();

    System.out.println(listTest.add("hello"));
    System.out.println(listTest.add("my name is"));
    System.out.println(listTest.add("Kirsten"));

    System.out.println(listTest);

    listTest.add(2, "changed this");

    System.out.println("New Tests ------" + "\n" + listTest);

    MyLinkedList listTest1 = new MyLinkedList();

    listTest1.add("i am tired");
    listTest1.add("i am hungry");
    listTest1.add("i am angry");
    listTest1.add("i am stressed");

    System.out.println(listTest1);
    listTest.extend(listTest1);
    System.out.println(listTest);
    System.out.println(listTest1 + "----");

    listTest1.add("do they still have the other linkedList");

    System.out.println(listTest);
    System.out.println(listTest1 + "----");
  }
}
