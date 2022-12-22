
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
    }
    
     class Coche {
        public int puertas = 0;
        
        public void AumentarPuertas() {
        this.puertas++;
        }
    }
    
    
}
