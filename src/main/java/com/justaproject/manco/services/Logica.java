package com.justaproject.manco.services;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.justaproject.manco.dao.DatosInforme;
import com.justaproject.manco.dao.RepositoriCnae;
import com.justaproject.manco.model.Empresa;
import com.justaproject.manco.model.EmpresasCNAE;
import com.justaproject.manco.model.Resultat;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;

@Service
public class Logica {
	/*Métode: rebent un objecte Empresa comparar amb EmpresasCNAE 
	 * per a extraure un objecte Resultats  
	 */
	public Resultat obtinResultats(Empresa empresa, EmpresasCNAE cnaeseleccionat, String key) {
		
//		try {
//			List<EmpresasCNAE> lista = RepositoriCnae.getInstance().getLeads();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		EmpresasCNAE cnaeseleccionat = RepositoriCnae.getInstance().cnaeseleccionat(key);
		
//		for (String key : RepositoriCnae.lltacnae.keySet()) {
//	    	if (key==empresa.getCodCNAE()) {
//	    		cnaeseleccionat=RepositoriCnae.lltacnae.get(empresa.getCodCNAE()); 
//	    	}
//	    }
				
		int cifranegociomediadelsector=(cnaeseleccionat.getCifradenegocios()*1000/cnaeseleccionat.getNúmerodeempresas())-empresa.getCifraNegocio();
		int margenbruto=(cnaeseleccionat.getCifradenegocios()*1000/cnaeseleccionat.getNúmerodeempresas()-cnaeseleccionat.getValorañadidoacostedelosfactores()*1000/cnaeseleccionat.getNúmerodeempresas())-empresa.getCifraNegocio()-empresa.getValorPrecioCosteProductosServiciosVendidos();
		double margenBrutoenporc=((empresa.getCifraNegocio()-empresa.getValorPrecioCosteProductosServiciosVendidos())/empresa.getCifraNegocio())-((cnaeseleccionat.getValorañadidoacostedelosfactores()/cnaeseleccionat.getNúmerodeempresas())/(cnaeseleccionat.getCifradenegocios()/cnaeseleccionat.getNúmerodeempresas()));
		int comprasdebienesyservicios=empresa.getComprasBienesServicios()-(cnaeseleccionat.getTotaldecomprasdebienesyservicios()*1000/cnaeseleccionat.getNúmerodeempresas());
		int gastospersonal=empresa.getGastosPersonal()-(cnaeseleccionat.getGastosdepersonal()*1000/cnaeseleccionat.getNúmerodeempresas());
		int cifradenegocioporpersonaocupada=(int) ((empresa.getCifraNegocio()/empresa.getMediaPaxOcupadasEmpresa())-((cnaeseleccionat.getCifradenegocios()*1000)/cnaeseleccionat.getPersonalocupado()));
		int productividadporpersonaocupada=(int) (((empresa.getCifraNegocio()-empresa.getValorPrecioCosteProductosServiciosVendidos())/empresa.getMediaPaxOcupadasEmpresa())-cnaeseleccionat.getValorañadidoacostedelosfactores()*1000/cnaeseleccionat.getPersonalocupado());
		int gastosdepersonalporpersonaocupada=(int) ((empresa.getGastosPersonal()/empresa.getMediaPaxOcupadasEmpresa())-(cnaeseleccionat.getGastosdepersonal()*1000/cnaeseleccionat.getPersonalocupado()));
		double compradebienesyserviciosCifradenegocio=(empresa.getComprasBienesServicios()/empresa.getCifraNegocio())-(cnaeseleccionat.getTotaldecomprasdebienesyservicios()/cnaeseleccionat.getCifradenegocios());
		double gastospersonalsobreproductividadporc=((empresa.getGastosPersonal()/empresa.getMediaPaxOcupadasEmpresa())/((empresa.getCifraNegocio()-empresa.getValorPrecioCosteProductosServiciosVendidos())/empresa.getMediaPaxOcupadasEmpresa()))-((cnaeseleccionat.getGastosdepersonal()*1000/cnaeseleccionat.getPersonalocupado())/((cnaeseleccionat.getValorañadidoacostedelosfactores()*1000/cnaeseleccionat.getPersonalocupado())));
		double mediadepersonasocupadasporempresa=empresa.getMediaPaxOcupadasEmpresa()-(cnaeseleccionat.getPersonalocupado()/cnaeseleccionat.getNúmerodeempresas());
		double CuotaMercado=empresa.getCifraNegocio()/cnaeseleccionat.getCifradenegocios()*cnaeseleccionat.getNúmerodeempresas();
				
		Resultat resultat = new Resultat(cifranegociomediadelsector, margenbruto, margenBrutoenporc, comprasdebienesyservicios, gastospersonal, cifradenegocioporpersonaocupada, productividadporpersonaocupada, gastosdepersonalporpersonaocupada, compradebienesyserviciosCifradenegocio, gastospersonalsobreproductividadporc, mediadepersonasocupadasporempresa, CuotaMercado);
		
		return resultat;
		
	}

	
	/*Métode impresio: rebent un objecte Resultats generar un PDF*/
	
