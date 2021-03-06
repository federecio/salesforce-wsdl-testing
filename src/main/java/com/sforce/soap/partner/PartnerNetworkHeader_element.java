package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class PartnerNetworkHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PartnerNetworkHeader_element() {
  }
    
  
  /**
   * element  : connectionId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo connectionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","connectionId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean connectionId__is_set = false;

  private java.lang.String connectionId;

  public java.lang.String getConnectionId() {
    return connectionId;
  }

  

  public void setConnectionId(java.lang.String connectionId) {
    this.connectionId = connectionId;
    connectionId__is_set = true;
  }
  
  /**
   * element  : partnerEntityIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo partnerEntityIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","partnerEntityIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean partnerEntityIds__is_set = false;

  private java.lang.String[] partnerEntityIds = new java.lang.String[0];

  public java.lang.String[] getPartnerEntityIds() {
    return partnerEntityIds;
  }

  

  public void setPartnerEntityIds(java.lang.String[] partnerEntityIds) {
    this.partnerEntityIds = partnerEntityIds;
    partnerEntityIds__is_set = true;
  }
  
  /**
   * element  : parentEntityIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo parentEntityIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","parentEntityIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean parentEntityIds__is_set = false;

  private java.lang.String[] parentEntityIds = new java.lang.String[0];

  public java.lang.String[] getParentEntityIds() {
    return parentEntityIds;
  }

  

  public void setParentEntityIds(java.lang.String[] parentEntityIds) {
    this.parentEntityIds = parentEntityIds;
    parentEntityIds__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, connectionId__typeInfo, connectionId, connectionId__is_set);
    __typeMapper.writeObject(__out, partnerEntityIds__typeInfo, partnerEntityIds, partnerEntityIds__is_set);
    __typeMapper.writeObject(__out, parentEntityIds__typeInfo, parentEntityIds, parentEntityIds__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, connectionId__typeInfo)) {
      setConnectionId((java.lang.String)__typeMapper.readString(__in, connectionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, partnerEntityIds__typeInfo)) {
      setPartnerEntityIds((java.lang.String[])__typeMapper.readObject(__in, partnerEntityIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, parentEntityIds__typeInfo)) {
      setParentEntityIds((java.lang.String[])__typeMapper.readObject(__in, parentEntityIds__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PartnerNetworkHeader_element ");
    sb.append(super.toString());
    sb.append(" connectionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(connectionId)+"'\n");
    sb.append(" partnerEntityIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(partnerEntityIds)+"'\n");
    sb.append(" parentEntityIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(parentEntityIds)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}