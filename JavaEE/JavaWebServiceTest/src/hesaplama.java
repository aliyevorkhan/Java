
public class hesaplama {
	public int topla(int x, int y) {
		return x+y;
	}
	
	public int cikar(int x, int y) {
		return x-y;
	}
	
	public double bol(int x, int y) {
		return x/y;
	}
	
	public int carp(int x, int y) {
		return x*y;
	}
	
	public int boyuk(int x, int y) {
		
		if(x>y) {
			return x;
		}
		else if(x<y){
			return y;
		}
		else{
			return 0000;
		}
		
	}

}
