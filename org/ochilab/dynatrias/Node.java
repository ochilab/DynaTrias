package org.ochilab.dynatrias;

public class Node {

	private String id;
	private String acl;
	private String namespace;
	private String value;
	
public Node(){
	
		this.acl="";
		this.namespace="";
		this.value="";
		this.id=createID();
	}
	
	public Node(String namespace){
		
		this.acl="";
		this.namespace=namespace;
		this.value="";
		this.id=createID();
	}
	
	
	public Node(String namespace,String acl){
		
		this.acl=acl;
		this.namespace=namespace;
		this.value="";
		this.id=createID();
	}
	public Node(String namespace,String acl,String id){
		
		this.id=id;
		this.acl=acl;
		this.namespace=namespace;
		this.value="";
	}
	
			
	public String getAttribute(){			
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(this.acl+";");
		sbuf.append(this.namespace+";");
		sbuf.append("value="+this.value+";");
		
		return sbuf.toString();
	}
	public String getRevAttribute(){
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(this.acl+";");
		sbuf.append(this.namespace+";");
		sbuf.append("id="+this.id+";");
		
		return sbuf.toString();
	}
	
	public String getNamespace() {
		return namespace;
	}
	private void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	private String  createID(){
		return 	new com.eaio.uuid.UUID().toString();
	}
	public String getAcl() {
		return acl;
	}

	public void setAcl(String acl) {
		this.acl = acl;
	}
}
