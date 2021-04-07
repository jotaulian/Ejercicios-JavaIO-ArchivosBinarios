package es.studium.PR.tema8.FicherosBinarios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroBinarioLectura
{
	public FicheroBinarioLectura()
	{
		double d;
		try
		{
			FileInputStream fis = new FileInputStream ("Datos.dat");
			BufferedInputStream bis = new BufferedInputStream (fis);
			//Necesitamos un objeto de la clase DataInputStream
			DataInputStream entradaB = new DataInputStream(bis);
			//Sacar un double del archivo.
			d=entradaB.readDouble();
			//Cierres
			entradaB.close();	
			bis.close();
			fis.close();
			
			System.out.println(Double.toString(d));
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

	public static void main(String[] args)
	{
		new FicheroBinarioLectura();
	}

}
