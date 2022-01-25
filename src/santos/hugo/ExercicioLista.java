package santos.hugo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Class.Funcionario;

public class ExercicioLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int quantityEmpolyes = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        Funcionario func = null;

        for(int i=0;i < quantityEmpolyes; i++){
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionario(id, name, salary));
        }
        
        System.out.println("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        
        Funcionario emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null); 
        
        /*Integer pos = position(list, idIncrease);*/
        		
        if(emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        	
        }

        System.out.println("List of employees: ");
        for(Funcionario x: list){
            System.out.println(x);
        }
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
