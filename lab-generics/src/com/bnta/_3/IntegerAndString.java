package com.bnta._3;

public class IntegerAndString implements GenericInterface<Integer, String>{

    @Override
    public String doSomeOperations(Integer integer) {
        return integer.toString(integer);
    }

    @Override
    public Integer doReverseOperations(String s) {
        return Integer.parseInt(s);
    }

}
