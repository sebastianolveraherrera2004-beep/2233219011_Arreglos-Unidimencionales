import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unidad4_ACT03{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.print(texto + ": ");
        String cadena = br.readLine();
        return cadena;
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String DesplegarMenu(String titulo1, String[] menu) throws IOException {
        String cadena = titulo1 + "\n\n";
        cadena += MostrarMenu(menu);
        cadena += "Elija una opción: ";
        return Dialogo(cadena);
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        for (int i = 0; i < dato.length(); i++) {
            if (!Character.isDigit(dato.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        boolean puntoEncontrado = false;
        for (int i = 0; i < dato.length(); i++) {
            char c = dato.charAt(i);
            if (Character.isDigit(c)) {
                continue;
            } else if (c == '.') {
                if (!puntoEncontrado) {
                    puntoEncontrado = true;
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }
        return true;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                if (EsNumeroEntero(dato)) valido = true;
                break;
            case 2:
                if (EsNumeroDouble(dato)) valido = true;
                break;
        }
        return valido;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        for (int i = dato.length(); i < tamano; i++) {
            cadena += " ";
        }
        return cadena;
    }

    public static int ObtenerUltimaPosicion(String[] arreglo) {
        int ultimaPosicion = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && !arreglo[i].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static void main(String[] args) throws IOException {
        String[] opciones = {"Opción A", "Opción B", "Opción C"};
        String seleccion = DesplegarMenu("Menú Principal", opciones);
        System.out.println("Seleccionaste: " + seleccion);

        String numero = Leer("Ingrese un número");
        if (numero != null) {
            if (EvaluarNumerico(numero, 1)) {
                System.out.println("Es un número entero válido.");
            } else if (EvaluarNumerico(numero, 2)) {
                System.out.println("Es un número decimal válido.");
            } else {
                System.out.println("No es un número válido.");
            }
        } else {
            System.out.println("No ingresaste nada.");
        }
    }
}
