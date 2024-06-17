package n1_address_url;

import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressUrlExample {

	public static void main(String[] args) {
		
		try {
			// 예외 처리 블럭 지정 alt + s, w
			// Java 에서 ip 주소를 표현하기 위해서 제공되는 클래스
			InetAddress address = InetAddress.getLocalHost();
			// 로컬 호스트 - 내 컴퓨터 정보
			System.out.println(address);
			
			// 내 컴퓨터 아이피 주소
			System.out.println(address.getHostAddress());
			
			// 내 컴퓨터 이름
			System.out.println(address.getHostName());
			
			// 도메인으로 정보 얻기
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println(naver);
			
			InetAddress[] iar = InetAddress.getAllByName("www.nate.com");
			for (InetAddress remote : iar) {
				System.out.println(remote);
			}
			
			/*
			 	URI(Uniform Resource Identifier) - 통합 자원 식별자
			 	
			 	URI의 하위 개념
			 	URL(Uniform Resource Locator)
			 	- 네트워크 상에서 통합 자원(리소스)의 위치를 나타내기 위한 규칙(규약)
			 	
			 	URN(Uniform Resource Named)
			 	- 네트워크 상에서 통합 자원의 위치를 이름으로 구분하기 위한 규칙(규약)
			 	- URL이 많이 사용되어 현재는 잘 사용되지 않는 규약
			 */
			
			// java.net.URL
			// new URL("host") deprecated since 20
			// URL url = new URL("https://www.naver.com/");
			// https://n.news.naver.com/mnews/article/055/0001163994
			URI uri = new URI("https://n.news.naver.com/article/024/0000089693?cds=news_media_pc&type=editn");	
			URL url = uri.toURL();
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("default port : " + url.getDefaultPort());
			System.out.println("path : " + url.getPath());
			System.out.println("query string : " + url.getQuery());
			
			InputStream is = url.openStream();
			// byte 기반 스트림을 2byte 문자 기반 스트림으로 변환
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// naver 에서 읽은 웹페이지 문서를 파일에 출력
			File file = new File("naver.html");  // 프로젝트 경로에 naver.html
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			String readLine = "";
			while((readLine = br.readLine()) != null) {
				// System.out.println(readLine);
				writer.write(readLine);
				writer.newLine();
			}
			writer.flush();		// 버퍼에 잔존하는 데이터 출력
			writer.close();		// naver.html 자원 해제
			br.close();			// naver.com url 자원 해제
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// 올바른 구문을 따르지 않은 경우
			// 프로토콜이 없거나 잘못된 포멧을 따르는 경우 발생
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
