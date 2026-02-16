import java.util.Scanner;
class Patterns{

void pp1(int size){
	int s=size;
	for(int ln=1;ln<=s;ln++){
		for(int i=0;i<ln;i++){
			System.out.print("*");
		}
		for(int j=0;j<s-ln;j++){
			System.out.print(" ");
		}
		System.out.print("\n");
	}
} 

void pp2(int size){
  int s=size;
  for(int ln=1;ln<=s;ln++){
    for(int i=0;i<s-ln;i++){
      System.out.print(" ");
    }
    for(int j=0;j<ln;j++){
      System.out.print("*");
    }
    System.out.print("\n");
}
} 

void pp3(int size){
  int s=size;
  for(int ln=1;ln<=s;ln++){
    for(int i=0;i<s-ln;i++){
      System.out.print(" ");
    }
    for(int j=0;j<2*ln-1;j++){
      System.out.print("*");
    }
    for(int k=0;k<ln;k++){
      System.out.print(" ");
    }
    System.out.print("\n");
}
} 

void pp4(int size){
  int s=size;
  int v=s;
  int f=0;
  for(int ln=1;ln<=s;ln++){
    f=2*v-1;
    for(int i=1;i<=ln-1;i++){
      System.out.print(" ");
    }
    for(int j=0;j<f;j++){
      System.out.print("*");
    }
    for(int i=1;i<=ln-1;i++){
      System.out.print(" ");
    }
  System.out.print("\n");
  v--;
  }
} 

void pp5(int size){
  int s=size;
  int num =1;
  for(int ln=1;ln<=s;ln++){
    for(int i=1;i<=ln;i++){
        System.out.print(num+" ");
            num++;
    }
    for(int j=0;j<s-ln;j++){
        System.out.print(" ");
    }
    System.out.print("\n");

  }
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Size:");
int s = sc.nextInt();
Patterns p1=new Patterns();
p1.pp1(s);
System.out.print("\n-----------------\n");
p1.pp2(s);
System.out.print("\n-----------------\n");
p1.pp3(s);
System.out.print("\n-----------------\n");
p1.pp4(s);
System.out.print("\n-----------------\n");
p1.pp5(s);
}
}

