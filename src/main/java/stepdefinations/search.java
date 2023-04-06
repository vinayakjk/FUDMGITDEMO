package stepdefinations;

public class search {
	
	public String diaplyProduct(product product) {
		
		if(product.getProductList().contains(product.getProductName()))
		{
			return product.getProductName();
			
		}
		return null;
		 
	}

}
