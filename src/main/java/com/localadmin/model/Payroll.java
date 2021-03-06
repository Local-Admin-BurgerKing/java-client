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
import com.localadmin.model.SalaryChange;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * The Payroll for a certain restaurant
 */
@Schema(description = "The Payroll for a certain restaurant")

public class Payroll implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("changes")
  private List<SalaryChange> changes = null;

  @SerializedName("restaurant")
  private Integer restaurant = null;

  public Payroll changes(List<SalaryChange> changes) {
    this.changes = changes;
    return this;
  }

  public Payroll addChangesItem(SalaryChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * The salary changes over time
   * @return changes
  **/
  @Schema(description = "The salary changes over time")
  public List<SalaryChange> getChanges() {
    return changes;
  }

  public void setChanges(List<SalaryChange> changes) {
    this.changes = changes;
  }

  public Payroll restaurant(Integer restaurant) {
    this.restaurant = restaurant;
    return this;
  }

   /**
   * A unique ID by which a restaurant is identified 
   * minimum: 0
   * @return restaurant
  **/
  @Schema(example = "4643", description = "A unique ID by which a restaurant is identified ")
  public Integer getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(Integer restaurant) {
    this.restaurant = restaurant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payroll payroll = (Payroll) o;
    return Objects.equals(this.changes, payroll.changes) &&
        Objects.equals(this.restaurant, payroll.restaurant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, restaurant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payroll {\n");
    
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    restaurant: ").append(toIndentedString(restaurant)).append("\n");
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
