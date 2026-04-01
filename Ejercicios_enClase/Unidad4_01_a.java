public class Unidad4_01_a {

    private static String Menus(String[] opciones)
    {
        String salida="";
        for(int ciclo=0;ciclo<opciones.length;ciclo++)
            salida=salida+opciones[ciclo]+"\n";
        return salida;
    }

    public static void main(String[] args) {

        String[] menus= new String[5];
        menus[0]="1. Option 1";
        menus[1]="1. Option 2";
        menus[2]="1. Option 3";
        menus[3]="1. Option 4";
        menus[4]="1. Option 5";
        System.out.println(Menus(menus));
    }

}
