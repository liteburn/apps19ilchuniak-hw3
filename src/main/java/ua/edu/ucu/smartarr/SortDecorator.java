package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator mycmp;

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        mycmp = cmp;
    }

    @Override
    public Object[] toArray() {
        arr = Arrays.stream(smartArray.toArray()).sorted(mycmp).toArray();
        return arr.clone();
    }

    @Override
    public String operationDescription() {
        return "Sort " + smartArray.operationDescription();
    }
}
