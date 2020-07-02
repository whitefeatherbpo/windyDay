package c;

import java.net.Proxy;

public class ProxyNew {
	private Proxy getProxy() {
	     server = getServer();

	    server.setCaptureContent(true);
	    server.setCaptureHeaders(true);

	    SeleniumHolder.setProxyServer(server);

	    Proxy proxy = new Proxy();

	    try {
	        proxy = server.seleniumProxy();
	        String localIp = InetAddress.getLocalHost().getHostAddress();
	        String proxyStr = String.format("%s:%d", localIp, server.getPort());
	        proxy.setHttpProxy(proxyStr);
	        proxy.setSslProxy("trustAllSSLCertificates");
	        proxy.setFtpProxy(proxyStr);
	        SeleniumHolder.setProxy(proxy);
	    } catch (UnknownHostException e) {
	        LOGGER.error("UnknownHostException occurs", e);
	    }
	    return proxy;
	}
	 
}
