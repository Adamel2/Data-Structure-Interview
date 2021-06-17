/*
  @created 23/05/2021 - 12:46
  @author  Adham eldda
  @package PACKAGE_NAME
  @project GreeBash
 */
public class LinkedList <T>{
  private Node head;

  public LinkedList(Node node) {
    this.head = node;
  }

  public void setNode(Node node) {
    Node tempNode = this.head;
    this.head = node;
    node.setNext(tempNode);

  }

  public void display(){
    Node node = this.head;
    while(node != null){
      System.out.println(node.getValue());
      node = (Node) node.getNext();
    }
  }

  @Override
  public String toString() {
    return "LinkedList{" +
      "head=" + head +
      '}';
  }
}
