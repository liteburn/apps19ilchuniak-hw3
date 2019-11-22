package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] arr;

    public BaseArray(Object[] array) {
        arr = array.clone();
    }

    @Override
    public Object[] toArray() {
        return arr.clone();
    }

    @Override
    public String operationDescription() {
        return "BaseArray";
    }

    @Override
    public int size() {
        return arr.length;
    }

    private boolean validIndex(int index) {
        if (!(0 <= index && index < arr.length)) {
            System.out.println("Wrong index");
            return false;
        }
        return true;
    }

    public void setValue(int index, Object value) {
        if (validIndex(index)) {
            arr[index] = value;
        }
    }

    public void setValue(int index) {
        if (validIndex(index)) {
            arr[index] = 0;
        }
    }
}
