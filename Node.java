public class Node {

  private String data;
  private Node next;
  private Node prev;

  public Node (String value) {
    data = value;
    next = null;
    prev = null;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node var) {
    next = var;
  }

  public Node getPrev() {
    return prev;
  }

  public void setPrev(Node var) {
    prev = var;
  }

}
