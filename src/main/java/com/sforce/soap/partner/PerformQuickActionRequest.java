package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class PerformQuickActionRequest implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PerformQuickActionRequest() {
  }
    
  
  /**
   * element  : parentId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo parentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","parentId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean parentId__is_set = false;

  private java.lang.String parentId;

  public java.lang.String getParentId() {
    return parentId;
  }

  

  public void setParentId(java.lang.String parentId) {
    this.parentId = parentId;
    parentId__is_set = true;
  }
  
  /**
   * element  : postToIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo postToIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","postToIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean postToIds__is_set = false;

  private java.lang.String[] postToIds = new java.lang.String[0];

  public java.lang.String[] getPostToIds() {
    return postToIds;
  }

  

  public void setPostToIds(java.lang.String[] postToIds) {
    this.postToIds = postToIds;
    postToIds__is_set = true;
  }
  
  /**
   * element  : quickActionName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo quickActionName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","quickActionName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean quickActionName__is_set = false;

  private java.lang.String quickActionName;

  public java.lang.String getQuickActionName() {
    return quickActionName;
  }

  

  public void setQuickActionName(java.lang.String quickActionName) {
    this.quickActionName = quickActionName;
    quickActionName__is_set = true;
  }
  
  /**
   * element  : records of type {urn:sobject.partner.soap.sforce.com}sObject
   * java type: com.sforce.soap.partner.sobject.SObject[]
   */
  private static final com.sforce.ws.bind.TypeInfo records__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","records","urn:sobject.partner.soap.sforce.com","sObject",0,-1,true);

  private boolean records__is_set = false;

  private com.sforce.soap.partner.sobject.SObject[] records = new com.sforce.soap.partner.sobject.SObject[0];

  public com.sforce.soap.partner.sobject.SObject[] getRecords() {
    return records;
  }

  

  public void setRecords(com.sforce.soap.partner.sobject.SObject[] records) {
    this.records = records;
    records__is_set = true;
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
   
    __typeMapper.writeString(__out, parentId__typeInfo, parentId, parentId__is_set);
    __typeMapper.writeObject(__out, postToIds__typeInfo, postToIds, postToIds__is_set);
    __typeMapper.writeString(__out, quickActionName__typeInfo, quickActionName, quickActionName__is_set);
    __typeMapper.writeObject(__out, records__typeInfo, records, records__is_set);
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
    if (__typeMapper.verifyElement(__in, parentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, parentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, postToIds__typeInfo)) {
      setPostToIds((java.lang.String[])__typeMapper.readObject(__in, postToIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, quickActionName__typeInfo)) {
      setQuickActionName((java.lang.String)__typeMapper.readString(__in, quickActionName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, records__typeInfo)) {
      setRecords((com.sforce.soap.partner.sobject.SObject[])__typeMapper.readObject(__in, records__typeInfo, com.sforce.soap.partner.sobject.SObject[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PerformQuickActionRequest ");
    
    sb.append(" parentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(parentId)+"'\n");
    sb.append(" postToIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(postToIds)+"'\n");
    sb.append(" quickActionName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActionName)+"'\n");
    sb.append(" records=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(records)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}