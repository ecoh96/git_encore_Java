package com.encore.car.Engine;

public class Engine {


    private String engineType;
    public Engine(){
    }
    public Engine(String engineType){
        this.engineType =engineType;
    }


    public void engineInfo(){

    }
    public String showInfo(){
        return "엔진의타입은" + engineType+"입니다";
    }







}
