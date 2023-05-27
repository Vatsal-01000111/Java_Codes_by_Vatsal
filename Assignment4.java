import java.util.*;
public class Assignment4 {
	public static void main(String[] args) {
		System.out.println("A-33 Vatsal Gandhi");
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = sc.nextInt();
		System.out.println("Enter the number columns");
		col = sc.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int result[][] = new int[row][col];
		System.out.println("Enter the elements of matrix1");
		for ( i= 0 ; i < row ; i++ )
		{ 
			for ( j= 0 ; j < col ;j++ )
				matrix1[i][j] = sc.nextInt();
				System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		for ( i= 0 ; i < row ; i++ )
		{
			for ( j= 0 ; j < col ;j++ )
				matrix2[i][j] = sc.nextInt();
				System.out.println();
			}
		for ( i= 0 ; i < row ; i++ ) {
			for ( j= 0 ; j < col ;j++ ) {
			result[i][j] = matrix1[i][j] + matrix2[i][j] ; 
			}}
		System.out.println("Sum of matrices:-");
		for ( i= 0 ; i < row ; i++ )
		{ 
			for ( j= 0 ; j < col ;j++ )
				System.out.print(result[i][j]+"\t");
		 
			System.out.println();
		}

	}
}
