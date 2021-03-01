package com.arobs.internship.week1.lab3;


import com.arobs.internship.week1.lab3.ex1.Robot;
import com.arobs.internship.week1.lab3.ex1.TestRobot;
import com.arobs.internship.week1.lab3.ex2.Circle;
import com.arobs.internship.week1.lab3.ex2.TestCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberEx = 0;
        do {

            System.out.println("Enter the exercise number (1-7) or 0 to close: ");
            while (!scanner.hasNextInt()) {
                System.out.printf("%s is not valid number. %n", scanner.next());
            }
            numberEx = scanner.nextInt();

            switch (numberEx) {
                case 1:
                    Robot robot = new Robot();
                    robot.change(5);
                    TestRobot testRobot = new TestRobot(robot);
                    break;
                case 2:
                    Circle circle = new Circle(6.0, "white");
                    TestCircle testCircle = new TestCircle(circle);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

            }

        } while (numberEx != 0);
    }
}
