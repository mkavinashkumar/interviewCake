import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


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
