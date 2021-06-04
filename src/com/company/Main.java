package com.company;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(" esto es una prueba");

        String sPalabra = "palabra";

        String []vector = {"a", "b", "c", "c","b","a"};
        List<Integer> lista = Arrays.asList(1,3,4,5,7,2,5,2);

        Integer [] lista_alterna = {1,3,5,6,7,4};

       // List<Integer> lista2 = ordenar(lista_alterna);

        //NumeroMayor(vector);
        //Simetrica (vector, 8);
        //ConstruirMatrix(10);
       // fizz(41);

       /* List<Integer> lista = new ArrayList<Integer>();

        lista.add(4);
        lista.add(5);
        lista.add(6);*/





        /*Scanner scan = new Scanner(System.in);
        String d ="FDFSDfs";
        double precio = 1.22;
        System.out.printf("%-15s%.2f%n",d, precio);*/

        //int valor[] = {1, 2, 4, 5, 6};
        int valor[] = {1,2,2,4,5,6,7,7,7,7,8,8,8};

       // verificarOrden(valor);

        int [] array = {1, 2, 9, 1, 1, 1, 1, 1, 3};
        rutaOptima (array);
        //ordenar(valor);
        //mostrarDescendente();
        //histograma(valor);
        //Ocurrencias(valor);
        //Matriz(valor,4);
        //Suma(valor);
    }


    public static void rutaOptima(int vector[])
    {
        Integer matrix [][] = new Integer[3][3];
        int controladora= 3;
        String resultado ="";

        int col1=0, col2=0, col3=0, suma=0, suma_minima=10000;


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = vector[j+ controladora*i];
                }
            }

        for (int u=0; u<3 ; u++) {
            col1 = matrix[u][0];
            for (int i = 0; i < 3; i++) {
                col2 = matrix[i][1];
                for (int j = 0; j < 3; j++) {
                    col3 = matrix[j][2];

                    suma = col1 + col2+ col3;

                  //  if(suma < suma_minima   && (i+1)>= j && (i+1-u) <3)
                    if(suma < suma_minima   && (i+1)>= j && (u+1) >=i && (u-i)<=1 && (i-j)<=1)
                    {
                        resultado = matrix[u][0] +" "+matrix[i][1]+" "+matrix[j][2];
                        suma_minima = suma;
                    }

                }
            }
        }

        System.out.println("la menor suma la da los siguientes números" + resultado);

    }

    public  static void matrixUnidimencional(int vector[][]){

        int tam = vector.length;
        int suma =0;
        int suma_menor = 1000000;
        int valor_inicial=0, valor_segunda=0;
        for( int i = 0 ; i< tam; i++)
        {
            valor_inicial = vector[i][0];

            for( int j = 0 ; j< tam; i++)
            {
                valor_segunda = vector[j][1];
                for( int m = 0 ; m< tam; i++){
                    suma = valor_inicial + valor_segunda + vector[m][2];
                    if(suma<suma_menor){
                        suma_menor = suma;
                    }

                }
            }
        }


    }


    public static void ConstruirMatrix(int n)
    {
        String resul[][]= new String[n][n];

        String respuesta[] = new String[n];
        for (int i=0 ; i<n; i++){
            respuesta [i]="";
            for(int j=0 ; j<n;j++) {
                if (i == j) {
                    resul[i][j] = "X";
                } else  if (i + j == n - 1) {
                    resul[i][j] = "X";
                }else
                {
                    resul[i][j] = "_";
                }
                respuesta [i]= respuesta[i] +  resul[i][j] ;
            }
            System.out.println(respuesta [i]);

        }

    }

    public static void Simetrica (String vector[], int n){

        int tam = vector.length;

        boolean simetrica= true;

        int j=tam -1;
        for(int i= 0; i<tam; i++){
            if (vector[i]!=vector[j]){
                simetrica = false;
            }
            j--;
        }

        if(simetrica)
        {
            System.out.println("Symmetric");
        }
        else
        {
            System.out.println("Asymmetric");
        }

        }

    public static void  NumeroMayor(int vector[])
    {
        int tam = vector.length;

        int mayor =0;

        for (int i=0 ;i<tam; i++){

            if(vector[i]>mayor){
                mayor = vector[i];
            }

        }

        System.out.println("Numero mas alto"+mayor);
    }


    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void subarray(List<Integer> arr)
    {

        int tam = arr.size();
        int num_arrays= (int) Math.pow(2,tam);

        int sumNume= factorial(tam+ tam - 1);
        int sumDen= factorial(tam)* factorial(tam - 1);

        //{{

        int resultado = 1;
        for (int i = 1; i <= sumNume; i++) {
            resultado *= i;
        }

        int resul = sumNume / sumDen;
        System.out.println(resul);

    }


    public static void fizz(int n)
    {

        if(n%3 ==0 && n%5==0)
        {
            System.out.println("FizzBuzz");
        }else if(n%3 ==0 && n%5!=0){
            System.out.println("Fizz");
        } else  if (n%3 !=0 && n%5==0){
            System.out.println("Buzz");
        }else if (n%3 !=0 || n%5!=0){
            System.out.println(n);
        }


    }


    public static void Matriz(int vector[], int n){

        int matrix[][]= {{1,2,9},{2,5,3},{5,1,5}};
        int sum=0;
        int aux=0;
        int resul[]= new int[n];
        for( int i= 0; i<n ; i++) {
            aux = matrix[i][0];
            resul[i] = aux;
            for (int j = 1; j < n; j++) {

                sum = aux + matrix[i-j][j] ;

            }
            if(sum <6){

            }
        }

    }


    public static void Ocurrencias(int vector[])
    {
        int tam = vector.length;
        int resul[]= new int[2];
        int longest =0;
        int number =0;

        for( int i= 0; i<tam ; i++) {
            resul[0] = vector[i];

            for (int j = i ; j < tam; j++) {

                if (resul[0] == vector[j]) {
                    resul[1] = resul[1] + 1;
                } else {
                    break;
                }
            }
            if(resul[1]>longest) {
                longest = resul[1];
                number = resul[0];
            }
            resul[1] = 0;

        }

        System.out.println("longest: "+longest );
        System.out.println("Number: "+number  );

    }


    public static void Suma(int vector[])
    {
        int tam  = vector.length;
        boolean aux = true;
        int resul[]= new int[2];

        for( int i= 0; i<tam ; i++)
        {

                resul[0] = vector[i];
                for (int j = i + 1; j < tam; j++) {

                    if (vector[i] + vector[j] == 10) {
                        resul[1] = vector[j];
                        System.out.println("resultado "+  resul[0]+" "+ resul[1]);
                        return;
                    }
                }
        }
    }

    public static  void mostrarDescendente()
    {
        for( int i=10; i>-1; i-=1)
        {
            System.out.println(i);
        }

    }

    public static  void histograma(int vector[])
    {
        //{1,2,1,3,3,1,2,1,5,1};
        int tam = vector.length;
        int cant_uno=0,cant_dos=0,cant_tres=0,cant_cuatro=0,cant_cinco=0;
        String cant_num []= new String[5];
        int valor=0;
        for (int j= 0 ; j<5 ; j++) {
            cant_num[j]="";
            for (int i = 0; i < tam; i++) {
                if(j +1 == vector[i])
                {
                    cant_num[j] = cant_num[j] + "*";
                }
            }
        }
        System.out.println("1:" + cant_num[0]);
        System.out.println("2:" + cant_num[1]);
        System.out.println("3:" + cant_num[2]);
        System.out.println("4:" + cant_num[3]);
        System.out.println("5:" + cant_num[4]);

    }


    public static void ordenar(int valor[])
    {
        int mayor =0;

        int tam = valor.length;
        boolean cambio = false;

        int pos_mayor=0;
        int pos_inicial = 0;

        for (int i=0 ; i<tam; i++)
        {
            mayor = valor[i];

            for(int j= i +1  ; j<tam ; j++){
                if(mayor < valor[j])
                {
                    mayor = valor[j];
                    pos_mayor = j;
                    cambio = true;
                }
            }
            if(cambio) {
                pos_inicial = valor[i];
                valor[i] = valor[pos_mayor];
                valor[pos_mayor] = pos_inicial;
                cambio = false;
            }


        }

        for (int i = 0 ; i< tam ; i++)
        {
            System.out.println(valor[i]);
        }

    }

    public static void verificarOrden(int valor[]){

        boolean asc= true;
        boolean desc= true;

        int tam = valor.length;


        for (int i=0 ; i< tam-1; i++) {

            if (asc || desc) {
                if (valor[i] < valor[i + 1]) {
                    desc = false;
                }
                if (valor[i] > valor[i + 1]) {
                    asc = false;
                }
            } else {
                break;
            }
        }
        if (desc)
        {
            System.out.println(" el vector esta descendiente");
        }
        if (asc)
        {
            System.out.println(" el vector esta ascendiente");
        }
        if(desc == asc)
        {
            System.out.println(" el vector esta desordenado");
        }




    }



    //public static List<Integer>  ordenar(List<Integer> lista){
        public static List<Integer>  ordenar(Integer [] lista){


       List<Integer> listaNueva = null ;//Arrays.stream(lista).sorted().toList();

        return listaNueva;

    }


}
