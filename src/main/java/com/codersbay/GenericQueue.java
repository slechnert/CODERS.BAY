package com.codersbay;

import java.util.EmptyStackException;

public class GenericQueue<E> {

   int size = 0;
   GenericQueueElement<E> front;
   GenericQueueElement<E> rear;

   public GenericQueue() {
   }

//Methods

   public int length() {
      return size;
   }

   public void enqueue(E newValue) {
      GenericQueueElement<E> newElement = new GenericQueueElement<E>(newValue, rear);
      rear = newElement;
      size++;
      if (size == 1) {
         front = newElement;
      }
   }

   public E dequeue() {
      GenericQueueElement<E> oldFront = front;
      if (size == 0) {
         throw new EmptyStackException();
      }
      front = front.getNext();
      size--;
      return oldFront.getValue();
   }

   public E peekFront() {
      if (size == 0) {
         throw new EmptyStackException();
      }
      return front.getValue();
   }

   public E peekRear() {
      if (size == 0) {
         throw new EmptyStackException();
      }
      return rear.getValue();
   }

   //Getter & Setter
   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public GenericQueueElement<E> getFront() {
      return front;
   }

   public void setFront(GenericQueueElement<E> front) {
      this.front = front;
   }

   public GenericQueueElement<E> getRear() {
      return rear;
   }

   public void setRear(GenericQueueElement<E> rear) {
      this.rear = rear;
   }
}

