public class Store {
    public static void main(String[] args) {
        final int[] PRECIOS = { 15, 10, 5 };
        final int[] CANTIDADES = { 2, 3, 4 };
        final int LIMTITE_DE_PRODUCCION_DE_SALES = 50;

        int totalSales = 0;
        // calculamos el total de sales multilicando el arreglo de precios por cantdades
        for (int i = 0; i < PRECIOS.length; i++) {
            totalSales = totalSales + (PRECIOS[i] * CANTIDADES[i]);
        }
        // ahora utilizamos un if-else para saber si la produción estuvo buena o no
        if (totalSales > LIMTITE_DE_PRODUCCION_DE_SALES) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}