import java.util.Scanner;

public class Policy {
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
    * Constructor that initializes fields to the default values.
    */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyholderFirstName = "";
        this.policyholderLastName = "";
        this.policyholderAge = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

     /**
     * Constructor that initializes all Policy fields.
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param policyholderFirstName the policyholder's first name
     * @param policyholderLastName the policyholder's last name
     * @param policyholderAge the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
    public Policy(String policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String smokingStatus,
                  double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
    * Gets policy number.
    * @return the policy number
    */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
    * Sets policyholder's age.
    * @param policyholderAge the age to set
    */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
    * Gets the provider name.
    * @return the provider name
    */
    public String getProviderName() {
        return providerName;
    }

    /**
    * Sets the provider name.
    * @param providerName provider name to set
    */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
    * Gets policyholder first name.
    * @return the first name
    */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /**
    * Sets the policyholder first name.
    * @param policyholderFirstName the first name to set
    */
    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }
    
    /**
    * Gets the policyholder last name.
    * @return the last name
    */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /**
    * Sets the policyholder last name.
    * @param policyholderLastName the last name to set
    */
    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    /**
    * Gets the policyholder age.
    * @return the age
    */
    public int getPolicyholderAge() {
        return policyholderAge;
    }
    
    /**
    * Calculates and returns the BMI of the policyholder.
    * @return the BMI value
    */
    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }
   
    /**
    * Gets smoking status.
    * @return the smoking status
    */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
    * Sets a smoking status.
    * @param smokingStatus the smoking status to set
    */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
    * Gets height.
    * @return the height in inches
    */
    public double getHeight() {
        return height;
    }

    /**
    * Sets the height.
    * @param height the height in inches to set
    */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
    * Gets weight.
    * @return the weight in pounds
    */
    public double getWeight() {
        return weight;
    }
      
    /**
    * Sets weight.
    * @param weight the weight in pounds to set
    */  
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
   /**
   * Calculates and returns the BMI of the policyholder.
   * @return the BMI value
    */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
    * Calculates and returns the policy price.
    * @return the total policy price
    */
    public double calculatePolicyPrice() {
        double policyPrice = 600.0;

        if (policyholderAge > 50) {
            policyPrice += 75.0;
        }

        if (smokingStatus.equals("smoker")) {
            policyPrice += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            policyPrice += (bmi - 35) * 20;
        }

        return policyPrice;
    }
 }

    