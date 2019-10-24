package br.com.quicksoft.www.ns.wsvortx.v1;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.quicksoft.www.ns.wsvortx.v1.Stub.ServicePassivo;
import br.com.quicksoft.www.ns.wsvortx.v1.Stub.ServicePassivoLocator;

public class Main {
	public static void main(String[] args) throws RemoteException, ServiceException {
		ServicePassivo locator = new ServicePassivoLocator();
		RetornoOperacaoType postarArquivoPkcs7 = locator.getBasicHttpBinding_IContratosImplServiceSoapBinding().postarArquivoPkcs7(new ArquivoPkcs7Type());
		System.out.println(postarArquivoPkcs7.getErro(0).getDescricao());
	}
}
