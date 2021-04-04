public class emp {
       	public static final int IS_PART_TIME = 1;
	public static final int IS_FLL_TIME =2;
	 public static final int EMP_RATE_PER_HR =20;
	 public static final int NUM_OF_WORKING_DAYS =2;
	 public static final int MAX_HR_IN_MONTH = 10;

public static int computeEmpWage () {
int empHr=0,totalEmpHr=0,totalWorkingDays=0;
while (totalEmpHr <=  MAX_HR_IN_MONTH  && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
totalWorkingDays ++;
int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck) {

case IS_PART_TIME:
empHr =4;
break;

case IS_FLL_TIME:
empHr=8;
break;

default :
empHr=0;
}
totalEmpHr += empHr;
System.out.println("Days :" +  totalWorkingDays +"Emp Hr :" +empHr);
}
int totalEmpWage = totalEmpHr * EMP_RATE_PER_HR;
System.out.println("Total Emp Wage:" +totalEmpWage);
return totalEmpWage;
}
public static void main(String[] args)
{
computeEmpWage();
}
}
