package controller;

import model.Professor;

public class ProfessorController {

	public void testaProfessor() {
		
		Professor p1= new Professor();
		p1.setNome("Tobias");
		p1.setCpf("475575828-02");
		p1.setMateria("Fisica");
		p1.setSalario(2100);
		p1.exibe();		
	}
	
}
