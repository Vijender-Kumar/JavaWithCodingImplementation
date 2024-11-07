package com.example.interviewPractice.other.payment;

import org.springframework.stereotype.Service;

@Service
public class PhonePayService implements PaymentService {
    @Override
    public void payment(double amount) {
        System.out.println("This is PhonePay Service");
    }
}
