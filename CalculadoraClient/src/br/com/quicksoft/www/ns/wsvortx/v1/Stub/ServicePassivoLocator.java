package br.com.quicksoft.www.ns.wsvortx.v1.Stub;
/**
 * ServicePassivoLocator.java
 *
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */

public class ServicePassivoLocator extends org.apache.axis.client.Service implements ServicePassivo {

	public ServicePassivoLocator() {
	}

	public ServicePassivoLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public ServicePassivoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for
	// BasicHttpBinding_IContratosImplServiceSoapBinding
	private java.lang.String BasicHttpBinding_IContratosImplServiceSoapBinding_address = "http://wsqs.vortx.com.br/ServicePassivoQCertifica.svc";

	public java.lang.String getBasicHttpBinding_IContratosImplServiceSoapBindingAddress() {
		return BasicHttpBinding_IContratosImplServiceSoapBinding_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String BasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName = "BasicHttpBinding_IContratosImplServiceSoapBinding";

	public java.lang.String getBasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName() {
		return BasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName;
	}

	public void setBasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName(java.lang.String name) {
		BasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName = name;
	}

	public IContratosImplServiceSoapBinding getBasicHttpBinding_IContratosImplServiceSoapBinding()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(BasicHttpBinding_IContratosImplServiceSoapBinding_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getBasicHttpBinding_IContratosImplServiceSoapBinding(endpoint);
	}

	public IContratosImplServiceSoapBinding getBasicHttpBinding_IContratosImplServiceSoapBinding(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			BasicHttpBinding_IContratosImplServiceSoapBindingStub _stub = new BasicHttpBinding_IContratosImplServiceSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getBasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setBasicHttpBinding_IContratosImplServiceSoapBindingEndpointAddress(java.lang.String address) {
		BasicHttpBinding_IContratosImplServiceSoapBinding_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (IContratosImplServiceSoapBinding.class.isAssignableFrom(serviceEndpointInterface)) {
				BasicHttpBinding_IContratosImplServiceSoapBindingStub _stub = new BasicHttpBinding_IContratosImplServiceSoapBindingStub(
						new java.net.URL(BasicHttpBinding_IContratosImplServiceSoapBinding_address), this);
				_stub.setPortName(getBasicHttpBinding_IContratosImplServiceSoapBindingWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("BasicHttpBinding_IContratosImplServiceSoapBinding".equals(inputPortName)) {
			return getBasicHttpBinding_IContratosImplServiceSoapBinding();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("", "ServicePassivo");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("", "BasicHttpBinding_IContratosImplServiceSoapBinding"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("BasicHttpBinding_IContratosImplServiceSoapBinding".equals(portName)) {
			setBasicHttpBinding_IContratosImplServiceSoapBindingEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
