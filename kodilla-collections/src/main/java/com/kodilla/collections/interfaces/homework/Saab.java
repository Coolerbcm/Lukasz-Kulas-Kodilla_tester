package com.kodilla.collections.interfaces.homework;

public class Saab implements Car{
    private int speed;


    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        if(speed >= 50){
            speed -= 40;
        } else {
            speed = 0;
        }
    }
}
