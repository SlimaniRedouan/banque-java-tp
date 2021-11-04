package fr.formation.banque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CompteTest {
	
	//Référence de l'objet a tester
	private Compte compte;
	
	@Before
	public void setUp() {
		compte = new Compte(123, 2000.00, "redouan"); 
	}
	
	@Test
	public void testGetNumero() {
		long numero = compte.getNumero();
		assertEquals(123, numero);
	}
	
	@Test
	public void testGetReferenceClient() {
		String referenceClient = compte.getReferenceClient();
		assertEquals("redouan", referenceClient);
	}
	
	@Test
	public void testSetNumero() {
		compte.setNumero(4764);
		long numero = compte.getNumero();
		assertEquals(4764, numero);
	}
	
	@Test
	public void testSetReferenceClient() {
		compte.setReferenceClient("slimani");
		String referenceClient = compte.getReferenceClient();
		assertEquals("slimani", referenceClient);
	}
	

}
