import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> autos= new HashSet<String>();
		
		System.out.println(autos.add("volvo"));//devolvera true cuando agregue los elementos 
		//y false cuando no lo haga
		System.out.println(autos.add("ford"));
		System.out.println(autos.add("Audi"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("VM"));
		
		System.out.println(autos.size());
		for (String auto : autos) {
			System.out.println(auto);
		}//fore
		System.out.println(autos.isEmpty());
		
		autos.forEach((marca)-> mostrarMarcas(marca));
	}//main

	private static void mostrarMarcas(String marca) {
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------");
		System.out.println("|    "+marca.toUpperCase());
		System.out.println("---------------------------");

	}

}//class
