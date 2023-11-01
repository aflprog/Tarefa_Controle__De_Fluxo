public class Tarefa_Controle_De_Fluxo {
    public static void main(String args[]){
        calculaMedia();

    }
    public static void calculaMedia(){
        int nota1=6;
        int nota2=5;
        int nota3=1;
        int nota4=7;
        int media=0;

        media=(nota1+nota2+nota3+nota4)/4;
        if (media>=7) {
            System.out.printf("Aprovado.");
        } else if (media>=5) {
            System.out.printf("De recuperação.");
        }
        else {
            System.out.printf("Reprovado");
        }



    }
}