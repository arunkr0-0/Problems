import java.util.*;

class shift{
	public static void action(int arr[][],int m,int n,int k){
		//n=3,k=1,2
		int temp[][]=new int[m][n-k];

		for(int i=0;i<m;i++){
			for(int j=0;j<n-k;j++){
				temp[i][j]=arr[i][j];
				//System.out.print(temp[i][j]+" ");
			}
			//System.out.println();
		}

		for(int i=0;i<m;i++){
			for(int j=n-k;j<n;j++){
				arr[i][j-n+k]=arr[i][j];
				//System.out.print(arr[i][j-n+k]+" ");
			}
			//System.out.println();
		}

		for(int i=0;i<m;i++){
			for(int j=0;j<n-k;j++){
				arr[i][j+k]=temp[i][j];
				//System.out.print(arr[i][j+k]+" ");
			}
			//System.out.println();
		}

print(arr,m,n);

	}
	public static void print(int arr[][],int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		int k=sc.nextInt();
		int t =1;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=t;
				t++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("<--->");
		if(n==k||k==0){
			print(arr,m,n);
		}

		else{
			action(arr,m,n,k);
		}

	sc.close();
}
}