import java.util.Scanner;

/**
 * The ComplexNumber class should provide basic operations such as 
 * addition, subtraction, multiplication and division.
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Student Name>
 * 
 * @version: 1.0
 * @author Santosh Kumar M
 * Date:24-11-2020
 */

public class ComplexNumber {

	//	Declare the attributes of the class below and write the documentation
	// comments for the declared attributes..

	/**
	 * The following is a parameterized constructor that sets up the default
	 * values for real and imaginary parts of a complex number.
	 * 
	 * @param real: The real part of this complex number.
	 * @param imag: The imag part of this complex number.
	 */
	double real;
	double imag;
	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	/**
	 * This method performs the addition of two complex numbers and returns the 
	 * result as as complex number which of this (ComplexNumber) class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber add(ComplexNumber r2) {
		ComplexNumber result = new ComplexNumber(0, 0);
		result.real = this.real+r2.real;
		result.imag = this.imag+r2.imag;
		return result;
	}


	/**
	 * This method performs the subtraction of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber subtract(ComplexNumber r2) {
		// return null;
		ComplexNumber result = new ComplexNumber(0, 0);
		result.real = this.real-r2.real;
		result.imag = this.imag-r2.imag;
		return result;
	}

	/**
	 * This method performs the multiplication of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber multiply(ComplexNumber r2) {
		//mul is r1*r2 = ((r1.real*r2.real) - (r1.imag*r2.imag)) +i((r1.real*r2.imag)+(r2.real*r1.imag))
		ComplexNumber result = new ComplexNumber(0, 0);
		result.real = ((this.real*r2.real) - (this.imag*r2.imag));
		result.imag = ((this.real*r2.imag)+(r2.real*this.imag));
		return result;
	}

	/**
	 * This method performs the multiplication of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @return String: the string version of the ComplexNumber object.
	 * Following is the string version. real + imag i
	 * Example:
	 * 		3.0 + 4.0i
	 * 		6.0 - 4.0i
	 * 		0.0 + 1.0i
	 */
	public String toString() {
		if(this.real == 0 && this.imag == 0)
		{
			return "0.0";
		}
		if(this.real == 0 && this.imag!=0)
		{
			return (this.imag)+"i";
			
		}
		if(this.real != 0 && this.imag == 0)
		{
			return this.real+"";
		}
		if(this.real != 0 && this.imag != 0)
		{
			if(this.imag<0)
				return this.real+" - "+Math.abs(this.imag)+"i";
			return this.real+" + "+this.imag+"i";
		}
		if(this.imag<0)
			return this.real+" - "+Math.abs(this.imag)+"i";
		return this.real+" + "+this.imag+"i";
	}


	/**
	 * Don't change the following code.
	 * 
	 * The following is a main method which is used to test the ComplexNumber
	 * class.
	 * 
	 * @param args: The command line args. No need to pass any command line 
	 * arguments at the time of executing this program.
	 * 
	 */
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		
		ComplexNumber r = null;
		
		while (sc.hasNext() && i < n) {
			switch (sc.next()) {
				case "Complex":
					r = new ComplexNumber(
						Double.parseDouble(sc.next()), 
						Double.parseDouble(sc.next()));
					System.out.println(r);
					break;

				case "plus":
					ComplexNumber r1 = new ComplexNumber(
						Double.parseDouble(sc.next()), 
						Double.parseDouble(sc.next()));
					System.out.println(r.add(r1));
					break;

				case "minus":
					ComplexNumber r2 = new ComplexNumber(
						Double.parseDouble(sc.next()), 
						Double.parseDouble(sc.next()));
					System.out.println(r.subtract(r2));
					break;

				case "times":
					ComplexNumber r3 = new ComplexNumber(
						Double.parseDouble(sc.next()), 
						Double.parseDouble(sc.next()));
					System.out.println(r.multiply(r3));
					break;

				default:
					break;
			}
			i++;
		}
	}
}