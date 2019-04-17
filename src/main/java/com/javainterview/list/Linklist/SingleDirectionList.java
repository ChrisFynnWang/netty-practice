package com.javainterview.list.Linklist;

import java.util.LinkedList;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/29
 * @Other:
 */
public class SingleDirectionList<E> {

  private Object[] array;

  private Node<E> first;

  private Node<E> last;

  private int size = 0;


  public SingleDirectionList() {

  }


  private static class Node<E> {

    Node<E> next;

    E item;

    Node(E element, Node<E> next) {
      this.next = next;
      this.item = element;
    }
  }

  public boolean add(E element) {
    Node<E> l = last;
    Node<E> newNode = new Node(element, null);
    last = newNode;
    if (l == null) {
      first = newNode;
    } else {
      l.next = newNode;
    }
    return true;
  }

  public void add(int index, E element) {

  }

  public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<>();

    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    System.out.println(linkedList.indexOf(4));
  }
}
