package com.example.couplingsDemo;

/*
* In this we have Doctor and Engineer class and
* we're directly calling the display methods of both of the
* classes directly in the display method of TightCoupling class
* which makes the code tightly coupled.*/
class Doctor implements Job
{
    @Override
    public void display() {
        System.out.println("This is doctor.");
    }
}

class Engineer implements Job{
    @Override
    public void display() {
        System.out.println("This is engineer.");
    }
}
public class TightCoupling implements Job{
    Doctor doctor;
    Engineer engineer;

    public TightCoupling(Doctor doctor, Engineer engineer) {
        this.doctor = doctor;
        this.engineer = engineer;
    }

    @Override
    public void display() {
        doctor.display();
        engineer.display();
    }

    public static void main(String[] args) {

        Engineer engineer1 = new Engineer();
        Doctor doctor1 = new Doctor();

        TightCoupling tightCoupling = new TightCoupling(doctor1, engineer1);
        System.out.println("Tightly coupled code example");
        System.out.println("------------------------------");
        tightCoupling.display();
    }
}
