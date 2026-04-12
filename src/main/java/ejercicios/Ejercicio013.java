package ejercicios;

public class Ejercicio013 {
	
	//COMPLETAR METODO
	public void mostrarPrimeros20Pares() 
	{
		System.out.println("Los primeros veinte números pares:");
	    for(int i=2 ; i <=40 ;i=i+2) 
		    {
	    		System.out.print(i + " ");
		    }
	   
    }

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}
