package com.akshay.learning.oldDesign;

public class Slab {
    private long start;
     private long end;
     private float discount;

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Slab(long start, long end, float discount) {
        this.start = start;
        this.end = end;
        this.discount = discount;

    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public float getDiscount() {
        return discount;
    }



}
