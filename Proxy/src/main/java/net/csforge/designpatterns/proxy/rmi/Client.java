package net.csforge.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

//	static String rmi_url = "rmi://127.0.0.1";
	
	public static void main(String[] args){
		try {
			if(args.length<=0){
				System.out.println("[Usage] java net.csforge.designpatterns.proxy.rmi.Client <RMI host>");
				System.exit(1);
			}
			System.out.println("........rmi url: "+args[0]);
			
			TaskService service = (TaskService)Naming.lookup("rmi://"+ args[0] +"/taskService");
			
			System.out.println("........service: "+service);
			System.out.println("........token from service: "+service.findToken("123"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
