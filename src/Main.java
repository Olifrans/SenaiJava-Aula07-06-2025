import Model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produtos = new Produto();

        produtos.nome = "Placa mãe";
        produtos.quantidade = 37;
        produtos.preco = 780.99;

        produtos.adcionaProduto(10);
        produtos.venderProduto(37);
        produtos.venderProduto(57);

        System.out.println();


        Student student1 = new Student();
        student1.name = "Pedro";
        student1.grade1 = 4.5;
        student1.grade2 = 7.5;

        Student student2 = new Student();
        student2.name = "Silvia";
        student2.grade1 = 9.5;
        student2.grade2 = 7.5;

        System.out.println(student1.name + " tem média: " + student1.calculaMedia());
        System.out.println(student2.name + " tem média: " + student2.calculaMedia());


        System.out.println();

        Bond bond = new Bond();
        bond.name = "Tesouro direto";
        bond.balance= 20000.00;

        bond.buyBond(24);
        bond.simulateInterest();


        System.out.println();

        Aluno aluno01 = new Aluno();
        aluno01.nome = "Paulo";
        aluno01.altura = 1.77;
        aluno01.anoMatricula = 2023;

        Aluno aluno02 = new Aluno();
        aluno02.nome = "Pedro";
        aluno02.altura = 1.57;
        aluno02.anoMatricula = 2024;

        System.out.println(aluno01.nome + " tem " + aluno01.altura + "m de altura.");

        aluno02.estudar();


















    }
}