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

public class GeraRelatorio {

		public void gera(List<ConteudoProgramatico> list, String totalHoras) {
			
			try {

				FacesContext context = FacesContext.getCurrentInstance();

				HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();

				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

				InputStream caminho = getClass().getResourceAsStream("/relatorios/conteudo.jasper");

				Map<String, Object> param = new HashMap<String, Object>();
								
				param.put("totalHoras", totalHoras);

				JasperReport report = (JasperReport) JRLoader.loadObject(caminho);
				JasperPrint print = JasperFillManager.fillReport(report, param, new JRBeanCollectionDataSource(list));

				JasperExportManager.exportReportToPdfStream(print,outputStream);

				response.reset();
				response.setContentType("application/pdf");
				response.setHeader("Content-Disposition", "inline;filename=conteudo.pdf");
				response.setContentLength(outputStream.size());
				response.getOutputStream().write(outputStream.toByteArray());
				response.getOutputStream().flush();
				response.getOutputStream().close();
				
				context.responseComplete();

				} catch (JRException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		public static void main(String[] args) {
			List<ConteudoProgramatico> list = new ConteudoProgramaticoDao().pesquisaPorProfessor(ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva());
			new GeraRelatorio().gera(list , "20");
			
		}
}

