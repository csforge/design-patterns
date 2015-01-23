package net.csforge.designpatterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaskService extends Remote{

	public String findToken(String userid) throws RemoteException;
}
