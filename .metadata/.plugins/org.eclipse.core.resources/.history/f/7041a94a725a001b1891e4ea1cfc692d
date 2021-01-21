package com.oskarol.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oskarol.domain.exception.NegocioException;
import com.oskarol.domain.model.Cliente;
import com.oskarol.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExiste = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExiste != null && !clienteExiste.equals(cliente)) {
			throw new NegocioException("Já existe cliente cadastrado com esse email!");
		}
		
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		
		clienteRepository.deleteById(clienteId);
	}
}
