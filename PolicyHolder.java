public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // Constructor statements below
   public PolicyHolder(String firstName, String lastName, int age,
                       String smokingStatus, double height, double weight){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.smokingStatus = smokingStatus;
       this.height = height;
       this.weight = weight;
   }
   
   // Getter statements below
   public String getFirstName(){
        return firstName;
   }
   
   public String getLastName(){
        return lastName;
   }

   public int getAge() {
        return age;
   }

   public String getSmokingStatus() {
        return smokingStatus;
   }

   public double getHeight() {
        return height;
   }

   public double getWeight() {
        return weight;
   }
   
   // BMI Calculation statement
   public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

   
    public String toString() {
        return "Policyholder's First Name: " + firstName +
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
               "\nPolicyholder's Height: " + height + " inches" +
               "\nPolicyholder's Weight: " + weight + " pounds" +
               "\nPolicyholder's BMI: " + String.format("%.2f", calculateBMI());
    }
}