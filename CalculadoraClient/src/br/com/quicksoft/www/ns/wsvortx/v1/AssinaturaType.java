/**
 * AssinaturaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class AssinaturaType  implements java.io.Serializable {
    private br.com.quicksoft.www.ns.wsvortx.v1.SignatarioType signatario;

    private long idContrato;  // attribute

    private java.util.Calendar data;  // attribute

    public AssinaturaType() {
    }

    public AssinaturaType(
           br.com.quicksoft.www.ns.wsvortx.v1.SignatarioType signatario,
           long idContrato,
           java.util.Calendar data) {
           this.signatario = signatario;
           this.idContrato = idContrato;
           this.data = data;
    }


    /**
     * Gets the signatario value for this AssinaturaType.
     * 
     * @return signatario
     */
    public br.com.quicksoft.www.ns.wsvortx.v1.SignatarioType getSignatario() {
        return signatario;
    }


    /**
     * Sets the signatario value for this AssinaturaType.
     * 
     * @param signatario
     */
    public void setSignatario(br.com.quicksoft.www.ns.wsvortx.v1.SignatarioType signatario) {
        this.signatario = signatario;
    }


    /**
     * Gets the idContrato value for this AssinaturaType.
     * 
     * @return idContrato
     */
    public long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this AssinaturaType.
     * 
     * @param idContrato
     */
    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }


    /**
     * Gets the data value for this AssinaturaType.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this AssinaturaType.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssinaturaType)) return false;
        AssinaturaType other = (AssinaturaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signatario==null && other.getSignatario()==null) || 
             (this.signatario!=null &&
              this.signatario.equals(other.getSignatario()))) &&
            this.idContrato == other.getIdContrato() &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getSignatario() != null) {
            _hashCode += getSignatario().hashCode();
        }
        _hashCode += new Long(getIdContrato()).hashCode();
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssinaturaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "assinaturaType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("idContrato");
        attrField.setXmlName(new javax.xml.namespace.QName("", "idContrato"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("data");
        attrField.setXmlName(new javax.xml.namespace.QName("", "data"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "signatarioType"));
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
