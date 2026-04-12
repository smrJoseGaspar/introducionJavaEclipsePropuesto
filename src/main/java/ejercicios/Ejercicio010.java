package ejercicios;

public class Ejercicio010 {
	
	//COMPLETAR METODO
	public void mostrarFor() 
	{
       System.out.println("FOR");
       for (int i = 0; i <= 100; i++)
       {
    	   System.out.print(i+ " ");
       }
       System.out.println("");	//salto de linea
    }
	
	//COMPLETAR METODO
    public void mostrarWhile() 
    {
    	   System.out.println("WHILE");
           int i = 0 ;
           while(i<=100)
           {	
        	   System.out.print(i + " " );
        	   i++;
           }
       System.out.println("");    //salto de linea
 
    }
    
  //COMPLETAR METODO
    public void mostrarDoWhile()
    {
    	System.out.println("DO-WHILE");
        int i = 0 ;
        do
        {
     	 System.out.print(i + " ");
    	 i++;
        }while(i <= 100);
     
      System.out.println();    //salto de linea
              
    }

    public static void main(String[] args) {
    	Ejercicio010 ejercicio010 = new Ejercicio010();
    	ejercicio010.mostrarFor();
    	ejercicio010.mostrarWhile();
    	ejercicio010.mostrarDoWhile();
    }
}
