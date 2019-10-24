/**
 * ArquivoPkcs7TypeArquivo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class ArquivoPkcs7TypeArquivo  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private byte[] _value;

    private boolean duplicata;  // attribute

    private java.lang.String idDuplicata;  // attribute

    public ArquivoPkcs7TypeArquivo() {
    }

    // Simple Types must have a String constructor
    public ArquivoPkcs7TypeArquivo(byte[] _value) {
        this._value = _value;
    }
    public ArquivoPkcs7TypeArquivo(java.lang.String _value) {
        this._value = org.apache.axis.encoding.Base64.decode(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : org.apache.axis.encoding.Base64.encode(_value);
    }


    /**
     * Gets the _value value for this ArquivoPkcs7TypeArquivo.
     * 
     * @return _value
     */
    public byte[] get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ArquivoPkcs7TypeArquivo.
     * 
     * @param _value
     */
    public void set_value(byte[] _value) {
        this._value = _value;
    }


    /**
     * Gets the duplicata value for this ArquivoPkcs7TypeArquivo.
     * 
     * @return duplicata
     */
    public boolean isDuplicata() {
        return duplicata;
    }


    /**
     * Sets the duplicata value for this ArquivoPkcs7TypeArquivo.
     * 
     * @param duplicata
     */
    public void setDuplicata(boolean duplicata) {
        this.duplicata = duplicata;
    }


    /**
     * Gets the idDuplicata value for this ArquivoPkcs7TypeArquivo.
     * 
     * @return idDuplicata
     */
    public java.lang.String getIdDuplicata() {
        return idDuplicata;
    }


    /**
     * Sets the idDuplicata value for this ArquivoPkcs7TypeArquivo.
     * 
     * @param idDuplicata
     */
    public void setIdDuplicata(java.lang.String idDuplicata) {
        this.idDuplicata = idDuplicata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArquivoPkcs7TypeArquivo)) return false;
        ArquivoPkcs7TypeArquivo other = (ArquivoPkcs7TypeArquivo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              java.util.Arrays.equals(this._value, other.get_value()))) &&
            this.duplicata == other.isDuplicata() &&
            ((this.idDuplicata==null && other.getIdDuplicata()==null) || 
             (this.idDuplicata!=null &&
              this.idDuplicata.equals(other.getIdDuplicata())));
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
        if (get_value() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_value());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_value(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDuplicata() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdDuplicata() != null) {
            _hashCode += getIdDuplicata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArquivoPkcs7TypeArquivo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", ">arquivoPkcs7Type>arquivo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("duplicata");
        attrField.setXmlName(new javax.xml.namespace.QName("", "duplicata"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("idDuplicata");
        attrField.setXmlName(new javax.xml.namespace.QName("", "idDuplicata"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
