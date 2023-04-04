class rectangle{

	public static void main(String x[]){
		float l, b;
		l = Float.parseFloat(x[0]);
		b = Float.parseFloat(x[1]);
		float a = l*b;
		float p = 2*(l+b);
		System.out.println("Permieter: "+ p);
		System.out.println("Area: " + a);
	}
}