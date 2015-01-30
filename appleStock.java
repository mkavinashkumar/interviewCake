import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class appleStock {

	public static void main(String[] args) throws IOException {
		//		Writing interview questions hasn't made me rich. Maybe trading Apple stocks will.
		//		I have an array stock_prices_yesterday where:
		//
		//		The indices are the time, as a number of minutes past trade opening time, which was 9:30am local time.
		//		The values are the price of Apple stock at that time, in dollars.
		//		For example, the stock cost $500 at 10:30am, so stock_prices_yesterday[60] = 500.
		//
		//		Write an efficient algorithm for computing the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday. For this problem, we won't allow "shorting"—you must buy before you sell.



		// Using a fixed sized array
		//		System.out.println("Enter the size of the array");
		//		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//		int size = buf.read();
		//		int[] arr = new int[100];
		//		System.out.println("Enter the next "+size+"elements followed  by a return");
		//		for (int i = 0;i<size;i++)
		//		{
		//			arr[i] = buf.read();
		//		}

		// Using an array of dynamic size
		ArrayList<Integer> stockPrice = new ArrayList<Integer>();
		int arrSize = 0;

		//Using an interactive Cmd line method for reading data
		//		char c;
		//		do{
		//			System.out.println("Enter the Element");
		//			BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
		//			//stockPrice.add(buf1.read());
		//			System.out.println(buf1.read());
		//			arrSize++;
		//			System.out.println("Do you want to add an element y/n");
		//			BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
		//			c = buf2.readLine().toCharArray()[0];
		//		}while(c == 'y');

		// Using a file input 
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String j;
		while((j = br.readLine())!=null)
		{
			// Adding to a specific position on the arrayList
			stockPrice.add(arrSize,Integer.parseInt(j));
			arrSize++;
		}
		br.close();
		// Core Logic
		int max_profit=0,min_price = stockPrice.get(0);
		for(int i = 0 ;i<arrSize;i++)
		{
			if (stockPrice.get(i) < min_price)
			{
				min_price = stockPrice.get(i);

			}

			if((stockPrice.get(i)-min_price)>max_profit)
			{
				max_profit = stockPrice.get(i)-min_price;
			}
			//			System.out.println(stockPrice.get(i));
		}

		System.out.println("The maximum profit is "+max_profit);
	}

}
