package appl.Controller;


//import appl.model.Product;
import appl.Service.ClientService;
import appl.Entity.Client;
//import appl.Service.ClientService;

// import hw.model.Searching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
//@RequestMapping(value = "clients")
//@ResponseBody
//@RestController
public class SearchClientController {
    @GetMapping("/clientsearch")
    public String greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        model.addAttribute("clientsearch", new Client());
        return "clientsearch";
    }
    @PostMapping("/clientsearch")
    public String gettingInfo(@ModelAttribute Client client) {
        if (client.getName()!=null ||client.getDateBirth()!=null || client.getGender()!=null){
            return "/result";}
        return "/unsearch";
    }


 /* @Autowired
  private ClientService clientService;

    @GetMapping("/clientsearch")
    public String filter(@RequestParam String filter, Model model) {

        model.addAttribute("clientsearch", new Client());
        Iterable<Client> clients;

        if (filter != null && !filter.isEmpty()) {
            clients = clientService.findByName(filter);
        } else {
            clients = clientService.findAllClients();
        }

        //model.addAllAttributes(clients);
        //model.put("clients", clients);

        return "result";
        //return "clientsearch";
    }*/

}

//clientService.findByName("Harry Potter").forEach(System.out::println);