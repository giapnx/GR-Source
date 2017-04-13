package io.gr.Game;

import io.nadron.handlers.netty.UDPUpstreamHandler;
import io.nadron.server.netty.NettyConfig;
import io.nadron.server.netty.NettyUDPServer;
import io.nadron.server.netty.UDPChannelInitializer;

public class Server {
	
	
	
	public static void main(String[] args) throws Exception {
		
		NettyConfig nettyConfig = new NettyConfig();
		
		
		new NettyUDPServer(nettyConfig, new UDPChannelInitializer(new UDPUpstreamHandler())).startServer();
		
	}
	
	
}
