package es.studium.PR.tema8.FicherosBinarios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBinarioEscritura
{
	public FicheroBinarioEscritura()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("Datos.dat");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			Double dato= 7.345;
			salidaB.writeDouble(dato);
			salidaB.close();	
			bos.close();
			fos.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new FicheroBinarioEscritura();
	}

}
