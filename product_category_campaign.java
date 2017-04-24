package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.List;

public class product_category_campaign {
	interface CustomerPurchase {
		String getCustomerId();

		String getProductCategory();
	}

	static int countExclusiveCustomers(List<CustomerPurchase> customerPurchases) {
		int ans = 0;
		HashMap<String, HashSet<String>> purchase_table = new HashMap<>();
		HashMap<String, Integer> purchase_count = new HashMap<>();
		Iterator<CustomerPurchase> ite = customerPurchases.iterator();

		HashMap<String, HashSet<String>> category_table = new HashMap<>();

		while (ite.hasNext()) {
			CustomerPurchase temp = ite.next();
			String person_id = temp.getCustomerId().toLowerCase();
			String category = temp.getProductCategory();
			if (purchase_table.get(person_id) == null) {
				HashSet<String> tem = new HashSet<>();
				tem.add(category);
				purchase_table.put(person_id, tem);
			} else {
				HashSet<String> tem = purchase_table.get(person_id);
				if (tem.contains(category)) {

				} else {
					tem.add(category);
				}
				purchase_table.put(person_id, tem);
			}

			if (category_table.get(category) == null) {
				HashSet<String> tem = new HashSet<>();
				tem.add(person_id);
				category_table.put(category, tem);
			} else {
				HashSet<String> tem = category_table.get(category);
				if (tem.contains(person_id)) {

				} else {
					tem.add(person_id);
				}
				category_table.put(category, tem);
			}

		}

		HashSet<String> isolated_person = new HashSet<>();
		for (String key : purchase_table.keySet()) {
			if (purchase_table.get(key).size() == 1)
				isolated_person.add(key);
		}
		int max =-1;
		for(String key : category_table.keySet())
		{
			HashSet<String> tem = category_table.get(key);
			Iterator<String> ite1 = tem.iterator();
			int tem_max =0;
			while(ite1.hasNext())
			{
				String current_id = ite1.next();
				if(isolated_person.contains(current_id))
				{
					tem_max++;
				}
			}
			if(tem_max>max)
				max = tem_max;
		}
	
		
		System.out.println(isolated_person);

		return max;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		final List<CustomerPurchase> _customerPurchases = new ArrayList<>();
		while (in.hasNext()) {
			_customerPurchases.add(_createCustomerPurchase(in.nextLine()));
		}

		res = countExclusiveCustomers(_customerPurchases);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}

	private static CustomerPurchase _createCustomerPurchase(String line) {
		final String[] split = line.split(" ");
		if (split.length != 2) {
			return null;
		}
		return new CustomerPurchase() {
			@Override
			public String getCustomerId() {
				return split[0];
			}

			@Override
			public String getProductCategory() {
				return split[1];
			}
		};
	}

}
