package automatic.type.promotions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientLearning implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private transient String ssnNumber;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	
	public static void main(String[] args) {
		try
		{
		   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\varun chakravarthy\\OneDrive\\Desktop\\empInfo.ser"));
		   TransientLearning emp = new TransientLearning();
		   emp.setFirstName("Varun Chakravarthy");
		   emp.setLastName("Gumpena");
		   emp.setSsnNumber("123-45-6789");
		   //Serialize the object
		   oos.writeObject(emp);
		   oos.close();
		   System.out.println("Done");
		} catch (Exception e)
		{
		   System.out.println(e);
		}
		
		try
		{
		   ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("C:\\Users\\varun chakravarthy\\OneDrive\\Desktop\\empInfo.ser"));
		   //Read the object back
		   TransientLearning readEmpInfo = (TransientLearning) ooi.readObject();
		   System.out.println(readEmpInfo.getFirstName());
		   System.out.println(readEmpInfo.getLastName());
		   System.out.println(readEmpInfo.getSsnNumber());
		   ooi.close();
		} catch (Exception e)
		{
		   System.out.println(e);
		}
	}

}
