import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();//puede eo no contener el integer por que ya lo infiere segun lo que tudefines en el arraylist
		numeros.add(35); 	numeros.add(33); 	numeros.add(42);
		numeros.add(10); 	numeros.add(14); 	numeros.add(19);
		numeros.add(27); 	numeros.add(44); 	numeros.add(26);
		numeros.add(31);	numeros.add(31); 
		
		System.out.println(numeros.size());//tamano del arreglolist en arraylist no existe el length
		System.out.println(numeros.get(5));
		System.out.println(numeros.isEmpty());//para saber si esta vacio y devuelce tru or false
		System.out.println(numeros.indexOf(31));//el primero que encuentra con coincidencia
		System.out.println(numeros.lastIndexOf(31));//el ultimo que esncuentra
		System.out.println(numeros.contains(44));//pregunta si esta el emento y si existe devolvera true
		System.out.println(numeros.set(8, 300));
		System.out.println(numeros.remove(9));//remueve elementos
		//muestra todos los elementos de la lista
		System.out.println("===========");
	//	for (int i = 0; i < numeros.size(); i++) {
		//	System.out.println(numeros.get(i));
		//}//for
		
		/*System.out.println("===========");
		for(Integer numero: numeros) {
			System.out.println(numero);
		}*/
		
		numeros.forEach((num)->imprimirParesImpares(num));
		
		
	}//main

	private static void imprimirParesImpares(Integer num) {
		// TODO Auto-generated method stub
		if (num%2==0) {
			System.out.println(num + "Es numero par");
		}else {
			System.out.println(num + "Es numero impar");
		}
	}//pares

}//class
