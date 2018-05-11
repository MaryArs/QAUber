package insurance;

public class InsurancePolicy {
    public String insuranceName;
    private String userInsuranceName;
    public int insurancePlanID;
    private int copay;
    private boolean isActive;

    public InsurancePolicy(String insuranceName, String userInsuranceName,
                           String groupNumber, int insurancePlanID, int copay, boolean isActive) {
        this.insuranceName = insuranceName;
        this.userInsuranceName = userInsuranceName;
        this.insurancePlanID = insurancePlanID;
        this.copay = copay;
        this.isActive = isActive;
    }

    public void changeInsurance(String newInsuranceName) {
        insuranceName = newInsuranceName;
    }

    public void changeInsurancePlan(int newInsurancePlanID) {
        insurancePlanID = newInsurancePlanID;
    }

    public boolean suspendInsurance() {
        isActive = false;
        return isActive;
    }

    public boolean resumeInsurance() {
        isActive = true;
        return isActive;
    }

    public boolean checkStatus() {
        return isActive;
    }

}