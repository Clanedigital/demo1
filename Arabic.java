package com.company;

public class Arabic extends Number {
    int arab;

    public Arabic(String val) throws Exception {
        super(val);
        this.arab = Integer.parseInt(val);
        if (arab < 1 || arab > 10) {
            throw new Exception("ERROR");
        }
    }
}
