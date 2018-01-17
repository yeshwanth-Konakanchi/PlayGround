package com.crmindz.bcjmay2017.oops.inheritance.lab4;

/**
 * @author Yeshwanth Konakanchi
 * This class inhertis the GraduateStudent class.
 */
public class MastersStudent extends GraduateStudent{

	private String finalProject;

	/**
	 * @return the finalProject
	 */
	public String getFinalProject() {
		return finalProject;
	}

	/**
	 * @param finalProject the finalProject to set
	 */
	public void setFinalProject(String finalProject) {
		this.finalProject = finalProject;
	}

		
	@Override
	public String toString() {
		return "StudentName = "	+ getStudentName()+ "\nStudentId = " + getId() + "\nCurrentYear = " + getCurrentYear() +" \nGradMajor = " + getMajor() + "\nCreditsCompleted = " + getCreditsCompleted()
				 + "\nSchoolName = " + getSchoolName() ;
	}
}
