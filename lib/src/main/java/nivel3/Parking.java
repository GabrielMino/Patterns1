package nivel3;

public class Parking {
	
	public static void main(String[] args) {
	MethodList ml= new MethodList();
	
	ml.addMethod(new Arrancar());
	ml.addMethod(new Acelerar());
	ml.addMethod(new Frenar());
	
	
    

Vehicle coche = new Vehicle();
Vehicle bicicleta = new Vehicle();
Vehicle avion = new Vehicle();
Vehicle barco = new Vehicle();

MethodManager mm = new MethodManager();


mm.ejecutar(ml, coche);
mm.ejecutar(ml, bicicleta);
mm.ejecutar(ml, avion);
mm.ejecutar(ml, barco);

}
}
