package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Franco");
		Tio tia1 = new Tio("Graça");
		
		Sobrinho sobrinho1 = new Sobrinho("Benedito");
		Sobrinho sobrinha1	 = new Sobrinho("Flavia");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tio1);
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tia1);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(tio1)
			.incluir(tia1)
			.incluir(sobrinho1)
			.incluir(sobrinha1)
			.fecharT()
			.fechar();

	}

}
