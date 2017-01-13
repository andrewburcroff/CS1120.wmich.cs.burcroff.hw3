public class CellPhone {

	private String model;
	private double retailPrice;
	private String manufact;
	
	public CellPhone(String man, String mod, double Price){
		manufact = man;
		model = mod;
		retailPrice = Price;
	}
	
	public void setManufact(String man) {
		manufact = man;
	}

	public void setMod(String mod) {
		model = mod;
	}

		public void setPricePrice(double price) {
		retailPrice = price;
	}

	public String getManufact() {
		return manufact;
	}	
	
	public String getModel(){
		return model;
	}
	
	public double getRetailPrice(){
		return retailPrice;
	}
}
