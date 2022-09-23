package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program6 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			sc.nextLine();
			System.out.println("Employee #" + i +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list,id)) {
				System.out.println("Id already taken! Try again: ");
			}
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			Funcionario func= new Funcionario(id,nome,salario);
			
			list.add(func);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		
		int id = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			func.aumentarsalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		sc.close();

	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario !=null;
	}

}
