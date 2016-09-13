import java.io.*;

class PayTable {

public static void main(String args[]) {
	
	System.out.println("Month       Amt_Left       Principal_Paid       Total_Paid");
	

for (int i = 1; i < 361; i++) {
	
	// Total Paid
	double Total = 0;
	Total = ((double)i * 1242.76);
	Total = Math.round(Total * 100);
	Total = Total/100;
	
	// Payment
	double P;
	double Present = 270000;
	double RP = .037d/12.0d;
	double NP = 360;
	P = (RP * Present)/(1 - Math.pow(1 + RP, (-1 * (NP))));
	
	// Future Balance
	double Future;
	int N = (i);
	double R = (.037d)/(12.0d);
	Future = (Present * Math.pow(1 + R, N)) - (P * (Math.pow(1 + R, N) - 1)/(R));
	System.out.println(Future);
	
	double Amount = 270000;
	// Principal Paid
	double Principal;
	Principal = (Amount - Future);
	Principal = Math.round(Principal * 100);
	Principal = Principal/100;

	// Amount Left
	
	Amount =(Amount - Principal);
	Amount = Math.round(Amount * 100);
	Amount = Amount/100;
	
	// Month
	System.out.println(i + "          " + Amount + "          " + Principal + "            " + Total);
	
}
	
} // main
	
} // PayTable



