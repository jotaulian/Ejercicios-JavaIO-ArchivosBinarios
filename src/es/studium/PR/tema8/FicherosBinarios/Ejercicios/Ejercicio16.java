package es.studium.PR.tema8.FicherosBinarios.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[] = new int[TAM];
		try
		{
			FileInputStream fos = new FileInputStream("Datos.dat");
			BufferedInputStream bos = new BufferedInputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataInputStream entradaB = new DataInputStream(bos);
			//Meter un double en el archivo
			
			for (int i = 0; i < TAM; i++) {
				tabla[i] = entradaB.readInt();
				System.out.println(tabla[i]);
			}
			entradaB.close();	
			bos.close();
			fos.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}

}
