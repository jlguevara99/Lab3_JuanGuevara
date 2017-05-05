/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_juanguevarap2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab3_JuanGuevaraP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        ArrayList<Equipo> equipos = new ArrayList();
        int opcion = 0;
        int seguir = 0;
        do {
            System.out.println("***MENU***");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Modificar Jugador");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Crear equipo");
            System.out.println("5. Eliminar equipo");
            System.out.println("6. Hacer compras ");
            System.out.println("7. Organizar equipo");
            System.out.println("8. Listar equipo");
            System.out.println("9. Listar jugadores");
            System.out.println("10. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Crear jugador");
                        System.out.println("Nombre: ");
                        String nombre = sc.next();
                        System.out.println("Apellido: ");
                        String apellido = sc.next();
                        System.out.println("Edad: ");
                        int edad = sc.nextInt();
                        int estado = 1;
                        System.out.println("Precio: ");
                        double precio = sc.nextInt();
                        while (estado < 1 || estado > 2) {
                            System.out.println("Codigo incorrecto, ingreselo de nuevo:");
                            estado = sc.nextInt();
                        }
                        System.out.println("Pais de nacimiento: ");
                        sc.nextLine();
                        String pais = sc.nextLine();
                        System.out.println("Pie preferido");
                        String pie = sc.next();
                        System.out.println("Ingrese posicion del jugador");
                        System.out.println("1. Delantero");
                        System.out.println("2. Medio");
                        System.out.println("3. Defensa");
                        System.out.println("4. Portero");
                        int posicion = sc.nextInt();
                        while (posicion < 1 || posicion > 4) {
                            System.out.println("Posicion incorrecta, ingrese de nuevo");
                            System.out.println("1. Delantero");
                            System.out.println("2. Medio");
                            System.out.println("3. Defensa");
                            System.out.println("4. Portero");
                            posicion = sc.nextInt();
                        }

                        switch (posicion) {
                            case 1:
                                System.out.println("Nivel de definicion: ");
                                int definicion = sc.nextInt();
                                System.out.println("Altura: ");
                                double altura = sc.nextDouble();
                                System.out.println("Velocidad: ");
                                double velocidad = sc.nextDouble();
                                System.out.println("Promedio de goles: ");
                                double promedio = sc.nextDouble();
                                Jugador d = new Delantero(definicion, altura, velocidad, promedio, nombre, apellido, edad, estado, pais, pie, 0, precio, "");
                                jugadores.add(d);
                                break;
                            case 2:
                                System.out.println("Nivel de creatividad: ");
                                int creatividad = sc.nextInt();
                                System.out.println("Nivel de dominio: ");
                                int dominio = sc.nextInt();
                                System.out.println("Asistencias: ");
                                double asistencias = sc.nextDouble();
                                Jugador m = new Medio(creatividad, dominio, asistencias, nombre, apellido, edad, estado, pais, pie, 0, precio, "");
                                jugadores.add(m);
                                break;
                            case 3:
                                System.out.println("Agresividad: ");
                                int agresividad = sc.nextInt();
                                System.out.println("Altura: ");
                                altura = sc.nextDouble();
                                System.out.println("Peso: ");
                                double peso = sc.nextDouble();
                                System.out.println("Velocidad: ");
                                velocidad = sc.nextDouble();
                                Jugador df = new Defensa(agresividad, altura, peso, velocidad, nombre, apellido, edad, estado, pais, pie, 0, precio, "");
                                jugadores.add(df);
                                break;
                            case 4:
                                System.out.println("Nivel de juego aereo: ");
                                int aereo = sc.nextInt();
                                System.out.println("Nivel con los pies: ");
                                int pies = sc.nextInt();
                                Jugador por = new Portero(aereo, pies, nombre, apellido, edad, estado, pais, pie, 0, precio, "");
                                jugadores.add(por);
                                break;
                        }
                        System.out.println("Desea ingresar otro jugador?[1/2]");
                        seguir = sc.nextInt();
                        while (seguir < 1 || seguir > 2) {
                            System.out.println("Incorrecto");
                            System.out.println("Desea ingresar otro jugador?[1/2]");
                            seguir = sc.nextInt();
                        }
                    } while (seguir != 2);
                    break;
                case 2:

                    do {
                        System.out.println("Modificar jugador");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println(i + ". " + jugadores.get(i));
                        }
                        System.out.println("Ingrese la posicion del jugador que quiere modificar: ");
                        int indice = sc.nextInt();
                        while (indice < 0 || indice >= jugadores.size()) {
                            System.out.println("indice incorrecto");
                            System.out.println("Ingrese la posicion del jugador que quiere modificar: ");
                            indice = sc.nextInt();
                        }
                        System.out.println("Que quiere modificar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Edad");
                        System.out.println("4. Pais");
                        System.out.println("5. Pie");
                        System.out.println("6. Precio");
                        if (jugadores.get(indice) instanceof Delantero) {
                            System.out.println("Opciones de delantero");
                            System.out.println("7. Nivel de definicion");
                            System.out.println("8. Altura");
                            System.out.println("9. Velocidad");
                            System.out.println("10. Promedio de goles");
                        }
                        if (jugadores.get(indice) instanceof Medio) {
                            System.out.println("Opciones de defensa");
                            System.out.println("11. Nivel de creatividad");
                            System.out.println("12. Nivel de dominio");
                            System.out.println("13. Asistencias");
                        }
                        if (jugadores.get(indice) instanceof Defensa) {
                            System.out.println("opciones de defensa");
                            System.out.println("14. Agresividad");
                            System.out.println("15. Altura");
                            System.out.println("16. peso");
                            System.out.println("17. velocidad");
                        }
                        if (jugadores.get(indice) instanceof Portero) {
                            System.out.println("Opciones de portero");
                            System.out.println("18. Juego aereo");
                            System.out.println("19. juego con los pies");
                        }
                        int modificar = sc.nextInt();
                        while (modificar < 1 || modificar > 6) {
                            System.out.println("posicion incorrecta");
                            System.out.println("Ingresela de nuevo");
                            modificar = sc.nextInt();
                        }
                        switch (modificar) {
                            case 1:
                                System.out.println("Nuevo nombre: ");
                                String nombre = sc.next();
                                jugadores.get(indice).setNombre(nombre);
                                break;
                            case 2:
                                System.out.println("Nuevo Apellido: ");
                                String apellido = sc.next();
                                jugadores.get(indice).setApellido(apellido);
                                
                                break;
                            case 3:
                                System.out.println("Nueva edad: ");
                                int edad = sc.nextInt();
                                while (edad < 0) {
                                    System.out.println("Incorrecto");
                                    System.out.println("Nueva edad: ");
                                    edad = sc.nextInt();
                                }
                                jugadores.get(indice).setEdad(edad);
                                break;
                            case 4:
                                System.out.println("Nuevo Pais: ");
                                sc.nextLine();
                                String pais = sc.nextLine();
                                jugadores.get(indice).setPais(pais);
                                break;
                            case 5:
                                System.out.println("Nuevo pie preferido");
                                String pie = sc.next();
                                jugadores.get(indice).setPie(pie);
                                break;
                            case 6:
                                System.out.println("Nuevo precio: ");
                                double precio = sc.nextDouble();
                                jugadores.get(indice).setPrecio(precio);
                                break;
                            case 8:
                                System.out.println("Nueva altura: ");
                                double altura = sc.nextDouble();
                                ((Delantero)jugadores.get(indice)).setAltura(altura);
                                break;
                            case 7:
                                System.out.println("Nuevo nivel de definicion");
                                int nivel = sc.nextInt();
                                ((Delantero)jugadores.get(indice)).setDefinicion(nivel);
                                break;
                            case 9:
                                System.out.println("nueva velocidad: ");
                                double velocidad = sc.nextDouble();
                                ((Delantero)jugadores.get(indice)).setVelocidad(velocidad);
                                break;
                            case 10:
                                System.out.println("Nuevo promedio de goles: ");
                                double promedio = sc.nextDouble();
                                ((Delantero)jugadores.get(indice)).setPromedio(promedio);
                                break;
                            case 11:
                                System.out.println("Nivel de creatividad: ");
                                int creatividad = sc.nextInt();
                                ((Medio)jugadores.get(indice)).setCreatividad(creatividad);
                                break;
                            case 12:
                                System.out.println("Nivel de dominio:");
                                creatividad = sc.nextInt();
                                ((Medio)jugadores.get(indice)).setCreatividad(creatividad);
                                break;
                            case 13:
                                System.out.println("Asistencias: ");
                                double asistencias = sc.nextDouble();
                                ((Medio)jugadores.get(indice)).setAsistencias(asistencias);
                                break;
                            case 14:
                                System.out.println("nueva agresividad: ");
                                creatividad = sc.nextInt();
                                ((Defensa)jugadores.get(indice)).setAgresividad(creatividad);
                                break;
                            case 15:
                                System.out.println("Nueva altura: ");
                                altura = sc.nextInt();
                                ((Defensa)jugadores.get(indice)).setAltura(altura);
                                break;
                            case 16:
                                System.out.println("Nuevo peso: ");
                                 double peso = sc.nextInt();
                        }
                        System.out.println("Desea seguir modificando)[1 si ; 2 no]");
                        seguir = sc.nextInt();
                    } while (seguir != 2);
                    break;
                case 3:
                    System.out.println("ELIMINAR JUGADOR");
                    System.out.println("Ingrese posicion del jugador que desea eliminar");
                    int indice = sc.nextInt();
                    while(){
                        
                    }

            }
        } while (opcion != 10);

    }

}
