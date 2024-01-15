import java.util.Scanner;

public class DescrobrirNotaUNIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MediaUNIP unip = new MediaUNIP();
        System.out.print("Qual o seu nome?: ");
        unip.nome = sc.nextLine();
        System.out.print("Digite sua nota da Np1: ");
        unip.np1 = sc.nextDouble();
        System.out.print("Digite sua nota da Np2: ");
        unip.np2 = sc.nextDouble();
        System.out.print("Digite sua nota do trabalho(PIM): ");
        unip.pim = sc.nextDouble();

        System.out.printf("Ola %s, Sua média Semestral é: %.2f\n", unip.nome, unip.mediaSemestral());
        if (unip.mediaSemestral() < 5.75){
            System.out.printf("Sua nota não foi o suficiente para escapar do exame, Você vai precisar tirar: (%.2f) ou mais para não ficar em DP na matéria", unip.notaNecessariaExame());
        }else{
            System.out.println("Parabéns sua nota foi o suficiente para não precisar fazer o exame!");
        }
        sc.close();
    }
}
