
class Number{
    static int n=9;

    public static boolean is_Even(){
        if (n%2==0)
			return true;
		else
            return false;
    }

    public static boolean is_Prime(){
        int flag=0;
        if (n == 0 || n == 1)
            flag = 1;

        for (i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return true;
        else
            return false;
    }

    public static boolean is_Perfect(){
        int i=1;  
        int sum=0;
        //executes until the condition becomes false  
        while(i <= n/2){  
            if(n % i == 0){  
                Sum = sum + i;
            }
            i++;  
        }  
        if(sum==n){  
            return true;  
        } 
        else  
            return false;
    }

    public static int fin_Factorial(){
        int fact=1;
		for (int i=1; i<=n; i++){
			fact = fact*i;
		}
        return fact;
    }

    public static void main(String []args){
        if (is_Even() == true){
            System.out.println("The entered value is Even.");
        }
        else
            System.out.println("The entered value is Odd.");

        if (is_Prime() == true)
            System.out.println("The entered value is Prime.");
        else
            System.out.println("The entered value is not Prime.");

        if (is_Perfect() == true)
            System.out.println("The entered value is Perfect.");
        else
            System.out.println("The entered value is not Perfect.");
        
   
        System.out.println("The Factorial of entered value is: "+ fin_Factorial());
    }
}

