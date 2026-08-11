import java.util.Scanner;
public class aplicacion_de_musica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] titulos = new String[10];
        String[] artistas = new String[10];
        String[] albumes = new String[10];
        String[] generos = new String[10];
        String[] duraciones = new String[10];
        int[] lanzamientos = new int[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_aplicacion_de_musica|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal aplicacion de musica");
            System.out.println("1) Registrar cancion");
            System.out.println("2) Editar cancion");
            System.out.println("3) Listar canciones");
            System.out.println("4) Buscar cancion");
            System.out.println("5) Eliminar cancion");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_cancion|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro de la cancion");
                    System.out.println("id de la cancion a registrar: " + id);
                    System.out.print("titulo de la cancion: ");
                    titulos[total] = entrada.nextLine();
                    System.out.print("artista: ");
                    artistas[total] = entrada.nextLine();
                    System.out.print("album: ");
                    albumes[total] = entrada.nextLine();
                    System.out.print("genero musical: ");
                    generos[total] = entrada.nextLine();
                    System.out.print("duracion: ");
                    duraciones[total] = entrada.nextLine();
                    System.out.print("anio de lanzamiento: ");
                    lanzamientos[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado de reproduccion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Cancion registrada correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_cancion|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen canciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las canciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println(
                            "ID: " + (i + 1)
                            + " | Titulo: " + titulos[i]
                            + " | Artista: " + artistas[i]
                            + " | Album: " + albumes[i]
                            + " | Genero: " + generos[i]
                            + " | Duracion: " + duraciones[i]
                            + " | Lanzamiento: " + lanzamientos[i]
                            + " | Estado: " + estados[i]
                        );
                    }
                    System.out.print("Ingrese el ID de la cancion: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la cancion");
                        System.out.print("Nuevo titulo de la cancion: ");
                        titulos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo artista: ");
                        artistas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo album: ");
                        albumes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo genero musical: ");
                        generos[posicion] = entrada.nextLine();
                        System.out.print("Nueva duracion: ");
                        duraciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo anio de lanzamiento: ");
                        lanzamientos[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo estado de reproduccion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Cancion actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_canciones|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen canciones registradas.");
                    } else {
                        System.out.println("Lista de canciones");
                        for (int i = 0; i < total; i++) {
                            System.out.println(
                                "ID: " + (i + 1)
                                + " | Titulo: " + titulos[i]
                                + " | Artista: " + artistas[i]
                                + " | Album: " + albumes[i]
                                + " | Genero: " + generos[i]
                                + " | Duracion: " + duraciones[i]
                                + " | Lanzamiento: " + lanzamientos[i]
                                + " | Estado: " + estados[i]
                            );
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_cancion|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen canciones registradas.");
                        break;
                    }
                    System.out.println("busqueda de cancion");
                    System.out.print("ingresa la id para buscar cancion: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la cancion encontrada:");
                        System.out.println(
                            "ID: " + idBusqueda
                            + " | Titulo: " + titulos[posicion]
                            + " | Artista: " + artistas[posicion]
                            + " | Album: " + albumes[posicion]
                            + " | Genero: " + generos[posicion]
                            + " | Duracion: " + duraciones[posicion]
                            + " | Lanzamiento: " + lanzamientos[posicion]
                            + " | Estado: " + estados[posicion]
                        );
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_cancion|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen canciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las canciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println(
                            "ID: " + (i + 1)
                            + " | Titulo: " + titulos[i]
                            + " | Artista: " + artistas[i]
                            + " | Album: " + albumes[i]
                            + " | Genero: " + generos[i]
                            + " | Duracion: " + duraciones[i]
                            + " | Lanzamiento: " + lanzamientos[i]
                            + " | Estado: " + estados[i]
                        );
                    }
                    System.out.print("Ingrese el ID de la cancion a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            titulos[i] = titulos[i + 1];
                            artistas[i] = artistas[i + 1];
                            albumes[i] = albumes[i + 1];
                            generos[i] = generos[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            lanzamientos[i] = lanzamientos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Cancion eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Aplicacion de Musica.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}