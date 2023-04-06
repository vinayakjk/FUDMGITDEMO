package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	product product;
	search search ;
	
	@Given("I have a search filed on Amazon page")
	public void i_have_a_search_filed_on_amazon_page() {
		System.out.println("Step1: Im on search page");

	}

	@When("I have search product with name {string} and price {int}")
	public void i_have_search_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step2: Search product name "+productName+ " with price " +price);
		
		product = new product(productName,price);
		
	}

	@Then("Product with name {string} should be display")
	public void product_with_name_should_be_display(String productName) {

		System.out.println("Step3: The product with name "+ productName +"is displayed."  );
		
		search search = new search();
		String prodName= search.diaplyProduct(product);
		System.out.println("Searched product is "+ prodName);
		
		Assert.assertEquals(product.getProductName(),prodName);
		
	}

}
