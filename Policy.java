public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0;
    
    public Policy(int policyNumber, String providerName, PolicyHolder policyholder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyholder;
        policyCount++;
    }

    
    public int getPolicyNumber() {
        return policyNumber;
    }
    
  
    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    /**
    * Calculates and returns the policy price.
    * @return the total policy price
    */
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyHolder.getAge() > 50) {
            price += 75.0;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
    
    //Provides output for information.
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName + "\n" +
               policyHolder.toString() +
               "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }
 }

    