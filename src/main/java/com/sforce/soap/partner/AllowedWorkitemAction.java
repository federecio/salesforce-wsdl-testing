package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class AllowedWorkitemAction implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AllowedWorkitemAction() {
  }
    
  
  /**
   * element  : versionRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo versionRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","versionRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean versionRequired__is_set = false;

  private boolean versionRequired;

  public boolean getVersionRequired() {
    return versionRequired;
  }

  

  public boolean isVersionRequired() {
    return versionRequired;
  }

  

  public void setVersionRequired(boolean versionRequired) {
    this.versionRequired = versionRequired;
    versionRequired__is_set = true;
  }
  
  /**
   * element  : commentsRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo commentsRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","commentsRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean commentsRequired__is_set = false;

  private boolean commentsRequired;

  public boolean getCommentsRequired() {
    return commentsRequired;
  }

  

  public boolean isCommentsRequired() {
    return commentsRequired;
  }

  

  public void setCommentsRequired(boolean commentsRequired) {
    this.commentsRequired = commentsRequired;
    commentsRequired__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : nextOwnerRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo nextOwnerRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","nextOwnerRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean nextOwnerRequired__is_set = false;

  private boolean nextOwnerRequired;

  public boolean getNextOwnerRequired() {
    return nextOwnerRequired;
  }

  

  public boolean isNextOwnerRequired() {
    return nextOwnerRequired;
  }

  

  public void setNextOwnerRequired(boolean nextOwnerRequired) {
    this.nextOwnerRequired = nextOwnerRequired;
    nextOwnerRequired__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, versionRequired__typeInfo, versionRequired, versionRequired__is_set);
    __typeMapper.writeBoolean(__out, commentsRequired__typeInfo, commentsRequired, commentsRequired__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeBoolean(__out, nextOwnerRequired__typeInfo, nextOwnerRequired, nextOwnerRequired__is_set);
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
    if (__typeMapper.verifyElement(__in, versionRequired__typeInfo)) {
      setVersionRequired((boolean)__typeMapper.readBoolean(__in, versionRequired__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, commentsRequired__typeInfo)) {
      setCommentsRequired((boolean)__typeMapper.readBoolean(__in, commentsRequired__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, nextOwnerRequired__typeInfo)) {
      setNextOwnerRequired((boolean)__typeMapper.readBoolean(__in, nextOwnerRequired__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AllowedWorkitemAction ");
    
    sb.append(" versionRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(versionRequired)+"'\n");
    sb.append(" commentsRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(commentsRequired)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" nextOwnerRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nextOwnerRequired)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}