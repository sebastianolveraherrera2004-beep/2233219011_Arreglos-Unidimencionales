public class Unidad4_01_b {

    private static String Menus(String[] opciones)
    {
        String salida="";
        for(int ciclo=0;ciclo<opciones.length;ciclo++)
            salida=salida+opciones[ciclo]+"\n";
        return salida;
    }

    public static void main(String[] args) {

        String[] menus = {"1. Opcion 1","2. Opcion 2","3. Opcion 3","4. Opcion 4","5. Opcion 5"};
        System.out.println(Menus(menus));
    }
}
