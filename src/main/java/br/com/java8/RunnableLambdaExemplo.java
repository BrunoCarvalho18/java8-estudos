package br.com.java8;

public class RunnableLambdaExemplo {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
               System.out.println("Executando um runnable");
            }
        }).start();

        //Uso da thread com lambda
        new Thread(() -> System.out.println("Executando um runnable 2")).start();
    }
}
