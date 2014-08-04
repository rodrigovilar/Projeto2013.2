import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ProjetoPlanoDeCursoTest {

	@Test
	public void definirEmenta() {
		PlanoDeCurso plano = new PlanoDeCurso();
		plano.setEmenta("teste");
		
		Sistema sistema = new Sistema();
		sistema.add(plano);
		
		List<PlanoDeCurso> planos = sistema.getPlano();
		Assert.assertEquals(1, planos.size());
		Assert.assertEquals(plano, planos.get(0));
		Assert.assertTrue(plano.equals(planos.get(0)));
		
		
	}



}
