package com.training.retailorderhub.service;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public boolean charge(String paymentMethod, double amount) {
        if (paymentMethod.equals("CREDIT_CARD")) {
            System.out.println("Charging credit card: " + amount);
        } else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Charging PayPal: " + amount);
        } else if (paymentMethod.equals("GIFT_CARD")) {
            System.out.println("Charging gift card: " + amount);
        } else {
            System.out.println("Unknown payment method: " + paymentMethod);
            return false;
        }
        return true;
    }
}
