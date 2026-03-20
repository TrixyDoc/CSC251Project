import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        ArrayList<Policy> policies = new ArrayList<>();

        while (inputFile.hasNext()) {

            String policyNumber = inputFile.nextLine();
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = Integer.parseInt(inputFile.nextLine());
            String smokingStatus = inputFile.nextLine();
            double height = Double.parseDouble(inputFile.nextLine());
            double weight = Double.parseDouble(inputFile.nextLine());

            Policy policy = new Policy(policyNumber, providerName, firstName,
                    lastName, age, smokingStatus, height, weight);

            policies.add(policy);
        }

        inputFile.close();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy p : policies) {
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("Policyholder's First Name: " + p.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + p.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + p.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.println("Policyholder's Height: " + p.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + p.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", p.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n\n", p.calculatePolicyPrice());

            if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}