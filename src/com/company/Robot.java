package com.company;

import java.util.Random;

public class Robot {
    private int xPosition;
    private int yPosition;
    private Random random = new Random();

    Robot(int xPosition,int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void MoveInXdirection(int noOfSteps){
        this.xPosition+=noOfSteps;
        System.out.println(this);
    }

    public void MoveInXdirection(){
        this.xPosition+= random.nextInt(10);
        System.out.println(this);
    }

    public void Move(int stepsInXdirection , int stepsInYdirection){
        this.xPosition+=stepsInXdirection;
        this.yPosition+=stepsInYdirection;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
