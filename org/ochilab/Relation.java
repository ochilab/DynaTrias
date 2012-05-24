package org.ochilab.dynatrias;

public class Relation {

	private String value;
	private String namespace;
	private String serial;
	private String acl;
	private String ext;

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value=value;
	}
	
	public Relation(String namespace){

		this.namespace=namespace;
		this.acl="";
		this.setExt("");
		this.setSerial("");
		
	}
	
	public Relation(String namespace,String acl){

		this.namespace=namespace;
		this.acl=acl;
		this.setExt("");
		this.setSerial("");
		
	}
	
	public String toForwardString(){
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(this.acl+";");
		sbuf.append(this.namespace+";");
		sbuf.append("relationf="+this.getValue()+";");
		sbuf.append(this.serial+";");
		sbuf.append(this.ext+";");
	
		return sbuf.toString();
	}
	public String toBackwardString(){
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(this.acl+";");
		sbuf.append(this.namespace+";");
		sbuf.append("relationb="+this.getValue()+";");
		sbuf.append(this.serial+";");
		sbuf.append(this.ext+";");
	
		return sbuf.toString();
	}
	

	public String getNamespace() {
		return this.namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getAcl() {
		return acl;
	}
	public void setAcl(String acl) {
		this.acl = acl;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	
}
