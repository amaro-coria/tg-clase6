package net.tecgurus.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import net.tecgurus.clienteservice._1.ClienteServicePortType;
import net.tecgurus.clienteservice._1.DataCliente;
import net.tecgurus.clienteservice._1.ReqCteData;
import net.tecgurus.clienteservice._1.RespCteData;
import net.tecgurus.clienteservice._1.StatusOperation;

@WebService(serviceName = "clienteService", endpointInterface = "net.tecgurus.clienteservice._1.ClienteServicePortType", targetNamespace = "http://www.tecgurus.net/clienteService/1.0")
public class ClienteWSImpl implements ClienteServicePortType {

	@Override
	public RespCteData listarClientesOperation(ReqCteData reqCteData) {
		RespCteData respuesta = new RespCteData();
		StatusOperation stat = new StatusOperation();
		stat.setCode("00");
		stat.setStatus("00");
		respuesta.setStatusOpe(stat);
		List<DataCliente> listaDeTodosLosClientes = new ArrayList<>();
		DataCliente cliente1 = new DataCliente();
		cliente1.setApeMCte("Perez");
		cliente1.setApePCte("Perez");
		cliente1.setNomCte("Joaquin");
		cliente1.setIdCte(1);
		listaDeTodosLosClientes.add(cliente1);

		DataCliente cliente2 = new DataCliente();
		cliente2.setApeMCte("Guzman");
		cliente2.setApePCte("Loera");
		cliente2.setNomCte("Joaquin");
		cliente2.setIdCte(2);
		listaDeTodosLosClientes.add(cliente2);
		respuesta.setTodosClientes(listaDeTodosLosClientes);
		return respuesta;
	}

}
