import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class highestProductOf3nlogn {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while((line =br.readLine())!=null)
		{
			arr.add(Integer.parseInt(line));
		}
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		System.out.println("The biggest product is "+arr.get(0)*arr.get(1)*arr.get(2));
		
	}

}
