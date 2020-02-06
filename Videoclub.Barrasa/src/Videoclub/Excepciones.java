package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public String soloTexto(String a) throws IOException {
		int cont=0;
		do {
			if (a.toLowerCase().matches("^([a-z]+[ ]?){1,2}$")==false) {
				System.out.println("Introduzca solo letras, por favor.");
				a=teclado.readLine();
			}else {
				cont=1;
			}
		} while (cont==0);
		return a;
	}
	
	public String soloTelefono(String a) throws IOException {
		
		int cont=0;
		do {
			if (a.matches("^([1-9]{9}){1,2}$")==false) {
				System.out.println("Introduzca solo 9 numeros, por favor.");
				a=teclado.readLine();
			}else {
				cont=1;
			}
		} while (cont==0);
		return a;
	}
	
public String soloNumeros(String a) throws IOException {
		
		int cont=0;
		do {
			if (a.matches("^([1-9]+){1,2}$")==false) {
				System.out.println("Introduzca solo numeros, por favor.");
				a=teclado.readLine();
			}else {
				cont=1;
			}
		} while (cont==0);
		return a;
	}
}