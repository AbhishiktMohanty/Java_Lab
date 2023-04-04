class factorial{

	public static void main(String x[]){
		int n;
		n = Integer.parseInt(x[0]);
		int fact=1;
		for (int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("Factorial: "+ fact);
	}
}