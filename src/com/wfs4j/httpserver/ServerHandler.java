package com.wfs4j.httpserver;

import static io.netty.handler.codec.http.HttpHeaderNames.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

import javax.xml.ws.Response;

import com.wfs4j.exception.WfsException;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpUtil;

/**
 * ClassName: ServerHandler.java <br/>
 * date: 2017年5月17日 上午11:21:38 <br/>
 *
 * @author dong
 * @version
 * @since JDK 1.7
 * @classDesc 类描述:
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws WfsException {
		try {
			HttpRequest request = null;
			String uri = null;
			if (msg instanceof HttpRequest) {
				request = (HttpRequest) msg;
				uri = request.uri();
			}
			if (msg instanceof HttpContent) {
				HttpContent content = (HttpContent) msg;
				ByteBuf buf = content.content();
				byte[] body = new byte[buf.capacity()];
				buf.readBytes(body);
				buf.release();
				RouteHandler rh = Controller.Route(uri);
				byte[] bs = null;
				if (rh != null) {
					bs = rh.handler(request, body);
				} else {
					bs = "404".getBytes(io.netty.util.CharsetUtil.UTF_8);
				}
				FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(bs));
				response.headers().set(CONTENT_TYPE, "text/plain");
				response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
				if (HttpUtil.isKeepAlive(request)) {
					response.headers().set(CONNECTION, HttpHeaderValues.KEEP_ALIVE);
				}
				ctx.write(response);
				ctx.flush();
			}
		} catch (Exception e) {
			throw new WfsException(e);
		}
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		ctx.close();
	}

}
