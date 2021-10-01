package com.justaproject.manco.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.justaproject.manco.dao.RepositoriCnae;
import com.justaproject.manco.model.Empresa;
import com.justaproject.manco.model.EmpresasCNAE;
import com.justaproject.manco.model.Resultat;
import com.justaproject.manco.services.EmpresaService;
import com.justaproject.manco.services.Logica;

@Controller
//@RequestMapping(value = "/benchmarking")
public class EmpresaController {
	
	@Autowired
	EmpresaService service;
	
	@Autowired
	Logica logica;
	
//	@Autowired
//	JavaMailSender javaMailSender;
	
	Resultat resultat;
	
	
    @GetMapping("/form")
    public String index(Model model){
    	model.addAttribute("empresa", new Empresa());
    	System.out.println("entra en el getmapping ('/')");
        return "index";
    }

    
    //Empresa empresa = null;
    
//    @PostMapping("/subir")
//    public Empresa subir(@RequestParam("name") String nomEmpresa, @RequestParam("mail") String email, @RequestParam("localidad") String codPostal, @RequestParam("cnae") String codCNAE, @RequestParam("cifranegocio") int cifraNegocio,@RequestParam("valorcoste") int valorPrecioCosteProductosServiciosVendidos, @RequestParam("totalcostes") int comprasBienesServicios, @RequestParam("paxocupadas") double mediaPaxOcupadasEmpresa, @RequestParam("totalgastospax") int gastosPersonal, @RequestParam("ejercicio") String ejercicio, @RequestParam("cif") String cif) throws MessagingException {
//    	
//    	empresa = new Empresa(codCNAE, nomEmpresa, email, cif, codPostal, cifraNegocio,
//    			valorPrecioCosteProductosServiciosVendidos, comprasBienesServicios, gastosPersonal,
//    			mediaPaxOcupadasEmpresa);
//    	
//    	Resultat resultat = logica.obtinResultats(empresa);
//    	try {
//			logica.creaPdf(resultat);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//    	//sendMail(empresa.getEmail(), "static/fitxerspdf/fichero.pdf");
//    	
//    	service.setOne(empresa);
//    	
//    	return empresa;
//    }
    
    
    @PostMapping("/subir")
//    public void crearEmpresa(@RequestParam(value="name") String nomEmpresa, @RequestParam(value="mail") String email, @RequestParam(value="localidad") String codPostal, @RequestParam(value="cnae") String codCNAE, @RequestParam(value="cifranegocio") int cifraNegocio,@RequestParam(value="valorcoste") int valorPrecioCosteProductosServiciosVendidos, @RequestParam(value="totalcostes") int comprasBienesServicios, @RequestParam(value="paxocupadas") double mediaPaxOcupadasEmpresa, @RequestParam(value="totalgastospax") int gastosPersonal, @RequestParam(value="ejercicio") String ejercicio, @RequestParam(value="cif") String cif) throws MessagingException {
//    	System.out.println("entra en el getmapping ('/subir')");
//    	empresa = new Empresa(codCNAE, nomEmpresa, email, cif, codPostal, cifraNegocio,
//    			valorPrecioCosteProductosServiciosVendidos, comprasBienesServicios, gastosPersonal,
//    			mediaPaxOcupadasEmpresa);
//    	System.out.println("Hola: "+ nomEmpresa);
//    	}
    public String crearEmpresa(@ModelAttribute("empresa") Empresa empresa, BindingResult result) {
    	ModelAndView model = new ModelAndView();
        model.addObject("empresa", empresa);
        
        System.out.println("entra en el getmapping ('/subir')");
    	//model.addAttribute("empresa", new Empresa());
        
        System.out.println("Hola: "+ empresa.toString());
        service.save(empresa);
    	String k = empresa.getCodCNAE();
    	System.out.println(k);
        List<EmpresasCNAE> lista= RepositoriCnae.getInstance().getLeads();

//        boolean cont = false;
//		for(int i = 0; i < lista.size(); i++) {
//			//System.out.println(lista.get(i).cnae);
//			
//            if (lista.get(i).cnae==k) {           
//            seleccionat = RepositoriCnae.getInstance().getOne("500");
//            cont = true;
//            }
//		}
//            if (cont=false) {
//            	System.out.println("Valor no trobat");
//            }else {
    			EmpresasCNAE seleccionat = RepositoriCnae.getInstance().getOne("500");
            	System.out.println("Valor trobat!");
            	System.out.println(seleccionat.toString());
//            }
        
		resultat = logica.obtinResultats(empresa, seleccionat, k);
		
		System.out.println("Objecte resultat= "+resultat.toString());
				
        //System.out.println(RepositoriCnae.getInstance().cnaeseleccionat(empresa.getCodCNAE()).toString());
        
        return "/download";
    }
    
		@GetMapping("/download")
		public void downloadFile(HttpServletResponse response) throws Exception {
    	System.out.println("entra en el getmapping ('/descarregar')");
    	
    	//Resultat resultat = logica.obtinResultats(empresa);
    	//Logica generator = new Logica();
        byte[] pdfReport = logica.creaPdf(resultat).toByteArray();

        String mimeType =  "application/pdf";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", "reporte.pdf"));

        response.setContentLength(pdfReport.length);

        ByteArrayInputStream inStream = new ByteArrayInputStream( pdfReport);

        FileCopyUtils.copy(inStream, response.getOutputStream());
    }
    
    
//    @Bean
//	public void sendMail(String to, String fitxer) throws MessagingException {
//		
//		MimeMessage msg = javaMailSender.createMimeMessage();
//		 
//        MimeMessageHelper mail = new MimeMessageHelper(msg, true);
//        mail.setFrom("bguerola@hotmail.com");
//        mail.setTo(to);
//                 mail.setSubject ("Asunto: hay archivos adjuntos");
//                 mail.setText ("Correo con archivo adjunto");
// 
//        FileSystemResource file = new FileSystemResource(new File(fitxer));
//                 mail.addAttachment ("Archivo adjunto-1.jpg", file);
//                 mail.addAttachment ("Archivo adjunto-2.jpg", file );
// 
//        javaMailSender.send(msg);
//		
//    }
	

}
