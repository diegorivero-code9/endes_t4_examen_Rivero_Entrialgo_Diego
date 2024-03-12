package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // contenido del reporte
        imprimirTitulo();
        // más contenido...
        imprimirContenido();
        // imprimir conclusión
        imprimirConclusion();
        System.out.println("Conclusión del Reporte");

    }
    private void imprimirTitulo() {
        System.out.println("Título del Reporte");
    }

    private void imprimirContenido() {
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
    }

    private void imprimirConclusion() {
        System.out.println("Conclusión del Reporte");
    }
}
