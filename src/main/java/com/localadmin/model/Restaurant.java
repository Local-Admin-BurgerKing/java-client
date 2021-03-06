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
import java.io.Serializable;
/**
 * A restaurant with all its information
 */
@Schema(description = "A restaurant with all its information")

public class Restaurant implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("number")
  private Integer number = null;

  @SerializedName("sollvalue")
  private Float sollvalue = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("location")
  private String location = null;

  public Restaurant number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * A unique ID by which a restaurant is identified 
   * minimum: 0
   * @return number
  **/
  @Schema(example = "4643", required = true, description = "A unique ID by which a restaurant is identified ")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Restaurant sollvalue(Float sollvalue) {
    this.sollvalue = sollvalue;
    return this;
  }

   /**
   * The maximum percentage that the employe costs regarding to the netto income should not overextend
   * @return sollvalue
  **/
  @Schema(required = true, description = "The maximum percentage that the employe costs regarding to the netto income should not overextend")
  public Float getSollvalue() {
    return sollvalue;
  }

  public void setSollvalue(Float sollvalue) {
    this.sollvalue = sollvalue;
  }

  public Restaurant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human readable name for the restaurant
   * @return name
  **/
  @Schema(example = "Quick Restaurant", required = true, description = "A human readable name for the restaurant")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Restaurant location(String location) {
    this.location = location;
    return this;
  }

   /**
   * A human findable location
   * @return location
  **/
  @Schema(required = true, description = "A human findable location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurant restaurant = (Restaurant) o;
    return Objects.equals(this.number, restaurant.number) &&
        Objects.equals(this.sollvalue, restaurant.sollvalue) &&
        Objects.equals(this.name, restaurant.name) &&
        Objects.equals(this.location, restaurant.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, sollvalue, name, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurant {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sollvalue: ").append(toIndentedString(sollvalue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
