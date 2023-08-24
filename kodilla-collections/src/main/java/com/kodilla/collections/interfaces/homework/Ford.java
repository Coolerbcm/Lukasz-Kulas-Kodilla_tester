package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;


    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        if(speed >= 40){
            speed -= 20;
        } else {
            speed = 0;
        }
    }
}
