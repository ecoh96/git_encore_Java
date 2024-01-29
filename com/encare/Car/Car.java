package com.encare.Car;

import com.encore.car.Engine.Engine;

public class Car {
    private Engine engine;

    public Car(){
        engine=new Engine();
    }
    public void engineInfo(){
        String Info = engine.showInfo();
        System.out.println(">>>>>>>엔진정보<<<<");
        System.out.println(Info);

    }

    public Car(String type){
        engine = new Engine(type);

    }





}
