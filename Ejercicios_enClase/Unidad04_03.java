public class Unidad04_03 {

    private static void Ordenar(String[] alumnos, int[] calificaciones)
    {
        int tam = alumnos.length;
        if (tam != calificaciones.length) {
            System.out.println("Error: Los arreglos deben tener el mismo tamaño.");
            return;
        }
        else {
            String auxa;
            int auxc;
            for (int ciclopadre = 0; ciclopadre < tam; ciclopadre++)
                for (int ciclo = 0; ciclo < tam - 1; ciclo++)
                {
                    // si el valor de compareto = 0 son iguales
                    // si el valor de compareto < 0 el valor de la izquierda es menor que el de la derecha
                    // si el valor de compareto > 0 el valor de la izquierda es mayor que el de la derecha
                    if (alumnos[ciclo].compareTo(alumnos[ciclo + 1]) > 0) {
                        auxa = alumnos[ciclo];
                        alumnos[ciclo] = alumnos[ciclo + 1];
                        alumnos[ciclo + 1] = auxa;
                        auxc = calificaciones[ciclo];
                        calificaciones[ciclo] = calificaciones[ciclo + 1];
                        calificaciones[ciclo + 1] = auxc;
                    }
                }
        } //fin del else del fi de tamanos
    }

    public static String Mostrar (String[] alumnos, int[] calificaciones)
    {
        String salida="";
        for (int ciclo=0; ciclo<alumnos.length; ciclo++)
            salida=salida+alumnos[ciclo]+": "+calificaciones[ciclo]+"\n";
        return salida;
    }

    public static void main(String[] args) {

        String[] Alumnos = { "Jorge", "Maria", "Luis", "Ana", "Pedro", "Lucia", "Carlos", "Sofia", "Miguel", "Isabel" };
        int[] calificaciones = { 85, 90, 78, 92, 88, 95, 80, 91, 87, 89 };

        System.out.println("Antes de ordenar: \n"+Mostrar(Alumnos,calificaciones));
        Ordenar(Alumnos,calificaciones);
        System.out.println("Despues de ordenar: \n"+Mostrar(Alumnos,calificaciones));

    }
}
