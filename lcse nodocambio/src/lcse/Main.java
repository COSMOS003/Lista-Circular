package lcse;

public class Main {
    public static void  main(String[] args ){
        ListaCircularSimplenlazada l= new ListaCircularSimplenlazada();

        l.insertarFinal(2);
        l.insertarFinal(4);
        l.insertarFinal(6);
        l.insertarFinal(8);
        l.insertarFinal(9);

        l.mostrarC();
        l.mostrarC();

        l.eliminar();
        l.eliminar();



    }
}
