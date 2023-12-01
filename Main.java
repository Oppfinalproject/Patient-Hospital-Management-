import java.util.Scanner;
import java.util.ArrayList;

class Main{
  static ArrayList<ArrayList<Patient>> plist = new ArrayList<>();
  
  static ArrayList<Patient> pcured = new ArrayList<Patient>();
  
  static ArrayList<Patient> padmit = new ArrayList<Patient>();
  
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
plist.add(padmit);
plist.add(pcured);

while(true){  

System.out.println("\n=======================================");
      System.out.println("A : Admit Patient");
      System.out.println("B : view patient status");
      System.out.println("C : update patient status ");
      System.out.println("D : Discharge patient");
      System.out.print("\n\n");
      System.out.print("Enter Capital letter : ");
      String letter = s.nextLine();
    
   
switch (letter){  
case "A":
System.out.println("\n=======================================");

System.out.print("Enter Patient Name : ");
String N = s.nextLine();

System.out.print("Enter the disease of Patient : ");
String D = s.nextLine();

System.out.print("Enter the Drug you will apply : ");
String C = s.nextLine();

System.out.print("Patient rooom number : ");
int R = s.nextInt();
System.out.print("\n\n");

System.out.println("Name : " + N);
System.out.println("Disease : " + D);
System.out.println("Drug use : " + C);
System.out.println("Room number: " + R);
System.out.print("\n\n");

System.out.print("!!New patient has been admitted");

Patient ps = new Patient(N,D,C,R);
padmit.add(ps);


break;

case "B":
System.out.println("\n=======================================");
System.out.print(plist);
System.out.print("\n\n");

System.out.print("0 : Admited || 1 : Cured ");
System.out.println("Enter a num: ");
int l = s.nextInt();
System.out.println(plist.get(l));
System.out.println("Enter index to view");
int p = s.nextInt();

Patient view = plist.get(l).get(p);

System.out.print("\n\n");

System.out.println("Name : " + view.getN());
System.out.println("Disease : " + view.getD());
System.out.println("Cure : " + view.getC());
System.out.println("Room : " + view.getR());

break;

case "C":
System.out.println("\n=======================================");
System.out.print(plist.get(0));
System.out.print("ENTER INDEX TO UPDATE : ");
int ind = s.nextInt();

Patient edit = plist.get(0).get(ind);

System.out.print("Are you sure you want to transfer " + edit.getN() + " to the Cured list?");
System.out.print("\n\n");
System.out.println("1 : Yes || 2 : back to main menu");
int nC = s.nextInt();

if (nC == 1){
pcured.add(edit);

padmit.remove(ind);


 

System.out.print("RECORD HAS BEEN UPDATED ");
}
else {
	System.out.println("Exiting.......");
	}

break;

case "D":
System.out.println("\n=======================================");
System.out.print(plist.get(1));
System.out.println("Enter index to discharge patient : ");
int las = s.nextInt();
Patient dele = plist.get(1).get(las);
System.out.println("Patient "+ dele.getN()+" has been discharge");
pcured.remove(las);
s.close();
break;
   
   
   
   
    
    
}//switch

      
}//while loop
    
  }//main
  
}//Main class
 
