// VERY BASIC Hospital Management System

// -------- ABSTRACT CLASS 1 --------
abstract class Person {
    private String name;   // encapsulation

    Person(String name) {
        this.name = name;   // using this
    }

    public String getName() {
        return name;
    }
}

// -------- ABSTRACT CLASS 2 --------
abstract class Staff extends Person {

    Staff(String name) {
        super(name);  // using super
    }

    abstract void work();   // must be overridden
}

// -------- INTERFACE 1 --------
interface Billable {
    void showBill();
}

// -------- INTERFACE 2 --------
interface Schedulable {
    void schedule();
}

// -------- CONCRETE CLASS 1 --------
class Patient extends Person implements Schedulable {

    private int roomNo;

    Patient(String name, int roomNo) {
        super(name);
        this.roomNo = roomNo;
    }

    @Override
    public void schedule() {
        System.out.println("Appointment scheduled for " + getName());
    }

    public void showDetails() {
        System.out.println("Patient: " + getName() + ", Room: " + roomNo);
    }
}

// -------- CONCRETE CLASS 2 --------
class Doctor extends Staff {

    Doctor(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Dr. " + getName() + " is treating patients.");
    }
}

// -------- CONCRETE CLASS 3 --------
class Billing implements Billable {

    private double amount;

    Billing(double amount) {
        this.amount = amount;
    }

    @Override
    public void showBill() {
        System.out.println("Total Bill Amount: " + amount);
    }
}

// -------- MAIN CLASS --------
public class HospitalMain {

    public static void main(String[] args) {

        Patient patient = new Patient("Sakshi", 12);
        Doctor doctor = new Doctor("Mehta");
        Billing bill = new Billing(1500);

        patient.showDetails();
        patient.schedule();

        doctor.work();

        bill.showBill();
    }
}