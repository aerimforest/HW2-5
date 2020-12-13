import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if(studentID==1810666) hw_1810666();
	    else if (studentID == 1810815) hw_1810815();
        else if (studenID == 1810348) hw_1810348();
        else
            System.out.println("To be developed...\n");
    }

    private void hw_1810815() {
	Scanner scanner = new Scanner(System.in);
	int chosenMenu;
	int[] dataArray;
	int result;

	printInfo_1810815();
	
	System.out.print("Enter menu number: ");
	chosenMenu = scanner.nextInt();
	System.out.println();

	if (chosenMenu == 1) {
		System.out.print("Calculate MIN, input three integers separated by space: ");
		dataArray = null;
		dataArray = new int[3];
		for (int i = 0; i < 3; i++) {
			dataArray[i] = scanner.nextInt();
		}

		result = calculateMin_1810815(dataArray);
	}
	else {
		System.out.print("Calculate POW(first ^ second), input two integers separated by space: ");
		dataArray = null;
		dataArray = new int[2];
		for (int i = 0; i < 2; i++) {
			dataArray[i] = scanner.nextInt();
		}

		result = calculatePow_1810815(dataArray);
	}

	System.out.println("The result is: " + result);
	System.out.println();
    }

    private void printInfo_1810815() {
	System.out.println("Student ID: 1810815]");
	System.out.println("1. Calculate MIN");
	System.out.println("2. Calculate POW");
    }

    public int calculateMin_1810815(int[] dataArray) {
	int MIN = Integer.MAX_VALUE;

	for (int i = 0; i < dataArray.length; i++) {
		if (dataArray[i] < MIN) {
			MIN = dataArray[i];
		}
	}

	return MIN;
    }

    public int calculatePow_1810815(int[] dataArray) {
	int POW = 1;

	for (int i = 0; i < dataArray[1]; i++) {
		POW *= dataArray[0];
	}
	    
	return POW;
    }

    public void hw_1810666() {
       int choice;
       int n1;int n2; int n3;
       int fact;
       try {
          Scanner n_scan=new Scanner(System.in);
          System.out.println("[Student ID: 1810666]");
          System.out.println("1. Calculate Max");
          System.out.println("2. Calculate Factorial");
          System.out.println("-Input Only Integer Type");
          System.out.println();
          System.out.print("Enter menu number: ");
          choice= n_scan.nextInt();
          System.out.println();
          
          if(choice==1) {
             System.out.println("-Calculate Max-");
             System.out.println("Input 3 Numbers.");
            
             System.out.print("First number:");
             n1=n_scan.nextInt();
             System.out.print("Second number:");
             n2=n_scan.nextInt();
             System.out.print("Third number:");
             n3=n_scan.nextInt();
             
             System.out.println("=> Max Result: "+max_1810666(n1,n2,n3));
          }
          else if (choice==2) {
             System.out.println("-Calculate Factorial-");
             System.out.print("Input Positive Number:");
             fact=n_scan.nextInt();
             if(fact>0) {
                //calculate factorial
                 System.out.println("=> Factorial Result: "+fact_1810666(fact));
             }
             else {System.out.println("Wrong Input");}
             
          }
          else {System.out.println("Wrong menu Input");}
            System.out.println();
       }
       catch(InputMismatchException e) {
          System.out.println("Wrong Input Type");
          System.out.println();
       }
       
       
    }
    
    public int max_1810666(int n1,int n2,int n3){
       int max;
       max=((n1>n2)?n1:n2);
       max=((n3>max)?n3:max);
       return max;
    }
    
    public int fact_1810666(int num) {
       int i=1;
       int fact_res=1;
       for(i=num;i>0;i--) {
          fact_res=fact_res*i;
       }
       return fact_res;
    }

    private void hw_1810348() {
    	Scanner sc = new Scanner(System.in);
		int menu=0, num=0, result=0;
		
		do {
			System.out.println("[student ID: 1810348]");
			System.out.println("1. Calculate the factorial");
			System.out.println("2. Calculate the absoulte value");
			System.out.print("Enter menu number: ");
			menu = sc.nextInt();
			
			if(menu==1) {
				System.out.print("Enter a natural number to calculate factorial: ");
				num = sc.nextInt();
				result = factorial_1810348(num);
			}
			else if(menu==2) {
				System.out.print("Enter an integer to calculate abs: ");
				num = sc.nextInt();
				result = abs_1810348(num);
			}
			else {
				System.out.println("Wrong Menu. Please enter again.");
			}
			
		} while(menu!=1&&menu!=2);
		
		
		System.out.println("Result: " + result);
	}
	
	public int factorial_1810348(int n) {
		int fact=0, i=0;
		if(n==0)
			fact=1;
		else if (n>0){
			fact=n*factorial_1810348(n-1);
		}
		return fact;
	}

	public int abs_1810348(int a) {
		if(a>0)	return a;
		else if (a<0) return a*(-1);
		else return 0;
	}


    
 
}
