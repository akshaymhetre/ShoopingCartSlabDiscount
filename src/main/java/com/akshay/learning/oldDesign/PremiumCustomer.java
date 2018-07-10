package com.akshay.learning.oldDesign;

import java.util.List;

public class PremiumCustomer implements Customer {

    private List<Slab> slabList;

    public PremiumCustomer(final List<Slab> slabList) {
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
