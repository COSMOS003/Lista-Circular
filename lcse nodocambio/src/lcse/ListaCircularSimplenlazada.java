package lcse;

public class ListaCircularSimplenlazada {


    Nodo primero;
    Nodo ultimo;

    public ListaCircularSimplenlazada() {
        primero = null;
        ultimo = null;

    }

    public boolean estaVacia() {
        return  primero == null;
    }

    public void insertarFinal (int x){

        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        if(primero == null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;

        }


    }

    public void eliminar(){
        if(estaVacia()){

            primero.siguiente = ultimo;

        }



    }

    public void mostrarC(){
        Nodo actual = new Nodo();
        actual = primero;
        do{
            System.out.println("  " + actual.dato);
            actual = actual.siguiente;
        }while (actual != primero);

    }


}
