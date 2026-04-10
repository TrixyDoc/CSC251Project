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
            
            PolicyHolder holder = new PolicyHolder(firstName, lastName, age,
                    smokingStatus, height, weight);
            Policy policy = new Policy(Integer.parseInt(policyNumber), providerName, holder);

            policies.add(policy);
        }

        inputFile.close();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy p : policies) {
            System.out.println(p);
            System.out.println();
            
            if (p.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }
        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}