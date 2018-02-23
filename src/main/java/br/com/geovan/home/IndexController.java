/**
 * 
 */
package br.com.geovan.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geovan.goes
 *
 */
@Controller
@RequestMapping("/")
public class IndexController
{
	@RequestMapping(method=RequestMethod.GET)
	public String index ()
	{
		return "index";
	}
}
