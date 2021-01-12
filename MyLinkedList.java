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
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException("there is no Node at this index");
    }
    else {
      for (int i = 0; i < size; i++) {
        current = current.getNext();
        if (i == index) {
          ret = current.getData();
        }
      }
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
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException("Node cannot be added at this index");
    }
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
          size++;
        }
        current = current.getNext();
      }
    }
  }

  public String toString() {
    current = start;
    int index = 0;
    String ret = "";
    while (current != null && index != size - 1) {
      ret += current.getData() + ", ";
      current = current.getNext();
      index++;
    }
    if (current != null && index == size - 1) {
      ret += current.getData();
    }
    return ret;
  }

  private int getSize() {
    return size;
  }

  private void clearList() {
    start = null;
    end = null;
    size = 0;
  }

  private Node getStart() {
    return start;
  }

  private Node getEnd() {
    return end;
  }

  public void extend(MyLinkedList other) {
    end.setNext(other.getStart());
    end = other.getEnd();
    size += other.getSize();
    other.clearList();
  }

  public String remove (int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException ("there is no node at index " + index);
    }
    String ret = "";
    Node toMod = start;

    if (size == 1) {
      ret = start.getData();
      start = null;
      end = null;
      size = 0;
      ret += " 'size 1' case ran through";
      return ret;
    }

    else if (index == 0) {
      ret = start.getData();
      start = start.getNext();
      start.setPrev(null);
      size--;
      ret += " 'first' case ran through";
      return ret;
    }

    else if (index == size - 1) {
      ret = end.getData();
      end = end.getPrev();
      end.setNext(null);
      size--;
      ret += " end index case ran through";
      return ret;
    }

    else {
      for (int i = 1; i <= index; i++) {
        toMod = toMod.getNext();
      }
      ret = toMod.getData();
      toMod.getPrev().setNext(toMod.getNext());
      toMod.getNext().setPrev(toMod.getPrev());
      size--;
      ret += "'other' case ran through";
    }
    return ret;
  }
}
