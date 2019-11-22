package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate mypred;

    public FilterDecorator(SmartArray smartArray, MyPredicate pred) {
        super(smartArray);
        mypred = pred;
    }

    public Object[] toArray() {
        if (size() == 0) {
            arr = new Object[0];
            return arr.clone();
        }
        arr = Arrays.stream(smartArray.toArray()).filter(mypred::test).toArray();
        return arr.clone();
    }

    @Override
    public String operationDescription() {
        return "Filter " + smartArray.operationDescription();
    }
}
