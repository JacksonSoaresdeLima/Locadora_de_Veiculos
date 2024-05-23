package CadastroPessoas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int repetir;
        CadastroPessoas cp = new CadastroPessoas();

        do {
            System.out.println("Escolha 1 para CadastroPessoas.Pessoa Jurídica;\n Escolha 2 para CadastroPessoas.Pessoa Física;");
            int x = sc1.nextInt();
            switch (x) {


                case 1:

                PessoaJuridica pj = new PessoaJuridica();
                sc2.nextLine();
                System.out.println("Digite o nome da pessoa ou empresa a ser cadastrada: ");
                pj.setNome(sc2.nextLine());

                System.out.println("Digite a idade da pessoa a ser cadastrada: ");
                pj.setIdade(sc1.nextInt());

                System.out.println("Digite o Cnpj da pessoa cadastrada: ");
                pj.setCnpj(sc1.nextDouble());


                cp.cadastrarPessoa(pj);

                cp.listarpj();
                break;

                case 2:
                    PessoaFisica pf = new PessoaFisica();

                    System.out.println("Digite o nome da CadastroPessoas.Pessoa física: ");
                    pf.setNome(sc2.nextLine());

                    System.out.println("Digite a idade da CadastroPessoas.Pessoa física: ");
                    pf.setIdade(sc1.nextInt());

                    System.out.println("Digite o Cpf da CadastroPessoas.Pessoa a ser cadastrada: ");
                    pf.setCpf(sc1.nextDouble());

                    cp.cadastrarPessoa(pf);
                    System.out.println(pf.toString());

                    cp.listarpf();
                    break;

            }
            System.out.println("Se deseja cadastrar outra pessoa, digite 0:");
            repetir = sc1.nextInt();
        }while (repetir == 0) ;

    }
}