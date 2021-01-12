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
    String ret = "";
    while (current != null) {
      ret += current.getData() + ", ";
      current = current.getNext();
    }
    return ret;
  }
  //remove is still under construction
  // throwing null pointer exception @ line130
/*
  public String remove (int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException ("there is no node at this index");
    }

    String ret = "";
    Node toMod = start;

    if (size == 1) {
      ret = start.getData();
      start = null;
      end = null;
      size--;
      return ret;
    }
    else if (index == 0) {
      ret = start.getData();
      start = start.getNext();
      start.setPrev(null);
      size--;
      return ret;
    }
    else if (index == size - 1) {
      ret = end.getData();
      end = end.getPrev();
      end.setNext(null);
      size--;
      return ret;
    }
    else {
      toMod = start;
      for (int i = 0; i <= index; i++) {
        toMod = toMod.getNext();
      }
      toMod.getPrev().setNext(toMod.getNext());
---------- debug statements (disregard) -----------
      if (toMod.getNext() == null) {
        throw new IllegalArgumentException ("next null");
      }
      if (toMod.getPrev() == null) {
        throw new IllegalArgumentException ("prev null");
      }
 ----------------------------------------------------
      toMod.getNext().setPrev(toMod.getPrev());
      size--;
    }
    return ret;
  }
  */
}
