package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employees funcionario = new Employees();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.println("Funcionario: " + funcionario);
		System.out.println();
		
		System.out.print("Qual a % para aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println("Funcionario atualizado: " + funcionario);
		
		sc.close();
	}

}
