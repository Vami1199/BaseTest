package maven;


import org.mortbay.http.SocketListener;  
import org.mortbay.jetty.Server;  
public class StartJetty {  
       public static void main(String[] args) throws Exception {  
             //创建Jetty HttpServer对象  
            Server server = new Server();  
             //在端口8080上给HttpServer对象绑上一个listener，使之能够接收HTTP请求  
            SocketListener listener = new SocketListener();  
            listener.setPort(8098);  
            server.addListener(listener);  
             // 第一个参数为ContextPath，第二个webapp路径  
            server.addWebApplication( "/","./src/main/webapp" );  
             // 启动服务器  
            server.start();  
      }  
} 