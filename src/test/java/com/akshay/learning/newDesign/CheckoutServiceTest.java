package com.akshay.learning.newDesign;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Should Pass all checkout tests")
class CheckoutServiceTest {

    @Test
    void checkout(){
        SlabBasedOffer.Slab slab1 = new SlabBasedOffer.Slab(0,5000, 0);
        SlabBasedOffer.Slab slab2 = new SlabBasedOffer.Slab(5001,10000, 0.1F);
        SlabBasedOffer.Slab slab3 = new SlabBasedOffer.Slab(10001,15000, 0.2F);
        final List<SlabBasedOffer.Slab> slabsRegular = Arrays.asList(slab1, slab2, slab3);
        // Slab slab4 = new Slab(0,5000, 0);
        //Slab slab5 = new Slab(0,5000, 0);
        //Slab slab6 = new Slab(0,5000, 0);
        CheckoutRequest checkoutRequest = new CheckoutRequest(Customer.REGULAR, 25001.0);
        final HashMap<Customer, List<SlabBasedOffer.Slab>> customerBasedSlabs = new HashMap<>();
        customerBasedSlabs.put(Customer.REGULAR, slabsRegular);


        final List<Offer> offers = Arrays.asList(new SlabBasedOffer(customerBasedSlabs));
        final CheckoutService checkoutService = new CheckoutService(offers);

        final double checkout = checkoutService.checkout(checkoutRequest);
        System.out.println(checkout);
        assertEquals(23501, checkout, 1.0);
    }

}