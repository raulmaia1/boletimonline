package br.com.boletimonline.relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import br.com.boletimonline.dao.jdbc.ConteudoProgramaticoDao;
import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;
import br.com.boletimonline.model.ConteudoProgramatico;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class GeraRelatorioConteudoProgramatico extends GeraRelatorio<ConteudoProgramatico>{

		public void gera(List<ConteudoProgramatico> list, String totalHoras) {
			
			try {

				FacesContext context = FacesContext.getCurrentInstance();

				HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();

				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

				InputStream caminho = getClass().getResourceAsStream("/relatorios/conteudo.jasper");

				Map<String, Object> param = new HashMap<String, Object>();
								
				param.put("totalHoras", totalHoras);

				geraRelatorio(list, context, response, outputStream, caminho, param);

				} catch (JRException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}


	
		public static void main(String[] args) {
			List<ConteudoProgramatico> list = new ConteudoProgramaticoDao().pesquisaPorProfessor(ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva());
			new GeraRelatorioConteudoProgramatico().gera(list , "20");
			
		}
}

