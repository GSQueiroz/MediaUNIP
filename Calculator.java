public class Calculator {
    public String nome;
    public double np1;
    public double np2;
    public double pim;
    public double exame;

    public double mediaSemestral(){ return (np1 + np2) * 0.4 + pim * 0.2; }

    public double notaNecessariaExame(){ return 10 - mediaSemestral(); }
    public double mediaFinal(){ return (mediaSemestral() + exame) / 2; }

}
