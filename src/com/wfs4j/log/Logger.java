package com.wfs4j.log;

import org.slf4j.LoggerFactory;

/**
 * ClassName: Logger.java <br/>
 * date: 2017年5月17日 上午11:21:56 <br/>
 *
 * @author dong
 * @version
 * @since JDK 1.7
 * @classDesc 类描述:
 */
public class Logger {

	org.slf4j.Logger logger;
	String className;

	private Logger(String cn) {
		className = cn;
		logger = LoggerFactory.getLogger(cn);
	}

	public static Logger getLogger() {
		return new Logger(java.lang.Thread.currentThread().getStackTrace()[2].getClassName());
	}

	public void debug(Object... args) {
		logger.debug(objs2str(args));
	}

	public void debug(Object arg, Throwable e) {
		logger.debug(String.valueOf(arg), e);
	}

	public void info(Object... args) {
		logger.info(objs2str(args));
	}

	public void info(Object arg, Throwable e) {
		logger.info(String.valueOf(arg), e);
	}

	public void warn(Object... args) {
		logger.warn(objs2str(args));
	}

	public void warn(Object arg, Throwable e) {
		logger.warn(String.valueOf(arg), e);
	}

	public void error(Object... args) {
		logger.error(objs2str(args));
	}

	public void error(Object arg, Throwable e) {
		logger.error(String.valueOf(arg), e);
	}

	private static String objs2str(Object... args) {
		if (args != null) {
			StringBuilder sb = new StringBuilder();
			for (Object o : args) {
				sb.append(o).append(" ");
			}
			return sb.toString();
		}
		return "";
	}
}
