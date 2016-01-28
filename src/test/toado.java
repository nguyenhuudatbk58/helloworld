package test;

public class toado {
	int x; 
	int y;
	
	public toado(int x, int y){
		this.x=x;
		this.y=y;
	}
	public toado(){
		this.x=0;
		this.y=0;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}
	
	public static void main(String[] args) {
		toado t= new toado();
		toado[] mt= new toado[10];
		for(int i=1; i<=10; i++){
			mt[i].setY(i);
		    mt[i].setX(i*i);
		}
		for(int i=1; i<=10; i++)
			System.out.println("x= "+mt[i].getX()+";y=" +mt[i].getY() );
	}
}
