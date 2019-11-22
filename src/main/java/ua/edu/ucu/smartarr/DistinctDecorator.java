package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        arr = Arrays.stream(smartArray.toArray()).distinct().toArray(Object[]::new);
        return arr;
    }

    @Override
    public String operationDescription(){
        return "Distinct " + smartArray.operationDescription();
    }

}
