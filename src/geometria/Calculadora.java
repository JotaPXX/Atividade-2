package geometria;
import java.util.Scanner;
import java.math.*;
public class Calculadora {
	
	private double lado;
	
	private double base;
	
	private double altura;
	
	private double raio;
	
	private int opcao;
	
	private double resultado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}


	public void menu() {
		System.out.println("Escolha a opção de cálculo da área:");
        System.out.println("1. Calcular Área do Quadrado");
        System.out.println("2. Calcular Área do Retângulo");
        System.out.println("3. Calcular Área do Círculo");
        System.out.println("4. Sair");
		
	}
	public void executar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Escolha uma opção (1 a 4): ");
            setOpcao(scanner.nextInt());

            switch (getOpcao()){
                case 1:
                    
                    System.out.print("Digite o lado do quadrado em metros: ");
                    setLado(scanner.nextDouble());
                    setResultado(Math.pow(getLado(), 2));
                    System.out.printf("A área do quadrado é: %.2f m²\n", getResultado());
                    break;

                case 2:
                    
                    System.out.print("Digite a base do retângulo em metros: ");
                    setBase(scanner.nextDouble());
                    System.out.print("Digite a altura do retângulo em metros: ");
                    setAltura(scanner.nextDouble());
                    setResultado(getBase() * getAltura());
                    System.out.printf("A área do retângulo é: %.2f m²\n", getResultado());
                    break;

                case 3:
                    
                    System.out.print("Digite o raio do círculo em metros: ");
                    setRaio(scanner.nextDouble());
                    setResultado(Math.PI * Math.pow(getRaio(), 2));
                    System.out.printf("A área do círculo é: %.2f m²\n", getResultado());
                    break;

                case 4:
                    
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }  
        }
	}
	
}


