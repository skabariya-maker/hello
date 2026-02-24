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