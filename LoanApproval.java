public class LoanApproval {
    public static void main(String[] args){
        int age=60;
        int salary=80000;
        boolean loanApproval=false;
            if(age>=20 && age<=35 && salary>=30000){
                loanApproval=true;
            }
            else if(age>=35 && age<=45 && salary>=40000){
                loanApproval=true;
            }
            else if(age>45 && age<=60 && salary>=60000){
                loanApproval=true;
            }
            else{
                loanApproval=false;
            }
        System.out.println("loan Approval status:" +loanApproval);
        }


}


    

    
    

