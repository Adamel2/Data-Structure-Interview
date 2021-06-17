package com.interview.linked_list;

/*
  @created 18/05/2021 - 14:17
  @author  Adham eldda
  @package com.interview.linked_list
  @project GreeBash
 */
public class Driver {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(new Node<String>("A",null));

    linkedList.add(new Node("B",null));
    linkedList.add(new Node("C",null));
    linkedList.add(new Node("D",null));
    linkedList.add(new Node("E",null));
    linkedList.display();
    System.out.println("*******************");
    linkedList.delete();
    linkedList.display();
  }
}
