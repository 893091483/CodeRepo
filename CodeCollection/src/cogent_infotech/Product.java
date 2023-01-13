/**
 * 
 */
package cogent_infotech;

/**
 * @author : Jialin Zheng
 * Jan 11, 2023
 */
public class Product {
	int productId;
	String productName;
	int productPrice;
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product(int productId,String productName,int productPrice) {
		this.productId= productId  ;
		this.productName = productName;
		this.productPrice = productPrice ;
		
	}
	
	
	
}
