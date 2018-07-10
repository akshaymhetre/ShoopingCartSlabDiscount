package com.akshay.learning;

import com.akshay.learning.oldDesign.Customer;
import com.akshay.learning.oldDesign.DicountGeneratorService;
import com.akshay.learning.oldDesign.RegularCutomer;
import com.akshay.learning.oldDesign.Slab;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DicountGeneratorServiceTest {

    @Test
    public void getTotalDiscount() {
        Slab slab1 = new Slab(0,5000, 0);
        Slab slab2 = new Slab(5001,10000, 0.1F);
        Slab slab3 = new Slab(10001,15000, 0.2F);
        final List<Slab> slabsRegular = Arrays.asList(slab1, slab2, slab3);
       // Slab slab4 = new Slab(0,5000, 0);
        //Slab slab5 = new Slab(0,5000, 0);
        //Slab slab6 = new Slab(0,5000, 0);
        Customer customer = new RegularCutomer(slabsRegular);

        final double totalDiscount = DicountGeneratorService.getTotalDiscount(customer, 5001);
        assertEquals(11100, totalDiscount, 0.0);


    }
}