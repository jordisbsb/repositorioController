package idat.edu.pe.daa2.controladores;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/principal")
public class PrincipalController {

	@RequestMapping(value="inicio" ,method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("principal");
		return model;
	}
	
	
}
