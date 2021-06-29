package Project;

public interface SPayment {   // interface
	double disc();
	double rentPrice(String selection, int day); //method with 2 argument
	double getPayment(String selection, int day);//method with 2 argument
	double getPayment(String selection, int day, double disc); //method with 3 argument
}
