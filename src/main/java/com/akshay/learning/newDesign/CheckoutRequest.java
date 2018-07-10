package com.akshay.learning.newDesign;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CheckoutRequest {
    private Customer customer;
    private double totalAmount;
}
