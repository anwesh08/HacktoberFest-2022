import java.util.*;
import java.io.*;
import java.lang.*;

class Activity
{
	int start;
	int finish;

	Activity(int s, int f)
	{
		start = s;
		finish = f;
	}
}

class MyCmp implements Comparator<Activity>
{
	public int compare(Activity a1, Activity a2)
	{
		return a1.finish - a2.finish;
	}
}

class Main
{ 

    static int maxActivity(Activity arr[], int n)
    {	
	    Arrays.sort(arr, new MyCmp());

	    int res = 1;
	    int prev = 0;

	    for(int curr = 1; curr < n; curr++)
	    {
	       
	    	if(arr[curr].start >= arr[prev].finish)
	    	{
	    		res++;

	    		prev = curr;
	    	}
	    }

	    return res;
    }

    public static void main(String args[]) 
    {
    	Activity arr[] = {new Activity(12, 25), 
    					  new Activity(10, 20), 
    					  new Activity(20, 30)};
    	int n = 3;

        System.out.println(maxActivity(arr, n));

    } 

}
