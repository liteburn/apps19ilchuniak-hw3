package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction myfunc;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        myfunc = func;
    }

    @Override
    public Object[] toArray() {
        arr = Arrays.stream(smartArray.toArray()).map(myfunc::apply).toArray();
        return arr.clone();
    }

    @Override
    public String operationDescription() {
        return "Map " + smartArray.operationDescription();
    }

}
