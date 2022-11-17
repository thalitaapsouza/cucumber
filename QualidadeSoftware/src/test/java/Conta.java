import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	public boolean clienteEspecial = false;
	public int saldoAtual;
	public int sacar;

	/**
	 * 
	 * @author thaap
	 * @param saldo - Parametro do tipo inteiro dado com o nome de conta.
	 * 
	 */
	
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer saldo) {
		this.saldoAtual = saldo;

		if (this.clienteEspecial == true) {
		} else
			throw new io.cucumber.java.PendingException();	}
	
	/**
	 * 
	 * @author thaap
	 * @param sacar - Parametro do tipo inteiro dado com o nome de saque.
	 * 
	 */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer sacar) {
		this.sacar = sacar;

		if (this.clienteEspecial) {
		} else
			throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param saldo - Parametro do tipo inteiro dado com o nome de saldo.
	 * 
	 */

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer saldo) {
		if (this.clienteEspecial == true) {
			saldo = this.saldoAtual - (this.sacar);
		} else
			throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * @param saldo - Parametro do tipo inteiro dado com o nome de conta.
	 * 
	 */

	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer saldo) {
		this.saldoAtual = saldo;

		if (this.clienteEspecial == false) {
		} else
			throw new io.cucumber.java.PendingException();
	}
	
	
	/**
	 * 
	 * @author thaap
	 * @param sacar - Parametro do tipo inteiro dado com o nome de saque.
	 * 
	 */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer sacar) {
		this.sacar = sacar;

		if (sacar instanceof Integer) {
		} else
			throw new io.cucumber.java.PendingException();
	}
	
	/**
	 * 
	 * @author thaap
	 * Se o cliente for comum e tiver saldo, o sistema deve permitir o saque,
	 *  senao deve aparecer a mensagem de saldo insuficiente
	 */

	@Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {

		if (this.saldoAtual > 0 && this.sacar < this.saldoAtual && this.clienteEspecial == false) {

		} else if (this.sacar > this.saldoAtual) {
			System.out.print("Saldo insuficiente");
		} else
			throw new io.cucumber.java.PendingException();
	}
}
