
public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<String, String> colores = new java.util.HashMap<String, String>();
		colores.put("RED", "#FF0000");
		colores.put("GREN", "#00FF00");
		colores.put("BLUE", "#FFFFFF");
		colores.put("BLUE", "#000000");
		colores.put("fuchsia", "#ff00ff");
		colores.put("pink", "#ffc8cb");
		colores.put("yellow", "#ffff00");
		colores.put("cyan", "#00ffff");
		
		System.out.println(colores.put("Navy", "#000080"));
		System.out.println(colores.put("Navy", "#000088"));//remplaza el valor
		
		System.out.println(colores.size());
		System.out.println(colores.get("Navy"));
		

		for (String valor: colores.values()) {
			System.out.println(valor);
		}
		
	
		for (String llave: colores.keySet()) {
			System.out.println(llave + colores.get(llave));
		}
		
		//implementa un for each para el mapa- colores.foreach
		
		colores.forEach((k,v)->mostrarColores(k, v));
		

	}

	private static void mostrarColores(String k, String v) {
		// TODO Auto-generated method stub
		String espacio="           ";
		System.out.println("---------------");
		System.out.println("|"+k+" | " +v);
		System.out.println("---------------");
	}//mostrar colores

}
