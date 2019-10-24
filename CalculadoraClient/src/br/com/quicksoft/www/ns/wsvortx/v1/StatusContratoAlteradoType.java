/**
 * StatusContratoAlteradoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class StatusContratoAlteradoType  implements java.io.Serializable {
    private br.com.quicksoft.www.ns.wsvortx.v1.ResponsavelType responsavel;

    private long idContrato;  // attribute

    private int codigoStatus;  // attribute

    private boolean duplicatas;  // attribute

    public StatusContratoAlteradoType() {
    }

    public StatusContratoAlteradoType(
           br.com.quicksoft.www.ns.wsvortx.v1.ResponsavelType responsavel,
           long idContrato,
           int codigoStatus,
           boolean duplicatas) {
           this.responsavel = responsavel;
           this.idContrato = idContrato;
           this.codigoStatus = codigoStatus;
           this.duplicatas = duplicatas;
    }


    /**
     * Gets the responsavel value for this StatusContratoAlteradoType.
     * 
     * @return responsavel
     */
    public br.com.quicksoft.www.ns.wsvortx.v1.ResponsavelType getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this StatusContratoAlteradoType.
     * 
     * @param responsavel
     */
    public void setResponsavel(br.com.quicksoft.www.ns.wsvortx.v1.ResponsavelType responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the idContrato value for this StatusContratoAlteradoType.
     * 
     * @return idContrato
     */
    public long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this StatusContratoAlteradoType.
     * 
     * @param idContrato
     */
    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }


    /**
     * Gets the codigoStatus value for this StatusContratoAlteradoType.
     * 
     * @return codigoStatus
     */
    public int getCodigoStatus() {
        return codigoStatus;
    }


    /**
     * Sets the codigoStatus value for this StatusContratoAlteradoType.
     * 
     * @param codigoStatus
     */
    public void setCodigoStatus(int codigoStatus) {
        this.codigoStatus = codigoStatus;
    }


    /**
     * Gets the duplicatas value for this StatusContratoAlteradoType.
     * 
     * @return duplicatas
     */
    public boolean isDuplicatas() {
        return duplicatas;
    }


    /**
     * Sets the duplicatas value for this StatusContratoAlteradoType.
     * 
     * @param duplicatas
     */
    public void setDuplicatas(boolean duplicatas) {
        this.duplicatas = duplicatas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusContratoAlteradoType)) return false;
        StatusContratoAlteradoType other = (StatusContratoAlteradoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            this.idContrato == other.getIdContrato() &&
            this.codigoStatus == other.getCodigoStatus() &&
            this.duplicatas == other.isDuplicatas();
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
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        _hashCode += new Long(getIdContrato()).hashCode();
        _hashCode += getCodigoStatus();
        _hashCode += (isDuplicatas() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusContratoAlteradoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "statusContratoAlteradoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("idContrato");
        attrField.setXmlName(new javax.xml.namespace.QName("", "idContrato"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codigoStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "codigoStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("duplicatas");
        attrField.setXmlName(new javax.xml.namespace.QName("", "duplicatas"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "responsavelType"));
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
