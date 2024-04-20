import java.util.*;

public class Main {
    public static void main(String[] args) {
        int seleccion = 0, vuelta = 0;
        TelefonoMovil celular = new TelefonoMovil();
        Laptop laptop = new Laptop();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1)Agregar dispositivo 2) modificar datos 3)listado 4) salir");
            seleccion = sc.nextInt();
            if(seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4){
                switch (seleccion){
                    case 1:
                        int seleccion2 = 0;
                        System.out.println("Desea ingresar un 1)telefono movil o una 2)laptop");
                        seleccion2 = sc.nextInt();
                        if (seleccion2 == 1){
                            System.out.println("Ingrese la generacion del telefono movil en entero");
                            celular.setGen(sc.nextInt());
                            System.out.println("Ingrese el modelo del telefono movil");
                            celular.setModelo(sc.next());
                            System.out.println("Ingrese el precio del telefono movil");
                            celular.setPrecio(sc.nextDouble());
                            System.out.println("Ingrese la marca del telefono movil");
                            celular.setMarca(sc.next());
                            System.out.println("Ingrese el tamaño del telefono movil");
                            celular.setTamanio(sc.nextDouble());

                        }else if (seleccion2 == 2){
                            System.out.println("Ingrese la generacion de la computadora");
                            laptop.setGen(sc.nextInt());
                            System.out.println("Ingrese el modelo de la computadora");
                            laptop.setModelo(sc.next());
                            System.out.println("Ingrese el precio de la computadora");
                            laptop.setPrecio(sc.nextDouble());
                            System.out.println("ingrese la marca de la computadora");
                            laptop.setMarca(sc.next());
                            System.out.println("Ingrese el tipo de la computadora");
                            laptop.setTipo(sc.next());

                        } else if (seleccion2 != 1 || seleccion2 != 2) {
                            System.out.println("Opcion ingresada invalida");
                        }

                        break;
                    case 2:
                        System.out.println("Desea cambiar el preico de un 1)telefono movil o una 2)laptop");
                        seleccion2 = sc.nextInt();
                        if (seleccion2 == 1){

                            System.out.println("Ingrese el precio del telefono movil");
                            celular.setPrecio(sc.nextDouble());

                        }else if (seleccion2 == 2){

                            System.out.println("Ingrese el precio de la computadora");
                            laptop.setPrecio(sc.nextDouble());


                        } else if (seleccion2 != 1 || seleccion2 != 2) {
                            System.out.println("Opcion ingresada invalida");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el producto a enseñar 1) telefono movil 2) laptop");
                        seleccion2 = sc.nextInt();
                        if (seleccion2 == 1){
                            System.out.println("Generacion: " + celular.getGen() + " modelo: " + celular.getModelo() + " precio: " + celular.getPrecio() + " marca: " + celular.getMarca() + " tamanio: " + celular.getTamanio());
                        }else if (seleccion2 == 2){
                            System.out.println("Generacion: " + laptop.getGen() + " modelo: " + laptop.getModelo() + " precio: " + laptop.getPrecio() + " marca: " + laptop.getMarca() + " tipo: " + laptop.getTipo());
                        } else if (seleccion2 != 1 || seleccion2 != 2) {
                            System.out.println("Opcion ingresada invalida");
                        }

                        break;
                    case 4:
                        vuelta = 1;
                        break;
                    default:
                        System.out.println("ingrese una opcion valida");
                        break;
                }

            }else {
                System.out.println("ingrese una opcion valida");
            }
        }while (vuelta != 1);

    }
}

