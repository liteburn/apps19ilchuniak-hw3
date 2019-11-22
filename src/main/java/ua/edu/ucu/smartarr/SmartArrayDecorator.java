package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected Object[] arr;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
        this.arr = toArray();
    }

    @Override
    public Object[] toArray() {
        return arr.clone();
    }

    @Override
    public int size() {
        return arr.length;
    }
}
