package com.codabase;

class Node {
     private Node next;
     private int data;

     Node getNext() {
         return next;
     }

     void setNext(Node next) {
         this.next = next;
     }

     int getData() {
         return data;
     }
     void setData(int data) {
         this.data = data;
     }
 }