package interfaz;
import java.util.Scanner;
import dominio.*;
public class Interfaz{
        public boolean procesarPeticion (String peticion, Libreta l){
                String [] p = peticion.split (" ");
                if (p[0].equals("add Ropa"))
                        l.add(new Ropa(p[1],p[2],p[3],p[4]));
		if (p[0].equals("add Equipamiento"))
                        l.add(new Equipamiento(p[1],p[2],p[3],p[4]));
                if (p[0].equals("list"));
                        System.out.print(l);
                if (p[0].equals("help"))
                        System.out.print(" introduzca una de las siguientes peticiones: \n add Ropa: añadir ropa al catálogo\n add Equipamiento: añadir equipamiento al catálogo \n list: mostrar el catálogo \n exit: salir");
                if (p[0].equals("exit"))
                        return false;
                return true;
        }
        public String leerPeticion(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduccir petición ");
                String cadena = sc.nextLine();
                return cadena;
        }

}

