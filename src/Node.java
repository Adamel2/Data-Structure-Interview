/*
  @created 23/05/2021 - 12:45
  @author  Adham eldda
  @package PACKAGE_NAME
  @project GreeBash
 */
public class Node <T>{

  private Object value;
  private Object Next;

  public Node(Object value, Object next) {
    this.value = value;
    Next = next;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public Object getNext() {
    return Next;
  }

  public void setNext(Object next) {
    Next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", Next=" + Next +
      '}';
  }
}
