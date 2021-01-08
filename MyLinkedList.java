public class MyLinkedList{
  private int size;
  private Node start;
  private Node end;
  private Node current;

  public MyLinkedList() {
    size = 0;
    start = null;
    end = null;
  }

  public int size() {
    return size;
  }

  public String get (int index) {
    current = start;
    String ret = "";
    if (index > size) {
      throw new IllegalArgumentException("there is no Node at this index");
    }
    for (int i = 0; i < size; i++) {

      if (i == index) {
        ret = current.getData();
      }
      current = current.getNext();
    }
    return ret;
  }

  public boolean add(String value) {
    Node toAdd = new Node(value);
    if (size == 0) {
      start = toAdd;
      end = toAdd;
      size++;
    }
    else {
      toAdd.setPrev(end);
      toAdd.getPrev().setNext(toAdd);
      end = toAdd;
      size++;
    }
    return true;
  }

  public void add(int index, String value) {
    current = start;
    Node toAdd = new Node(value);

    if (index == 0) {
      toAdd.setNext(start);
      start = toAdd;
      size++;
    }
    else {
      for (int i = 0; i < size; i++) {
        if (i == index - 1) {
          toAdd.setNext(current.getNext());
          current.setNext(toAdd);
        }
        current = current.getNext();
      }
    }
  }

  public String toString() {
    current = start;
    String ret = "";
    while (current != null) {
      ret += current.getData() + ", ";
      current = current.getNext();
    }
    return ret;
  }

}
