package com.wfs4j.httpserver;

import com.wfs4j.handler.MockRouteHandler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpContentCompressor;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.timeout.ReadTimeoutHandler;

/**
 * ClassName: ServerInitializer.java <br/>
 * date: 2017年5月17日 上午11:21:50 <br/>
 *
 * @author dong
 * @version
 * @since JDK 1.7
 * @classDesc 类描述:
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		pipeline.addLast("timeout", new ReadTimeoutHandler(5000));
		pipeline.addLast("codec", new HttpServerCodec());
		pipeline.addLast(new HttpContentCompressor(9));
		pipeline.addLast("aggegator", new HttpObjectAggregator(1024 * 1024 * 1024));
		pipeline.addLast("handler", new ServerHandler());
		Controller.addHandler("/mock", new MockRouteHandler());
	}
}
