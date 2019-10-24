/**
 * RetornoOperacaoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class RetornoOperacaoType  implements java.io.Serializable {
    private long idContrato;

    private int status;

    private br.com.quicksoft.www.ns.wsvortx.v1.ErroType[] erro;

    public RetornoOperacaoType() {
    }

    public RetornoOperacaoType(
           long idContrato,
           int status,
           br.com.quicksoft.www.ns.wsvortx.v1.ErroType[] erro) {
           this.idContrato = idContrato;
           this.status = status;
           this.erro = erro;
    }


    /**
     * Gets the idContrato value for this RetornoOperacaoType.
     * 
     * @return idContrato
     */
    public long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this RetornoOperacaoType.
     * 
     * @param idContrato
     */
    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }


    /**
     * Gets the status value for this RetornoOperacaoType.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RetornoOperacaoType.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the erro value for this RetornoOperacaoType.
     * 
     * @return erro
     */
    public br.com.quicksoft.www.ns.wsvortx.v1.ErroType[] getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this RetornoOperacaoType.
     * 
     * @param erro
     */
    public void setErro(br.com.quicksoft.www.ns.wsvortx.v1.ErroType[] erro) {
        this.erro = erro;
    }

    public br.com.quicksoft.www.ns.wsvortx.v1.ErroType getErro(int i) {
        return this.erro[i];
    }

    public void setErro(int i, br.com.quicksoft.www.ns.wsvortx.v1.ErroType _value) {
        this.erro[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoOperacaoType)) return false;
        RetornoOperacaoType other = (RetornoOperacaoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idContrato == other.getIdContrato() &&
            this.status == other.getStatus() &&
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              java.util.Arrays.equals(this.erro, other.getErro())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getIdContrato()).hashCode();
        _hashCode += getStatus();
        if (getErro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoOperacaoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "retornoOperacaoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "erroType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
