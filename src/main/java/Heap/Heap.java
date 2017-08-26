package Heap;

public class Heap {

    private HeapElement top = null;

    public void addToHeap(int value) {
        this.top = new HeapElement(value, this.top);
    }

    public int removeFromHeap() {
        if (this.top != null) {
            int temp = top.getValue();
            this.top = top.getPrev();
            return top.getValue();
        }
        return -1;
    }

    public int getPickOfHeap() {
        if (this.top != null) {
            return this.top.getValue();
        }
        return -1;
    }

    public void printHeap() {
        HeapElement temp = this.top;
        while (this.top != null) {
            System.out.println(this.top.getValue());
            this.top = this.top.getPrev();
        }
    }


    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }

    public void removeByValue(int value) {
        if (this.top != null) {

            HeapElement temp = null;
            if (this.top.getValue() == value) {
                if (temp == null) {
                    this.top = this.top.getPrev();
                }
            }
            if (temp != null) {
                if (temp.getValue() == value) {
                    last

                }
                temp = this.top.getPrev();
            }
            while (temp != null) ;
        }
    }
}