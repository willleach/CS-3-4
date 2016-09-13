import java.io.*;

class PayTable2 {

public static void main(String args[]) {
	
	System.out.println("Month       Amt_Left       Principal_Paid       Total_Paid");
	
    int counter = 0;
	double Principal = 0;
	double Total = 0;
	double Amount = 270000;
	double showAmt = 0;
	double monthly = 1242.76;
	double intpaid = 0;
	double princpaid = 0;
	
for (int i = 1; i < 361; i++) {

    intpaid = intpaid + (Amount * (0.037/12.0));
    princpaid = princpaid + (monthly - (Amount * (0.037/12.0)));
    counter++;
	
	Amount = Amount - (monthly - (Amount * (0.037/12.0)));

	if (i % 12 == 0) {

	counter++;
	Amount = Amount - monthly;

    }
	
	if (Amount <= 0) {

	// Month
	System.out.println(i + "          " + showAmt + "          " + Principal + "            " + counter*monthly);
	
	System.exit(1);
	}

	
	// Month
	System.out.println(i + "          " + Amount + "          " + princpaid + "            " + counter*monthly);
	
}



	


	
} // main
	
} // PayTable



