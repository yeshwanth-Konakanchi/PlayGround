package com.crmindz.bcjmay2017.oops.inheritance.lab4;

/**
 * @author Yeshwanth Konakanchi
 * This class has functionality to check whether student Under graduated or not.
 */
public class Under_graduateStudent extends Student{
	
	private static final int TOTAL_UG_CREDITS = 42;
	private String underGradMajor;
	private int creditsCompleted;
	
	
public boolean isUnderGraduated(){
		
		if(TOTAL_UG_CREDITS == creditsCompleted){
			return true;
		}else
		return false;
	}


/**
 * @return the underGradMajor
 */
public String getUnderGradMajor() {
	return underGradMajor;
}


/**
 * @param underGradMajor the underGradMajor to set
 */
public void setUnderGradMajor(String underGradMajor) {
	this.underGradMajor = underGradMajor;
}


/**
 * @return the creditsCompleted
 */
public int getCreditsCompleted() {
	return creditsCompleted;
}


/**
 * @param creditsCompleted the creditsCompleted to set
 */
public void setCreditsCompleted(int creditsCompleted) {
	this.creditsCompleted = creditsCompleted;
}


/**
 * @return the totalUgCredits
 */
public static int getTotalUgCredits() {
	return TOTAL_UG_CREDITS;
}

@Override
public String toString() {
	return "StudentName = "	+ getStudentName()+ "\nStudentId = " + getId() + "\nCurrentYear = " + getCurrentYear() +" \nGradMajor = " + getUnderGradMajor() + "\nCreditsCompleted = " + getCreditsCompleted()
			 + "\nSchoolName = " + getSchoolName() ;
}



}
