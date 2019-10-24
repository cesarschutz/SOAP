/**
 * ArquivoPkcs7Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class ArquivoPkcs7Type  implements java.io.Serializable {
    private br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7TypeArquivo arquivo;

    private long idContrato;  // attribute

    public ArquivoPkcs7Type() {
    }

    public ArquivoPkcs7Type(
           br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7TypeArquivo arquivo,
           long idContrato) {
           this.arquivo = arquivo;
           this.idContrato = idContrato;
    }


    /**
     * Gets the arquivo value for this ArquivoPkcs7Type.
     * 
     * @return arquivo
     */
    public br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7TypeArquivo getArquivo() {
        return arquivo;
    }


    /**
     * Sets the arquivo value for this ArquivoPkcs7Type.
     * 
     * @param arquivo
     */
    public void setArquivo(br.com.quicksoft.www.ns.wsvortx.v1.ArquivoPkcs7TypeArquivo arquivo) {
        this.arquivo = arquivo;
    }


    /**
     * Gets the idContrato value for this ArquivoPkcs7Type.
     * 
     * @return idContrato
     */
    public long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this ArquivoPkcs7Type.
     * 
     * @param idContrato
     */
    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArquivoPkcs7Type)) return false;
        ArquivoPkcs7Type other = (ArquivoPkcs7Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arquivo==null && other.getArquivo()==null) || 
             (this.arquivo!=null &&
              this.arquivo.equals(other.getArquivo()))) &&
            this.idContrato == other.getIdContrato();
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
        if (getArquivo() != null) {
            _hashCode += getArquivo().hashCode();
        }
        _hashCode += new Long(getIdContrato()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArquivoPkcs7Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "arquivoPkcs7Type"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("idContrato");
        attrField.setXmlName(new javax.xml.namespace.QName("", "idContrato"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", ">arquivoPkcs7Type>arquivo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
