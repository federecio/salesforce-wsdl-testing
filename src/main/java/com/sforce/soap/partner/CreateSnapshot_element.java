package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class CreateSnapshot_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public CreateSnapshot_element() {
  }
    
  
  /**
   * element  : sObject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sObject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sObject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sObject__is_set = false;

  private java.lang.String sObject;

  public java.lang.String getSObject() {
    return sObject;
  }

  

  public void setSObject(java.lang.String sObject) {
    this.sObject = sObject;
    sObject__is_set = true;
  }
  
  /**
   * element  : forceFullSnapshot of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo forceFullSnapshot__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","forceFullSnapshot","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean forceFullSnapshot__is_set = false;

  private boolean forceFullSnapshot;

  public boolean getForceFullSnapshot() {
    return forceFullSnapshot;
  }

  

  public boolean isForceFullSnapshot() {
    return forceFullSnapshot;
  }

  

  public void setForceFullSnapshot(boolean forceFullSnapshot) {
    this.forceFullSnapshot = forceFullSnapshot;
    forceFullSnapshot__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeString(__out, sObject__typeInfo, sObject, sObject__is_set);
    __typeMapper.writeBoolean(__out, forceFullSnapshot__typeInfo, forceFullSnapshot, forceFullSnapshot__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sObject__typeInfo)) {
      setSObject((java.lang.String)__typeMapper.readString(__in, sObject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, forceFullSnapshot__typeInfo)) {
      setForceFullSnapshot((boolean)__typeMapper.readBoolean(__in, forceFullSnapshot__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CreateSnapshot_element ");
    
    sb.append(" sObject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sObject)+"'\n");
    sb.append(" forceFullSnapshot=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(forceFullSnapshot)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}