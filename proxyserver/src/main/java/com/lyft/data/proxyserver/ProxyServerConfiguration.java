package com.lyft.data.proxyserver;

import lombok.Data;

@Data
public class ProxyServerConfiguration {
  private String name;
  private int localPort;
  private String proxyTo;
  private String prefix = "/";
  private String trustAll = "true";
  private String preserveHost = "true";
  private boolean ssl;
  private String keystorePath;
  private String keystorePass;
  private boolean forwardKeystore;
  private boolean forwardedHttps;

  protected String getPrefix() {
    return prefix;
  }

  protected String getTrustAll() {
    return trustAll;
  }

  protected String getPreserveHost() {
    return preserveHost;
  }

  protected boolean isSsl() {
    return ssl;
  }

  protected String getKeystorePath() {
    return keystorePath;
  }

  protected String getKeystorePass() {
    return keystorePass;
  }

  protected boolean isForwardKeystore() {
    return forwardKeystore;
  }

  protected int getLocalPort() {
    return localPort;
  }

  protected boolean isForwardedHttps() {
    return forwardedHttps;
  }
}
