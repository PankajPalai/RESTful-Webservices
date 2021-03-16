package com.pk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;import lombok.Setter;
@Data
public class UserDetails {
	//@json property is used to refer property as alias name for convinient to the end user
	@JsonProperty("user-id")
	Integer uid;
	@JsonProperty("user-name")
	String uname;
	@JsonIgnore
	String pswd;
	String city;

}
