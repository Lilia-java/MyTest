package appl.Service;


import appl.Entity.Client;
import appl.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

  /*  public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }*/
    /*public List<Client> findAll(){
        return ClientRepository.findAll();
    }*/
    /*public Client findById(int id){
        Optional<Client> optional = ClientRepository.findById(id);
        return optional.orElse(new Client());
    }*/

    public List<Client> findByName(String name){
        return ClientRepository.findByName(name);
    }

    /*public void save(Client Client){
        ClientRepository.save(Client);
    }*/

    public List<Client> retrieveByName(String name){
        return ClientRepository.retrieveByName(name);
    }

    public List<Client> findAllClients(){
        return ClientRepository.findAllClients();
    }


   /* public List<Client> findAllDistricts(){
        return ClientRepository.findAllDistricts();
    }

    public List<Client> findByDiscount(int discount){
        return ClientRepository.findByDiscount(discount);
    }
*/
}

