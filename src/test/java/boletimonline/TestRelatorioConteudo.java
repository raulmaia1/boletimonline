package boletimonline;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.altera.relatorio.ConteudoProgramaticoRelatorio;
import br.com.boletimonline.model.usuario.Professor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

public class TestRelatorioConteudo {

	public static void main(String[] args) {
		
		ConteudoProgramaticoRelatorio conteudo = TestRelatorioConteudo.conteudo();
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("professor", conteudo.getProfessor().getNome());
		

		try {
			JasperReport report = (JasperReport) JRLoader.loadObject(new File("relatorios/conteudo.jasper"));
			JasperPrint print = JasperFillManager.fillReport(report, param, new JRBeanCollectionDataSource(conteudo.getConteudos()));

		
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(print));
			File outputFile = new File("/home/edu/output.xlsx");
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputFile));
			SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
			configuration.setDetectCellType(true);//Set configuration as you like it!!
			configuration.setCollapseRowSpan(false);
			exporter.setConfiguration(configuration);
			exporter.exportReport();
//			
//			JasperViewer jv = new JasperViewer(print, false);
//			jv.setTitle("Relatorios");
//			jv.setVisible(true);
		} catch (JRException e) {
			e.printStackTrace();
		}


	}
	
	private static ConteudoProgramaticoRelatorio conteudo(){
		Professor professor = ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva();

		ConteudoProgramatico conteudo1 = new ConteudoProgramatico();
		conteudo1.setConteudo("Uma introdução a morfologia, Prefixos e Sufixos, Tipo de Derivações, uma Introdução ao Substantivo ");
		conteudo1.setData("02/08/2021");
		conteudo1.setDisciplina(professor.getDisciplinas().get(0));
		conteudo1.setQuantAulas("2");
		conteudo1.setTurma(professor.getTurmas().get(0));

		ConteudoProgramatico conteudo2 = new ConteudoProgramatico();
		conteudo2.setConteudo("Uma Introdução a Substatntivo");
		conteudo2.setData("03/08/2021");
		conteudo2.setDisciplina(professor.getDisciplinas().get(0));
		conteudo2.setQuantAulas("2");
		conteudo2.setTurma(professor.getTurmas().get(0));

		ConteudoProgramaticoRelatorio relatorio = new ConteudoProgramaticoRelatorio();
		relatorio.setProfessor(professor);
		relatorio.setConteudos(Arrays.asList(conteudo1,conteudo2));
		
		
		return relatorio;
	}
	
}
