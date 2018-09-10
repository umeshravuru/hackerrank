package webScrap.org.webScrap;

import java.awt.Frame;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class person{
	String name;
	int CIBIL;
	int NEGATIVE;
	
	public person(String name, int CIBIL ,int NEGATIVE) {
		super();
		this.name = name;
		this.CIBIL = CIBIL;
		this.NEGATIVE = NEGATIVE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCIBIL() {
		return CIBIL;
	}

	public void setCIBIL(int cIBIL) {
		CIBIL = cIBIL;
	}

	public int getNEGATIVE() {
		return NEGATIVE;
	}

	public void setNEGATIVE(int nEGATIVE) {
		NEGATIVE = nEGATIVE;
	}
	
	public static Comparator<person> personCompataror = new Comparator<person>() {

		@Override
		public int compare(person o1, person o2) {
			// TODO Auto-generated method stub
			if(o1.getCIBIL() > o2.getCIBIL())
				return -1;
			else if(o1.getCIBIL() < o2.getCIBIL())
				return 1;
			else {
				if(o1.getNEGATIVE() > o2.getNEGATIVE())
					return 1;
				else if(o1.getNEGATIVE() < o2.getNEGATIVE())
					return -1;
				else{
					return o2.getName().compareTo(o1.getName());
				}
			}
		}
	};
	
	
}
public class CIBIL_Score {
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = Integer.parseInt(s.nextLine());
		
		for(int ii =0;ii<t;ii++){
			int n = Integer.parseInt(s.nextLine());
			person[]  plist = new person[n];
			for(int i =0;i<n;i++){
			String data[] = s.nextLine().split(" ");
			plist[i] = new person(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
			}
//			disp(plist);
			Arrays.sort(plist, person.personCompataror);
			disp(plist);
			int need = Integer.parseInt(s.nextLine());
			System.out.println(plist[need-1].getName() +" "+ plist[need-1].getCIBIL());
		}
		
		
		
		
	}
	public static void disp(person [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.println(data[i].getName() + " "+data[i].getCIBIL() + " "+ data[i].getNEGATIVE());
		}
		System.out.println("");
	}


}
