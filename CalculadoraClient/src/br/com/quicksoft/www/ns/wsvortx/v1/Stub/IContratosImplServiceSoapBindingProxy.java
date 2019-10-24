package br.com.quicksoft.www.ns.wsvortx.v1.Stub;

public class IContratosImplServiceSoapBindingProxy implements IContratosImplServiceSoapBinding {
	private String _endpoint = null;
	private IContratosImplServiceSoapBinding iContratosImplServiceSoapBinding = null;

	public IContratosImplServiceSoapBindingProxy() {
		_initIContratosImplServiceSoapBindingProxy();
	}

	public IContratosImplServiceSoapBindingProxy(String endpoint) {
		_endpoint = endpoint;
		_initIContratosImplServiceSoapBindingProxy();
	}

	private void _initIContratosImplServiceSoapBindingProxy() {
		try {
			iContratosImplServiceSoapBinding = (new ServicePassivoLocator())
					.getBasicHttpBinding_IContratosImplServiceSoapBinding();
			if (iContratosImplServiceSoapBinding != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) iContratosImplServiceSoapBinding)
							._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) iContratosImplServiceSoapBinding)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (iContratosImplServiceSoapBinding != null)
			((javax.xml.rpc.Stub) iContratosImplServiceSoapBinding)
					._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public IContratosImplServiceSoapBinding getIContratosImplServiceSoapBinding() {
		if (iContratosImplServiceSoapBinding == null)
			_initIContratosImplServiceSoapBindingProxy();
		return iContratosImplServiceSoapBinding;
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType alterarStatus(
			br.com.quicksoft.www.ns.wsvortx.v1.StatusContratoAlteradoType statusContratoAlterado)
			throws java.rmi.RemoteException {
		if (iContratosImplServiceSoapBinding == null)
			_initIContratosImplServiceSoapBindingProxy();
		return iContratosImplServiceSoapBinding.alterarStatus(statusContratoAlterado);
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType postarArquivoPkcs7(
			br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7Type arquivoPkcs7) throws java.rmi.RemoteException {
		if (iContratosImplServiceSoapBinding == null)
			_initIContratosImplServiceSoapBindingProxy();
		return iContratosImplServiceSoapBinding.postarArquivoPkcs7(arquivoPkcs7);
	}

	public br.com.quicksoft.www.ns.wsvortx.v1.RetornoOperacaoType assinar(
			br.com.quicksoft.www.ns.wsvortx.v1.AssinaturaType assinatura) throws java.rmi.RemoteException {
		if (iContratosImplServiceSoapBinding == null)
			_initIContratosImplServiceSoapBindingProxy();
		return iContratosImplServiceSoapBinding.assinar(assinatura);
	}

}