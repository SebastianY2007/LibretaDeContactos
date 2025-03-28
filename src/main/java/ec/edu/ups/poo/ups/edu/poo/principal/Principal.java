package ec.edu.ups.poo.ups.edu.poo.principal;
import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de personas que desea registrar: ");
        int numPersonas = scan.nextInt();
        Persona[] personas = new Persona[numPersonas];
        System.out.print("Introduzca la cantidad de familiares que desea registrar: ");
        int numFamiliares = scan.nextInt();
        Familiar[] familia = new Familiar[numFamiliares];
        System.out.println("-".repeat(70));
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el numero de cedula de la persona "+(i+1)+": ");
            String cedula = scan.next();
            System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
            String nombre = scan.next();
            System.out.print("Ingrese el apellido de la persona "+(i+1)+": ");
            String apellido = scan.next();
            System.out.print("Ingrese la direccion de la persona "+(i+1)+": ");
            String direccion = scan.next();
            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }
        System.out.println("-".repeat(70));
        for (int i = 0; i < numFamiliares; i++){
            System.out.print("Ingrese el numero de cedula del familiar "+(i+1)+": ");
            String cedula = scan.next();
            System.out.print("Ingrese el nombre del familiar "+(i+1)+": ");
            String nombre = scan.next();
            System.out.print("Ingrese el apellido del familiar "+(i+1)+": ");
            String apellido = scan.next();
            System.out.print("Ingrese la direccion del familiar "+(i+1)+": ");
            String direccion = scan.next();
            System.out.print("Ingrese el parentesco del familiar "+(i+1)+": ");
            String parectesco = scan.next();
            System.out.print("Ingrese el tipo de sangre del familiar "+(i+1)+": ");
            String tipoDeSangre = scan.next();
            System.out.print("Ingrese el año de nacimiento del familiar "+(i+1)+": ");
            int añoDeNacimiento = scan.nextInt();
            System.out.print("Ingrese el mes de nacimiento del familiar "+(i+1)+" (1 - 12) : ");
            int mesDeNacimiento = scan.nextInt();
            System.out.print("Ingrese el dia de nacimiento del familiar "+(i+1)+": ");
            int diaDeNacimiento = scan.nextInt();

            GregorianCalendar fechaDeNacimiento = new GregorianCalendar(añoDeNacimiento, mesDeNacimiento - 1, diaDeNacimiento);
            familia[i] = new Familiar(cedula, nombre, apellido, direccion, parectesco, tipoDeSangre, fechaDeNacimiento);
        }
        System.out.println("-".repeat(70));

        // Mostrar personas registradas
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("----------------- Persona "+(i+1)+" -----------------");
            System.out.println("Cedula: "+personas[i].getCedula());
            System.out.println("Nombre: "+personas[i].getNombre());
            System.out.println("Apellido: "+personas[i].getApellido());
            System.out.println("Direccion: "+personas[i].getDireccion());
        }

        // Mostrar familiares registradas
        for (int i = 0; i < numFamiliares; i++) {
            System.out.println("----------------- Familiar "+(i+1)+" -----------------");
            for (Familiar familiar : familia){
                System.out.println(familiar);
                System.out.println(" ");
            }
        }
    }
}