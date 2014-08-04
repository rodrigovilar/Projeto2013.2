import java.util.ArrayList;
import java.util.List;
 
public class Sistema {
	
	private List<PlanoDeCurso> planos = new ArrayList<>();
	
	public Sistema(){
		
	}

	public void add(PlanoDeCurso plano) {
		planos.add(plano);
	}

	public List<PlanoDeCurso> getPlano() {
		return planos;
	}
	
	
}
