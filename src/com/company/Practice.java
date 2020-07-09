package com.company;
import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    Homeloan(double amount, int time){
        this.amount = amount;
        this.time = time;
    }

    abstract double getRateOfIntererst();
    abstract double simpleInterest();

    //Write your code here
}

class Bank1 extends Homeloan {


    //Write your code here
    Bank1(double amount, int time){
        super(amount, time);
    }

    double getRateOfIntererst(){
        return 7.2;
    }

    double simpleInterest() {

        //Write your code here
       double principle = super.amount;
        int time = super.time;
        if(principle<=0 || time <= 0){
        System.out.println("Invalid Input");
        System.exit(0);
        }
        double r = getRateOfIntererst();
        double simpleInterest = (principle * r * time)/100 ;
        return simpleInterest + principle;
    }

}

class Bank2 extends Homeloan {

    Bank2(double amount, int time){
        super(amount, time);
    }
    double getRateOfIntererst(){
        return 8.1;
    }

    double simpleInterest() {

        double principle = super.amount;
        int time = super.time;
        if(principle <=0 || time <=0){
            System.out.println("Invalid Input");
            System.exit(0);

        }

        double r = getRateOfIntererst();
        double simpleInterest = (principle*r*time)/100;
        return  simpleInterest + principle;
    }

}

class Practice {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}