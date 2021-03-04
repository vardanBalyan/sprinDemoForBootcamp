package com.example.couplingsDemo;

/*
* In this we have the Lawyer and Scientist class
* which is loosely coupled by using the instance of Job
* interface we're calling the display methods of both of the class.*/

class Lawyer implements Job{

    @Override
    public void display() {
        System.out.println("This is lawyer");
    }
}

class Scientist implements Job{

    @Override
    public void display() {
        System.out.println("This is scientist");
    }
}
public class LooseCoupling implements Job{
    Job job;

    public LooseCoupling(Job job) {
        this.job = job;
    }

    @Override
    public void display() {
        job.display();
    }

    public static void main(String[] args) {
        Lawyer lawyer = new Lawyer();
        Scientist scientist = new Scientist();
        LooseCoupling looseCoupling = new LooseCoupling(lawyer);
        looseCoupling.display();
        LooseCoupling looseCoupling1 = new LooseCoupling(scientist);
        looseCoupling1.display();
    }
}
