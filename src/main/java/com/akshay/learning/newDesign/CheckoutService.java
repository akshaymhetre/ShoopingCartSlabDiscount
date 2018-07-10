package com.akshay.learning.newDesign;

import com.akshay.learning.oldDesign.Slab;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class CheckoutService {
    List<Offer> offers ;

    public double checkout(CheckoutRequest request){
        final double totalDiscount = offers.stream().mapToDouble(offer -> offer.discountOffered(request)).sum();
        return request.getTotalAmount()- totalDiscount;
    }

}
