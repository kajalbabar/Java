//break is used to stop the loop iteration
class ContinueDemo {
	public static void main(String[] args) {
			int i;
			for(i=1; i<=50; i++) {
				if(i%7 ==0 && i%5==0) 
					 continue;
				System.out.println(i);
			}
			System.out.println("Out of loop");
	}
	
}
