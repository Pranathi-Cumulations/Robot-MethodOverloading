package com.company;

public class Main {

    public static void main(String[] args) {
	   Robot robot = new Robot(0,0);
       robot.Move(1,2); //moves robot to coordinate(1,2)
       robot.MoveInXdirection(2);  //moves robot to coordinate(3,2)
       robot.MoveInXdirection();     //moves robot to coordinate(random,2) since steps are not specified
    }
}
