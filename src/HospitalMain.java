import java.util.*;
import java.io.*;

public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patientList = new ArrayList<>();

        try {
            // how many patients
            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.print("Enter Patient Name: ");
                String pName = sc.nextLine();

                if (!pName.matches("[a-zA-Z ]+")) {
                    throw new Exception("Invalid name!");
                }

                System.out.print("Enter Room Number: ");
                int room = sc.nextInt();
                sc.nextLine();

                // store in list
                Patient p = new Patient(pName, room);
                patientList.add(p);
            }

            // -------- SAVE TO FILE --------
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

            for (Patient p : patientList) {
                bw.write("Name: " + p.getName() + ", Room: " + p.getRoomNo());
                bw.newLine();
            }

            bw.close();
            System.out.println("Data saved.");

            // -------- READ FROM FILE --------
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;
            System.out.println("\n--- Data from file ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}