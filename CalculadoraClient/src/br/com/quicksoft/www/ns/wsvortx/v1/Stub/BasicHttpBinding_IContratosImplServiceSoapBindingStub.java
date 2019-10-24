package br.com.quicksoft.www.ns.wsvortx.v1.Stub;
/**
 * BasicHttpBinding_IContratosImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */

public class BasicHttpBinding_IContratosImplServiceSoapBindingStub extends org.apache.axis.client.Stub
		implements IContratosImplServiceSoapBinding {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[3];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("alterarStatus");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "statusContratoAlterado"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/",
						"statusContratoAlteradoType"),
				br.com.quicksoft.www.ns.wsvortx.v1.StatusContratoAlteradoType.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "retornoOperacaoType"));
		oper.setReturnClass(br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "retornoOperacao"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("postarArquivoPkcs7");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arquivoPkcs7"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "arquivoPkcs7Type"),
				br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7Type.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "retornoOperacaoType"));
		oper.setReturnClass(br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "retornoOperacao"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("assinar");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assinatura"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "assinaturaType"),
				br.com.quicksoft.www.ns.wsvortx.v1.AssinaturaType.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(
				new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "retornoOperacaoType"));
		oper.setReturnClass(br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "retornoOperacao"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

	}

	public BasicHttpBinding_IContratosImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public BasicHttpBinding_IContratosImplServiceSoapBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public BasicHttpBinding_IContratosImplServiceSoapBindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/",
				">arquivoPkcs7Type>arquivo");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7TypeArquivo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "arquivoPkcs7Type");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7Type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "assinaturaType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.AssinaturaType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "erroType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.ErroType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "responsavelType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.ResponsavelType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "retornoOperacaoType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "signatarioType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.SignatarioType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/",
				"statusContratoAlteradoType");
		cachedSerQNames.add(qName);
		cls = br.com.quicksoft.www.ns.wsvortx.v1.StatusContratoAlteradoType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType alterarStatus(
			br.com.quicksoft.www.ns.wsvortx.v1.StatusContratoAlteradoType statusContratoAlterado)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:IContratosImplServiceSoapBinding/alterarStatus");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "alterarStatus"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { statusContratoAlterado });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) _resp;
				} catch (java.lang.Exception _exception) {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) org.apache.axis.utils.JavaUtils
							.convert(_resp, br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType postarArquivoPkcs7(
			br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7Type arquivoPkcs7) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:IContratosImplServiceSoapBinding/postarArquivoPkcs7");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "postarArquivoPkcs7"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { arquivoPkcs7 });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) _resp;
				} catch (java.lang.Exception _exception) {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) org.apache.axis.utils.JavaUtils
							.convert(_resp, br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType assinar(
			br.com.quicksoft.www.ns.wsvortx.v1.AssinaturaType assinatura) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:IContratosImplServiceSoapBinding/assinar");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "assinar"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { assinatura });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) _resp;
				} catch (java.lang.Exception _exception) {
					return (br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType) org.apache.axis.utils.JavaUtils
							.convert(_resp, br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
