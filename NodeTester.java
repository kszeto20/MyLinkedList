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

    System.out.println("Remove Tests ------" + "\n" + "-----------");

    MyLinkedList listTester = new MyLinkedList();

    listTester.add("can my remove please work?");
    System.out.println("\n" + listTester);
    System.out.println(listTester.remove(0));
    System.out.println("\n" + listTester + "\n -------------");

    System.out.println("---------new remove part---------");

    listTester.add("i am tired");
    listTester.add("i am hungry");
    listTester.add("i am angry");
    listTester.add("i am stressed");

    System.out.println(listTester);
    /*
    System.out.println(listTester.remove(0));
    System.out.println(listTester.remove(0));
    System.out.println(listTester.remove(0));
    System.out.println(listTester.remove(0));
    */
    System.out.println("---------new remove part---------");

    System.out.println(listTester.remove(3));
    System.out.println(listTester.remove(1));
    System.out.println(listTester.remove(0));
    System.out.println(listTester.remove(0));
    /*
    System.out.println(listTest1);
    listTest.extend(listTest1);
    System.out.println(listTest);
    System.out.println(listTest1 + "----");

    listTest1.add("do they still have the other linkedList");

    System.out.println(listTest);
    System.out.println(listTest1 + "----");
    */
  }
}
