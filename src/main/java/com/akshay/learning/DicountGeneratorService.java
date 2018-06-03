package com.akshay.learning;

import java.util.List;

public class DicountGeneratorService {

    public static double getTotalDiscount(Customer customer, double billAmount){
        double totalDiscountedAmount = getTotalDiscountedAmount(customer, billAmount);
        return billAmount - totalDiscountedAmount;
    }

    private static double getTotalDiscountedAmount(Customer customer, double billAmount) {
        final List<Slab> slabList = customer.getSlabList();
        //double totalDiscount = 0;
        double reminder = billAmount;
        double totalDiscountedAmount = 0;
        for (Slab slab: slabList) {
            long slabAmount = slab.getEnd() - slab.getStart();

            if(reminder > 0 ){
                double actualDiscountable ;
                if(reminder >= slabAmount){
                   actualDiscountable = slabAmount;
                } else {
                    actualDiscountable = reminder;
                }
                totalDiscountedAmount += actualDiscountable * slab.getDiscount();
                reminder -= slabAmount;
                System.out.println("total discount: "+totalDiscountedAmount + " reminder: "+reminder);
            }

        }
        return totalDiscountedAmount;
    }
}
