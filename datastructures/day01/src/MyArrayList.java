public class MyArrayList {
    private Cow[] elems;
    private int size;

    // TODO: Runtime: O(1)
    public MyArrayList() {
        // TODO
        this.elems = new Cow[10]
    }

    // TODO: Runtime: O(1)
    public MyArrayList(int capacity) {
        // TODO
        this.elems = new Cow[capacity]
    }

    // TODO: Runtime: O(1)
    public void add(Cow c) {
        elems[i] = c;
        size+=1
    }

    // TODO: Runtime: O(1)
    public int size() {
        return size;
    }

    // TODO: Runtime: O(1)
    public Cow get(int index) {
        return elems[i];
    }

    // TODO: Runtime: O(n)
    public Cow remove(int index) {
        for (int i = index; i<elems.length(); i++){
            elems[i] = elems[i+1]
        }
        return null;
    }

    // TODO: Runtime: O(?)
    public void add(int index, Cow c) {
        // TODO
        for (int i = elems.length()-1; i>=index; i--){
            elems[i] = elems[i+1]
        }
        elems[index] = c
    }
}