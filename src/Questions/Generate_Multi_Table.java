package Questions;

public class Generate_Multi_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int totaln=10;
		int basenum=8;
		for(int nextn=1;nextn<=totaln;nextn++) {
			int answ=basenum*nextn;
			System.out.println(basenum+"x"+nextn+"="+answ);
		}
		
		
	}

}
