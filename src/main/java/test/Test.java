package test;

import insurance.InsurancePolicy;

public class Test {
    public static void main(String[] args){
        InsurancePolicy myInsurance = new InsurancePolicy("Cigna", "Marina Arsitova",
                "0061895", 123, 40, true );

//check status of insurance policy
        boolean status = myInsurance.checkStatus();
        System.out.println(status);
//suspend insurance policy
        status = myInsurance.suspendInsurance();
        System.out.println(status);
//resume insurance policy
        status = myInsurance.resumeInsurance();
        System.out.println(status);
//change insurance
        myInsurance.changeInsurance("Anthem");
        myInsurance.changeInsurancePlan(456);
        System.out.println(myInsurance.insuranceName);
        System.out.println(myInsurance.insurancePlanID);

    }
}
