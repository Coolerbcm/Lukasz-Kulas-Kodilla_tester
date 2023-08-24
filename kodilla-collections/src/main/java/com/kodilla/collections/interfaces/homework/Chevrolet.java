package com.kodilla.collections.interfaces.homework;

public class Chevrolet implements Car{
    private int speed;


    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        if(speed >= 35){
            speed -= 25;
        } else {
            speed = 0;
        }
    }
}
