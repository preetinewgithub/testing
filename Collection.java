package DynamicCollection;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Collection 
{
	public void DemoArrayList()
	{
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("hi");
		arrList.add("Welcome");
		arrList.add("Java");
		
		System.out.println(arrList.size());
       String value= arrList.get(2);
       System.out.println(value);
       for( String xyz   : arrList   )
       {
    	  System.out.println(xyz); 
       }
       
       
       
       
	}

	public void Verify()
	{
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		// Verify 30 is present or not
		
		for(  Integer number : arrList )
		{
			if(number==30)
			{
				System.out.println("30 is Present");
			}
		}
		
		boolean result=arrList.contains(30);
		System.out.println(result);
		
	}

	public void Demohashtable()
	{
		Hashtable<Integer, String> hst=new Hashtable<Integer, String>();
		hst.put(10, "a1");
		hst.put(20, "a2");
		
		
		System.out.println(hst.get(10));
		
		Set<Integer> allkeys =    hst.keySet(); // 10, 20
		
		for(  Integer var   :allkeys)
		{
			System.out.println(var);
			System.out.println(hst.get(var));
		}
		
		
		
		
		
		
	
		
	}
}
