import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peso1 = 2, peso2 = 3;
		double maiorMedia = -1, menorMedia = 11;
		
		for(int i = 1; i <= 5; i++)
		{
			double nota1;
			do
			{
				System.out.print("Digita a primeira nota: ");
				nota1 = sc.nextDouble();
				if(nota1 < 0 || nota1 > 10)
				{
					System.out.println("Valor invalido para primeira nota, digite novamente.");
				}
			}while(nota1 < 0 || nota1 > 10);
			
			double nota2;
			do
			{
				System.out.print("Digita a segunda nota: ");
				nota2 = sc.nextDouble();
				if(nota2 < 0 || nota2 > 10)
				{
					System.out.println("Valor invalido para primeira nota, digite novamente.");
				}
			}while(nota2 < 0 || nota2 > 10);
			
			double media = ((nota1 * peso1)+(nota2 * peso2))/ (peso1 + peso2);
			
			if(media >= 7)
			{
				System.out.println("Aluno aprovado com média: "+media);
			}else if (media < 7 && media >= 3)
			{
				double pontuacaoParaPassaNaFinal = 10 - media;
				System.out.println("Aluno irá para final precisando da nota mínima de: "+pontuacaoParaPassaNaFinal);	
			}else
			{
				System.out.println("Aluno reprovado com média: "+media);	
			}
			
			if(media > maiorMedia)
			{
				maiorMedia = media;
			}
			if(media < menorMedia)
			{
				menorMedia = media;
			}
		}
		
		System.out.println("A maior média é: "+maiorMedia);
		System.out.println("A menor média é: "+menorMedia);
	}

}
