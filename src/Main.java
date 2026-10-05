public class Main {
    public static void main(String args[]) {
        ejercicio1("Pera");
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    
    public static void ejercicio1(String productoFichado) {
        int idProducto = 8;
        char categoria = 'A';
        double precio = 0.99;
        int unidades = 67;
        boolean rebaja = false;

        imprimirProducto(productoFichado, idProducto, categoria, precio, unidades, rebaja);
    }

    public static void imprimirProducto(String productoFichado, int idProducto, char categoria, double precio, int unidades, boolean rebaja) {
        System.out.println("Articulo escaneado: " + productoFichado);
        System.out.println("Producto: " + idProducto);
        System.out.println("Categoría: " + categoria);
        System.out.println(precio + " €");
        System.out.println(unidades + "UDs");
        System.out.println("Rebaja: " + rebaja);
    }

    public static void ejercicio2(String precios){
        double precio = 120;
        double IVA = 0.21;
        int rebaja = 5;

        precioFinal(precio, IVA, rebaja);
    }

    public static void precioFinal(double precio, double IVA, int rebaja){
        System.out.println("Producto + IVA: " + (precio + precio * IVA));
        System.out.println("Precio final: " + (precio + precio * IVA - rebaja));
    }
    public static void ejercicio3(){

    }

    public static void ejercicio4(){

    }

    public static void ejercicio5(){

    }

    public static void ejercicio6(){

    }

    public static void ejercicio7(){

    }

    public static void ejercicio8(){

    }

    public static void ejercicio9(){

    }

    public static void ejercicio10(){
        
    }
}
