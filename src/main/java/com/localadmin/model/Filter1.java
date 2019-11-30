/*
 * rest-api
 * An api to fetch manipulate and enter data to the Local Admin service. All Responses can be done with JSON and XML where JSON is the default. You can change the response by setting the content-type header. The downside of our XML is that we do not provide XLS for the Responses
 *
 * OpenAPI spec version: 1.1.0
 * Contact: nbrugger@student.tgm.ac.at
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.localadmin.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * Represents a filter, with an unique name and a list of column-names
 */
@Schema(description = "Represents a filter, with an unique name and a list of column-names")

public class Filter1 implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("name")
  private String name = null;

  @SerializedName("whitelist")
  private List<String> whitelist = null;

  public Filter1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Filter1 whitelist(List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public Filter1 addWhitelistItem(String whitelistItem) {
    if (this.whitelist == null) {
      this.whitelist = new ArrayList<>();
    }
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @Schema(description = "")
  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter1 filter1 = (Filter1) o;
    return Objects.equals(this.name, filter1.name) &&
        Objects.equals(this.whitelist, filter1.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, whitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}