package Automovil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Estructuras {

    private Nodo inicio;
    private Nodo ultimo;
    private Nodo inicio2;
    private Nodo ultimo2;
    private int tam;
    private String marc,marc2;
    private int max = 0, tope = 0, op, op1;
    private boolean res1 = false, res2 = false;
    private int Frente = -1, Final = 0;
    private ObAuto cola[] = new ObAuto[max];
    private ObAuto pila[] = new ObAuto[max];

    public void ListaDoble() {
        inicio = null;
        ultimo = null;
        tam = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }
    public boolean esVacia2() {
        return inicio2 == null;
    }

    public void PilaLleno() {
        if (tope == max) {
            res1 = true;
        } else {
            res1 = false;
        }
    }

    public void PilaVacia() {
        if (tope == 0) {
            res1 = true;
        } else {
            res2 = false;
        }
    }

    public int getTam() {
        return tam;
    }

    public Estructuras() {

        max = Integer.parseInt(JOptionPane.showInputDialog("Ingerese el tamaño que va a contener la estructuras de cola y pila"));
        cola = new ObAuto[max];
        pila = new ObAuto[max];

        while (op != 6) {
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "\n 1.Lista Simple"
                    + "\n 2.Lista doble"
                    + "\n 3.cola"
                    + "\n 4.pila"
                    + "\n 5.salir"));

            switch (op) {
                case 1: {
                    op1 = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "\n1.agrear al final"
                            + "\n 2.agregar al inicio"
                            + "\n 3.Imprimir"
                            + "\n 4.Buscar registro"
                            + "\n 5.Eliminar"));
                    if (op1 == 1) {
                        agregarAlFinal();

                    } else {
                        if (op1 == 2) {

                            agregarAlInicio();

                        } else {

                            if (op1 == 3) {

                                verlSimple();

                            } else {

                                if (op1 == 4) {

                                    buscarSimple(marc);
                                } else {

                                    if (op1 == 5) {

                                        eliminarSimple();

                                    }

                                }
                            }

                        }

                    }
                    break;
                }

                case 2: {
                    op1 = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "\n1.agregar"
                            + "\n2.Imprimir"
                            + "\n3.Eliminar"
                    ));

                    if (op1 == 1) {

                        verCiclo();
                    } else {
                        if (op1 == 2) {
                            verlDoble(tam);
                        }else{
                            if(op1 ==3){
                                eliminarDoble();
                          
                            }
                        }
                    }

                    break;
                }

                case 3: {
                    op1 = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "\n 1.agregar registro"
                            + "\n 2.Imprimir"
                            + "\n 3.Eliminar Registro"));

                    if (op1 == 1) {

                        agregarCola();
                    } else {
                        if (op1 == 2) {

                            verCola();

                        } else {
                            eliminarCola();
                        }

                    }
                    break;
                }

                case 4: {
                    op1 = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "\n 1.agregar registro"
                            + "\n 2.Imprimir"
                            + "\n 3.Eliminar Registro"));
                    if (op1 == 1) {

                        apilar();

                    } else {
                        if (op1 == 2) {
                            verPila();

                        } else {
                            if (op1 == 3) {
                                eliminarPila();
                            }
                        }
                    }
                    break;
                }

                case 5: {
                    System.exit(0);
                    break;
                }

            }
        }
    }

    public ObAuto datosAuto() {

        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo");

        String col = JOptionPane.showInputDialog("Ingrese el Color");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Añio"));
        String des = JOptionPane.showInputDialog("Ingrese el Descripción");
        ObAuto A = new ObAuto();

        A.setMarc(marca);
        A.setModel(modelo);
        A.setCol(col);
        A.setAnio(anio);
        A.setDes(des);

        return A;
    }

