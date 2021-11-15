package nivel3;
import java.util.*;

public class MethodList implements MethodsVehicle{
	
	private List<MethodsVehicle> lista = new ArrayList<>();
	public void addMethod(MethodsVehicle method) {
		lista.add(method);
	}
	@Override
	public void ejecutar(Vehicle vehicle) {
		for (MethodsVehicle m:lista) {
			if (m instanceof Arrancar) {
				m.ejecutar(vehicle);
			}
			else if (m instanceof Acelerar) {
				m.ejecutar(vehicle);
			}
			else if (m instanceof Frenar) {
					m.ejecutar(vehicle);
			}
		}
		
	}
	
	
}
