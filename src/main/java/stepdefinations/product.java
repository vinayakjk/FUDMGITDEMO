package stepdefinations;

import java.util.ArrayList;
import java.util.List;

public class product {
	
	private String productName;
	private int price;
	
	public product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public List<String> getProductList(){
			List <String> productList= new ArrayList<>();
			productList.add("Apple Mobile");
			productList.add("Apple TV");
			productList.add("Apple Tab");
			productList.add("Apple Watch");
			
		return productList;
		
	}
	

}
