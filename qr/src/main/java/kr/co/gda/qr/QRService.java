package kr.co.gda.qr;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class QRService {
	public String getUserName() throws UnsupportedEncodingException {
		// text = new String(text.getBytes("UTF-8"), "ISO-8859-1");
		String name = "손영현";
		//한글을 출력하기 위해서 utf-8 은 지원하지 않으므로 iso-8859-1 로 변환이 필요하다.
		name = new String(name.getBytes("UTF-8"), "ISO-8859-1");

		return name;
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
	
	/*
	 * InetAddress: 자바 네트워크 프로그래밍 IP주소 관련 InetAddress 클래스
	 * ->getAddress() - InetAddress 객체의 IP주소를 반환
  	 * ->getHostAddress() - IP주소를 반환
     * ->getHostName() - 호스트 이름을 문자열로 반환 
	 */
	public String getNetworkInfo() throws UnknownHostException {
		StringBuffer sf = new StringBuffer();
		InetAddress address = InetAddress.getLocalHost();
		String s = address.getHostName();
		sf.append(s);
		s = address.getHostAddress();
		sf.append(","+s);
		//s = address.getAddress(); : byte 타입 
		//sf.append(","+address.getAddress());
		return sf.toString();
	}
}
