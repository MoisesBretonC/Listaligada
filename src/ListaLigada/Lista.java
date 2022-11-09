/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigada;

/**
 *
 * @author Berke
 */
public class Lista {
    
    private Nodo head;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual;//Apuntador al nodo seleccionado actualmente
    private int size;//tamaño de la lista (numero de nodos en la lista)

    public Lista() {
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }

   /* public void addFirst(int dato) {
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual = nodo;
        this.size++;
    } */

    public void add(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        tail = nuevoNodo;//Se mueve el apuntador al ultimo nodo
        
        if (head == null){//la lista esta vacia creamos el primer metodo
           head = nuevoNodo;
           actual= head;
        }
        else{
        
        actual.setSiguiente(nuevoNodo);//actual apunta al nuevo nodo
        actual = nuevoNodo;//Ahora actual es el nuevo nodo
        }
    }
    
    public void add(int dato, int posicion){
    Nodo nuevoNodo=new Nodo(dato);
    int i = 1;
    actual =head;
    while (i < posicion - 1){
    actual = actual.getSiguiente();
    i++;
}
Nodo auxiliar=actual.getSiguiente();
actual.setSiguiente(nuevoNodo);
actual = nuevoNodo;
actual.setSiguiente(auxiliar);
}
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while(actual != null){
            int elemento = actual.getDato();
            System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
}