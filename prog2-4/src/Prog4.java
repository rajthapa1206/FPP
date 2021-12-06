public class Prog4 {
	
	public static void main(String[] args) {
		String[] productDetails = Data.records.split(":");
		String[] productIds = new String[productDetails.length];
		int i = 0;
		for (String productdetails : productDetails) {
			productIds[i] = productdetails.split(",")[0];
			System.out.println(productIds[i]);
			i++;
		}
	}
}