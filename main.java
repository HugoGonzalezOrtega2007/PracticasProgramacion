//De 0 a 4
public class Main {
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
//Hello World!
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
//Cita Enstein
public class Main {
    public static void main(String[] args) {
        System.out.println("Life is like riding a bicycle. To keep your balance you must keep moving.");
    }
}
//J con asteriscos
public class Main {
    public static void main(String[] args) {
        System.out.println("********\n" +
                "      **\n" +
                "      **\n" +
                "      **\n" +
                "**    **\n" +
                "**    **\n" +
                " *******");
    }
}
//Hello world con ASCII-art
public class Main {
    public static void main(String[] args) {
        System.out.println("\"%   *&  %)&>*%  =+     &!     /&![%{\\    +,       ?<  .:;*!<,  ])<;]>   )!     /<-[\\>\n" +
                "<;   {<  -%      -%     <%     :;   [;    {;       \"*  ?{   ?!  ?*   \\|  :=     \\|   ?\\\n" +
                ",![=+((  }:;=.   <;     ?-     }[   }*     ?]  -  '*   &:   [.  +;=-:,   =]     )\"    ;)\n" +
                "*)   .>  -]      {!     |;     =<   -.     {; |(| <%   ,|   (%  -,  .\\   }-     ?/   +?\n" +
                "%+   *&  })=(\\{  \"<}&%  &[/|>  \\+]&\"!/      <\\' '(+    '&![%{'  [%   ?<  %|<?+  ;=?%&'");
    }
}
//Declaración de variables invalida
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int a = 512343;
        int b = 3431231;

        System.out.println(a + b);
    }
}
//Asignaciones
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int a = 3;
        int b = 5;
        int c = 4;

        System.out.println(a + " " + b + " " + c);
    }
}
//Completa la declaración
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int variable = 123456;

        System.out.println(variable);
    }
}
//Tipo correcto
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int y = 2020;
        String m = "Abril";
        float t = 37.5f;
        boolean s = false;
        char c = ';';

        System.out.println(y);
        System.out.println(m);
        System.out.println(t);
        System.out.println(s);
        System.out.println(c);
    }
}
//Valores correctos
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        // asigna els valors a aquestes variables

        boolean a = true;
        float b = 35.6f;
        float c = 2000.0f;
        String d = "true";
        char e1 = 't', e2 = 'r', e3 = 'u', e4 = 'e';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.print(e1);
        System.out.print(e2);
        System.out.print(e3);
        System.out.print(e4);
    }
}
//Nombres correctos
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String feature = "Text Blocks";
        String language = "Java";
        char quote = '"';
        int version = 15;

        System.out.print(language);
        System.out.print(" ");
        System.out.print(version);
        System.out.print(" incorpora ");
        System.out.print(feature);
        System.out.print(", que es delimiten amb ");
        System.out.print(quote);
        System.out.print(quote);
        System.out.print(quote);
    }
}
//Hello you
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String n1 = scanner.nextLine();
        System.out.print("Hola " + n1 + "!");

    }
}
//Archivos extension
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filename1 = scanner.next();
        String archivo1 = scanner.next();
        String type1 = scanner.nextLine().trim();

        String filename2 = scanner.next();
        String archivo2 = scanner.next();
        String type2 = scanner.nextLine().trim();

        String filename3 = scanner.next();
        String archivo3 = scanner.next();
        String type3 = scanner.nextLine().trim();

        String filename4 = scanner.next();
        String archivo4 = scanner.next();
        String type4 = scanner.nextLine().trim();

        System.out.println(" " + archivo4 + " " + type4 + " " + filename4);
        System.out.println(" " + archivo3 + " " + type3 + " " + filename3);
        System.out.println(" " + archivo2 + " " + type2 + " " + filename2);
        System.out.println(" " + archivo1 + " " + type1 + " " + filename1);

    }
}
//Ficha medica
import java.io.*;
        import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine().trim();

        String edad = scanner.nextLine().trim();

        String nada = scanner.nextLine().trim();

        String ciudad = scanner.nextLine().trim();

        String enfermedad = scanner.nextLine().trim();

        System.out.println("El/la paciente " + nombre + ", de " + edad + " anos, con residencia en " + ciudad + ", acude al hospital por: " + enfermedad);
    }
}
//Registrar Disco
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cancion = scanner.nextLine().trim();

        String artista = scanner.nextLine().trim();

        String album = scanner.nextLine().trim();

        String duracion = scanner.nextLine().trim();

        String ano = scanner.nextLine().trim();

        System.out.println("La cancion \"" + cancion + "\" del grupo \"" + artista + "\", del album \"" + album + "\", con una duracion de " + duracion + " minutos y publicada en " + ano + ", ha sido guardada correctamente.");
    }
}
//Cada palabra una linea
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.next().trim();
        String n2 = scanner.next().trim();
        String n3 = scanner.next().trim();
        String n4 = scanner.next().trim();
        String n5 = scanner.next().trim();

        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4+ "\n" + n5);
    }
}
//Contratar a un desarrollador
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.next().trim();
        String n2 = scanner.next().trim();
        String n3 = scanner.next().trim();
        String n4 = scanner.next().trim();
        String n5 = scanner.next().trim();

        System.out.println("El formulario de " + n1 + " se ha completado. Te contactaremos si necesitamos un programador de " + n5 + ".");
    }
}
//Fechas
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.next().trim();
        String n2 = scanner.next().trim();
        String n3 = scanner.next().trim();

        System.out.println(n1 + "/" + n2 + "/" + n3);
    }
}
//Operaciones básicas 1
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int suma = a + b;


        System.out.println(suma);

        scanner.close();
    }
}
//Área rectangulo y perímetro
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        float area = a * b;
        float perimetro = 2 * (a+b);


        System.out.println("Area: " + area + "\n" + "Perimetro: " + perimetro);

        scanner.close();
    }
}
//JSON
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String nombre = scanner.nextLine().trim();
        String edad = scanner.nextLine().trim();
        String correo = scanner.nextLine().trim();
        String actividad = scanner.nextLine().trim();

        System.out.println("{");
        System.out.println("  \"nombre\": " + "\"" + nombre + "\",");
        System.out.println("  \"edad\": " + edad + ",");
        System.out.println("  \"email\": " + "\"" + correo + "\",");
        System.out.println("  \"activo\": " + actividad);
        System.out.println("}");

    }
}
//Salida de autobús
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int resultado = (n1 * n3) + (n2 * n3);

        System.out.println(resultado);

        scanner.close();
    }
}
//Nota media
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();

        float resultado = (n1+n2+n3)/3;

        System.out.println(resultado);

        scanner.close();
    }
}
//Perímetro de un rectangulo
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int ancho = Math.abs(x2 - x1);
        int alto = Math.abs(y2 - y1);

        int perimetro = 2 * (ancho + alto);

        System.out.println(perimetro);

        scanner.close();
    }
}
//stigid serT
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int unidad = n%10;
        int decena = (n/10)%10;
        int centena = n/100;

        int resultado = unidad*100 + decena*10 + centena;

        System.out.println(resultado);

        scanner.close();
    }
}
//Horas para fin de año
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();

        int minutohora = hora * 60;

        int falta = Math.abs ((minutohora + minuto) - 1440);

        System.out.println(falta);

        scanner.close();
    }
}
//Pizza
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amigos = scanner.nextInt();
        int operacion = (2*amigos) + 1;

        System.out.println(operacion);

        scanner.close();
    }
}
//El camino circular
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n1 = 3.1416;
        double n2 = scanner.nextDouble();
        int perimetro = (int) (2 * n1 * n2);

        System.out.println(perimetro);

        scanner.close();
    }
}
//Diferencia Escalonada
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = num-1;
        int operacion = num*num - 2*num2;

        System.out.println(operacion);

        scanner.close();

    }
}
//Caramelos en el frasco
import java.util.Scanner;

