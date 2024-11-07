package com.example.interviewPractice.mphasisInterview.carDealerShip;

public class DealerShip {
    public static void main(String[] args) {
        Car car = Car.builder()
                .engine(new PetrolCar())
                .build();
        car.startCar();

        Car car1 = Car.builder()
                .engine(new DieselCar())
                .build();
        car1.startCar();
    }
}
