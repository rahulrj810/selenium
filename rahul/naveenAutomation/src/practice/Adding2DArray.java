package practice;

public class Adding2DArray {
	public static void main(String args[]) {
		
		int row=2; int col=2;
		
		int a[][]={{2,4},{3,6}};
		int b[][]= {{3,1},{5,1}};
		
		int sum[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				 sum[i][j]=a[i][j]+b[i][j]; 
			}	
		}
	}

}
