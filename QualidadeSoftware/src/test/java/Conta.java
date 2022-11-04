import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	public int valor1;
	public int valor2;
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */
	
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
	    this.valor1 = int1;
	    if (this.valor1 != -200) 
	    	throw new io.cucumber.java.PendingException();
	    
	}
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
	    this.valor1 = int1;
	    if (this.valor1 != 100) 
	    	throw new io.cucumber.java.PendingException();
	    
	    
	}
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		if ((this.valor1 -= this.valor2) == -300) 
	    	this.valor1 = int1;
		else 
	    	throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */

	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.valor1 = int1;
	    if (this.valor1 != -300) 
	    	throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.valor2 = int1;
	    if (this.valor2 != -100) 
	    	throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param int1 - Parametro do tipo inteiro dado com o nome de int1.
	 * 
	 */

	@Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		if (this.valor1 < 0 || this.valor2 < 0)  
			System.out.println("Saldo Insuficiente");
		else 
			throw new io.cucumber.java.PendingException();
		
	}
	
}
