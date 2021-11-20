package br.com.boletimonline.relatorio;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import br.com.boletimonline.dao.jdbc.BimestreDao;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;

public class GeraRelatorioNotaPorDisciplina extends GeraRelatorio<DisciplinaTurma> {
	
	public void gera(DisciplinaTurma disciplinaTurma, Disciplina disciplina) {
		
		
		new BimestreDao().verificaBimestrePorTurmaEDisciplina(disciplinaTurma.getTurma(), disciplina);
		
		FacesContext context = FacesContext.getCurrentInstance();

		HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		InputStream caminho = getClass().getResourceAsStream("/relatorios/conteudo.jasper");

		Map<String, Object> param = new HashMap<String, Object>();
						
		//param.put("totalHoras", totalHoras);

	//	geraRelatorio(list, context, response, outputStream, caminho, param);
		
	}
	
	
	
}