//INGRESAR
    public void agregarAlFinal() {
        Nodo nuevo = new Nodo(datosAuto());

        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
        }
        tam++;

    }

    public void agregarAlInicio() {
        Nodo nuevo = new Nodo(datosAuto());

        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);

            inicio = nuevo;

        }
        tam++;
    }

    public void agregarCola() {

        if (Final < max) {

            cola[Final] = datosAuto();
            Final++;
            if (Final == 1) {
                Frente = 0;
            }
        } else {
            JOptionPane.showInputDialog(null, "No hay elementos disponibles");
        }
    }

    public void apilar() {
        PilaLleno();

        if (res1 == true) {
            JOptionPane.showMessageDialog(null, "Pila llena");
        } else {

            pila[tope] = (datosAuto());
            tope++;

        }
        Nodo nuevo = new Nodo(datosAuto());

        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tam++;
    }

    public void agregarListaDoble() {

        Nodo actual2 = new Nodo(datosAuto());
        if (esVacia2()) {

            inicio2 = actual2;
            ultimo2 = inicio2;

            inicio2.setAnterior2(ultimo2);
            System.out.println("Primero:" + inicio2.getA().getMarc());
        } else {
            ultimo2.setSiguiente2(actual2);
            actual2.setAnterior2(ultimo2);
            ultimo2 = actual2;
            ultimo2.setSiguiente(inicio2);
            System.out.println("ULTIMO: " + actual2.getA().getMarc());
        }
        tam++;
    }

    //MOSTRAR
    public void verlSimple() {
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            String listado = "";
            while (aux != null) {

                listado += i + " = " + aux.getA().toString() + "\n\n";

                aux = aux.getSiguiente();
                i++;
                JOptionPane.showMessageDialog(null, listado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }

    }

    private void verCola() {
        String vector = "";
        for (int a = 0; a < max; a++) {
            vector += "Posicion" + a + "--->" + cola[a] + "\n";
        }
        JOptionPane.showMessageDialog(null, vector);

    }

    public void verPila() {
        String cadena = "";
        for (int a = 0; a < max; a++) {
            cadena += "posición" + a + "---> " + pila[a] + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void verlDoble(int nVueltas) {
        String salida2 = "";

        if (!esVacia2()) {
            Nodo aux2 = inicio2;
            int i = 0;
            while (aux2 != null && i < nVueltas) {
                salida2 += i + " = " + aux2.getA().toString() + "\n\n";
                System.out.println("--------- " + "\r\n");

                if (aux2.getAnterior2() == null) {
                    System.out.println("ANTERIOR = " + null + "\r\n");
                } else {
                    System.out.println("ANTERIOR = " + aux2.getAnterior2().getA().toString() + "\r\n");
                }
                System.out.println(i + ".[" + aux2.getA().toString() + "]." + "\r\n");

                if (aux2.getSiguiente2() != null) {
                    System.out.println("NEXT = " + aux2.getSiguiente2().getA() + "\r\n");
                } else {
                    System.out.println("NEXT = " + "\r\n");
                }
                aux2 = aux2.getSiguiente2();
                i++;
            }
            System.out.println("");
            JOptionPane.showMessageDialog(null, salida2);
        }

    }

    public void verCiclo() {
        int contador = 0;
        int opcion = 1;

        while (contador != 3) {
            if (opcion == 1) {
                agregarListaDoble();
            } else {
                eliminarDoble();
            }
            contador++;
        }

        verlDoble(2);
    }
    
//BUSCAR
    
    public String buscarSimple(String marca) {
        Nodo aux = inicio;
        boolean encontrado = false;
        String result = "Vehículo No Encontrado";
        marca = JOptionPane.showInputDialog("Ingrese La Marca Del Vehículo");
        while (aux != null && encontrado != true) {
            if (aux.getA().getMarc().equalsIgnoreCase(marca)) {
                encontrado = true;
                result = "Vehículo Encontrado";
            } else {
                aux = aux.getSiguiente();

            }
        }
        JOptionPane.showMessageDialog(null, result);

        return result;
    }
    
    public String buscarDoble(String marca){
    Nodo aux2 = inicio2;
    boolean encontrado = false;
    
    String result = "Vehículo encontrado en la lista";
     marca = JOptionPane.showInputDialog("Ingrese La Marca Del Vehículo");
    
    while (aux2  != null && encontrado != true){
        if(aux2.getA().getMarc().equalsIgnoreCase(marca)){
            encontrado = true;
            result = "No se encotró vehículo!";
        }else{
            aux2 = aux2.getSiguiente2();
        }    
}
    System.out.println(result);
    return result;
}

    //ELIMINAR
    public void eliminarSimple() {

        inicio = null;
        tam = 0;

        JOptionPane.showMessageDialog(null, "Información en la lista eliminada!");

    }

    public void eliminarCola() {

        if (Frente != -1) {
            JOptionPane.showMessageDialog(null, "Información en la cola eliminada! " + cola[Frente]);
            cola[Frente] = null;
            if (Frente == (Frente - 1)) {

                System.out.println(Frente + "-" + Final);
                Frente = -1;
                Final = 0;

            } else {
                Frente++;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Datos Vacios");
        }

    }

    public void eliminarPila() {
        PilaVacia();
        if (res2 == true) {
            JOptionPane.showMessageDialog(null, "pila vacia");
        } else {
            tope -= 1;
            JOptionPane.showMessageDialog(null, "dato eliminado " + pila[tope]);
            pila[tope] = null;

        }

    }

    public void eliminarDoble() {
        inicio2 = null;
        tam = 0;
    }

}
