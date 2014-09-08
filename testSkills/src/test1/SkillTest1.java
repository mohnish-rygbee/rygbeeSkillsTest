package test1;
import java.util.ArrayList;
public class SkillTest1 {

	public String dupliRemove(String str)
	{
		ArrayList<String> strings =  new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			   strings.add(str.substring(i, i+1));
			    }
		for (int i = 0; i < strings.size();i++)
		{
			for(int j = i+1;j < strings.size();j++)
			{
				if(strings.get(i).equals(strings.get(j)))
				{	strings.remove(j);
					j--;}
				}
		}
		str="";
		for (int i = 0; i < strings.size(); i++) {
			   str=str+strings.get(i);
			    }
	return str;
	}
	
	
	public String consecutiveDuplicateRemove(String str)
	{
		ArrayList<String> strings =  new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			   strings.add(str.substring(i, i+1));
			    }
		
		for (int i = 0; i < strings.size()-1;)
		{
			if(strings.get(i).equals(strings.get(i+1)))
				{	strings.remove(i);
					}
			else
				{i++;
				}
		}
		str="";
		for (int i = 0; i < strings.size(); i++) {
			   str=str+strings.get(i);
			    }
	return str;
	}
	
}
