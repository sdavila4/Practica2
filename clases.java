import java.util.InputMismatchException;
import java.util.Scanner;

public class clases {
    public static void main(String[] args) {

        Scanner opc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("            Menú           ");
            System.out.println("1) Clase 1 - Computadora");
            System.out.println("2) Clase 2 - Celular");
            System.out.println("3) Clase 3 - Consola de videojuegos");
            System.out.println("4) Clase 4 - Perro");
            System.out.println("5) Clase 5 - Instrumento musical");
            System.out.println("6) Clase 6 - Salir");
            //atributos c1=new atributos();

            try{
                System.out.println("Elige una opción: ");
                opcion = opc.nextInt();

                switch(opcion){
                    case 1:
                        System.out.println("Clase 1 - Computadora");
                        atributos comp1=new atributos();

                        System.out.println("\nIngresa la marca: ");
                        Scanner inMarca = new Scanner(System.in);
                        comp1.setMarca(inMarca.next());

                        System.out.println("\nIngresa el modelo: ");
                        Scanner inModelo = new Scanner(System.in);
                        comp1.setModelo(inModelo.next());

                        System.out.println("\nIngresa el color: ");
                        Scanner inColor = new Scanner(System.in);
                        comp1.setColor(inColor.next());

                        System.out.println("\nIngresa el procesador: ");
                        Scanner inProcesador = new Scanner(System.in);
                        comp1.setProcesador(inProcesador.next());

                        System.out.println("\nIngresa el SO: ");
                        Scanner inSo = new Scanner(System.in);
                        comp1.setSo(inSo.next());

                        System.out.println("Este objeto tiene valores asignados por parametro: ");
                        System.out.println(comp1.getMarca() + ", " + comp1.getModelo() + ", " + comp1.getColor() + ", " + comp1.getProcesador() + ", " + comp1.getSo());
                        inMarca.close();
                        inModelo.close();
                        inColor.close();
                        inProcesador.close();
                        inSo.close();
                        break;
                    case 2:
                        System.out.println("Clase 2 - Celular");
                        atributos comp2=new atributos();

                        System.out.println("\nIngresa la marca: ");
                        Scanner inMarca2 = new Scanner(System.in);
                        comp2.setMarca2(inMarca2.next());

                        System.out.println("\nIngresa el modelo: ");
                        Scanner inModelo2 = new Scanner(System.in);
                        comp2.setModelo2(inModelo2.next());

                        System.out.println("\nIngresa el color: ");
                        Scanner inColor2 = new Scanner(System.in);
                        comp2.setColor2(inColor2.next());

                        System.out.println("\nIngresa el almacenamiento: ");
                        Scanner inAlmacenamiento = new Scanner(System.in);
                        comp2.setAlmacenamiento(inAlmacenamiento.nextInt());

                        System.out.println("\nIngresa el SO: ");
                        Scanner inSo2 = new Scanner(System.in);
                        comp2.setSo2(inSo2.next());

                        System.out.println("Este objeto tiene valores asignados por parametro: ");
                        System.out.println(comp2.getMarca2() + ", " + comp2.getModelo2() + ", " + comp2.getColor2() + ", " + comp2.getAlmacenamiento() + ", " + comp2.getSo2());
                        inMarca2.close();
                        inModelo2.close();
                        inColor2.close();
                        inAlmacenamiento.close();
                        inSo2.close();

                        break;
                    case 3:
                        System.out.println("Clase 3 - Consola de videojuegos");
                        atributos comp3=new atributos();

                        System.out.println("\nIngresa la marca: ");
                        Scanner inMarca3 = new Scanner(System.in);
                        comp3.setMarca3(inMarca3.next());

                        System.out.println("\nIngresa el color: ");
                        Scanner inColor3 = new Scanner(System.in);
                        comp3.setColor3(inColor3.next());

                        System.out.println("\nIngresa el almacenamiento: ");
                        Scanner inAlmacenamiento2 = new Scanner(System.in);
                        comp3.setAlmacenamiento2(inAlmacenamiento2.nextInt());

                        System.out.println("\nIngresa el año de lanzamiento: ");
                        Scanner inLan = new Scanner(System.in);
                        comp3.setLan(inLan.nextInt());

                        System.out.println("\nIngresa el precio: ");
                        Scanner inPrecio = new Scanner(System.in);
                        comp3.setPrecio(inPrecio.nextInt());

                        System.out.println("Este objeto tiene valores asignados por parametro: ");
                        System.out.println(comp3.getMarca3() + ", " + comp3.getColor3() + ", " + comp3.getAlmacenamiento2() + ", " + comp3.getLan() + ", " + comp3.getPrecio());
                        inMarca3.close();
                        inColor3.close();
                        inAlmacenamiento2.close();
                        inLan.close();
                        inPrecio.close();
                        break;
                    case 4:
                        System.out.println("Clase 4 - Perro");
                        atributos comp4=new atributos();

                        System.out.println("\nIngresa el color del perro: ");
                        Scanner inColor4 = new Scanner(System.in);
                        comp4.setColor4(inColor4.next());

                        System.out.println("\nIngresa la edad del perro: ");
                        Scanner inEdad = new Scanner(System.in);
                        comp4.setEdad(inEdad.nextInt());

                        System.out.println("\nIngresa la raza: ");
                        Scanner inRaza = new Scanner(System.in);
                        comp4.setRaza(inRaza.next());

                        System.out.println("\nIngresa el peso: ");
                        Scanner inPeso = new Scanner(System.in);
                        comp4.setPeso(inPeso.nextInt());

                        System.out.println("\nIngresa el genero: ");
                        Scanner inGenero = new Scanner(System.in);
                        comp4.setGenero(inGenero.next());

                        System.out.println("Este objeto tiene valores asignados por parametro: ");
                        System.out.println(comp4.getColor4() + ", " + comp4.getEdad() + ", " + comp4.getRaza() + ", " + comp4.getPeso() + ", " + comp4.getGenero());
                        inColor4.close();
                        inEdad.close();
                        inRaza.close();
                        inPeso.close();
                        inGenero.close();
                        break;

                    case 5:

                        System.out.println("Clase 5 - Instrumento musical");
                        atributos comp5=new atributos();

                        System.out.println("\nIngresa el instrumento: ");
                        Scanner inIns = new Scanner(System.in);
                        comp5.setIns(inIns.next());

                        System.out.println("\nIngresa el tipo de instrumento: ");
                        Scanner inTipo = new Scanner(System.in);
                        comp5.setTipo(inTipo.next());

                        System.out.println("\nIngresa el color: ");
                        Scanner inColor5 = new Scanner(System.in);
                        comp5.setColor5(inColor5.next());

                        System.out.println("\nIngresa la marca: ");
                        Scanner inMar = new Scanner(System.in);
                        comp5.setMar(inMar.next());

                        System.out.println("\nIngresa el modelo: ");
                        Scanner inModel = new Scanner(System.in);
                        comp5.setModel(inModel.next());

                        System.out.println("Este objeto tiene valores asignados por parametro: ");
                        System.out.println(comp5.getIns() + ", " + comp5.getTipo() + ", " + comp5.getColor5() + ", " + comp5.getMar() + ", " + comp5.getModel());
                        inIns.close();
                        inTipo.close();
                        inColor5.close();
                        inMar.close();
                        inModel.close();
                        break;
                    case 6:
                        salir = true;

                }
            } catch (InputMismatchException e){
                return;
            }
        }

    }
}