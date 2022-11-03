import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
	 * 
	 * @author thaap
	 * @param valor - Parametro do tipo inteiro dado com o nome de valor.
	 * 
	 */
	
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer valor) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param valor - Parametro do tipo inteiro dado com o nome de valor.
	 * 
	 */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer valor) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param valor - Parametro do tipo inteiro dado com o nome de valor.
	 * 
	 */

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer valor) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param valor - Parametro do tipo inteiro dado com o nome de valor.
	 * 
	 */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer valor) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param - Não passa nenhum tipo de parametro no metodo.
	 * 
	 */

	@Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
