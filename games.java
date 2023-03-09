//package Javaprograms;

import java.util.Scanner;

public class games{
  int ar[];
  
  public static void main(String[] args) {
  games obj=new games();
  obj.toGetRandom();
  obj.toGetUserInput();
}
  
  public void toGetRandom()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter number:");
    int no=sc.nextInt();
    
    
    int count=0;
    int tempno=no;
    int tempno1=no;
    while(tempno>0)
    {
      tempno/=10;
      count++;
    }
//    System.out.println(count);
    ar= new int[count];
    int i=0;
    while(tempno1>0)
    {
      ar[i]=tempno1%10;
      tempno1/=10;
      i++;
    }
    
//    for(int j:ar) {
//    System.out.print(j+" ");
//    }
    
    int index=0;
    for(int k=ar.length-1;k>=ar.length/2;k--)
    {
      int temp=ar[index];
      ar[index]=ar[k];
      ar[k]=temp;
      index++;  
    }
    System.out.println();
    for(int j:ar) {
      System.out.print(j+" ");
      }
  }
  
  public void toGetUserInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter number:");
    int no=sc.nextInt();
    int count=0;
    int tempno=no;
    int tempno1=no;
    while(tempno>0)
    {
      tempno/=10;
      count++;
    }
//    System.out.println(count);
    int array[]= new int[count];
    int i=0;
    while(tempno1>0)
    {
        array[i]=tempno1%10;
      tempno1/=10;
      i++;
    }
    
//    for(int j:array) {
//    System.out.print(j+" ");
//    }
    int index=0;
    for(int k=array.length-1;k>=array.length/2;k--)
    {
      int temp=array[index];
      array[index]=array[k];
      array[k]=temp;
      index++;  
    }
    System.out.println();
    for(int j:array) {
      System.out.print(j+" ");
      }
    char c[]=new char[count];
    for(int j=0;j<array.length;j++)
    {
      boolean flag=false;
      for(int k=0;k<ar.length;k++)
      {
        if(array[j]==ar[k] && j==k)
        {
          c[j]='c';
          flag=true;
        }
        else if(array[j]==ar[k]) {
          c[j]='p';
          flag=true;
      }
    }
      if(flag==false)
      {
        c[j]='x';
      }
  }
    boolean check=true;
    for(int l=0;l<c.length;l++)
    {
      if(c[l]!='c')
      {
        check=false;  
      }
    }
    
    if(check==false)
    {
      System.out.println();
      for(char j:c) {
        System.out.print(j+" ");
      }
      toGetUserInput();
    }
    else
    {
      System.out.println();
      for(char j:c) {
        System.out.print(j+" ");
      }
    }
}
}
