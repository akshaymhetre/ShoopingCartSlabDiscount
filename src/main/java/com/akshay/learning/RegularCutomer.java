package com.akshay.learning;

import java.util.List;

public class RegularCutomer implements Customer{

    private List<Slab> slabList;

    public RegularCutomer(final List<Slab> slabList) {
        this.slabList = slabList;
    }

    @Override
    public List<Slab> getSlabList() {
        return slabList;
    }

    public void addNewSlab(Slab slab) {
        slabList.add(slab);
    }
}