public class Caramelos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura = scanner.nextInt();
        int ancho = scanner.nextInt();
        int profundidad = scanner.nextInt();
        int tamanoCaramelo = scanner.nextInt();

        int volumenFrasco = altura * ancho * profundidad;
        int cantidad = volumenFrasco / tamanoCaramelo;

        System.out.println(cantidad);

        scanner.close();
    }
}
//Conversión de temperatura
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = scanner.nextInt();
        double f = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Fahrenheit: " + f);
        double k = celsius + 273.15;
        System.out.println("Kelvin: " + k);

        scanner.close();
    }
}

//Suma
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int suma = n1+n2;

        System.out.println(suma);

        scanner.close();
    }
}
//Calcular binario
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int n7 = scanner.nextInt();
        int n8 = scanner.nextInt();

        int suma = n1*128 + n2*64 + n3*32 + n4*16 + n5*8 + n6*4 + n7*2 + n1*1;

        System.out.println(suma);

        scanner.close();
    }
}
//Calcular descuento
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int descuento = n1-(n1*n2/100);

        System.out.println(descuento);

        scanner.close();
    }
}
//Calcular propina
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int precio = scanner.nextInt();
        float porcentaje = scanner.nextInt();

        float porcentajetotaldecimal = porcentaje/100;
        float propina = precio * porcentajetotaldecimal;

        float total = precio + propina;

        System.out.println ((int)propina + " " + (int)total);

        scanner.close();
    }
}
//Calcular IMC 1
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peso = scanner.nextInt();
        int altura = scanner.nextInt();

        int imc = peso/(altura*altura);

        System.out.println(imc);

        scanner.close();
    }
}
//Calcular almacén
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int almacen = scanner.nextInt();
        int caja = scanner.nextInt();

        int lleno = almacen/caja;
        int sueltos = almacen % caja;

        System.out.println(lleno + " " + sueltos);

        scanner.close();
    }
}
//Artrópodos
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int insectos = scanner.nextInt();
        int aracnidos = scanner.nextInt();
        int crustaceos = scanner.nextInt();
        int miriapodos2 = scanner.nextInt();
        int segmentosmiriapodos2 = scanner.nextInt();
        int miriapodos4 = scanner.nextInt();
        int segmentosmiriapodos4 = scanner.nextInt();




        int patastotales = (insectos*6 + aracnidos*8 + crustaceos*10 + miriapodos2*2*segmentosmiriapodos2 + miriapodos4*4*segmentosmiriapodos4);

        System.out.println(patastotales);

        scanner.close();
    }
}
