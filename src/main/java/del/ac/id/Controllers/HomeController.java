package del.ac.id.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import del.ac.id.POJOS.Berita;
import del.ac.id.UTIL.Util;;

@Controller
public class HomeController {
	
	List<Berita> beritas = new ArrayList<Berita>();
	
	@GetMapping("/home")
	public String dashboard (Model model) {
		beritas = getAllBerita(Util.getSessionFactory().openSession());
		model.addAttribute("berita",beritas);
		return "home";
	}
	
	
	public List<Berita> getAllBerita(Session sess){
		Query q = sess.createQuery("from Berita");
		List<Berita> b = (List<Berita>)q.list();
		sess.disconnect();
		return b;
	}
	
	
}
