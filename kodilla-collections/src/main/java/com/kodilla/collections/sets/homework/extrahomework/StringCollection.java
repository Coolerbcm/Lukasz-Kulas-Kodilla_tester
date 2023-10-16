package com.kodilla.collections.sets.homework.extrahomework;

public class StringCollection {
    private Element collectionHead;

    public StringCollection() {
        this.collectionHead = null;
    }


    public void addElement(String s) {
        Element newElement = new Element(s);
        if (collectionHead == null) {
            collectionHead = newElement;
        } else {
            Element currentElement = collectionHead;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
            newElement.setPrev(currentElement);
        }
    }

    public String getElement(int n) {
        Element currentElement = collectionHead;
        int index = 0;
        while (currentElement != null) {
            if (index == n) {
                return currentElement.getValue();
            }
            currentElement = currentElement.getNext();
            index++;
        }
        return null;
    }

    public boolean removeElement(String s) {
        Element currentElement = collectionHead;
        while (currentElement != null) {
            if (currentElement.getValue().equals(s)) {
                Element prevElement = currentElement.getPrev();
                Element nextElement = currentElement.getNext();

                if (prevElement != null) {
                    prevElement.setNext(nextElement);
                } else {

                    collectionHead = nextElement;
                }

                if (nextElement != null) {
                    nextElement.setPrev(prevElement);
                }

                return true;
            }
            currentElement = currentElement.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        StringCollection collection = new StringCollection();

        collection.addElement("Element 1");
        collection.addElement("Element 2");
        collection.addElement("Element 3");

        System.out.println("Element 2: " + collection.getElement(1));

        boolean removed1 = collection.removeElement("Element 2");
        boolean removed2 = collection.removeElement("Element 5");
        System.out.println("Usunięto Element 2: " + removed1);
        System.out.println("Usunięto Element 5: " + removed2);

        System.out.println("Element 2 po usunięciu: " + collection.getElement(1));
    }


}