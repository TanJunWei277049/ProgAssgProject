package Project;

import javax.swing.JTable;

public class STotalPrice implements SPayment { 


	public double disc() {
		JTable t = SManageStorageType.getTable();
		double disc;
		if (t != null) {
			disc = Double.parseDouble(SManageAdvertisement.getDisc())/100;
		}
		else
			disc = 0;
		return disc;
	}
	

		public double rentPrice(String selection, int day) {
			JTable t = SManageStorageType.getTable();
			String pr = "";
			double price=0;
			
			for(int i = 0; i<t.getRowCount(); i++) { 
				if (selection.equals(String.valueOf( t.getValueAt(i, 0)))) {
					pr =String.valueOf( t.getValueAt(i, 1));							//set price
					price=Integer.parseInt(pr);
				}
			}
					if(day<7) {
						return price;
					}
					else if(day>=7 && day<30) {
						return price-20;
					}
					else {
						return price-(price*disc());
					}
				}	
		
		public double getPayment(String selection, int day) { //overloading method with 2 argument
															  
			return rentPrice(selection, day)*day;	
	}
		
		public double getPayment(String selection, int day, double disc) { // overloading method with 3 argument
																		  		
			return rentPrice(selection, day)*day;
		}
		
}
