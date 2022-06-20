package pro;
import java.util.Random;
public class Random_che {
	 static int[][] num=new int[3][3];

	public static void main(String[] args) {  
		boolean arfalse=true;                
		 for(int i=0;i<num.length;i++) {     
			 for(int j=0;j<num[i].length;j++) {
		   Random rand = new Random();
		   int random_number=(int) (Math.random()*(((9 - 1) + 1) )+1);
			 //System.out.println(random_number);

		   for(int p=0;p<num.length;p++) {
				for(int q=0;q<num[p].length;q++) {
					if(i==p&&j==q) {continue;}
					if(random_number==num[p][q]) {
						arfalse=false;
					}
				  }
				 }
		   if(arfalse) {num[i][j]=random_number;
			   
		   }
		   else {j--;}
		   arfalse=true;
				}
		 }
		 for(int i=0;i<num.length;i++) {
			 for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			 }
			 System.out.println();
			 }
		 }
		
	}		