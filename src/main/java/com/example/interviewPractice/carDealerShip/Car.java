package com.example.interviewPractice.mphasisInterview.carDealerShip;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private Engine engine;

    public void startCar(){
        System.out.println("++++Car is starting+++");
        engine.startEngine();
    }
}
