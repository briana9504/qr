package kr.co.gda.qr;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QRService {
	public String getUserName() {
		return "Young Hyeon";
	}
	
	
	/*
	 * System.getProperty() : 자바를 실행할 때, 실행되는 곳의 정보를 얻어오거나 운영체제의 정보가 필요할 때
	 *  ex) 실행하고 있는 현재 위치가 알고 싶다면 "user.dir"
	 */
	public String getSystemInfo() {
		StringBuffer sf = new StringBuffer();
		String s = System.getProperty("os.name");
		sf.append(s);
		s = System.getProperty("os.version");
		sf.append(","+s);
		s = System.getProperty("user.dir"); //실해하고 있는 현재 위치
		sf.append(","+s);
		return sf.toString();
	}
	
	public String getNetworkInfo() throws UnknownHostException {
		StringBuffer sf = new StringBuffer();
		InetAddress address = InetAddress.getLocalHost();
		String s = address.getHostName();
		sf.append(s);
		s = address.getHostAddress();
		sf.append(","+s);
		return sf.toString();
	}
}
