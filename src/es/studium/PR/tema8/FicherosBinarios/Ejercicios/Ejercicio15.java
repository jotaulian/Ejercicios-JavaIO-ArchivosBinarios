package es.studium.PR.tema8.FicherosBinarios.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15
{
	
	public static void main(String[] args)
	{
		int tabla[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Dame el valor de la posición: "+ i);
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		try
		{
			FileOutputStream fos = new FileOutputStream("Datos.dat");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			
			for (int i = 0; i < 10; i++) {
				salidaB.writeInt(tabla[i]);
			}
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

}
