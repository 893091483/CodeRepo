/**
 * 
 */
package cogent_infotech;

/**
 * @author : Jialin Zheng
 * Jan 11, 2023
 */
public class createProduct {
	public static void main(String[] args) {
		Product[] productList = new Product[2];
		productList[0] = new Product(001, "a", 1000);
		productList[1] = new Product(002, "b", 2000);
		for(Product i : productList) {
			System.out.println(i.getProductId()+  " "+ i.getProductName() +  " "+ i.getProductPrice());
		}
	}
}
