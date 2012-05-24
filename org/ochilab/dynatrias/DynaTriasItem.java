package org.ochilab.dynatrias;

import java.util.HashSet;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBRangeKey;

@DynamoDBTable(tableName="DynaTrias")
public class DynaTriasItem {

	private String entity;
	private String relation;
	private HashSet<String> value;
	
	
		
	public Node createNode(){
		
		String[] result=relation.split(";");
		
		Node node = new Node(result[1],result[0],entity);
		node.setValue(result[2].replace("value=", ""));
				
		return node;
	}
	
	
	@DynamoDBHashKey(attributeName="e")
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	@DynamoDBRangeKey(attributeName="r")
	public String getAttribute() {
		return relation;
	}
	public void setAttribute(String relation) {
		this.relation = relation;
	}
	@DynamoDBAttribute(attributeName="v")
	public HashSet<String> getValue() {
		return value;
	}
	public void setValue(HashSet<String> value) {
		this.value = value;
	}
	
	
	
	
}
