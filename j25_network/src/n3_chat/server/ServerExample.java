package n3_chat.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class ServerExample {
	/**
	 * 운영체제에서 포트 번호를 할당 받아
	 * 연결 요쳥을 보낸 Socket 정보를 수락과 함께
	 * Socket 객체로 제공해 줄 class
	 */
	ServerSocket serverSocket;
	// 모든 클라이언트가 공유할 연결 수락이 완료된 client 목록을 저장할 list
	static List<Client> clients = new Vector<>();
	
	// 서버 실행
	public void startServer() {
		
		try {
			serverSocket = new ServerSocket();
			// 5002번 포트를 사용하는 ServerSocket 생성
			serverSocket.bind(new InetSocketAddress(5002));
			System.out.println("[ Server Open ]");
			System.out.println(serverSocket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// client 연결 요청을 수락
		while (true) {
			try {
				System.out.println("[ Client 연결 대기 중 ... ]");
				// 한 유저(Client)의 연결이 수락 완료될 때까지 blocking(대기)
				Socket client = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				// IP 주소
				String host = isa.getHostString();
				System.out.println("연결 수락 : " + host);
				
				Client c = new Client(client);
				clients.add(c);
				System.out.println("연결된 clients 수 : " + clients.size());
				
			} catch (IOException e) {
				System.out.println("서버 종료 : " + e.getMessage());
				stopServer();
				break;
			}
		} // end while
	} // end startServer
	
	// 할당된 자원 해제 후 안전하게 서버 종료
	public void stopServer() {
		System.out.println("서버 자원 해제");
		for (Client client : clients) {
			if (client.socket.isClosed()) {
				try {
					client.socket.close();
				} catch (IOException e) {}
			} // end if
		} //  end for
		
		// 할당 받은 포트 반납
		if (serverSocket != null && !serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {}
		} // end if
		
	} // end stopServer
	
	public static void main(String[] args) {
		ServerExample server = new ServerExample();
		server.startServer();	// server 실행
		
	} // end main

}
