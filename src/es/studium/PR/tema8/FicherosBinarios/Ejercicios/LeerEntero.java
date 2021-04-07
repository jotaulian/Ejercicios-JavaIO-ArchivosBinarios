package es.studium.PR.tema8.FicherosBinarios.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerEntero
{

	public static void main(String[] args)
	{
		int entero;
		try
		{
			FileInputStream fis = new FileInputStream ("uno.bin");
			BufferedInputStream bis = new BufferedInputStream (fis);
			//Necesitamos un objeto de la clase DataInputStream
			DataInputStream entradaB = new DataInputStream(bis);
			//Sacar un double del archivo.
			entero=entradaB.readInt();
			//Cierres
			entradaB.close();	
			bis.close();
			fis.close();
			
			System.out.println(entero);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}

}
