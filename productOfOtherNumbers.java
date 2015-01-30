import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
Write a function get_products_of_all_ints_except_at_index() that takes an array of integers and returns an array of the products.

For example, given:

  [1, 7, 3, 4]
your function would return:

  [84, 12, 28, 21] */


public class productOfOtherNumbers {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while((line=br.readLine())!=null)
		{
			arr.add(Integer.parseInt(line));
		}
		//System.out.println(arr.size());
		int prod=1;
		ArrayList<Integer> pds = new ArrayList<Integer>();
		for(int i = arr.size()-1;i>0;i--)
		{
			prod = prod * arr.get(i);
			pds.add(prod);
		}
		
		System.out.println(pds);
		
		prod = 1;
		for(int i=0;i<arr.size()-1;i++ )
		{
			//System.out.println(pds.get(pds.size()-1-i));
			//System.out.println(prod *pds.get(pds.size()-1-i));
			System.out.println(prod*pds.get(pds.size()-1-i));
			prod = prod * arr.get(i);
		}
		
	}

}
