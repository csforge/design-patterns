package net.csforge.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerRunner {
	
	public static void main(String[] args){
		if(args.length<=0){
			System.out.println("[Usage] java net.csforge.designpatterns.proxy.rmi.ServerRunner <public host>");
			System.exit(1);
		}
		
		try {
			Naming.rebind("//"+ args[0] + "/taskService", new TaskServiceImpl());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
