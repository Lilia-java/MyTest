package appl.Controller;


//import appl.model.Product;
import appl.Service.ClientService;
import appl.Entity.Client;
//import appl.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class SearchClientController {
    @Autowired
    private ClientService clientService;


    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Client> clients = clientService.findAllClients();

        model.put("clients", clients);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam int id,@RequestParam String name, @RequestParam String gender, @RequestParam Date dateBirth, Map<String, Object> model) {
        Client client = new Client(id,name, gender, dateBirth);


        Iterable<Client> clients = clientService.findAllClients();

        model.put("clients", client);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, @RequestParam int id,@RequestParam String name, @RequestParam String gender, @RequestParam Date dateBirth, Map<String, Object> model) {
        Iterable<Client> clients;
        Client client = new Client(id,name, gender, dateBirth);
        filter=client.getName();

        if (filter != null && !filter.isEmpty()) {
            clients = clientService.findByName(filter);
        } else {
            clients = clientService.findAllClients();
        }

        model.put("clients", clients);

        return "main";
    }
}