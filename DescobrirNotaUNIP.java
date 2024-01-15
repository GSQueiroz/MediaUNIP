import java.util.Scanner;

public class DescobrirNotaUNIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MediaUNIP unip = new MediaUNIP();

        System.out.print("Qual o seu nome?: ");
        unip.nome = sc.nextLine();

        System.out.println("=========================================================================");
        System.out.println("================== Cálculo de Média UNIP em JAVA ========================");
        System.out.println("=========================================================================");

        System.out.println("Escolha uma opção: ");
        System.out.println("1- Calculo de Np1,NP2 e PIM");
        System.out.println("2- Calculo de Media Final  (nota semestral + Exame)");
        System.out.println("3- Sair");

        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.print("Digite sua nota da Np1: ");
                unip.np1 = sc.nextDouble();
                System.out.print("Digite sua nota da Np2: ");
                unip.np2 = sc.nextDouble();
                System.out.print("Digite sua nota do trabalho(PIM): ");
                unip.pim = sc.nextDouble();

                System.out.printf("Ola %s, Sua média Semestral é: %.2f\n", unip.nome, unip.mediaSemestral());
                if (unip.mediaSemestral() < 6.75){
                    System.out.printf("Sua nota não foi o suficiente para escapar do exame, Você vai precisar tirar: (%.2f) ou mais para não ficar em DP na matéria", unip.notaNecessariaExame());
                }else {
                    System.out.println("Parabéns sua nota foi o suficiente para não precisar fazer o exame!");
                }
            break;

            case 2:
                System.out.printf("Ola %s, Digite sua nota do Exame: ", unip.nome);
                unip.exame = sc.nextDouble();
                System.out.printf("Sua média final foi de: (%.2f), ", unip.mediaFinal());

                if (unip.mediaFinal() < 4.75){
                    System.out.println(" e não foi o suficiente para passar na matéria.");
                } else {
                    System.out.println(" Parabéns você passou na matéria!");
                }
            break;

            case 3:
                System.out.println("Finalizando o programa!");
                break;
        }
        sc.close();
    }
}
