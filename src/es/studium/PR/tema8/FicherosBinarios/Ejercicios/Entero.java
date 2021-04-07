package es.studium.PR.tema8.FicherosBinarios.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Entero
{
	
	public static void main(String[] args) {
		int entero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un entero:");
		entero = teclado.nextInt();
		teclado.close();
		try
		{
			FileOutputStream fos = new FileOutputStream("uno.bin");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			salidaB.writeInt(entero);
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
