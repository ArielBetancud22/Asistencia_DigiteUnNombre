package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	// ///////////////////////////////////////////////
	public static void main(String args[]) throws IOException {
		int inicio;
		// cargamos el modulo inicio del sistema
		iniciosistema();
	}

	// ////////////////////////////////////////////////
	// 1 proceso de inicio del sistema //
	// el proceso de inicio sistema funciona correctamente //
	// ejecutamos el sistema
	public static void iniciosistema() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		System.out.println("Bienvenido al Sistema de Verificaci�n de Peso");
		System.out.println("");
		System.out.println("Presione 1 para iniciar");
		System.out.println("Presione 2 para salir");
		System.out.println("");
		System.out.print("Digite una opcion: ");
		opcion = Integer.parseInt(bufEntrada.readLine());
		System.out.println("");
		// el ususario debe elegir entre 2 opciones , al elegir el sistema se iniciara o se cerrara
		// utilizando un segun.
		switch (opcion) {
		case 1 -> {
                    // subproceso 2
                    ingresoclave();
                    // subproceso 3
                    ingresodatos();
                }
		case 2 -> // se cierra el ssitema
			System.out.println("Saliendo del sistema, hasta pronto.");
		default -> // ejemplo opcion 3
			System.out.println("//// La opcion seleccionada no es correcta! ////");
		}
		System.out.println("");
	}

	// 2 subproceso para ingresar con clave al sistema
	public static void ingresoclave() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int intentos;
		int pass;
		// le asignamos un variable a la cantidad de intentos necesarios para que se bloquee el usuario
		// contrase�a predeterminada 12345
		// el contador de intentos arranca de 1
		intentos = 0;
		do {
			System.out.println("Ingrese su contrase�a: ");
			System.out.print("Contrase�a:");
			pass = Integer.parseInt(bufEntrada.readLine());
			System.out.println("");
			// creamos un condicional si pone mal la clave le dira contrase�a incorrecta y se sumara un intento, para repetir el ciclo hasta poner bien la clave
			if (pass==12345) {
				System.out.println("");
				System.out.println("Contrase�a correcta! bienvenido.");
			} else {
				System.out.println("Contrase�a Incorrecta!");
				// se le suma a intentos +1 hasta llegar al limite que son 3
				intentos = intentos+1;
				System.out.println("intentos realizados: "+intentos);
				if (intentos==4) {
					System.out.println("///////////////////////////////////////////////////////");
					System.out.println("Usuario bloqueado contacte al administrador del sistema");
					System.out.println("///////////////////////////////////////////////////////");
					System.out.println("");
					// se bloquea el ususario y el sistema inicia nuevamente
					iniciosistema();
				}
			}
			// se debe cumplir cualquiera de las 2 condiciones para que se salga del bucle y pase a la siguiente fase
		} while (!(pass==12345 || intentos==4));
	}

	// 3 subporceso donde ingresamos los datos del paciente para ver si necesita el plan o no
	public static void ingresodatos() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		int i;
		String nombres[];
		int pacientes;
		double peso;
		int plannutricional; 
		double score1;
		int sinplannutricional;
		// definimos las variables
		// se usa el IMC(indice de masa corporal)
		plannutricional = 0; 
		// ambos inician en 0 y se va a ir sumando dependiento si necesitan plan o no
		sinplannutricional = 0;
		System.out.println("ingrese la cantidad de pacientes a ingresar");
		// ingresamos la cantidad de vueltas del ciclo para utilizado en el SubProceso 
		pacientes = Integer.parseInt(bufEntrada.readLine());
		// creamos  y definimos el arreglo a utilizar para ordenar alfabeticamente el sistema
		nombres = new String[1000];
		for (i=0;i<=(pacientes-1);i++) {
			System.out.println("Por favor, ingrese los datos");
			System.out.println("Ingrese:Nombre, altura y Peso");
			System.out.print("nombre");
			// se guardan los nombre en el arreglo nombres[i]
			nombres[i] = bufEntrada.readLine();
			System.out.print("altura: ");
			altura = Double.parseDouble(bufEntrada.readLine());
			System.out.print("peso: ");
			peso = Double.parseDouble(bufEntrada.readLine());
			System.out.println("");
			// argumentos //funcion proceso 5.!!
			System.out.println("el score es: "+score(peso,altura));
			System.out.println("");
			// argumentos //guardamos en score1 la funcion score(peso,altura);
			score1 = score(peso,altura);
			// basado en el sistema de indice de masa corporal
			if (score1>25) {
				System.out.println("El paciente necesita un plan nutricional. Contactar a Carolina Jurczyszyn.");
				// si su IMC es mayor a 25 necesita plan nutricional
				plannutricional = plannutricional+1;
				System.out.println("");
			} else {
				System.out.println("El paciente no necesita Plan Nutricional. Hasta luego");
				// si es menor no necesita
				sinplannutricional = sinplannutricional+1;
				System.out.println("");
				// cada paciente guardado se va a ir asisgnando a con plan o sin pla depende si es mayor o menor a 25 su IMC
			}
	        }
	
                // SubProceso 4.!!
                totalesplan(plannutricional,sinplannutricional);
		// funcion 6!! arreglo que ordena alfabeticamente los nombres
		nombres[999] = datos(nombres,pacientes);
		// SubProceso 7!! muestra los nombres del arreglo del SubProceso 5.!
		mostrardatos(nombres,pacientes);
		System.out.println("");
		// SubProceso 8!!
		reiniciosistema();
	}

	// 4 subproceso en el cual se muestra los pacientes con plan y los que no necesitan plan Nutricional
	// parametos
	public static void totalesplan(int plannutricional, int sinplannutricional) {
		System.out.println("el total de pacientes con plan son: "+plannutricional);
		System.out.println("");
		System.out.println("el total de pacientes que no necesitan un plan son: "+sinplannutricional);
		// mostramos en consola la cantidad de gente que va a necesitar plan y la que no
	}

	// 5 funcion utilizada para calcular el score del paciente sobre el IMC
	// parametro
	public static double score(double peso, double altura) {
		double calculo;
		calculo = peso/Math.pow(altura,2);
		return calculo;
	}

	// 6 funcion arreglo y orden alfabetico
	// parametros
	public static String datos(String nombres[], double pacientes) {
		String aux;
		int i;
		int j;
		String ordenar1 = null;
		// se utiliza el metodo burbuja para realizar la funcion
		for (i=0;i<=(pacientes-2);i++) {
			// le restamos 2 a pacientes por que sino quedaria fuera de rango ya que j+1
			for (j=0;j<=(pacientes-2);j++) {
				if (nombres[j].compareTo(nombres[j+1])>0) {
					aux = nombres[j];
					nombres[j] = nombres[j+1];
					nombres[j+1] = aux;
					// ej. si b > a = aux <- b. nj <- A y nj+1 <- a por ende nj = A y nj+1 = b
				}
			}
		}
		return ordenar1;
	}

	// 7 funcion para mostrar los pacientes ordenados alfabeticamente
	// parametros
	public static void mostrardatos(String nombres[], double pacientes) {
		int i;
		System.out.println("");
		System.out.println("Mostrando los apellidos ordenamos alfabeticamente de los datos ingresados: ");
		System.out.println("");
		// le restamos 1 ya que el sistema arranca desde la posicion 0
		for (i=0;i<=(pacientes-1);i++) {
			// mostramos por consola los pacientes del sistema.!
			System.out.println((i+1)+". "+nombres[i]);
		}
	}

	// 8 funcion de reinicio del sistema
	// creamos una funcion para que el sistema inicie nuevamente
	public static void reiniciosistema() throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion1;
		System.out.println("Desea volver a iniciar el sistema?");
		System.out.println("Opcion 1 reinicia sistema");
		System.out.println("Opcion 2 salir del sistema");
		System.out.println("");
		System.out.print("Opcion: ");
		opcion1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("//////////////////////////////////////////");
		// creamos un cciclo en el cual depende la opcion vuelve al sistema y simplemente se cierra
		switch (opcion1) {
		case 1 -> // se vuelve al inicio del sistema.!!
			iniciosistema();
		case 2 -> {
                    System.out.println("");
                    // se termina el sistema.!
                    System.out.println("Saliendo del sistema, hasta pronto.");
                }
		default -> System.out.println("//// La opcion seleccionada no es correcta! ////");
		}
		System.out.println("");
	}


}