package net.csforge.designpatterns.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TaskServiceImpl extends UnicastRemoteObject implements TaskService {

	public TaskServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 2310607796556271784L;

	@Override
	public String findToken(String userid) throws RemoteException {
		// TODO Auto-generated method stub
		String token = ""+System.currentTimeMillis();
		System.out.println("..........find token for "+ userid + ", token: " + token);
		return token;
	}

}
