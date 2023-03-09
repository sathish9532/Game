package Games_task;
import java.util.Scanner;

public class number {
	int ar[];
	public static void main(String[] args) {
		number num = new number();
		num.getnumber();
		num.usernumber();
	}
	private void getnumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:\n");
		int no = sc.nextInt();
		int temp1 = no,temp2=no,count=0;
		while(temp1>0) {
			temp1/=10;
			count++;
		}
		ar = new int[count];
		int i=0;
		while(temp2>0) {
			ar[i]=temp2%10;
			temp2/=10;
			i++;
		}
		int index =0;
		for(int k=ar.length-1;k>=ar.length/2;k--) {
			int temp=ar[index];
			ar[index]=ar[k];
			ar[k]= temp;
			index++;
		}
		System.out.println();
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
	}
	private void usernumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:\n");
		int no = sc.nextInt();
		int temp1 = no,temp2=no,count=0;
		while(temp1>0) {
			temp1/=10;
			count++;
		}
		int array[] = new int[count];
		int i=0;
		while(temp2>0) {
			array[i]=temp2%10;
			temp2/=10;
			i++;
		}
		int index =0;
		for(int k=array.length-1;k>=array.length/2;k--) {
			int temp=array[index];
			array[index]=array[k];
			array[k]= temp;
			index++;
		}
		System.out.println();
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}
		char c[] = new char[count];
		for(int j=0;j<array.length;j++) {
			boolean check=false;
			for(int k=0;k<array.length;k++) {
				if(array[j]==ar[k] && j==k)
		        {
		          c[j]='C';
		          check=true;
		        }
		        else if(array[j]==ar[k]) {
		          c[j]='P';
		          check=true;
		      }
				
			}
			if(check==false)
		      {
		        c[j]='X';
		      }
		}
		boolean check1=true;
	    for(int l=0;l<c.length;l++)
	    {
	      if(c[l]!='C')
	      {
	        check1=false;  
	      }
	    }
	    
	    if(check1==false)
	    {
	      System.out.println();
	      for(char j = 0;j<c.length;j++) {
	        System.out.print(c[j]+" ");
	      }
	      usernumber();
	    }
	    else
	    {
	      System.out.println();
	      for(char j=0;j<c.length;j++) {
	        System.out.print(c[j]+" ");
	      }
	    }
	}
}

