class four_number{
public static void main(String[] args){
four_number four = new four_number();
four.array();
}
public void array(){
int no = 9532,i;
while(no>0){
System.out.println("values are : "+no%10);
no = no /10;
}
int fix[] = new int[4];
for(i=fix.length-1;i>=0;i--){
while(no>0){
fix[i]=no%10;
no = no /10;
}
}
}
}

