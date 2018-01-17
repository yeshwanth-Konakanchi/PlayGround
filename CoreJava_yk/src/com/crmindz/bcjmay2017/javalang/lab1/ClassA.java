package com.crmindz.bcjmay2017.javalang.lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClassA extends ClassC implements Serializable {

	private static final long serialVersionUID = 1L;
	transient int i;
	int j;

	public static void main(String[] args) {

		ClassC c = new ClassC();
		ClassA a = new ClassA();
		ClassB b = new ClassB();

		c.s = "me";
		a.i = 5;
		a.j = 6;
		b.l = 50;
		File outFile = new File("Serial.ser");
		try {
			FileOutputStream fs = new FileOutputStream(outFile);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(a);
			os.writeObject(b);
			os.writeObject(c);
			os.close();
			FileInputStream fis = new FileInputStream(outFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ClassA e = (ClassA) ois.readObject();
			ClassB e1 = (ClassB) ois.readObject();
			ClassC e2 = (ClassC) ois.readObject();
			System.out.println("Deserialized ClassA instance 'a' state= " + e.i);
			System.out.println("Deserialized ClassA instance 'b' state= " + e1.l);
			System.out.println("Deserialized ClassA instance 'b' state= " + e2.s);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
