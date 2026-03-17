public class HospitalMain {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            // input
            System.out.print("Enter Patient Name: ");
String pName = sc.nextLine();

// check: only letters and spaces
if (!pName.matches("[a-zA-Z ]+")) {
    throw new Exception("Name must contain only letters!");
}

            System.out.print("Enter Room Number: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Doctor Name: ");
String dName = sc.nextLine();

if (!dName.matches("[a-zA-Z ]+")) {
    throw new Exception("Invalid Doctor Name! Only letters allowed.");
}

            System.out.print("Enter Bill Amount: ");
            double amount = sc.nextDouble();

            // objects
            Patient patient = new Patient(pName, room);
            Doctor doctor = new Doctor(dName);
            Billing bill = new Billing(amount);

            // output
            patient.showDetails();
            patient.schedule();
            doctor.work();
            bill.showBill();

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Try again.");
        } finally {
            sc.close();
        }
    }
}