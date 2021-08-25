package Questions;

public class Singleton_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XYZ yy=XYZ.getInstance();
        XYZ jj=XYZ.getInstance(); 	
	
        System.out.println(yy);
        System.out.println(jj);
	}

}

class XYZ {
	
	static XYZ xy=new XYZ();
	
	private XYZ() {
		
	}
	
	public static XYZ getInstance()
	{
		return xy;
	}
	
}



