import java.util.*;
import java.io.*;
import java.lang.*;

class Item implements Comparable<Item>
{
	int wt;
	int val;

	Item(int w, int v)
	{
		wt = w;
		val = v;
	}

	public int compareTo(Item i)
	{
		return wt * i.val - val * i.wt;
	}

}


class Main
{ 

    static double fracKnapSack(Item arr[], int n, int W)
    {	
	    Arrays.sort(arr);

	    double  res = 0.0;

	for(int i = 0; i < n; i++)
	{
		if(arr[i].wt <= W)
		{
			res += arr[i].val;

			W = W - arr[i].wt;
		}
		else
		{
			res += arr[i].val * ((double) W / arr[i].wt);

			break;
		}
	}


	return res;
    }

    public static void main(String args[]) 
    {
    	Item arr[] = {new Item(10, 60), 
    				  new Item(40, 40), 
    				  new Item(20, 100),
    				  new Item(30, 120)};

    	int n = 4, W = 50;

        System.out.println(fracKnapSack(arr, n, W));

    } 

}
