import java.io.*;

public class Lenguas {

	public static void main(String args[]) {
		Lenguas L1= new Lenguas();
		String Dato;
		String Aux1 = args[0];
		String Aux2 = args[1];
		Dato= Aux1 + "\\" + Aux2;
		L1.Decodifica(Dato, args[0]);

	}

	public void Decodifica(String nombre, String Direc) {
	
	String Texto = "";
	File F = new File(nombre);
	char Z;
	String Nuevo;
	Nuevo = (Direc+"\\HablandoEnLenguas_201246079.txt");

		try{

		FileReader Lectura = new FileReader(F);
		BufferedReader br = new BufferedReader(Lectura);
		BufferedReader brl = new BufferedReader(Lectura);
		StringBuffer Guarda = new StringBuffer();
		FileWriter Destino = new FileWriter(Nuevo,false);
		BufferedWriter bw = new BufferedWriter(Destino);
		PrintWriter Escribe = new PrintWriter(bw);
		
		
		char Aux;
		int C =Lectura.read();
		//String linea = brl.readLine();
		//System.out.println("El numero de lineas son:"+linea);
		while( C != -1) {
				Aux= (char)C;
				if (Aux == 'a') {
					Z= 'y';
					Escribe.print(Z);
				} else {
					if (Aux == 'o') {
						Z='e';
						Escribe.print(Z);
					} else {
						if (Aux == 'z') {
							Z='q';
							Escribe.print(Z);;
						} else {
							Z= (char)C;
							Escribe.print(Z);
						}
					}
				}     
				System.out.print(Z);
				C = Lectura.read();
		}
		Lectura.close();
		Escribe.close();
		} catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}	
	}      
 
}
