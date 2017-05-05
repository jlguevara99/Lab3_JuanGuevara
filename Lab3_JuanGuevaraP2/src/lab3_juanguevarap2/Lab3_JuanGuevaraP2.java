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
            System.out.println("5. Modificar equipo");
            System.out.println("6. Eliminar equipo");
            System.out.println("7. Hacer compras ");
            System.out.println("8. Organizar equipo");
            System.out.println("9. Listar equipo");
            System.out.println("10. Listar jugadores");
            System.out.println("11. Salir");
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
                        while (modificar < 1 || modificar > 19) {
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
                                ((Delantero) jugadores.get(indice)).setAltura(altura);
                                break;
                            case 7:
                                System.out.println("Nuevo nivel de definicion");
                                int nivel = sc.nextInt();
                                ((Delantero) jugadores.get(indice)).setDefinicion(nivel);
                                break;
                            case 9:
                                System.out.println("nueva velocidad: ");
                                double velocidad = sc.nextDouble();
                                ((Delantero) jugadores.get(indice)).setVelocidad(velocidad);
                                break;
                            case 10:
                                System.out.println("Nuevo promedio de goles: ");
                                double promedio = sc.nextDouble();
                                ((Delantero) jugadores.get(indice)).setPromedio(promedio);
                                break;
                            case 11:
                                System.out.println("Nivel de creatividad: ");
                                int creatividad = sc.nextInt();
                                ((Medio) jugadores.get(indice)).setCreatividad(creatividad);
                                break;
                            case 12:
                                System.out.println("Nivel de dominio:");
                                creatividad = sc.nextInt();
                                ((Medio) jugadores.get(indice)).setCreatividad(creatividad);
                                break;
                            case 13:
                                System.out.println("Asistencias: ");
                                double asistencias = sc.nextDouble();
                                ((Medio) jugadores.get(indice)).setAsistencias(asistencias);
                                break;
                            case 14:
                                System.out.println("nueva agresividad: ");
                                creatividad = sc.nextInt();
                                ((Defensa) jugadores.get(indice)).setAgresividad(creatividad);
                                break;
                            case 15:
                                System.out.println("Nueva altura: ");
                                altura = sc.nextInt();
                                ((Defensa) jugadores.get(indice)).setAltura(altura);
                                break;
                            case 16:
                                System.out.println("Nuevo peso: ");
                                double peso = sc.nextInt();
                                ((Defensa) jugadores.get(indice)).setPeso(peso);
                                break;
                            case 17:
                                System.out.println("Nueva velocidad: ");
                                velocidad = sc.nextDouble();
                                ((Defensa) jugadores.get(indice)).setVelocidad(velocidad);
                                break;
                            case 18:
                                System.out.println("Nuevo juego aereo: ");
                                int aereo = sc.nextInt();
                                ((Portero) jugadores.get(indice)).setAereo(aereo);
                                break;
                            case 19:
                                System.out.println("Nuevo juego con los pies: ");
                                int pies = sc.nextInt();
                                ((Portero) jugadores.get(indice)).setPies(pies);
                                break;
                        }
                        System.out.println("Desea seguir modificando)[1 si ; 2 no]");
                        seguir = sc.nextInt();
                    } while (seguir != 2);
                    break;
                case 3:
                    int op = 0;
                    do {
                        System.out.println("ELIMINAR JUGADOR");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println(i + ". " + jugadores.get(i));
                        }
                        System.out.println("Ingrese posicion del jugador que desea eliminar");
                        int indice = sc.nextInt();
                        while (indice < 1 || indice >= jugadores.size()) {
                            System.out.println("INCORRECTO");
                            System.out.println("Ingrese posicion del jugador que desea eliminar");
                            indice = sc.nextInt();
                        }
                        jugadores.remove(indice);
                        System.out.println("Desea seguir eliminando?[1/2]");
                        op = sc.nextInt();
                    } while (op != 2);
                    break;
                case 4:
                    int continuar = 0;
                    do {
                        System.out.println("EQUIPOS");
                        System.out.println("Ingrese nombre del equipo: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese palmares: ");
                        int palmares = sc.nextInt();
                        System.out.println("Ingrese la ciudad: ");
                        sc.nextLine();
                        String ciudad = sc.nextLine();
                        System.out.println("Ingrese el presupuesto: ");
                        double presupuesto = sc.nextDouble();

                        equipos.add(new Equipo(nombre, palmares, presupuesto, ciudad, new ArrayList()));
                    } while (continuar != 2);
                    break;
                case 5:
                    continuar = 0;
                    do {
                        System.out.println("ELIMINAR EQUIPOS");
                        System.out.println("Ingrese la posicion");
                        int pos = sc.nextInt();
                        while (pos < 1 || pos >= equipos.size()) {
                            System.out.println("INCORRECTO");
                            System.out.println("Ingrese posicion del EQUIPO que desea eliminar");
                            pos = sc.nextInt();
                        }
                        equipos.remove(pos);
                        System.out.println("Desea continuar?[1/2]");
                        continuar = sc.nextInt();
                    } while (continuar != 2);
                    break;
                case 6:
                    continuar = 0;
                    do {
                        int pos = 0;
                        System.out.println("MODIFICAR EQUIPOS");
                        System.out.println("Ingrese posicion");
                        pos = sc.nextInt();
                        while (pos < 1 || pos >= equipos.size()) {
                            System.out.println("INCORRECTO");
                            System.out.println("Ingrese posicion del EQUIPO que desea eliminar");
                            pos = sc.nextInt();
                        }
                        System.out.println("1. Nombre");
                        System.out.println("2. Palmares");
                        System.out.println("3. Ciudad");
                        System.out.println("4. Presupuesto ");
                        int sub = sc.nextInt();
                        switch (sub) {
                            case 1:
                                System.out.println("Nombre nuevo:");
                                sc.nextLine();
                                String nom = sc.nextLine();
                                equipos.get(pos).setNombre(nom);
                                break;
                            case 2:
                                System.out.println("Palmares: ");
                                int palm = sc.nextInt();
                                equipos.get(pos).setPalma(palm);
                                break;
                            case 3:
                                System.out.println("Nueva ciudad: ");
                                sc.nextLine();
                                nom = sc.nextLine();
                                equipos.get(pos).setCiudad(nom);
                                break;
                            case 4:
                                System.out.println("presupuesto: ");
                                double prep = sc.nextDouble();
                                equipos.get(pos).setPresupuesto(prep);
                                break;
                        }
                        System.out.println("Desea continuar[1/2]");
                        continuar = sc.nextInt();
                    } while (continuar != 2);
                    break;
                case 7:
                    int resp = 0;

                    do {

                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println(i + ". " + equipos.get(i));
                        }
                        System.out.println("HACER COMPRAS");
                        System.out.println("Ingrese el equipo");
                        int equipo = sc.nextInt();
                        while (equipo < 1 || equipo >= equipos.size()) {
                            System.out.println("INCORRECTO");
                            System.out.println("Ingrese posicion del EQUIPO que desea comprar");
                            equipo = sc.nextInt();
                        }
                        System.out.println("Lista de jugadores");
                        for (int i = 0; i < jugadores.size(); i++) {
                            if (jugadores.get(i).getEstado() == 1) {
                                System.out.println(i + ". " + jugadores.get(i));
                            }
                        }
                        System.out.println("Ingrese la posicion del jugador que desea comprar");
                        int jugador = sc.nextInt();
                        while (jugador < 1 || jugador >= equipos.size()) {
                            System.out.println("INCORRECTO");
                            System.out.println("Ingrese posicion del jugador que desea comprar");
                            jugador = sc.nextInt();
                        }
                        if (equipos.get(equipo).getPresupuesto() >= jugadores.get(jugador).getPrecio()) {
                            System.out.println("La compra se ha realizado");
                            double nuevoP = equipos.get(equipo).getPresupuesto() - jugadores.get(jugador).getPrecio();
                            equipos.get(equipo).setPresupuesto(nuevoP);
                        }
                        System.out.println("Desea continuar[1 si/2 no]");
                        resp = sc.nextInt();
                    } while (resp != 2);

            }
        } while (opcion != 11);

    }

}
