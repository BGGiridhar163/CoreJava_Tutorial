class SwapEx{
	int a, b;
	public void storeDetails(int x, int y){
		a = x;
		b = y;
	}
	public void beforeSwap(){
		System.out.println("Before swapping A val : "+a+" B val : "+b); 
	}
	public void afterSwap(){
		a = a+b;  // 10 , 20
		b = a-b; // 30 , 20
		a = a-b; // 30, 10
		System.out.println("After swapping A val : "+a+" B val : "+b);
	}
	public static void main(String[] args){
		SwapEx s = new SwapEx();
		s.storeDetails(10,20);
		s.beforeSwap();
		s.afterSwap();
	}
}