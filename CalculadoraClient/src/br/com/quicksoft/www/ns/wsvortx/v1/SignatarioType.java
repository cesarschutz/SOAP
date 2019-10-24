/**
 * SignatarioType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.quicksoft.www.ns.wsvortx.v1;

public class SignatarioType  implements java.io.Serializable {
    private java.lang.String nome;  // attribute

    private java.lang.String email;  // attribute

    private long cpf;  // attribute

    private boolean duplicatas;  // attribute

    private int codigoPapel;  // attribute

    private java.lang.String papel;  // attribute

    private boolean validador;  // attribute

    public SignatarioType() {
    }

    public SignatarioType(
           java.lang.String nome,
           java.lang.String email,
           long cpf,
           boolean duplicatas,
           int codigoPapel,
           java.lang.String papel,
           boolean validador) {
           this.nome = nome;
           this.email = email;
           this.cpf = cpf;
           this.duplicatas = duplicatas;
           this.codigoPapel = codigoPapel;
           this.papel = papel;
           this.validador = validador;
    }


    /**
     * Gets the nome value for this SignatarioType.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this SignatarioType.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the email value for this SignatarioType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SignatarioType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the cpf value for this SignatarioType.
     * 
     * @return cpf
     */
    public long getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this SignatarioType.
     * 
     * @param cpf
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the duplicatas value for this SignatarioType.
     * 
     * @return duplicatas
     */
    public boolean isDuplicatas() {
        return duplicatas;
    }


    /**
     * Sets the duplicatas value for this SignatarioType.
     * 
     * @param duplicatas
     */
    public void setDuplicatas(boolean duplicatas) {
        this.duplicatas = duplicatas;
    }


    /**
     * Gets the codigoPapel value for this SignatarioType.
     * 
     * @return codigoPapel
     */
    public int getCodigoPapel() {
        return codigoPapel;
    }


    /**
     * Sets the codigoPapel value for this SignatarioType.
     * 
     * @param codigoPapel
     */
    public void setCodigoPapel(int codigoPapel) {
        this.codigoPapel = codigoPapel;
    }


    /**
     * Gets the papel value for this SignatarioType.
     * 
     * @return papel
     */
    public java.lang.String getPapel() {
        return papel;
    }


    /**
     * Sets the papel value for this SignatarioType.
     * 
     * @param papel
     */
    public void setPapel(java.lang.String papel) {
        this.papel = papel;
    }


    /**
     * Gets the validador value for this SignatarioType.
     * 
     * @return validador
     */
    public boolean isValidador() {
        return validador;
    }


    /**
     * Sets the validador value for this SignatarioType.
     * 
     * @param validador
     */
    public void setValidador(boolean validador) {
        this.validador = validador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignatarioType)) return false;
        SignatarioType other = (SignatarioType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.cpf == other.getCpf() &&
            this.duplicatas == other.isDuplicatas() &&
            this.codigoPapel == other.getCodigoPapel() &&
            ((this.papel==null && other.getPapel()==null) || 
             (this.papel!=null &&
              this.papel.equals(other.getPapel()))) &&
            this.validador == other.isValidador();
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += new Long(getCpf()).hashCode();
        _hashCode += (isDuplicatas() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCodigoPapel();
        if (getPapel() != null) {
            _hashCode += getPapel().hashCode();
        }
        _hashCode += (isValidador() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatarioType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.quicksoft.com.br/ns/wsvortx/v1/", "signatarioType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nome");
        attrField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("email");
        attrField.setXmlName(new javax.xml.namespace.QName("", "email"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cpf");
        attrField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("duplicatas");
        attrField.setXmlName(new javax.xml.namespace.QName("", "duplicatas"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codigoPapel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "codigoPapel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("papel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "papel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validador");
        attrField.setXmlName(new javax.xml.namespace.QName("", "validador"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
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
