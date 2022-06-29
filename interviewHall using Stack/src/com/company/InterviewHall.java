package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewHall {

    Queue<String> waitingHall = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    public void hall() throws InterruptedException {
        System.out.println("Enter Total Number Of Candidates");
        int candidatesCount = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<candidatesCount;i++){
            System.out.println("Enter Candidate Name");
            String name = sc.nextLine();
            if (waitingHall.size() < 3){

                waitingHall.add(name);
            }
            else{
                System.out.println("Interview for " +waitingHall.peek()+" is Going On please Wait ");
                Thread.sleep(2500);
                System.out.println(waitingHall.poll() +" was Completed The Interview");
                System.out.println("...........................................");
                System.out.println(name +" please Enter Inside Waiting Hall");
                waitingHall.add(name);
            }
        }
    }
}
