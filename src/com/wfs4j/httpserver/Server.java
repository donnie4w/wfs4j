package com.wfs4j.httpserver;

import com.wfs4j.exception.WfsRunTimeException;
import com.wfs4j.log.Logger;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * ClassName: Server.java <br/>
 * date: 2017年5月17日 上午11:21:21 <br/>
 *
 * @author dong
 * @version
 * @since JDK 1.7
 * @classDesc 类描述:
 */
public class Server {
	private static final Logger logger = Logger.getLogger();

	public static void main(String[] args) throws WfsRunTimeException {
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workerGroup);
			b.channel(NioServerSocketChannel.class);
			b.childHandler(new ServerInitializer());
			int port = (args == null || args.length == 0) ? 8374 : Integer.parseInt(args[0]);
			logger.info("wfs listen:", port);
			b.bind(port).sync().channel().closeFuture().sync();
		} catch (Exception e) {
			throw new WfsRunTimeException(e);
		} finally {
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}
}
// curl -d "name=wuxiaodong&age=100" "http://127.0.0.1:8374/mock"