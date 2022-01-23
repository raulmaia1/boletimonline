package br.com.boletimonline.relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class GeraRelatorio<T> {
	
	public void geraRelatorio(List<T> list, FacesContext context, HttpServletResponse response,
			ByteArrayOutputStream outputStream, InputStream caminho, Map<String, Object> param)
			throws JRException, IOException {
		
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
	}
}
