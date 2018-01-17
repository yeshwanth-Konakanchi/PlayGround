package com.crmindz.bcjmay2017.oops.inheritance.lab4;

/**
 * @author Yeshwanth Konakanchi
 * This class is a demo class for inheritance of Student types in a university.
 */
public class StudentDemo {

	public static void main(String[] args) {
		MastersStudent ms = new MastersStudent();
		ms.setStudentName("Siva Reddy");
		ms.setId(1234);
		ms.setSchoolName("University of Central Missouri");
		ms.setMajor("MSCS");
		ms.setCurrentYear("Final Year");
		ms.setCreditsCompleted(30);
		ms.setFinalProject("Ping Pong Project");
		
		if(ms.isGraduated()){
			System.out.println("Congrats! \nYou are Graduated");
			
		System.out.println(ms.toString());
		System.out.println("project = "+ms.getFinalProject());
		}
		else{
			System.out.println("Student Not Garduated!!! \nCredits to be completed  = "+(MastersStudent.getTotalCreditsRequired()-ms.getCreditsCompleted()));
		}
		
		
		Freshman fr = new Freshman();
		fr.setStudentName("Puneeth");
		fr.setId(1111);
		fr.setSchoolName("University of Florida");
		fr.setUnderGradMajor("IT");
		fr.setCurrentYear("1st Year");
		fr.setCreditsCompleted(12);
		fr.setFinalSeminar("Devapps TOOLS");
		
		if(fr.isUnderGraduated()){
		
		System.out.println("Congrats! \nYou are an UnderGraduate");
		System.out.println("\n\n"+fr.toString());
		System.out.println("Semionr given on = "+fr.getFinalSeminar());
		}else{
		System.out.println("\n\nStudent Not UnderGraduated \nCredits to be completed  = "+(Under_graduateStudent.getTotalUgCredits()-fr.getCreditsCompleted()));
		System.out.println("\n"+fr.toString());
		}
				
	}
}
