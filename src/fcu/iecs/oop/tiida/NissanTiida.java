package fcu.iecs.oop.tiida;


public class NissanTiida {
	public int times;
	public void tiida(){
		int i,j;
		this.times++;
		for(i=0;i<this.times;i++){
			for(j=0;j<this.times;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
