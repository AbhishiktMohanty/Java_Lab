class time{
	public static void main(String x[]){
		int n=38270;
		int h,m,s;
		m = n/60;
		s = n%60;
		h = m/60;
		m = m%60;
		System.out.println("Time: "+ h + ":"+ m +":"+ s);
	}
}