	//per a generar un pdf que se guarde en memoria i se puga enviar
	//https://es.stackoverflow.com/questions/330051/descargar-pdf-generado-con-itext-spring-boot-web-app
	//https://www.it-swarm-es.com/es/java/open-responseentity-pdf-en-la-nueva-pestana-del-navegador/1045522906/
	
	
	public ByteArrayOutputStream creaPdf(Resultat resultat) throws Exception {
		 String texto0, texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10;
		 String ind11="hola", ind12="",ind13="",ind14="";
		 String concarea1="", concarea2="", concarea3="", concarea4="", concarea5="", concarea6=""; 
		 String ind21="", ind22="hola",ind23="",ind24="";
		 String ind31="", ind32="",ind33="hola",ind34="";
		 String ind41="", ind42="hola",ind43="",ind44="";
		 String ind51="", ind52="",ind53="",ind54="hola";
		 String ind61="hola", ind62="",ind63="",ind64="";
		 
		 if (ind11!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind12!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind13!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 }
		 
		 if (ind21!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind22!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind23!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 } 
		 
		 if (ind31!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind32!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind33!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 } 
		 
		 if (ind41!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind42!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind43!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 } 
		 
		 if (ind51!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind52!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind53!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 } 
		 
		 if (ind61!="") {concarea1=DatosInforme.rojopos;
		 } else if (ind62!=""){concarea2=DatosInforme.naranjapos;
		 } else if (ind63!="") {concarea4=DatosInforme.verdeclaropos;
		 }else {concarea6=DatosInforme.verdeoscuropos;
		 } 
		 
		 int valor0= resultat.getCifranegociomediadelsector();
		 int valor1= resultat.getCifradenegocioporpersonaocupada();//Cifra de negocio por persona ocupada
		 double valor2= resultat.getCuotaMercado();//Cuota de mercado
		 double valor3= resultat.getMargenBrutoenporc();//Margen bruto en porcentaje
		 int valor4= resultat.getComprasdebienesyservicios();//Compra de bienes y servicios
		 double valor5= resultat.getCompradebienesyserviciosCifradenegocio();//Compra de bienes y servicios/ Cifra de negocio
		 double valor6= resultat.getMediadepersonasocupadasporempresa();//Media de personas ocupadas por empresa
		 double valor7= resultat.getGastosdepersonalporpersonaocupada();//gastosdepersonalporpersonaocupadapos
		 int valor8=resultat.getProductividadporpersonaocupada();//Productividad por persona ocupada
		 int valor9=resultat.getGastosdepersonalporpersonaocupada();//Gastos personal sobre productividad %
		 
		 String num0 = String.valueOf(valor0);
		 String num1 = String.valueOf(valor1);
		 String num2 = String.valueOf(valor2);
		 String num3 = String.valueOf(valor3);
		 String num4 = String.valueOf(valor4);
		 String num5 = String.valueOf(valor5);
		 String num6 = String.valueOf(valor6);
		 String num7 = String.valueOf(valor7);
		 String num8 = String.valueOf(valor8);
		 String num9 = String.valueOf(valor9);
		 
		 texto0 = valor0 > 0? DatosInforme.cifradenegociospos:DatosInforme.cifradenegociosneg;
		 texto1 = valor1 > 0? DatosInforme.cifradenegocioporpersonaocupadapos:DatosInforme.cifradenegocioporpersonaocupadapneg;
		 texto2 = DatosInforme.cuotademercadopos;
		 texto3 = valor3 > 0? DatosInforme.mbenporcentagepos:DatosInforme.mbenporcentageneg;
		 texto4 = DatosInforme.comprasdebienesyserviciospos;
		 texto5 = valor5 > 0? DatosInforme.comprasdebienesyservicioscifradenegociopos:DatosInforme.comprasdebienesyservicioscifradenegocioneg;
		 texto6 = valor6 > 0? DatosInforme.mediadepersonasocupadasporempresapos:DatosInforme.mediadepersonasocupadasporempresaneg;
		 texto7 = valor7 > 0? DatosInforme.gastosdepersonalporpersonaocupadapos:DatosInforme.gastosdepersonalporpersonaocupadaneg;
		 texto8 = valor8 > 0? DatosInforme.productividadporpersonaocupadapos:DatosInforme.productividadporpersonaocupadaneg;
		 texto9 = valor9 > 0? DatosInforme.gastospersonalsobreproductividadporpos:DatosInforme.gastospersonalsobreproductividadporneg;
		 if (valor9>0) {
			texto10 = DatosInforme.conclusionperdidaspos;
		 } else if(valor0>0 && valor1>0 && valor2>0 && valor3<0) {
			texto10 = DatosInforme.conclusionesbuenosdatospos;
		 } else if(valor0<0 && valor1<0 && valor2<0 && valor3>0) {
			texto10 = DatosInforme.conclusionesmalosdatospos; 
		 } else {
			texto10 = DatosInforme.conclusionesdatosintermediospos;
		 }
		 
		// Creamos la instancia de memoria en la que se escribirá el archivo temporalmente
	    try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
		 
		// Se crea el documento
		 Document documento = new Document(PageSize.A4);

		 // Se crea el OutputStream para el fichero donde queremos dejar el pdf.
		 //FileOutputStream ficheroPdf = new FileOutputStream("static/fitxerspdf/fichero.pdf");

		 // Se asocia el documento al OutputStream y se indica que el espaciado entre
		 // lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
		 //PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(30);
		 
		 PdfWriter.getInstance(documento, bos);

		 // Se abre el documento.
		 documento.open();
		 
		 
		 //Teniendo un fichero de imagen de los formatos habituales (jpg, png, gif, etc), 
		 //podemos añadir la foto fácilmente a nuestro documento
		 try
		 {
		 	Image foto = Image.getInstance("src/main/resources/informe/logosacord.png");
		 	foto.scaleToFit(500, 500);
		 	foto.setAlignment(Chunk.ALIGN_MIDDLE);
		 	documento.add(foto);
		 }
		 catch ( Exception e )
		 {
		 	e.printStackTrace();
		 }
		 
		 
		 
		 //En el siguiente código se añaden dos párrafos, uno normal 
		 documento.add(new Paragraph("RESULTADOS",
				 FontFactory.getFont("arial",
						 20,
						 Font.BOLD,
						 BaseColor.LIGHT_GRAY
						 )));
		 documento.add(new Paragraph("VENTAS",
				 FontFactory.getFont("arial",
						 16,
						 Font.BOLDITALIC,
						 BaseColor.LIGHT_GRAY
						 )));
		 
		 documento.add(new Paragraph("Cifra de Negocio"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla0 = new PdfPTable(5);
		 tabla0.addCell("");
		 tabla0.addCell("Datos Sector");
		 tabla0.addCell("Datos Empresa");
		 tabla0.addCell("Diferencia");
		 tabla0.addCell("Coincidencia con el sector");
		 tabla0.addCell("Cifra de Negocio");
		 tabla0.addCell("");
		 tabla0.addCell("");
		 tabla0.addCell(num0);
		 tabla0.addCell("");
		 documento.add(tabla0);
		 
		 documento.add(new Paragraph(texto0));
		 
		 documento.add(new Paragraph("Cifra de negocio por persona ocupada"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla1 = new PdfPTable(5);
		 tabla1.addCell("");
		 tabla1.addCell("Datos Sector");
		 tabla1.addCell("Datos Empresa");
		 tabla1.addCell("Diferencia");
		 tabla1.addCell("Coincidencia con el sector");
		 tabla1.addCell("Cifra de Negocio por persona ocupada");
		 tabla1.addCell("");
		 tabla1.addCell("");
		 tabla1.addCell(num1);
		 tabla1.addCell(""); 
		 documento.add(tabla1);
		 
		 documento.add(new Paragraph(texto1));
		 
		 documento.add(new Paragraph("Cuota de mercado"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla2 = new PdfPTable(5);
		 tabla2.addCell("");
		 tabla2.addCell("Datos Sector");
		 tabla2.addCell("Datos Empresa");
		 tabla2.addCell("Diferencia");
		 tabla2.addCell("Coincidencia con el sector");
		 tabla2.addCell("Cuota de mercado");
		 tabla2.addCell("");
		 tabla2.addCell("");
		 tabla2.addCell(num2);
		 tabla2.addCell("");
		 documento.add(tabla2);
		 
		 documento.add(new Paragraph(texto2));			 
		 		 
		 documento.add(new Paragraph("MARGEN",
				 FontFactory.getFont("arial",
						 16,
						 Font.BOLDITALIC,
						 BaseColor.LIGHT_GRAY
						 )));
		 documento.add(new Paragraph("margen bruto en porcentaje"));
		 documento.add(new Paragraph("Cuota de mercado"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla3 = new PdfPTable(5);
		 tabla3.addCell("");
		 tabla3.addCell("Datos Sector");
		 tabla3.addCell("Datos Empresa");
		 tabla3.addCell("Diferencia");
		 tabla3.addCell("Coincidencia con el sector");
		 tabla3.addCell("Cuota de mercado");
		 tabla3.addCell("");
		 tabla3.addCell("");
		 tabla3.addCell(num3);
		 tabla3.addCell("");
		 documento.add(tabla3);
		 
		 documento.add(new Paragraph(texto3));
		 
		 documento.add(new Paragraph("ESTRUCTURA",
				 FontFactory.getFont("arial",
						 20,
						 Font.BOLD,
						 BaseColor.LIGHT_GRAY
						 )));
		 documento.add(new Paragraph("COMPRAS"));
		 documento.add(new Paragraph("Compras de bienes y servicios"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla4 = new PdfPTable(5);
		 tabla4.addCell("");
		 tabla4.addCell("Datos Sector");
		 tabla4.addCell("Datos Empresa");
		 tabla4.addCell("Diferencia");
		 tabla4.addCell("Coincidencia con el sector");
		 tabla4.addCell("Compras de bienes y servicios");
		 tabla4.addCell("");
		 tabla4.addCell("");
		 tabla4.addCell(num4);
		 tabla4.addCell("");
		 documento.add(tabla4);
		 
		 documento.add(new Paragraph(texto4));
		 
		 documento.add(new Paragraph("Compras de bienes y servicios/ Cifra de negocio:"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla5 = new PdfPTable(5);
		 tabla5.addCell("");
		 tabla5.addCell("Datos Sector");
		 tabla5.addCell("Datos Empresa");
		 tabla5.addCell("Diferencia");
		 tabla5.addCell("Coincidencia con el sector");
		 tabla5.addCell("Compras de bienes y servicios/ Cifra de negocio:");
		 tabla5.addCell("");
		 tabla5.addCell("");
		 tabla5.addCell(num5);
		 tabla5.addCell("");
		 documento.add(tabla5);
		 
		 documento.add(new Paragraph(texto5));
		 
		 documento.add(new Paragraph("PERSONAL"));

		 documento.add(new Paragraph("Media de personas ocupadas por empresa:"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla6 = new PdfPTable(5);
		 tabla6.addCell("");
		 tabla6.addCell("Datos Sector");
		 tabla6.addCell("Datos Empresa");
		 tabla6.addCell("Diferencia");
		 tabla6.addCell("Coincidencia con el sector");
		 tabla6.addCell("Media de personas ocupadas por empresa:");
		 tabla6.addCell("");
		 tabla6.addCell("");
		 tabla6.addCell(num6);
		 tabla6.addCell("");
		 documento.add(tabla6);
		 
		 documento.add(new Paragraph(texto6));
		 
		 documento.add(new Paragraph("Gastos de personal por persona ocupada"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla7 = new PdfPTable(5);
		 tabla7.addCell("");
		 tabla7.addCell("Datos Sector");
		 tabla7.addCell("Datos Empresa");
		 tabla7.addCell("Diferencia");
		 tabla7.addCell("Coincidencia con el sector");
		 tabla7.addCell("Gastos de personal por persona ocupada");
		 tabla7.addCell("");
		 tabla7.addCell("");
		 tabla7.addCell(num7);
		 tabla7.addCell("");		 
		 documento.add(tabla7);
		 
		 documento.add(new Paragraph(texto7));
		 
		 documento.add(new Paragraph("Productividad por persona ocupada"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla8= new PdfPTable(5);
		 tabla8.addCell("");
		 tabla8.addCell("Datos Sector");
		 tabla8.addCell("Datos Empresa");
		 tabla8.addCell("Diferencia");
		 tabla8.addCell("Coincidencia con el sector");
		 tabla8.addCell("Productividad por persona ocupada");
		 tabla8.addCell("");
		 tabla8.addCell("");
		 tabla8.addCell(num8);
		 tabla8.addCell("");	 
		 documento.add(tabla8);
		 
		 documento.add(new Paragraph(texto8));
		 
		 documento.add(new Paragraph("Gastos personal sobre productividad %"));
		 documento.add(new Paragraph(" "));
		 PdfPTable tabla9 = new PdfPTable(5);
		 tabla9.addCell("");
		 tabla9.addCell("Datos Sector");
		 tabla9.addCell("Datos Empresa");
		 tabla9.addCell("Diferencia");
		 tabla9.addCell("Coincidencia con el sector");
		 tabla9.addCell("Gastos personal sobre productividad %");
		 tabla9.addCell("");
		 tabla9.addCell("");
		 tabla9.addCell(num9);
		 tabla9.addCell("");			 
		 documento.add(tabla9);
		 
		 documento.add(new Paragraph(texto9));
		 
		 documento.add(new Paragraph(" "));
		 
		 documento.add(new Paragraph("CONCLUSIONES"));
		 documento.add(new Paragraph(texto10));
		 documento.add(new Paragraph(" "));
		 
		//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela1 = new Paragraph("Media Sector");
		 cela1.getFont().setStyle(Font.BOLD);
		 cela1.getFont().setSize(10);
		 tablaconclu.addCell(cela1);
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 
		 tablaconclu.addCell("Cifra de negocio por persona ocupada");
		 PdfPCell celaroja = new PdfPCell(new Phrase(ind11));
		 celaroja.setBackgroundColor(BaseColor.RED);
		 tablaconclu.addCell(celaroja);
		 PdfPCell celaama = new PdfPCell(new Phrase(ind12));
		 celaama.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu.addCell(celaama);
		 PdfPCell celacya = new PdfPCell(new Phrase(ind13));
		 celacya.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu.addCell(celacya);
		 PdfPCell celaverd = new PdfPCell(new Phrase(ind14));
		 celaverd.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu.addCell(celaverd);
		 
		 tablaconclu.addCell("Conclusión área:");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 
		 tablaconclu.addCell(concarea1);
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 tablaconclu.addCell(" ");
		 
		 documento.add(tablaconclu); 
		 
		 documento.add(new Paragraph(" "));
		 
		//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu2 = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu2.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu2.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela2 = new Paragraph("Media Sector");
		 cela2.getFont().setStyle(Font.BOLD);
		 cela2.getFont().setSize(10);
		 tablaconclu2.addCell(cela2);
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 
		 tablaconclu2.addCell("Margen bruto en porcentaje");
		 PdfPCell celaroja2 = new PdfPCell(new Phrase(ind21));
		 celaroja2.setBackgroundColor(BaseColor.RED);
		 tablaconclu2.addCell(celaroja2);
		 PdfPCell celaama2 = new PdfPCell(new Phrase(ind22));
		 celaama2.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu2.addCell(celaama2);
		 PdfPCell celacya2 = new PdfPCell(new Phrase(ind23));
		 celacya2.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu2.addCell(celacya2);
		 PdfPCell celaverd2 = new PdfPCell(new Phrase(ind24));
		 celaverd2.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu2.addCell(celaverd2);
		 
		 tablaconclu2.addCell("Conclusión área:");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 
		 tablaconclu2.addCell(concarea2);
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 tablaconclu2.addCell(" ");
		 
		 documento.add(tablaconclu2);
		 
		 documento.add(new Paragraph(" "));
		 
		//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu3 = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu3.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu3.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela3 = new Paragraph("Media Sector");
		 cela3.getFont().setStyle(Font.BOLD);
		 cela3.getFont().setSize(10);
		 tablaconclu3.addCell(cela3);
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 
		 tablaconclu3.addCell("Gastos de personal por persona ocupada");
		 PdfPCell celaroja3 = new PdfPCell(new Phrase(ind31));
		 celaroja3.setBackgroundColor(BaseColor.RED);
		 tablaconclu3.addCell(celaroja3);
		 PdfPCell celaama3 = new PdfPCell(new Phrase(ind32));
		 celaama3.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu3.addCell(celaama3);
		 PdfPCell celacya3 = new PdfPCell(new Phrase(ind33));
		 celacya3.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu3.addCell(celacya3);
		 PdfPCell celaverd3 = new PdfPCell(new Phrase(ind34));
		 celaverd3.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu3.addCell(celaverd3);
		 
		 tablaconclu3.addCell("Conclusión área:");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 
		 tablaconclu3.addCell(concarea3);
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 tablaconclu3.addCell(" ");
		 
		 documento.add(tablaconclu3);
		 
		 documento.add(new Paragraph(" "));
		 
		//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu4 = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu4.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu4.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela4 = new Paragraph("Media Sector");
		 cela4.getFont().setStyle(Font.BOLD);
		 cela4.getFont().setSize(10);
		 tablaconclu4.addCell(cela4);
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 		 			 
		 tablaconclu4.addCell("Productividad por persona ocupada");
		 PdfPCell celaroja4 = new PdfPCell(new Phrase(ind41));
		 celaroja4.setBackgroundColor(BaseColor.RED);
		 tablaconclu4.addCell(celaroja4);
		 PdfPCell celaama4 = new PdfPCell(new Phrase(ind42));
		 celaama4.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu4.addCell(celaama4);
		 PdfPCell celacya4 = new PdfPCell(new Phrase(ind43));
		 celacya4.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu4.addCell(celacya4);
		 PdfPCell celaverd4 = new PdfPCell(new Phrase(ind44));
		 celaverd4.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu4.addCell(celaverd4);
		 
		 tablaconclu4.addCell("Conclusión área:");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 
		 tablaconclu4.addCell(concarea4);
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 tablaconclu4.addCell(" ");
		 
		 documento.add(tablaconclu4);
		 
		 documento.add(new Paragraph(" "));
		 
			//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu5 = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu5.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu5.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela5 = new Paragraph("Media Sector");
		 cela5.getFont().setStyle(Font.BOLD);
		 cela5.getFont().setSize(10);
		 tablaconclu5.addCell(cela5);
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 
		 tablaconclu5.addCell("Gastos personal sobre productividad %");
		 PdfPCell celaroja5 = new PdfPCell(new Phrase(ind51));
		 celaroja5.setBackgroundColor(BaseColor.RED);
		 tablaconclu5.addCell(celaroja5);
		 PdfPCell celaama5 = new PdfPCell(new Phrase(ind52));
		 celaama5.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu5.addCell(celaama5);
		 PdfPCell celacya5 = new PdfPCell(new Phrase(ind53));
		 celacya5.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu5.addCell(celacya5);
		 PdfPCell celaverd5 = new PdfPCell(new Phrase(ind54));
		 celaverd5.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu5.addCell(celaverd5);
		 
		 tablaconclu5.addCell("Conclusión área:");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 
		 tablaconclu5.addCell(concarea5);
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 tablaconclu5.addCell(" ");
		 
		 documento.add(tablaconclu);
		 
		 documento.add(new Paragraph(" "));
		 
			//Añadimos una tabla de 5 columnas. 
		 PdfPTable tablaconclu6 = new PdfPTable(5); 
		//Datos de porcentaje a la tabla (tamaño ancho).
		 tablaconclu6.setWidthPercentage(100);
		//Datos del ancho de cada columna.
		 tablaconclu6.setWidths(new float[] {30, 10, 10, 10, 10});
		 
		 Paragraph cela6 = new Paragraph("Media Sector");
		 cela6.getFont().setStyle(Font.BOLD);
		 cela6.getFont().setSize(10);
		 tablaconclu6.addCell(cela6);
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 
		 tablaconclu6.addCell("Compra de bienes y servicios/ Cifra de negocio");
		 PdfPCell celaroja6 = new PdfPCell(new Phrase(ind61));
		 celaroja6.setBackgroundColor(BaseColor.RED);
		 tablaconclu6.addCell(celaroja6);
		 PdfPCell celaama6 = new PdfPCell(new Phrase(ind62));
		 celaama6.setBackgroundColor(BaseColor.YELLOW);
		 tablaconclu6.addCell(celaama6);
		 PdfPCell celacya6 = new PdfPCell(new Phrase(ind63));
		 celacya6.setBackgroundColor(BaseColor.CYAN);
		 tablaconclu6.addCell(celacya6);
		 PdfPCell celaverd6 = new PdfPCell(new Phrase(ind64));
		 celaverd6.setBackgroundColor(BaseColor.GREEN);
		 tablaconclu6.addCell(celaverd6);
		 
		 tablaconclu6.addCell("Conclusión área:");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 
		 tablaconclu6.addCell(concarea6);
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 tablaconclu6.addCell(" ");
		 
		 documento.add(tablaconclu6);
		 
		 documento.close();
		 //Retornamos la variable al finalizar
		 
		 return bos;
		 
	    } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	 
   }
	
	
	
	
}
